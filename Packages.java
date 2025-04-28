//cat.java
package animal;

public class cat {
    public static void main(String[] args) {
        cat caters = new cat();
        caters.greeting();
    }

    public void greeting(){
        System.out.println("This is cat in animal Package");
    }
}

//dog.java
package animal;

public class dog {
    public static void main(String[] args) {
        dog doger  = new dog();
        doger.dog();
        doger.dog3();
         dog();

    }

    public static  void dog(){
        System.out.println("This is dog in animal package");
    }
   public  void dog2(){
        System.out.println("This is dog2 in animal package");
    }
    public void dog3(){
        System.out.println("This is dog3 in animal package");
    }
}


//Fruit Package
//apple.java

package fruit;
import animal.*;

import animal.cat;
import animal.dog;

import java.util.Scanner;

public class apple {
    public static void main(String[] args) {
        dog d = new dog();
        cat cater = new cat();
        d.dog();
        Scanner se = new Scanner(System.in);
    }
}

