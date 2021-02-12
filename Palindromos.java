
package palindromos;
import java.util.Scanner;
public class Palindromos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i=0, j, pos=0, contador1=0, contador2=0;
        String frase;
        System.out.println("Escriba una palabra");
        frase = entrada.nextLine();
        j=(frase.length()-1);
        while (i<frase.length() & j>=0)
            if (!Character.isLetter(frase.charAt(i)))
                i++;
            else
                if (!Character.isLetter(frase.charAt(j)))
                    j--;
                else
                    if (frase.charAt(i) == frase.charAt(j)){
                        contador1++;
                        i++;
                        j--;
                    }
                    else{
                        i++;
                        j--;
                    }
        while (pos <= (frase.length()-1))
            if (Character.isLetter(frase.charAt(pos))){
                contador2++;
                pos++;
            }
            else
                pos++;
        if (contador1 == contador2)
            System.out.println("La palabra es un palindromo.");
        else
            System.out.println("La palabra no es un palindromo.");
    }	
}


