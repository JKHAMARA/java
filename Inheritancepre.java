public class Inheritancepre {
    public static void main(String[] args) {

// Constructor example    
Pokemon p1 = new Pokemon();
System.out.println(p1.level);   

Pokemon p2 = new Pokemon("Eevee", 25);
System.out.println(p2.level);
p2.attack();


// Example 2
//      Pokemon p1 = new Pokemon();
//      p1.name = "Pikachu";
//      p1.level = 100;
     
//      System.out.println(p1.name + " " + p1.level);
       
//      Pokemon p2 = new Pokemon();
//      p2.name = "Eevee";
//      p2.level = 50;
     
//      System.out.println(p2.name + " " + p2.level);
       
//      p2.attack();
       
            
        // Programmer p = new Programmer();
        // System.out.println("Programmer salary is:"+p.salary);
        // System.out.println("Programmer bonus is:"+p.bonus);
    }
}

// class Employee{
//     float salary = 40000;
// }
// class Programmer extends Employee{
//     int bonus = 100000;
// }