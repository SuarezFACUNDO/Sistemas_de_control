public class CalculoSueldoNetoRandom {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10) {
            // Generar la categoría al azar
            String categoria = generarCategoriaAleatoria();

            // Generar la antigüedad al azar entre 1 y 15 años
            int antiguedad = generarAntiguedadAleatoria();

            // Generar el sueldo bruto al azar entre 1000 y 5000
            double sueldoBruto = generarSueldoBrutoAleatorio();

            // Calcular el sueldo neto
            double sueldoNeto = calcularSueldoNeto(categoria, antiguedad, sueldoBruto);

            // Mostrar el resultado
            System.out.println("Empleado " + contador + ":");
            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.println("Sueldo bruto: " + sueldoBruto);
            System.out.println("Sueldo neto: " + sueldoNeto);
            System.out.println();

            contador++;
        }
    }

    public static String generarCategoriaAleatoria() {
        int numAleatorio = (int) (Math.random() * 3);
        String categoria;

        switch (numAleatorio) {
            case 0:
                categoria = "A";
                break;
            case 1:
                categoria = "B";
                break;
            case 2:
                categoria = "C";
                break;
            default:
                categoria = "A"; // Valor por defecto si el número aleatorio está fuera de rango
                break;
        }

        return categoria;
    }

    public static int generarAntiguedadAleatoria() {
        return (int) (Math.random() * 15) + 1;
    }

    public static double generarSueldoBrutoAleatorio() {
        return (Math.random() * 4000) + 1000;
    }

    public static double calcularSueldoNeto(String categoria, int antiguedad, double sueldoBruto) {
        double aumento = 0.0;

        if (antiguedad >= 1 && antiguedad <= 5) {
            aumento = sueldoBruto * 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            aumento = sueldoBruto * 0.10;
        } else if (antiguedad > 10) {
            aumento = sueldoBruto * 0.30;
        }

        double plus = 0.0;

        switch (categoria) {
            case "A":
                plus = 1000;
                break;
            case "B":
                plus = 2000;
                break;
            case "C":
                plus = 3000;
                break;
            default:
                System.out.println("Categoría inválida");
                break;
        }

        return sueldoBruto + aumento + plus;
    }
}
