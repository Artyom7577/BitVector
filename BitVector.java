import java.lang.Math;
import java.util.ArrayList;
public class BitVector {
    private final ArrayList<Integer> ArrIndex = new ArrayList<>();
    private int temp;
    private final int size;
    private final int [] arr;
    BitVector(int size1){
        this.size = size1;
        int temp;
        if (size1 % 32 == 0) {
            temp = size1 / 32;
        }else {
            temp = (size1 / 32) + 1;
        }
        this.arr = new int[temp];
    }
    public void set(int index) {
        if(ArrIndex.contains(index)) {
            throw new IllegalArgumentException("Cant Set two same Elements");
        }
        ArrIndex.add(index);
        if (index == 0 || index > size) {
            throw new IllegalArgumentException("haven't 0 index or index > size");
        }
        if(index == 1) {
            arr[temp] = arr[0] ^ 1;
            return;
        }
        this.temp = index / 32;
        arr[temp] = arr[temp] ^ ( int )Math.pow(2, (index - 1) % 32 );
    }
    public void reset(int index){
        if(!ArrIndex.contains(index)) {
            throw new IllegalArgumentException("Cant Reset two same Elements");
        }
        for (int i = 0; i < ArrIndex.size(); i++) {
            if (ArrIndex.get(i) == index) {
                ArrIndex.remove(i);
            }
        }
        if(index == 1) {
            arr[temp] = arr[temp] ^ 1;
        }
        arr[temp] = arr[temp] - ( int )Math.pow(2, (index - 1) % 32 );
    }
}
