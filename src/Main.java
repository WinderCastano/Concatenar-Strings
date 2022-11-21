import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        System.out.println("Proporciona el titulo: ");
        Scanner sn = new Scanner(System.in);
        var titulo = sn.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = sn.nextLine();
        System.out.println(titulo+" fue escrito por "+autor);
    }
}

