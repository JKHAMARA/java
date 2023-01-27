public class JuliusKhamara 
{
public static void main(String[] args) 
{
// 1. Arrays
String[] sauces = {"Cassava Leaves", "Potato Leaves", "Egusi Soup", "Stew", "Beans", "Groundnut Soup"};
System.out.println(sauces[0]);

// Multidimensional Arrays
int[][] myGrades = { {56, 90, 32, 76, 89, 50, 99, 83}, {75, 96, 97, 67, 66, 99, 54, 81} };
System.out.println(myGrades[0][6]);

// 2. Strings
String name = "Julius Khamara";
System.out.println(name); 

// 3. StringBuffer
StringBuffer sb=new StringBuffer("Julius Khamara ");  
sb.append(8050);
System.out.println(sb);

// 4. StringBuilder
StringBuilder jv=new StringBuilder("Java");  
jv.delete(1,3);  
System.out.println(jv);  

// 5. Command Line Arguments
System.out.println("Your first argument is: "+args[0]);  
}
}