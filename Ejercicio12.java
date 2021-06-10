import java.util.Scanner;

/**
 * Ejercicio12
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double alturaM, cm, alturaF, cf, edadT,total,altura;
        String sexo=""; alturaM = 0; cm = 0; alturaF=0; cf =0; edadT=0; total=0;

        do {
            System.out.println("ingrese la altura ");
            altura = scanner.nextDouble();
            System.out.println("ingrese la edad ");
            double edad = scanner.nextDouble();
            System.out.println("ingrese sexo ");
            sexo = scanner.next();
            if (sexo.equalsIgnoreCase("f")) {
                alturaF+=altura;
                cf++;
            } else {
                if (sexo.equalsIgnoreCase("m")) {
                    alturaM+=altura;
                    cm++;
                }
            }
            edadT+=edad;
            total++;
        } while (0<altura);
        if (cf == 0) {
            cf++;
        }
        if (total==0) {
            total++;
        }
        if (cm==0) {
            cm++;
        }
        alturaF /=cf;
        edadT /=total;
        alturaM /=cm;
        System.out.println("altura mujeres: "+alturaF+" altura hombres: "+alturaM+" edad: "+edadT);
    }
}