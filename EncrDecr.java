import java.lang.*;
import java.io.*;
import java.util.*;

class EncrDecr
{ 
	static char[] encrp(String xyz)
	{
       xyz=xyz.toUpperCase(); // first converting to upper case
       int len=xyz.length();  //length of string

       char[] cArray = xyz.toCharArray();

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

 String fh=xyz.substring(0,len/2);
 char[] firstHalf=fh.toCharArray();

 String lh=xyz.substring(len/2,len);
 char[] lastHalf=lh.toCharArray();




    final int mid = (xyz.length()+1) / 2;
    String[] spstr = {
        xyz.substring(0, mid),
        xyz.substring(mid),
    };

    System.out.println(spstr[0]);
    System.out.println(spstr[1]);

    String firstMix=spstr[1]+spstr[0];
    System.out.println(firstMix);



	return cArray;	
	}

	public static void main(String[] args)
	{
	 
	 System.out.println(encrp("aucflo"));
	}
}