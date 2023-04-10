public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World !");

        //DATA TYPES

        byte myByte = 127;
        short myShort = 1000;
        int myInt = 99999999;
        double myDouble = 10.1234;
        boolean myBoolean = true;
        char myChar = 'c';

        String myString = "Hola Ironhack";
        String myName;
        myName = "Euge";

        System.out.println("myByte " + myByte);
        System.out.println("myShort " + myShort);
        System.out.println("myInt " + myInt);
        System.out.println("myDouble " + myDouble);
        System.out.println("myBoolean " + myBoolean);
        System.out.println("myChar " + myChar);
        System.out.println("myString " + myString);
        System.out.println("myName " + myName);

        myInt = 1234;
        System.out.println("myInt " + myInt);
        myInt = myInt + 1000;
        System.out.println("myInt " + myInt);
        myInt += 1000;
        System.out.println("myInt " + myInt);

        myByte += 10;
        System.out.println("myByte " + myByte);

        //OPERATORS

        int number =10;
        myDouble = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(myDouble / 3);
        System.out.println(1.2 - 1.1);
        System.out.println(number); //10
        System.out.println(number++); //10 imprime primero el valor y luego ejecuta el ++
        System.out.println(number); //11 imprime el valor luego de ejecutar ++
        System.out.println(++number); //12 ejecuta primero e imprime despues el resultado
    }
}