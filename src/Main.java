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

        int number = 10;
        myDouble = 10;

        System.out.println(number + 5);
        System.out.println(number - 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(number % 3);
        System.out.println(myDouble / 3);
        System.out.println(1.2 - 1.1);
        System.out.println(number); //10
        System.out.println(number++); //10 imprime primero el valor y luego ejecuta el ++
        System.out.println(number); //11 imprime el valor luego de ejecutar ++
        System.out.println(++number); //12 ejecuta primero e imprime despues el resultado

        number *= 10;
        System.out.println(number);

        // CONDITIONALS

        number = 1000;

        //If... else
        if (number >= 1000) {
            System.out.println("number es mayor o igual que 1000");
        } else if (number > 0 && number < 1000) {
            System.out.println("number es mayor que 0 y menor que 1000");
        } else {
            System.out.println("number es menor que 1000");
        }

        //en una sola linea no hace falta "{}"
        if (number % 2 == 0) System.out.println("number es par");
        else System.out.println("number es impar");

        // Switch
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
                break;
        }

        //ternary
        double mark = 6.5;
        boolean hasPassed = mark >= 5 ? true : false;

        myMethod();

        String info = getInfo(1);
        System.out.println("info: " + info);

        stringMethods();
    }

// METHODS

    public static void myMethod(){
        System.out.println("this ");
        System.out.println("is ");
        System.out.println("inside ");
        System.out.println("myMethod");
    }

    public static String getInfo(int option){
        if(option == 1) return "My name is Adrian";
        else if(option == 2) return "This is an Ironhack Bootcamp";
        else return "option " + option + "provides no info";
    }

    // STRING METHODS

    public static void stringMethods(){
        String address = "C/ Falsa Nº 123";

        System.out.println("address length: " + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.replace("a", "-"));
    }
}