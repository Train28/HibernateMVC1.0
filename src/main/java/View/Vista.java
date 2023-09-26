package View;

import Controller.PersonaController;
import java.util.Scanner;


public class Vista {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PersonaController perC = new PersonaController();
        int id, var;
        String name, apellido, email, telefono;

        System.out.println("WHAT ACTION U WANT TO DO");
        System.out.println("1. INSERT NEW PERSON 2. SEARCH PERSON BY ID 3. SHOW ALL PEOPLE");
        var = sc.nextInt();
        
        switch (var) {
            case 1:
                System.out.println("Insert id");
                id = sc.nextInt();

                System.out.println("Insert name");
                name = sc.next();

                System.out.println("Insert last name");
                apellido = sc.next();

                System.out.println("Insert email");
                email = sc.next();

                System.out.println("Insert phone number");
                telefono = sc.next();
                
                perC.insert(id, name, apellido, email, telefono);
                
                break;

            case 2:
                System.out.println("Insert id");
                id = sc.nextInt();                
                System.out.println(perC.buscar(id));                               
                break;
                
                case 3:
                    perC.list();
                break;

            default:
                throw new AssertionError();
        }


    }
}
