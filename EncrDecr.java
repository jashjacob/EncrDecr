import java.lang.*;
import java.io.*;
import java.util.*;

class EncrDecr
{ 
	static char[] encrp(String xyz)
	{
       xyz=xyz.toUpperCase(); // first converting to upper case
       int len=xyz.length();  //length of string

       char[] cArray = xyz.toCharArray();  //String to array conversion

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
		if(cArray[i]=='A')
		{
			cArray[i]='@';
		}
		if(cArray[i]=='E')
		{
			cArray[i]='=';
		}
		if(cArray[i]=='I')
		{
			cArray[i]='!';
		}
		if(cArray[i]=='J')
		{
			cArray[i]='?';
		}
		if(cArray[i]=='O')
		{
			cArray[i]='*';
		}
		if(cArray[i]=='P')
		{
			cArray[i]='#';
		}
		if(cArray[i]=='R')
		{
			cArray[i]='&';
		}
		if(cArray[i]=='S')
		{
			cArray[i]='$';
		}
		if(cArray[i]=='T')
		{
			cArray[i]='+';
		}
		if(cArray[i]=='V')
		{
			cArray[i]='^';
		}
		if(cArray[i]=='X')
		{
			cArray[i]='%';
		}
    }

 /*String fh=xyz.substring(0,len/2);
 char[] firstHalf=fh.toCharArray();

 String lh=xyz.substring(len/2,len);
 char[] lastHalf=lh.toCharArray();
*/

    final int mid = (xyz.length()+1) / 2;
    String[] spstr = {
        xyz.substring(0, mid),
        xyz.substring(mid),
    };  //splitting the string into two

    String firstMix=spstr[1]+spstr[0];  //swapping the first half of string with the last half
    System.out.println(firstMix); 


//incomplete process

	return cArray;	//returning the encrypted word
	}

	public static void main(String[] args)
	{
	 
	 System.out.println(encrp("aucflo")); //input string for encryption

	}
}