public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        swap(a, b);
//        System.out.print(a + " " + b);
    }
        static void swap(int a,int b){
            int temp = a;
            a = b;
            b = temp;
            System.out.print(a + " " + b);
        }
    }

