package StaticExample;

class Madhan{
    int rno = 27;
    String name = "Madhan";


     static void Aadhitya(){
        System.out.println("Aadhitya se ps5 milega");
    }
}
class rampo extends Madhan{
    int rno = 28;
    String name = "Rampo";

    static void rampo(){
//        rampo obj = new rampo();
        System.out.println("Rampo won 100000 at my11circle");
//        obj.Aadhitya();
        Madhan.Aadhitya();
    }

//        Madhan.Aadhitya();


}

public class Isha extends Madhan{
    public static void main(String[] args) {
      Isha isha = new Isha();

      isha.Aadhitya();
      rampo.rampo();
        System.out.println(isha.rno);
        System.out.println(isha.name);




    }
}



