public class Colaint {

    public static void main(String[] args) {
        int Num =0;
        ColaNumEntero Cln= new ColaNumEntero(3);
        try{
            System.out.println("AGREGAMOS 1");
            Cln.encolar(1);
            System.out.println("AGREGAMOS 2");
            Cln.encolar(2);
            Num = Cln.sacar();
            System.out.println("SACAMOS "+Num);
            Num = Cln.sacar();
            System.out.println("SACAMOS"+Num);
            System.out.println("AGREGAMOS 10");
            Cln.encolar(10);
        }catch(ExcepcionColaLlena Err){
            System.out.println(Err.getMessage());
        }catch(ExceptionColaVacia Err){
            System.out.println(Err.getMessage());
        }
    }  
}
