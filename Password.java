import java.util.Random;
import java.util.Scanner;
public class  Password {
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   System.out.println(" Enter the length of password:");
    int n =sc.nextInt();
    sc.nextLine();
    System.out.println("do u want special characters in your password(y/n)");
    String choice1=sc.nextLine();
    System.out.println("do u want to add uppercase in your password(y/n)");
    String choice2=sc.nextLine();
    System.out.println("do u want to add lowercase in your password(y/n)");
    String choice3=sc.nextLine();
    
    
   Random rand =new Random();
   String password="";
   String store ="ABCDEFGHI34J5KLM0NO5PQ&7&9RST656UVW5879X@YZa%bcd^efgh21ijkl45mno6pq16r65175stuvwxyz@#$%^&*!";
   if(choice1.equals("y")&choice2.equals("y")&choice3.equals("y")){
   for(int i=0;i<n;i++){
    
int index=rand.nextInt(store.length());


   password+=store.charAt(index);


   }
} 
String store1="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

if(choice1.equals("n")&choice2.equals("y")&choice3.equals("y")){
    for(int i=0;i<n;i++){
    int index1=rand.nextInt(store1.length()); 
    password+=store1.charAt(index1);
}
} 

String store2="!@#$%^&*";
if(choice1.equals("y")&choice2.equals("n")&choice3.equals("n")){
    for(int i=0;i<n;i++){
        int index2=rand.nextInt(store2.length());
        password+=store2.charAt(index2);

    }
}

String store3="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
if(choice1.equals("n")&choice2.equals("y")&choice3.equals("n")){
for(int i=0;i<n;i++){
        int index3=rand.nextInt(store3.length());
        password+=store3.charAt(index3);}

}

String store4="abcdefghijklmnopqrstuvwxyz";
if(choice1.equals("n")&choice2.equals("n")&choice3.equals("y")){
    for(int i=0;i<n;i++){
    int index4=rand.nextInt(store4.length());
    password+=store4.charAt(index4);
}
}

String store5="abcdefghijklmnopqrstuvwxyz!@#$%^&*";
if(choice1.equals("y")&choice2.equals("n")&choice3.equals("y")){
    for(int i=0;i<n;i++){
    int index5=rand.nextInt(store5.length());
    password+=store5.charAt(index5); 
} 
}

String store6="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*";
if(choice1.equals("y")&choice2.equals("y")&choice3.equals("n")){
for(int i=0;i<n;i++){
        int index6=rand.nextInt(store6.length());
        password+=store6.charAt(index6);}

}
  if(choice1.equals("n")&choice2.equals("n")&choice3.equals("n")){
    System.out.println("No values entered ");
    return;
  }
  
  
  
  
    System.out.println("Suggested password:"+ password);


}
}
