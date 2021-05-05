import java.util.Scanner;


public class Ejem1_8 {
    private Scanner reader;
    private Ejem1_8(){
        this.reader = new Scanner(System.in);
    }
    protected int askNumber() {
        System.out.println("Introduce un número: ");
        int number = reader.nextInt();
        return number;
    }

    protected void printMessage(int number) {
        switch (number) {
            case 1:
                System.out.println("Hola mundo");
                break;

            case 2:
                System.out.println("Foo bar");
                break;

            case 3:
                System.out.println("Dime una broma");
                break;

            default:
                System.out.println("El mensaje no está configurado para esta opción");
                break;
        }
    }
}
