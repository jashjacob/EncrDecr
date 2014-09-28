Simple Encryption and Decryption
========

The original code only has Encryption class with the swaps given below. Later it was updated to reverse the same with a Decryption class.

SWAP 1 - Splitting the input string into two and swapping

        Input : ABCDEFGHIJKLMNOPQRSTUVWXYZ
        Output: NOPQRSTUVWXYZABCDEFGHIJKLM

SWAP 2 - Swapping first two chars with last two chars

        Input : NOPQRSTUVWXYZABCDEFGHIJKLM
        Output: LMPQRSTUVWXYZABCDEFGHIJKNO

SWAP 3 - Swapping the chars in the middle

        Input : LMPQRSTUVWXYZABCDEFGHIJKNO
        Output: LMPQRSTUVWXABYZCDEFGHIJKNO

Character substitution table
 
       A  - @
       E  - =
       I  - !
       J  - ?
       O  - *
       P  - #
       R  - &
       S  - $
       T  - +
       V  - ^
       X  - %

