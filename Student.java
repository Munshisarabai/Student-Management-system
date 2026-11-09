public class Student{
int id;
String name;
double marks;
int age;
String branch;

 Student(int id,String name,double marks,int age,String branch){
    this.id=id;
    this.name=name;
    this.marks=marks;
    this.age=age;
    this.branch=branch;
}
void display(){
System.out.println("id:"+id);
System.out.println("name:"+name);
System.out.println("marks:"+marks);
System.out.println("age:"+age);
System.out.println("branch:"+branch);

}

}