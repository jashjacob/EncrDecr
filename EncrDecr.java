import java.lang.*;
import java.io.*;
import java.util.*;

class EncrDecr
{ 
	static char[] encrp(String xyz)
	{
       xyz=xyz.toUpperCase(); //  Converting string to uppercase
       int len=xyz.length();  //length of string

       final int mid = (xyz.length()+1) / 2;
       String[] spstr = {
       	xyz.substring(0, mid),
       	xyz.substring(mid),
    };  //splitting the string into two

    String firstMix=spstr[1]+spstr[0];  //swapping the first half of string with the last half
    
    char[] chars=firstMix.toCharArray(); // converting the string into an array for swapping characters


      // Swap first two chars with last two chars
    swap( chars, 0, chars.length - 2 );
    swap( chars, 1, chars.length - 1 );

     //   System.out.println( "Pass 2: " + new String( chars ) );

        // Swap middle 4 characters.
    swap( chars, mid - 1, mid + 1 );
    swap( chars, mid - 2, mid );
    //    System.out.println( "Pass 3: " + new String( chars ) );


      //running a character susbtituion 
       /*
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
       */


       for (int i = 0;i < len; i++){
       	if(chars[i]=='A')
       	{
       		chars[i]='@';
       	}
       	if(chars[i]=='E')
       	{
       		chars[i]='=';
       	}
       	if(chars[i]=='I')
       	{
       		chars[i]='!';
       	}
       	if(chars[i]=='J')
       	{
       		chars[i]='?';
       	}
       	if(chars[i]=='O')
       	{
       		chars[i]='*';
       	}
       	if(chars[i]=='P')
       	{
       		chars[i]='#';
       	}
       	if(chars[i]=='R')
       	{
       		chars[i]='&';
       	}
       	if(chars[i]=='S')
       	{
       		chars[i]='$';
       	}
       	if(chars[i]=='T')
       	{
       		chars[i]='+';
       	}
       	if(chars[i]=='V')
       	{
       		chars[i]='^';
       	}
       	if(chars[i]=='X')
       	{
       		chars[i]='%';
       	}
       }

	return chars;	//returning the encrypted word
}

public static void swap( char[] chars, int l, int r ) {
	char tmp = chars[ l ];
	chars[ l ] = chars[ r ];
	chars[ r ] = tmp;
    } //function to swap

    public static void main(String[] args)
    {
 	 System.out.println("The string before encrpytion - abcdefghijklmnopqurstuvwxyz");	
	 System.out.println(encrp("abcdefghijklmnopqurstuvwxyz")); //input string for encryption

	}
}