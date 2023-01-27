public class ControlStatements 
{
public static void main(String[] args)
{
// CONTROL STATEMENTS IN JAVA

// 1. if statement
if (20 > 18) {
    System.out.println("20 is greater than 18");
  }

// 2. else statement
int time = 20;
if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

// 3. else if  statement
int time1 = 22;
if (time1 < 10) {
  System.out.println("Good morning.");
} else if (time1 < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
}

// 4. switch statement
int names = 4;
switch (names) {
  case 1:
    System.out.println("Ibrahim Sillah");
    break;
  case 2:
    System.out.println("Moses Kargbo");
    break;
  case 3:
    System.out.println("Patrick Khamara");
    break;
  case 4:
    System.out.println("Vanessa Thomas");
    break;
  default:
    System.out.println("Julius Khamara");
}  

// 5. while loop
int i = 0;
while (i < 5) {
  System.out.println(i);
  i++;
}

// 6. do/while loop
int j = 0;
do {
  System.out.println(i);
  j++;
}
while (j < 5);

// 7. for loop
for (int k = 0; k < 5; k++) {
    System.out.println(k);
  }

// 8. nested for loop
// Outer loop
for (int a = 1; a <= 2; a++) {
    System.out.println("Outer: " + a); // Executes 2 times
    
    // Inner loop
    for (int b = 1; b <= 3; b++) {
      System.out.println(" Inner: " + b); // Executes 6 times (2 * 3)
    }
  } 

// 9. for-each loop
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String l : cars) {
  System.out.println(l);
}

// 10. break
for (int s = 0; s < 10; s++) {
    if (s == 4) {
      break;
    }
    System.out.println(s);
  }

// 11. continue
for (int t = 0; t < 10; t++) {
    if (t == 4) {
      continue;
    }
    System.out.println(t);
  }
}
}
