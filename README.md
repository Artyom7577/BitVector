# BitVector

The code is a Java implementation of a BitVector data structure. 
It uses an ArrayList to store the indices of the bits that have been set, 
and an integer array to store the actual bits as 32-bit integers. 
The BitVector class has methods to set and reset a bit in the vector, 
and it also contains two custom exceptions (IllegalArgumentException)
that it throws when specific conditions are not met (e.g. resetting a bit that hasn't been set).
....
