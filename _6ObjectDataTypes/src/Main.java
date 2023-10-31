public class Main {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        sommaInt(num1, num2);

        char char1 = 'Y';
        printChar(char1);

        Integer num3 = 10;
        Integer num4 = 40;
        sommaInteger(num3, num4);

        Character char2 = 'W';
        printCharacter(char2);

        //AUTOBOXING: Conversione automatica del tipo primitivo in oggetto
        Integer num5 = 5;
        Double num6 = 3.5;
        Character char3 = 'w';

        //INBOXING: Conversione automatica dell'oggetto in tipo primitivo
        int numeroInt = num5;
        double numeroDouble = num6;
        char char4 = char3;
    }


    //Somma 2 valori int
    static void sommaInt(int a, int b) {
        int somma = a + b;
        System.out.println("Somma due numeri int: " + somma);
    }

    //Stampa 1 valore char
    static void printChar(char c) {
        System.out.println("Stampo valore char: " + c);
    }


    //Somma 2 valori Integer
    static void sommaInteger(Integer a, Integer b) {
        Integer somma = a + b;
        System.out.println("Somma due numeri Integer: " + somma);
    }

    //Stampa 1 valore Character
    static void printCharacter(Character c) {
        System.out.println("Stampo valore Character: " + c);
    }


}