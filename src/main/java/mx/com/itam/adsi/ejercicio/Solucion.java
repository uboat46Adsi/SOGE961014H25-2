package mx.com.itam.adsi.ejercicio;

/** Represents a Solucion for adsi´s exam.
* @version 1.0.1
* @since 1.0
*/
public class Solucion {
    
    public boolean problema(string s) {
        String res = "";

        while(res.length() < s.length()){
            res += s.charAt(res.length());
            if(s.replaceAll(res, "") == ""){
                return true;
            }
        }

        return false;
    }

    public static void main(String...argv) {
        Solucion sol = new Solucion();
    }

}

