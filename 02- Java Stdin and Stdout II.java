/*
Problem statement: 
https://www.hackerrank.com/challenges/java-stdin-stdout/problem

Input Format

There are three lines of input:
1- The first line contains an integer.
2- The second line contains a double.
3- The third line contains a String.

Output Format
There are three lines of output:

1- On the first line, print String: followed by the unaltered String read from stdin.
2- On the second line, print Double: followed by the unaltered double read from stdin.
3- On the third line, print Int: followed by the unaltered integer read from stdin.
To make the problem easier, a portion of the code is already provided in the editor.

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens;
because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() 
will be reading the remainder of the integer line (which is empty).

Sample Input
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

*/


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
   
   // take the inputs
   Scanner sc = new Scanner(System.in);
   int i =  sc.nextInt();
   double d = sc.nextDouble();
   sc.nextLine();
   String s=sc.nextLine();
   
   // show the outputs
   System.out.println("String: "+s);
   System.out.println("Double: "+d);
   System.out.println("Int: "+i);
   
   
   
    }
}
