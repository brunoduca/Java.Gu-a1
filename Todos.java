/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package Ejercicios_Guía1;

import java.util.Random;
import java.util.Scanner;

public class Todos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Qué ejercicio desea realizar/ver?");
        String ejercicios = leer.nextLine();
        ejercicios = ejercicios.toUpperCase();
        switch (ejercicios) {
            case "1":
                Ejercicio_1();
            case "2":
                Ejercicio_2();
                break;
            case "3":
                Ejercicio_3();
                break;
            case "4":
                Ejercicio_4();
                break;
            case "5":
                Ejercicio_5();
                break;
            case "6":
                Ejercicio_6();
            case "7":
                Ejercicio_7();
                break;
            case "8":
                Ejercicio_8();
                break;
            case "9":
                Ejercicio_9();
                break;
            case "10":
                Ejercicio_10();
                break;
            case "11":
                Ejercicio_11();
                break;
            case "12":
                Ejercicio_12();
                break;
            case "13":
                Ejercicio_13();
                break;
            case "14":
                Ejercicio_14();
                break;
            case "15":
                Ejercicio_15();
                break;
            case "16":
                Ejercicio_16();
                break;
            case "17":
                Ejercicio_17();
                break;
            case "18":
                Ejercicio_18();
                break;
            case "19":
                Ejercicio_19();
                break;
            case "20":
                Ejercicio_20();
                break;
            case "21":
                Ejercicio_21();
                break;
            case "EXTRA_1":
                Extra_1();
                break;
            case "EXTRA_2":
                Extra_2();
                break;
            case "EXTRA_3":
                Extra_3();
                break;
            case "EXTRA_4":
                Extra_4();
                break;
            case "EXTRA_5":
                Extra_5();
                break;
            case "EXTRA_6":
                Extra_6();
                break;
            case "EXTRA_7":
                System.out.println("¿Cuál de los dos ejercicios desea ver? (1/2)");
                String ejercicio7 = leer.nextLine();
                switch (ejercicio7) {
                    case "1":
                        Extra_7_1();
                        break;
                    case "2":
                        Extra_7_2();
                        break;
                }
            case "EXTRA_8":
                Extra_8();
                break;
            case "EXTRA_9":
                Extra_9();
                break;
            case "EXTRA_10":
                Extra_10();
                break;
            case "EXTRA_11":
                Extra_11();
                break;
            case "EXTRA_12":
                Extra_12();
                break;
            case "EXTRA_13":
                Extra_13();
                break;
            case "EXTRA_14":
                Extra_14();
                break;
            case "EXTRA_15":
                Extra_15();
                break;
            case "EXTRA_16":
                Extra_16();
                break;
            case "EXTRA_17":
                Extra_17();
                break;
            case "EXTRA_18":
                Extra_18();
                break;
            case "EXTRA_19":
                Extra_19();
                break;
            case "EXTRA_20":
                Extra_20();
                break;
            case "EXTRA_21":
                Extra_21();
                break;
            case "EXTRA_22":
                Extra_22();
                break;
            case "EXTRA_23":
                Extra_23();
                break;
            case "EXTRA_24":
                Extra_24();
                break;
        }

    }

    public static void Ejercicio_1() {
        int n1;
        int n2;
        int resultado;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        n2 = leer.nextInt();
        resultado = (n1 + n2);
        System.out.println("El resultado es = " + resultado);
    }

    public static void Ejercicio_2() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre;
        nombre = leer.next();
        System.out.println("Su nombre es " + nombre);
    }

    public static void Ejercicio_3() {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Ingrese una frase");
        frase = leer.next();
        frase = frase.toUpperCase();
        System.out.println("Mayúscula: " + frase);
        frase = frase.toLowerCase();
        System.out.println("Minúscula " + frase);

    }

    public static void Ejercicio_4() {
        Scanner leer = new Scanner(System.in);
        double grados, resultado;
        System.out.println("Ingrese la cantidad de grados");
        grados = leer.nextDouble();
        resultado = 32 + (9 * grados / 5);
        System.out.println("El resultado en grados Fahrenheit es " + resultado);

    }

    public static void Ejercicio_5() {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un número");
        n = leer.nextInt();
        System.out.println("El doble del número ingresado es: " + (n * 2));
        System.out.println("El doble del número ingresado es: " + (n * 3));
        System.out.println("El doble del número ingresado es: " + (Math.sqrt(n)));

    }

    public static void Ejercicio_6() {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un número");
        num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        } else {
            System.out.println("El número ingresado es impar");
        }

    }

    public static void Ejercicio_7() {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        if (palabra.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

    public static void Ejercicio_8() {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una frase");
        palabra = leer.next();

        if (palabra.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

    public static void Ejercicio_9() {
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Ingrese una frase");
        palabra = leer.next();
        if (palabra.substring(0, 1).equals("a")) {
            System.out.println("CORRECTO");

        } else {
            System.out.println("INCORRECTO");
        }
    }

    public static void Ejercicio_10() {
        Scanner leer = new Scanner(System.in);
        int limite, suma, resultado;
        System.out.print("Ingrese un valor límite positivo ");
        limite = leer.nextInt();
        resultado = 0;
        System.out.print("Ingrese un valor");
        suma = leer.nextInt();

        while (resultado < suma) {
            System.out.print("Ingrese un valor");
            suma = leer.nextInt();
            resultado = resultado + suma;
        }

    }

    public static void Ejercicio_11() {
        Scanner leer = new Scanner(System.in);
        int opcion, num1, num2;
        System.out.println("Ingrese un número");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro número");
        num2 = leer.nextInt();

        do {
            System.out.println("Elija una de las siguientes opciones");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("= " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("= " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("= " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("= " + (num1 / num2));
                    break;
            }

        } while (opcion != 5);

    }

    public static void Ejercicio_12() {
        Scanner leer = new Scanner(System.in);
        String palabra;
        int longitud, cont1, cont2;
        cont1 = 0;
        cont2 = 0;
        do {
            System.out.println("Ingrese una palabra");
            palabra = leer.next();
            longitud = palabra.length();
            if ((longitud <= 5) && (palabra.substring(0, 1).equals("x")) && (palabra.substring(longitud - 1, longitud).equals("o"))) {
                cont1 = cont1 + 1;
                System.out.println("Se ha ingresado un dato correcto");
            } else if (!"&&&&&".equals(palabra)) {
                cont2 = cont2 + 1;
            }

        } while (!"&&&&&".equals(palabra));

        if (cont1 > cont2) {
            System.out.println("Se han registrado más intentos correctos. En total " + cont1);
        } else {
            System.out.println("Se han registrado más intentos incorrectos. En total: " + cont2);
        }
        System.out.println("Hata luego!");

    }

    public static void Ejercicio_13() {
        Scanner leer = new Scanner(System.in);
        String caracter;
        caracter = "* ";
        int longitud;
        System.out.println("Ingrese el largo del cuadrado");
        longitud = leer.nextInt();

        for (int aux1 = 1; aux1 <= longitud; aux1++) {
            for (int aux2 = 1; aux2 <= longitud; aux2++) {
                if ((aux1 == 1) || (aux1 == longitud) || (aux2 == 1) || (aux2 == longitud)) {
                    System.out.print(caracter);
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");

        }
        System.out.println(" ");

    }

    public static void Ejercicio_14() {
        Scanner leer = new Scanner(System.in);
        float plata;
        String opcion;
        System.out.println("Ingrese el importe en Euros: ");
        plata = leer.nextFloat();
        System.out.println("Ingrese el tipo de que desea obtener:\n "
                + "Dolar, Yan, Libra ");
        opcion = leer.next();
        opcion = opcion.toUpperCase();
        float retorno = convertir(plata, opcion);
        System.out.println("El total es = " + retorno);

    }

    public static float convertir(float plata, String opcion) {
        double plata1 = 0;
        switch (opcion) {
            case "DOLAR":
                plata1 = (plata * 1.28611);
                break;
            case "YAN":
                plata1 = plata * 129.852;
                break;
            case "LIBRAS":
                plata1 = plata * 0.86;
                break;
        }
        return (float) plata1;
    }

    public static void Ejercicio_15() {
        Scanner leer = new Scanner(System.in);
        int i, k;
        int[] vector = new int[100];

        for (i = 0; i < 100; i++) {
            vector[i] = i;

        }
        for (i = 99; i > 0; i--) {
            System.out.println(vector[i]);
        }

    }

    public static void Ejercicio_16() {
        Scanner leer = new Scanner(System.in);
        int n, i, n2, cont;
        cont = 0;
        System.out.println("Ingrese el límite del vector");
        n = leer.nextInt();
        int[] vector = new int[n];

        for (i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        System.out.println("Ingrese el número que desea buscar");
        n2 = leer.nextInt();

        for (i = 0; i < n; i++) {
            if (n2 == vector[i]) {
                System.out.println("El número se encuentra en la posición " + i);
                cont = cont + 1;
            }
        }
        if (cont > 1) {
            System.out.println("El número ingresado se encuentra repetido");
        }
        if (cont == 0) {
            System.out.println("No se ha encontrado el número");
        }
    }

    public static void Ejercicio_17() {
        Scanner leer = new Scanner(System.in);
        int n, i, cont, cont1, cont2, cont3, cont4;
        cont = 0;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        System.out.println("Ingrese el límite del vector");
        n = leer.nextInt();
        int[] vector = new int[n];
        String[] num = new String[n];
        int[] longitud = new int[n];
        Random num1 = new Random();

        for (i = 0; i < n; i++) {
            vector[i] = (num1.nextInt(10000 - 0 + 1) + 0);
            num[i] = String.valueOf(vector[i]);
            longitud[i] = num[i].length();

        }
        for (i = 0; i < n; i++) {
            switch (longitud[i]) {
                case 1:
                    cont++;
                    continue;
                case 2:
                    cont1++;
                    continue;
                case 3:
                    cont2++;
                    continue;
                case 4:
                    cont3++;
                    continue;
                case 5:
                    cont4++;
            }
        }
        if ((cont >= 1) || (cont1 >= 1) || (cont2 >= 1) || (cont3 >= 1) || (cont4 >= 1)) {
            System.out.println("Se han encontrado");
        } else {
            System.out.println("No se han encontrado números con las condiciones requeridas");
        }
        if (cont >= 1) {
            System.out.println(cont + "  número/s de un dígito");
        }
        if (cont1 >= 1) {
            System.out.println(cont1 + " número/s de dos dígitos");
        }

        if (cont2 >= 1) {
            System.out.println(cont2 + " números de tres dígitos");
        }

        if (cont3 >= 1) {
            System.out.println(cont3 + " número/s de cuatro dígitos");
        }

        if (cont4 >= 1) {
            System.out.println(cont4 + " número/s de cinco dígitos");
        }
    }

    public static void Ejercicio_18() {
        int[][] matriz = new int[4][4];
        int i, j;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);

            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }

    }

    public static void Ejercicio_19() {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese el tamaño de la matriz");
        n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int i, j, cont;
        cont = 0;

        //Para llenar
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == 0) {
                    System.out.println("Ingrese el número de la posición");
                }
                System.out.println("[" + i + "] [" + j + "]");
                matriz[i][j] = leer.nextInt();
            }
            System.out.println(" ");
        }

        //Para imprimir
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("[" + matriz[j][i] * (-1) + "]");
            }
            System.out.println(" ");
        }

        //Para corroborar
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if ((matriz[i][j]) == (matriz[j][i] * (-1))) {
                    cont++;
                }
            }
        }
        if (cont == (n * n)) {
            System.out.println("La matríz es anti simétrica");
        } else {
            System.out.println("La matriz no es anti simétrica");
        }

    }

    public static void Ejercicio_20() {
        Scanner leer = new Scanner(System.in);
        int sum, sum1, suma3, suma4;
        sum = 0;
        sum1 = 0;
        suma4 = 0;
        suma3 = 0;
        System.out.println("Elija el tamaño del cuadrado mágico");
        int n = leer.nextInt();
        int[] suma1 = new int[n];
        int[] suma2 = new int[n];
        int[][] matriz = new int[n][n];
        System.out.println("¿Desea llenar la matriz de manera manual? (s/n)");
        String opcion = leer.next();
        opcion = opcion.toUpperCase();
        switch (opcion) {
            case "S":
                LlenarMatrizManual(matriz, n);
                break;
            case "N":
                LlenarMatrizAutomatico(matriz, n);
        }
        MostrarMatriz(matriz, n);
        LlenarSumas(matriz, sum, suma1, sum1, suma2, suma3, suma4, n);
        Comprobar(suma1, suma2, suma4, suma4, n);

    }

    public static void LlenarMatrizManual(int[][] matriz, int n) {
        Scanner leer = new Scanner(System.in);
        int numero;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("Ingrese un número para la posición: \n"
                            + "[" + i + "] [" + j + "]");
                    numero = leer.nextInt();
                } else {
                    System.out.println("[" + i + "] [" + j + "]");
                    numero = leer.nextInt();
                }
                if ((numero >= 1) && (numero <= 9)) {
                    matriz[i][j] = numero;
                } else {
                    do {
                        System.out.println("Número incorrecto. Ingrese otro número");
                        numero = leer.nextInt();
                    } while ((numero < 1) || (numero > 9));
                    matriz[i][j] = numero;

                }
            }
        }

    }

    public static void LlenarMatrizAutomatico(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
            }
        }
    }

    public static void MostrarMatriz(int[][] matriz, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
                //Imprimir
            }
            System.out.println(" ");
        }
    }

    public static void LlenarSumas(int[][] matriz, int sum, int[] suma1, int sum1, int[] suma2, int suma3, int suma4, int n) {

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum = sum + matriz[j][i];
                //Para columnas
            }
            suma1[i] = sum;
        }

        for (int i = 0; i < n; i++) {
            sum1 = 0;
            for (int j = 0; j < n; j++) {
                sum1 = sum1 + matriz[i][j];
                //Para filas
            }
            suma2[i] = sum1;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    suma3 = suma3 + matriz[i][j];
                    //Para Diagonal izquierda
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (((i == 1) && (j == 1)) || ((i == (n - 1)) && (j == 0)) || ((i == 0) && (j == (n - 1)))) {
                    suma4 = suma4 + matriz[i][j];
                    //Para Diagonal derecha
                }
            }
        }

    }

    public static void Comprobar(int[] suma1, int[] suma2, int suma3, int suma4, int n) {
        int cont = 0;
        for (int i = 0; i < n; i++) {
            if ((suma1[i] == suma2[i]) || (suma1[i] == suma3) || (suma1[i] == suma4)) {
                cont = cont + 1;
            }

        }
        if (cont == 3) {
            System.out.println("El cuadrado es mágico");
        } else {
            System.out.println("El cuadrado no es mágico");

        }
    }

    public static void Ejercicio_21() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea ingresar los datos por teclado? (s/n)");
        String opcion = leer.nextLine();
        opcion = opcion.toUpperCase();
        int[][] matrizMayor = new int[10][10];
        int[][] matrizMenor = new int[3][3];
        switch (opcion) {
            case "S":
                LlenarManual(matrizMayor, matrizMenor);
                break;
            case "N":
                LlenarAutomatico(matrizMayor, matrizMenor);
        }
        MostrarMatriz(matrizMayor, matrizMenor);
        Comprobar(matrizMayor, matrizMenor);
    }

    public static void LlenarManual(int[][] matrizMayor, int[][] matrizMenor) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("MATRIZ 10 X 10 \n"
                            + "Ingrese un número para la posición \n"
                            + "[" + i + "] [" + j + "]");
                    matrizMayor[i][j] = leer.nextInt();
                } else {
                    System.out.println("[" + i + "] [" + j + "]");
                    matrizMayor[i][j] = leer.nextInt();
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("MATRIZ 3 X 3 \n"
                            + "Ingrese un número para la posición \n"
                            + "[" + i + "] [" + j + "]");
                    matrizMenor[i][j] = leer.nextInt();
                } else {
                    System.out.println("[" + i + "] [" + j + "]");
                    matrizMenor[i][j] = leer.nextInt();
                }

            }
        }
    }

    public static void LlenarAutomatico(int[][] matrizMayor, int[][] matrizMenor) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizMayor[i][j] = (int) ((Math.random()) * 100);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizMenor[i][j] = (int) ((Math.random()) * 100);
            }
        }
    }

    public static void MostrarMatriz(int[][] matrizMayor, int[][] matrizMenor) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("MATRIZ 10 X 10");
                }
                System.out.print("[" + matrizMayor[i][j] + "]" + "");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == 0) && (j == 0)) {
                    System.out.println("MATRIZ 3 X 3");
                }
                System.out.print("[" + matrizMenor[i][j] + "]" + "");
            }
            System.out.println("");
        }
    }

    public static void Comprobar(int[][] matrizMayor, int[][] matrizMenor) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if ((i < 3) && (j < 3)) {
                    if (matrizMayor[i][j] == matrizMenor[i][j]) {
                        System.out.println("Existe una coincidencia en la posición \n"
                                + " " + i + ", " + j + " ");
                    }
                } else if ((i > 3) || (j > 3)) {
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            if (matrizMayor[i][j] == matrizMenor[k][l]) {
                                System.out.println("Existe una coincidencia en la posición \n"
                                        + " " + i + ", " + j + " ");
                            }
                        }
                    }
                }

            }
        }
    }

    public static void Extra_1() {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese minutos");
        num = leer.nextInt();

        if (num < 60) {
            System.out.println("El número ingresado corresponde a menos de una hora");

        } else {
            System.out.println("El total es = " + num / 60 + " hora/s");
        }
        if (num < 1440) {
            System.out.println("El número ingresado corresponde a menos de un día");

        } else {
            System.out.println("Y total es = " + num / 1440 + " día/s");
        }
    }

    public static void Extra_2() {
        int a, b, c, d, aux;
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        System.out.println("Al princpio a=[" + a + "] " + " b=[" + b + "] " + " c=[" + c + "] " + "  d=[" + d + "]");
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("Ahora  a=[" + a + "] " + " b=[" + b + "] " + " c=[" + c + "] " + "  d=[" + d + "]");

    }

    public static void Extra_3() {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String n = leer.nextLine();
        if (("A".equals(n)) || ("E".equals(n)) || ("I".equals(n)) || ("O".equals(n)) || ("U".equals(n))) {
            System.out.println("La letra ingresada es vocal");
        } else {
            System.out.println("La letra ingresada no es vocal");
        }
    }

    public static void Extra_4() {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in, "ISO-8859-1");

        System.out.println("INGRESE UN NÚMERO DEL 1 AL 10:");

        int num = leer.nextInt();

        switch (num) {

            case 1:
                System.out.println(num + " en romano es I");
                break;
            case 2:
                System.out.println(num + " en romano es II");
                break;
            case 3:
                System.out.println(num + " en romano es III");
                break;
            case 4:
                System.out.println(num + " en romano es IV");
                break;
            case 5:
                System.out.println(num + " en romano es V");
                break;
            case 6:
                System.out.println(num + " en romano es VI");
                break;
            case 7:
                System.out.println(num + " en romano es VII");
                break;
            case 8:
                System.out.println(num + " en romano es VIII");
                break;
            case 9:
                System.out.println(num + " en romano es IX");
                break;
            case 10:
                System.out.println(num + " en romano es X");
                break;
            default:
                System.out.println("El dato ingresado no está entre 1 y 10.");
        }

    }

    public static void Extra_5() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su plan");
        String opcion = leer.nextLine();
        opcion = opcion.toUpperCase();
        System.out.println("Ingrese el costo del tratamiento");
        int costo = leer.nextInt();

        switch (opcion) {
            case "A":
                System.out.println("El costo del tratamiento es = " + (costo / 2));
                break;
            case "B":
                System.out.println("El costo del tratamiento es = " + (costo - (costo * 0.35)));
                break;
            case "C":
                System.out.println("Su plan no posee descuento. Debe abonar = " + costo);
                break;
            default:
                System.out.println("El plan ingresado no es válido");

        }
    }

    public static void Extra_6() {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas que desea analizar");
        int n = leer.nextInt();
        float[] alturas = new float[n];
        float suma;
        suma = 0;
        float suma1;
        suma1 = 0;
        float cont;
        cont = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1) + " en centímetros");
            alturas[i] = leer.nextFloat();
            suma = suma + (alturas[i] / 100);
            if (alturas[i] < 160) {
                suma1 = suma1 + (alturas[i] / 100);
                cont = cont + 1;
            }
        }
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 m es : \n"
                + (suma1 / cont) + " m");
        System.out.println("El promedio de estaturas en general es : \n "
                + (suma / n) + " m");

    }

    public static void Extra_7_1() {
        Scanner leer = new Scanner(System.in);

        /**
         * System.out.println("Ingrese la cantidad de números que desea
         * analizar"); int n = leer.nextInt();
         */
        int menor, mayor, suma, cont, num;
        menor = 100000;
        mayor = 0;
        suma = 0;
        cont = 0;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            if ((num > mayor) && (num > 0)) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
            suma = suma + num;
            cont = cont + 1;
        } while (cont < 4);
        // } while (cont < n);

        suma = (suma / cont);
        System.out.println(suma);

    }

    public static void Extra_7_2() {
        Scanner leer = new Scanner(System.in);
        int menor, mayor, suma, cont, num;
        menor = 100000;
        mayor = 0;
        suma = 0;
        cont = 0;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        System.out.println("¿Desea ingresar un número (s/n");
        String opcion = leer.nextLine();

        while (opcion.equals("s")) {
            if ((num > mayor) && (num > 0)) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
            suma = suma + num;
            cont = cont + 1;
        }

        suma = (suma / cont);
        System.out.println(suma);

    }

    public static void Extra_8() {
        Scanner leer = new Scanner(System.in);
        int cont;
        int cont1;
        int cont2;
        cont = 0;
        cont1 = 0;
        cont2 = 0;
        String opcion;
        do {
            cont = cont + 1;
            System.out.println("Ingrese un número entero");
            int num = leer.nextInt();
            if (num % 5 == 0) {
                System.out.println("La cantidad de números leídos es = " + cont);
                System.out.println("La cantidad de números pares es = " + cont1);
                System.out.println("La cantidad de números impares es = " + cont2);
                break;
            }
            if (num % 2 == 0) {
                cont1 = cont1 + 1;
            } else {
                cont2 = cont2 + 1;
            }

            System.out.println("¿Desea continuar? (s/n)");
            opcion = leer.nextLine();
        } while (opcion.equals("s"));
    }

    public static void Extra_9() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro valor");
        int num2 = leer.nextInt();
        int resta;
        int cont = 1;
        System.out.println(num1 + " / " + num2 + " :");
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

        do {

            resta = num1 - num2;
            if (num2 < resta) {
                System.out.println("Dado que " + num2 + " es menor que " + resta + " el residuo es " + num2 + " y el cociente es " + cont);
                break;
            } else {
                System.out.println(resta + " - " + num2 + " = " + (resta - num2));
            }
            cont = cont + 1;
        } while (num2 > resta);

    }

    public static void Extra_10() {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10 + 1);
        int num2 = (int) (Math.random() * 10 + 1);
        int mult = num1 * num2;
        System.out.println("Ingrese el el resultado de la multiplicación");
        int num3 = leer.nextInt();
        if (num3 == mult) {
            System.out.println("Exclente! Usted ha acertado");
        } else {
            System.out.println("Lamentablemente no ha acertado ");
        }

    }

    public static void Extra_11() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        int resto;
        int cont;
        cont = 0;
        resto = num;
        /**
         * String longitud = String.valueOf(num); int tamaño =
         * longitud.length(); System.out.println("El número ingresado tiene: " +
         * tamaño + " dígitos"); (una forma de hacerlo)
         */

        do {
            cont = cont + 1;
            resto = (resto / 10);
        } while (resto > 0);
        System.out.println("El nñumero ingresado: " + num + " tiene " + cont + " dígitos");
    }

    public static void Extra_12() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 3) {
                        System.out.println("E-" + "-" + j + "-" + k);
                    } else if (j == 3) {
                        System.out.println(i + "-E" + "-" + k);
                    } else if (k == 3) {
                        System.out.println(i + "-" + j + "-E");
                    } else {
                        System.out.println(i + "-" + j + "-" + k);
                    }
                }

            }
        }
    }

    public static void Extra_13() {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la escalera");
        int tamaño = leer.nextInt();
        System.out.println("");
        for (int i = 1; i <= tamaño ; i ++){
            for (int j = 1; j <=  i; j ++){
                System.out.print(j + "");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void Extra_14() {
        Scanner leer = new Scanner(System.in);
        int media1;
        media1 = 0;
        int media;
        media = 0;
        int hijos;
        System.out.println("Ingrese la cantidad de familias que desea analizar");
        int familias = leer.nextInt();
        for (int i = 0; i < familias; i++) {
            media1 = 0;
            media = 0;
            hijos = 0;
            System.out.println("Familia " + (i + 1) + ":");
            System.out.println("¿Cuántos hijos tiene?");
            hijos = leer.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("¿Cál es la edad del hijo " + (j + 1) + "?");
                media = leer.nextInt();
                media1 = media1 + media;
            }
            System.out.println("La media de la familia " + (i + 1) + " es: " + media1 / hijos);
            System.out.println("");
        }
    }

    public static void Extra_15() {
        Scanner leer = new Scanner(System.in);
        String opcion;
        System.out.println("Elija una de las siguientes opciones \n"
                + "1. Suma \n"
                + "2. Resta \n"
                + "3. Multiplicación \n"
                + "4. División");
        opcion = leer.nextLine();
        System.out.println("Ingrese dos valores");
        int n1 = leer.nextInt();
        int n2 = leer.nextInt();
        switch (opcion) {
            case "1":
                System.out.println(suma(n1, n2));
                break;
            case "2":
                System.out.println(resta(n1, n2));
                break;
            case "3":
                System.out.println(multiplicacion(n1, n2));
                break;
            case "4":
                System.out.println(division(n2, n1));
                break;
        }
    }

    public static int suma(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public static int resta(int n1, int n2) {
        int resta = (n1 - n2);
        return resta;
    }

    public static int multiplicacion(int n1, int n2) {
        int multiplicacion = (n1 * n2);
        return multiplicacion;
    }

    public static int division(int n1, int n2) {
        int division = (n1 / n2);
        return division;
    }

    public static void Extra_16() {
        pedir();
    }

    public static void pedir() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Cuántas personas desea analizar?");
        int personas = leer.nextInt();
        String[] nombre = new String[personas];
        int[] edad = new int[personas];
        String opcion;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1));
            nombre[i] = leer.next();
            System.out.println("Ingrese la edad de " + nombre[i]);
            edad[i] = leer.nextInt();
        }
        for (int i = 0; i < personas; i++) {
            if (edad[i] > 18) {
                System.out.println(nombre[i] + " es mayor de edad");
            } else {
                System.out.println(nombre[i] + " es menor de edad");
            }
            if (i < (personas - 1)) {
                System.out.println("¿Desea continuar?(si/no)");
                opcion = leer.next();
                opcion = opcion.toUpperCase();
                switch (opcion) {
                    case "SI":
                    case "NO":
                        break;
                }
            }
        }
    }

    public static void Extra_17() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        boolean averiguar = false;
        analizar(num, averiguar);

    }

    public static void analizar(int num, boolean averiguar) {
        if ((num / 1 == num) && (num / num == 1) && (0 != num % 2) && (1 != num) || (num == 2)) {
            averiguar = true;
        }
        if (averiguar) {
            System.out.println("El número ingresado es primo");
        } else {
            System.out.println("El número ingresado no es primo");
        }
    }

    public static void Extra_18() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        int suma = 0;
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese un valor para la posición [" + (i + 1) + "]");
            vector[i] = leer.nextInt();
            suma = suma + vector[i];
        }
        System.out.println("La suma de los números ingresados es: \n"
                + suma);
    }

    public static void Extra_19() {
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea que el programa se ejecute de forma automática? (s/n)");
        String opcion = leer.next();
        opcion = opcion.toUpperCase();
        switch (opcion) {
            case "S":
                automatico();
                break;
            case "N":
                manual();
                break;
        }
    }

    public static void automatico() {
        int[] vector1 = new int[3];
        int[] vector2 = new int[3];
        for (int i = 0; i < 3; i++) {
            vector1[i] = (int) (Math.random() * 100);
            vector2[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < 3; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Se encontró una diferencia en la posicón [" + i + "]");
                break;
            } else if (i == 2) {
                System.out.println("Los vectores son iguales");
            }

        }
    }

    public static void manual() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int tamaño = leer.nextInt();
        int[] vector1 = new int[tamaño];
        int[] vector2 = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            if (i == 0) {
                System.out.println("VECTOR 1");
            }
            System.out.println("Ingrese el valor de la posición " + i);
            vector1[i] = leer.nextInt();
        }
        System.out.println("");
        for (int i = 0; i < tamaño; i++) {
            if (i == 0) {
                System.out.println("VECTOR 2");
            }
            System.out.println("Ingrese el valor de la posición " + i);
            vector2[i] = leer.nextInt();
        }
        for (int i = 0; i < tamaño; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Se encontró una diferencia en la posicón [" + i + "]");
                break;
            } else if (i == (tamaño - 1)) {
                System.out.println("Los vectores son iguales");
            }

        }
    }

    public static void Extra_20() {
        int[] vector = new int[3];
        /*
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Desea ingresar el tamaño del vector? (s/n)");
        String opcion = leer.next();
        opcion = opcion.toUpperCase();
        int tam = 0;
        switch (opcion) {
            case "S":
                System.out.println("Ingrese el tamaño del vector");
                tam = leer.nextInt();
                int []vector = new int [tam];
                break;
            case "N":
                tam = (int) (Math.random()*100);
                int []vector = new int [tam];         
        }
         */
        rellenarVector(vector);
        imrimirVector(vector);
    }

    public static void rellenarVector(int[] vector) {
        /* public static void rellenarVector(int[] vector, tam) {
         */
        for (int i = 0; i < 3; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        /*for (int i = 0; i < tam; i++) {
            vector[i] = (int) (Math.random() * 100);
        }*/
    }

    public static void imrimirVector(int[] vector) {
        /*
         public static void imrimirVector(int[] vector, tam) {
         */
        for (int i = 0; i < 3; i++) {
            System.out.println("[" + vector[i] + "]");
        }
        /*for (int i = 0; i < 3; i++) {
            System.out.println("[" + vector[i] + "]");
        }
         */
    }

    public static void Extra_21() {
        Scanner leer = new Scanner(System.in);
        int[] suma = new int[10];
        int nota1, nota2, nota3, nota4, contA, contD;
        contA = 0;
        contD = 0;
        for (int i = 0; i < 10; i++) {
            nota1 = 0;
            nota2 = 0;
            nota3 = 0;
            nota4 = 0;
            System.out.println("ALUMNO: " + (i + 1) + "\n"
                    + "Ingrese la nota del primer TP");
            nota1 = leer.nextInt();
            if ((nota1 >= 1) && (nota1 <= 10)) {
            } else {
                do {
                    System.out.println("El dato ingresado es incorrecto. Ingrese la nota del primer TP");
                    nota1 = leer.nextInt();
                } while ((nota1 < 1) || (nota1 > 10));
            }
            System.out.println("Ingrese la nota del segundo TP");
            nota2 = leer.nextInt();
            if ((nota2 >= 1) && (nota2 <= 10)) {
            } else {
                do {
                    System.out.println("El dato ingresado es incorrecto. Ingrese la nota del segundo TP");
                    nota1 = leer.nextInt();
                } while ((nota2 < 1) || (nota2 > 10));
            }
            System.out.println("Primer Integrador");
            nota3 = leer.nextInt();
            if ((nota3 >= 1) && (nota3 <= 10)) {
            } else {
                do {
                    System.out.println("El dato ingresado es incorrecto. Ingrese la nota del primer Integrador");
                    nota1 = leer.nextInt();
                } while ((nota3 < 1) || (nota3 > 10));
            }
            System.out.println("Segundo integrador");
            nota4 = leer.nextInt();
            if ((nota4 >= 1) && (nota4 <= 10)) {
            } else {
                do {
                    System.out.println("El dato ingresado es incorrecto. Ingrese la nota del segundo Integrador");
                    nota4 = leer.nextInt();
                } while ((nota4 < 1) || (nota4 > 10));
            }
            suma[i] = (int) ((nota1 * 0.1) + (nota2 * 0.15) + (nota3 * 0.25) + (nota4 * 0.5));
            if (suma[i] >= 7) {
                contA = contA + 1;
            } else {
                contD = contD + 1;
            }
        }
        if (contA >= 1) {
            System.out.println("La cantidad de alumnos aprobados es de: " + contA);
        } else {
            System.out.println("No hay ningún alumno aprobado");
        }
        if (contD >= 1) {
            System.out.println("La cantidad de alumnos desaprobados es de: " + contD);
        } else {
            System.out.println("No hay ningún alumno desaprobado");
        }
    }
        public static void Extra_22() {
        Scanner leer = new Scanner(System.in);
        int n;
        int m;
        System.out.println("Ingrese el tamaño de la primera dimensión de la matriz");
        n = leer.nextInt();
        if (n < 1) {
            do {
                System.out.println("El dato ingresado es incorrecto. Ingrese un número mayor a 0");
                n = leer.nextInt();
            } while (n < 1);
        }
        System.out.println("Ingrese el tamaño de la segunda dimensión de la matriz");
        m = leer.nextInt();
        if (m < 1) {
            System.out.println("El dato ingresado es incorrecto. Ingrese un número mayor a 0");
            m = leer.nextInt();
        }
        int[][] matriz = new int[n][m];
        System.out.println("La suma de los valores de la matriz [" + n + "][" + m + "] = " + LlenarMatriz(n, m, matriz));

    }

    public static int LlenarMatriz(int n, int m, int matriz[][]) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 100);
                suma = suma + matriz[i][j];
            }
        }
        return suma;

    }
        public static void Extra_23() {
        Scanner leer = new Scanner(System.in);
        String[][] sopa = new String[20][20];
        int largo;
        String opcion;

        for (int i = 0; i < 20; i++) {
            if (i < 5) {
                System.out.println("Ingrese una palabra de entre 3 a 5 caracteres");
                opcion = leer.nextLine();
                largo = opcion.length();
                if ((largo < 3) || (largo > 5)) {
                    do {
                        System.out.println("La palabra ingresada es incorrecta. Ingrese otra");
                        opcion = leer.nextLine();
                        largo = opcion.length();
                    } while ((largo < 3) || (largo > 5));
                }
                for (int k = 0; k < largo; k++) {
                        sopa[i][k] = opcion.substring(k, k+1); 
                }   
                for (int l = largo; l < 20; l++) {
                    sopa[i][l] = String.valueOf((int) (Math.random() * 10));
                }
            } else {
                for (int j = 0; j < 20; j++) {
                    sopa[i][j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("[" + sopa[i][j] + "] ");
            }
            System.out.println("");
        }
    }
            public static void Extra_24() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un valor límite");
        int limite = leer.nextInt();
        int[] vector = new int[limite];
        int cont = 0;
        for (int i = 0; i < limite; i++) {
            if ((i == 0) || (i == 1)) {
                vector[i] = 1;
            } else {
                vector[i] = vector[i - 1] + vector[i - 2];
            }

            if (vector[i] <= limite) {
                cont = cont + 1;
            } else {
                break;
            }
        }

        for (int i = 0; i < cont; i++) {
            if (i < (cont - 1)) {
                System.out.print("[" + vector[i] + "],");
            } else {
                System.out.print("[" + vector[i] + "]");
            }
        }
        System.out.println("");
    }

}
