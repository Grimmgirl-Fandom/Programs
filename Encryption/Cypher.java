//Grace Hollis
public class Cypher
{
  
  public Cypher()
  {
  }
  
   //if using general or default constructor
   public String encrypt(String str)
   {
     
     return flipIt(reverseIt(str));
   }
   
   public String reverseIt(String str)
   {
     String r="";
     int size =str.length();
     for(int i=size-1;i>=0;i--)
       r+=str.charAt(i);
     
     return r;
   }
   
   public String flipIt(String str)
   {
     String f="";
     int size =str.length();
     for(int i=0;i<size;i++)
     {
       if(str.charAt(i)=='a')
       f+="Z";
       else if(str.charAt(i)=='A')
       f+="z";
       else if(str.charAt(i)=='b')
       f+="Y";
       else if(str.charAt(i)=='B')
       f+="y";
       else if(str.charAt(i)=='c')
       f+="X";
       else if(str.charAt(i)=='C')
       f+="x";
       else if(str.charAt(i)=='d')
       f+="W";
       else if(str.charAt(i)=='D')
       f+="w";
       else if(str.charAt(i)=='e')
       f+="V";
       else if(str.charAt(i)=='E')
       f+="v";
       else if(str.charAt(i)=='f')
       f+="U";
       else if(str.charAt(i)=='F')
       f+="u";
       else if(str.charAt(i)=='g')
       f+="T";
       else if(str.charAt(i)=='G')
       f+="t";
       else if(str.charAt(i)=='h')
       f+="S";
       else if(str.charAt(i)=='H')
       f+="s";
       else if(str.charAt(i)=='i')
       f+="R";
       else if(str.charAt(i)=='I')
       f+="r";
       else if(str.charAt(i)=='j')
       f+="Q";
       else if(str.charAt(i)=='J')
       f+="q";
       else if(str.charAt(i)=='k')
       f+="P";
       else if(str.charAt(i)=='K')
       f+="p";
       else if(str.charAt(i)=='l')
       f+="O";
       else if(str.charAt(i)=='L')
       f+="o";
       else if(str.charAt(i)=='m')
       f+="N";
       else if(str.charAt(i)=='M')
       f+="n";
       //fist half
       else if(str.charAt(i)=='z')
       f+="A";
       else if(str.charAt(i)=='Z')
       f+="a";
       else if(str.charAt(i)=='y')
       f+="B";
       else if(str.charAt(i)=='Y')
       f+="b";
       else if(str.charAt(i)=='x')
       f+="C";
       else if(str.charAt(i)=='X')
       f+="c";
       else if(str.charAt(i)=='w')
       f+="D";
       else if(str.charAt(i)=='W')
       f+="d";
       else if(str.charAt(i)=='v')
       f+="E";
       else if(str.charAt(i)=='V')
       f+="e";
       else if(str.charAt(i)=='u')
       f+="F";
       else if(str.charAt(i)=='U')
       f+="f";
       else if(str.charAt(i)=='t')
       f+="G";
       else if(str.charAt(i)=='T')
       f+="g";
       else if(str.charAt(i)=='s')
       f+="H";
       else if(str.charAt(i)=='S')
       f+="h";
       else if(str.charAt(i)=='r')
       f+="I";
       else if(str.charAt(i)=='R')
       f+="i";
       else if(str.charAt(i)=='q')
       f+="J";
       else if(str.charAt(i)=='Q')
       f+="j";
       else if(str.charAt(i)=='p')
       f+="K";
       else if(str.charAt(i)=='P')
       f+="k";
       else if(str.charAt(i)=='o')
       f+="L";
       else if(str.charAt(i)=='O')
       f+="l";
       else if(str.charAt(i)=='n')
       f+="M";
       else if(str.charAt(i)=='N')
       f+="m";
       
       
       
       
       
       
       
       
       
       
       
       
       
       else
         f+=str.charAt(i);
       
       
     }
     
     
     
     
     
     
     
     
     
     
     
     return f;
   }
   
    public void printAndEncrypt(String str)
   {
      print(encrypt(str));

   }
   
   public void print(String str)
   {
     System.out.println(str);
   }
   
}