import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
ArrayList<Student> Students=new ArrayList<>();
for(int i=1;i<=5;i++){
System.out.println("enter student id");
int id =sc.nextInt();
sc.nextLine();
System.out.println("enter student name");
String name =sc.nextLine();
System.out.println("enter student Marks");
double marks =sc.nextDouble();
System.out.println("enter student Age");
int age =sc.nextInt();
sc.nextLine();
System.out.println("enter student branch");
String branch =sc.nextLine();
Student s =new Student(id, name, marks, age, branch);
Students.add(s);
}
//Display all students
for(Student s:Students){
s.display();
System.out.println("\nAll student details");
}
//search students Id
System.out.println("enter student Id to search");
int searchId=sc.nextInt();
boolean found=false;
for(Student S:Students){
if(S.id==searchId){
S.display();
found=true;
break;
}
}
if(! found){
System.out.println("Students not found");
}
// update studentId
System.out.println("enter student Id to update");
int updateId=sc.nextInt();
boolean find=false;
for(Student S:Students){
if(S.id==updateId){
System.out.println("enter new marks");
double newmarks=sc.nextDouble();
S.marks=newmarks;
System.out.println("marks updated succesfully");
S.display();
find=true;
break;
}
}
if(! find){
System.out.println("Students not find");
}
System.out.println("Enter student Id delete");
int deleteId=sc.nextInt();
boolean deleted=false;
Iterator<Student> it=Students.iterator();
while (it.hasNext()) {
 Student s = it.next();
    if (s.id == deleteId) {
        it.remove();
        deleted = true;
        System.out.println("Student deleted successfully!");
        break;
    }
}
if (!deleted) {
    System.out.println("Student not found");
}
// Display remaining students
System.out.println("\nRemaining Student Details:");
for (Student s : Students) {
    s.display();
    System.out.println();
}
sc.close();
}
}




