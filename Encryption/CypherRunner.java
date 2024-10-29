//Grace Hollis


import java.util.*;
public class CypherRunner
{
 public static void main(String[] args)
    
 {
   Scanner keyboard = new Scanner(System.in);
   //default
   ///use as a tool-the cyper is the tool
   //my tests
   Cypher test = new Cypher();
   test.print(test.encrypt("Hello"));
   String hold =test.encrypt("Hello");
   test.printAndEncrypt(hold);
   test.printAndEncrypt("goodBye");

   System.out.println(
   "Welcome! Below please enter a message you want to code. See above for examples.\n"+
   "Enter the message directly into the printAndEncrpt method.\n"+
     "You may enter any characters. The message will be reversed first.\n"+
     "If it is a letter, the case will be switched, and it will be switched with a letter across(a to z. n to m).\n"+
     "Numbers or other character will remain the same.\n"+
     "If you wish to undo the encryption simply put it back into the cypher.");
   Cypher tester = new Cypher();
   tester.printAndEncrypt(""+keyboard.nextLine());
   
 }
}
