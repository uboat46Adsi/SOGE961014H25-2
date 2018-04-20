package mx.com.itam.adsi.ejercicio;

/** Represents a Solucion for adsi´s exam.
* @version 1.0.1
* @since 1.0
*/
public class Solucion {
    
    public boolean problema(String s) {
        String res = "";
        System.out.print(s);
        System.out.print(" => ");
        while(res.length() < s.length() - 1 ){
            res += s.charAt(res.length());
            if(s.replaceAll(res, "").trim().isEmpty()){
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String...argv) {
        Solucion sol = new Solucion();
    }

}

