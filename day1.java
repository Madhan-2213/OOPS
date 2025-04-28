class Student {
    int rno;
    String name;
    int age;
    float marks;

    Student(int rno, String name, int age, float marks) {
        this.rno = rno;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }


    void greeting() {
        System.out.println("Hello, " + name + "!");
    }

    void changeName(String newName){
        this.name = newName;
    }
    Student(Student other){  // copy constructor
        this.rno = other.rno;
        this.name = other.name;
        this.age = other.age;
        this.marks = other.marks;
    }
    Student(){
    this(22,"Maddy",19,100.f);
    }



}

public class Main{
    public static void main(String[] args) {
        Student student = new Student(27,"Madhan",20,99.8f);
//        Student kunal = new Student();
//        student.rno = 27;
//        student.name = "Madhan";
//        student.age = 20;
//        student.marks = 5.5f;
//        student.greeting();

        student.changeName("ferose");
        student.greeting();

        Student random  = new Student(student);
        Student random2 = new Student();

        // copy the object by other object

        System.out.println(student.rno);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.marks);
        System.out.println(random.name);
        System.out.println(random2.name);
//        System.out.println(kunal.rno);
//        System.out.println(kunal.name);
    }
}
