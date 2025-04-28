package StaticExample;

public class Main {
    void work(){
        System.out.println("work");
    }
    public static void salary(){
        System.out.println("salary");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        obj.work();

        System.out.println("It can be access in three ways");
        Main.salary();
        obj.salary();
        salary();
    }
}
