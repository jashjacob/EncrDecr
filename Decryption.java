import java.lang.*;
import java.io.*;
import java.util.*;

class Decryption 
{
  static String decryptWord(String inputWord)
  {
int len=inputWord.length();  //length of string
int mid = (inputWord.length()+1) / 2;
String s1=new String();
String s2=new String();
String firstswap=new String();
char[] chars=inputWord.toCharArray();

for (int i = 0;i < len; i++){
  if(chars[i]=='@')
  {
    chars[i]='A';
  }
  if(chars[i]=='=')
  {
    chars[i]='E';
  }
  if(chars[i]=='!')
  {
    chars[i]='I';
  }
  if(chars[i]=='?')
  {
    chars[i]='J';
  }
  if(chars[i]=='*')
  {
    chars[i]='O';
  }
  if(chars[i]=='#')
  {
    chars[i]='P';
  }
  if(chars[i]=='&')
  {
    chars[i]='R';
  }
  if(chars[i]=='$')
  {
    chars[i]='S';
  }
  if(chars[i]=='+')
  {
    chars[i]='T';
  }
  if(chars[i]=='^')
  {
    chars[i]='V';
  }
  if(chars[i]=='%')
  {
    chars[i]='X';
  }
}
//swap 3   
swap( chars, mid - 1, mid + 1 );
swap( chars, mid - 2, mid );

//swap 2
swap( chars, 0, chars.length - 2 );
swap( chars, 1, chars.length - 1 );

String s=new String(chars);

//swap 1
if(len%2!=0)
{
  s1=s.substring(0,mid-1);
  s2=s.substring(mid-1);
  firstswap=s2.concat(s1);
}
else
{
  s1=s.substring(0,mid);
  s2=s.substring(mid);
  firstswap=s2.concat(s1);
}
firstswap=firstswap.toLowerCase();

return firstswap; //returning the decrypted string
}
public static void swap( char[] chars, int l, int r ) 
{
  char tmp = chars[ l ];
  chars[ l ] = chars[ r ];
  chars[ r ] = tmp;
}

 public static void main(String[] args)
  {  
    System.out.println("The string before Decryption is - @GD@&*NM=D ");
    System.out.println(decryptWord("@GD@&*NM=D"));
  }

}