package ZeldaRefacotirzado;

import java.util.Scanner;

/**
 * Zelda: ¡En busca de la Trifuerza Matemática!
 * 
 * Este juego de aventura conversacional pone a prueba tus habilidades matemáticas
 * a través de varios niveles desafiantes. Link, el héroe valiente, debe resolver
 * problemas matemáticos para avanzar en su búsqueda y derrotar al malvado Ganon.
 * 
 * @author Eloy Sarriá Lijó
 */
public class  ZeldaRefacotirazado{

    /**
     * Método principal que inicia el juego.
     * 
     * @param args Los argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int niv = 1;
        int pg = niv;
        boolean mant = false;

        mostrarIntroduccion(scanner);

        while (!mant) {
            switch (niv) {
                case 1:
                    niv = nivel1(scanner);
                    break;
                case 2:
                    pg = niv;
                    niv = nivel2(scanner);
                    break;
                case 3:
                    pg = niv;
                    niv = nivel3(scanner);
                    break;
                case 4:
                    pg = niv;
                    niv = nivel4(scanner);
                    break;
                default:
                    niv = manejarPerdida(scanner, pg);
                    if (niv == 0) {
                        mant = true;
                    }
                    break;
            }
        }
    }

    /**
     * Muestra la introducción del juego.
     * 
     * @param scanner Objeto Scanner para capturar la entrada del usuario
     */
    public static void mostrarIntroduccion(Scanner scanner) {
        System.out.println("¡Bienvenido a 'Zelda: ¡En busca de la\n" +
                "Trifuerza Matematica’! Link, el valiente heroe,\n" +
                "se embarca en una aventura epica para salvar\n" +
                "Hyrule de las garras de Ganon. Para restaurar\n" +
                "el poder de la Trifuerza y derrotar al mal,\n" +
                "debes superar cada una de las siguientes\n" +
                "pruebas matematicas. (Presiona Intro para continuar)");
        scanner.nextLine();
    }

    /**
     * Ejecuta el primer nivel del juego, donde el jugador debe calcular la suma de un rango de números.
     * 
     * @param scanner Objeto Scanner para capturar la entrada del usuario
     * @return El siguiente nivel a ejecutar, o 999 si la respuesta es incorrecta
     */
    public static int nivel1(Scanner scanner) {
        int a = (int) (Math.random() * 10) + 1;
        int b = (int) (20 + Math.random() * (30 - 20 + 1));
        int sumatorio = 0;
        for (int i = a; i <= b; i++) {
            sumatorio += i;
        }
        System.out.println("Link inicia su épica aventura en el Bosque\n" +
                "Perdido, donde se topa con un cofre\n" +
                "misterioso que guarda un valioso secreto.\n" +
                "Para abrirlo y avanzar en su búsqueda, debe\n" +
                "resolver el siguiente enigma matemático.\n" +
                "¿Podrás calcular el sumatorio entre los números ?");
        System.out.println("Los números son " + a + " y " + b);
        int respuesta = scanner.nextInt();

        if (sumatorio == respuesta) {
            System.out.println("¡RESPUESTA CORRECTA! AVANZA AL NIVEL 2.\n" +
                    "EL COFRE SE HA ABIERTO Y HAS OBTENIDO...\n" +
                    "¡UNA PIEDRA FORTALECEDORA QUE CONFIERE PODER A LA TRIFUERZA!");
            return 2;
        } else {
            return 999;
        }
    }

    /**
     * Ejecuta el segundo nivel del juego, donde el jugador debe calcular el producto de un rango de números.
     * 
     * @param scanner Objeto Scanner para capturar la entrada del usuario
     * @return El siguiente nivel a ejecutar, o 0 si la respuesta es incorrecta
     */
    public static int nivel2(Scanner scanner) {
        int c = (int) (Math.random() * 9) + 1;
        int d = (int) (10 + Math.random() * 6);
        long producto = 1;
        for (int i = c; i <= d; i++) {
            producto *= i;
        }
        System.out.println("Con la piedra de poder en su posesión, Link\n" +
                "avanza más allá del Bosque Perdido y llega a\n" +
                "un antiguo puente custodiado por un\n" +
                "enemigo. El enemigo propone un nuevo\n" +
                "desafio matemático en su camino. ¿Podrás\n" +
                "calcular el productorio entre dos números?");
        System.out.println("Los números son " + c + " y " + d);
        int respuesta = scanner.nextInt();

        if (producto == respuesta) {
            System.out.println("¡RESPUESTA CORRECTA! AVANZA AL NIVEL 3.");
            return 3;
        } else {
            return 0;
        }
    }

    /**
     * Ejecuta el tercer nivel del juego, donde el jugador debe calcular el factorial de un número.
     * 
     * @param scanner Objeto Scanner para capturar la entrada del usuario
     * @return El siguiente nivel a ejecutar, o 0 si la respuesta es incorrecta
     */
    public static int nivel3(Scanner scanner) {
        int n = (int) (Math.random() * 10) + 1;
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        System.out.println("Después de vencer al enemigo en el puente,\n" +
                "Link avanza al interior de un antiguo templo\n" +
                "misterioso. Allí, se encuentra con un sabio\n" +
                "oráculo que le plantea un enigma desafiante.\n" +
                "'Para avanzar', dice el oráculo, 'debes\n" +
                "calcular el factorial de un número que te\n" +
                "revelaré'. Entonces, el oráculo revela un\n" +
                "número entero positivo. ¿Podrás superar\n" +
                "este reto y continuar fortaleciendo la Trifuerza?");
        System.out.println("El número es " + n);
        int respuesta = scanner.nextInt();

        if (factorial == respuesta) {
            System.out.println("¡RESPUESTA CORRECTA! AVANZA AL NIVEL 4.\n" +
                    "EL ORÁCULO TE ENTREGA...\n" +
                    "¡POTENCIADOR DE LA TRIFUERZA!");
            return 4;
        } else {
            return 0;
        }
    }

    /**
     * Ejecuta el cuarto nivel del juego, donde el jugador debe determinar si un número es primo.
     * 
     * @param scanner Objeto Scanner para capturar la entrada del usuario
     * @return -1 si el juego se ha completado, o 0 si la respuesta es incorrecta
     */
    public static int nivel4(Scanner scanner) {
        int p = (int) (10 + Math.random() * (100 - 10 + 1));
        boolean esPrimo = true;

        if (p <= 1) {
            esPrimo = false;
        } else if (p <= 3) {
            esPrimo = true;
        } else if (p % 2 == 0 || p % 3 == 0) {
            esPrimo = false;
        } else {
            for (int i = 5; i * i <= p; i += 6) {
                if (p % i == 0 || p % (i + 2) == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        int sino = esPrimo ? 0 : 1;

        System.out.println("Después de fortalecer la Trifuerza con el\n" +
                "misterioso potenciador obtenido del oráculo\n" +
                "en el templo, Link llega a un lugar enigmático\n" +
                "donde se encuentra un antiguo guardián del\n" +
                "conocimiento. El guardián revela un número\n" +
                "entero positivo y plantea el desafío final:\n" +
                "'Debes determinar si el número P es primo o\n" +
                "no'. Este es el momento decisivo en la\n" +
                "aventura matemática de Link. ¿Estás\n" +
                "preparado para enfrentar este último reto y\n" +
                "demostrar tu destreza matemática?");
        System.out.println("El número es " + p);
        System.out.println("Introduce tu respuesta, Link. Si crees que el número es primo introduce 0, en caso de que no lo sea introduce 1.");
        int respuesta = scanner.nextInt();

        if (sino == respuesta) {
            System.out.println("Link, el valiente héroe, ha triunfado sobre los\n" +
                    "desafíos matemáticos y ha fortalecido la\n" +
                    "Trifuerza con poderes matemáticos\n" +
                    "inigualables. En una confrontación\n" +
                    "legendaria, Ganon, el malvado señor de las\n" +
                    "sombras, se encuentra derrotado ante el\n" +
                    "poder de la sabiduría matemática. Hyrule,\n" +
                    "ahora liberada de la oscuridad, resplandece\n" +
                    "con una nueva luz. Link ha prevalecido y\n" +
                    "Ganon ha perdido. \n" +
                    "¡La sabiduría matemática ha triunfado sobre el mal!");
            System.out.println("¡ENHORABUENA! HAS COMPLETADO 'ZELDA: EN BUSCA DE LA TRIFUERZA MATEMÁTICA'. \n¡ERES UN EXPERTO MATEMÁTICO!");
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Maneja la situación en la que el jugador pierde un nivel.
     * 
     * @param scanner Objeto Scanner para capturar la entrada del usuario
     * @param pg El nivel actual del juego
     * @return El nivel a reiniciar o 0 si el jugador decide salir
     */
    public static int manejarPerdida(Scanner scanner, int pg) {
        System.out.println("La respuesta no es correcta... Link no pudo\n" +
                "superar el desafío matemático. La oscuridad\n" +
                "se apodera de Hyrule. ¡Inténtalo de nuevo!");
        System.out.println("Pulse 0 para salir del juego o 1 si desea intentarlo de nuevo");
        int opcion = scanner.nextInt();
        if (opcion == 0) {
            System.out.println("¡HASTA LUEGO JUGADOR, MÁS SUERTE LA PRÓXIMA VEZ ^^!");
            return 0;
        } else {
            return pg;
        }
    }
}
