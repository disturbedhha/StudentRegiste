package StudentRegistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        String numbers[] = {"huhg","non","jack"};
        for(int i = 0; i < 3; i++)
        {
            System.out.println(numbers[i]);
        }
        */
        String name;
        String surname;
        String identification;
        double grade;
        int i = 0;
        int option = 0;

        //Array of objects
        Student register[] = new Student[10];
        register[0] = new Student();
        Scanner kb = new Scanner(System.in);

       // register[0].getNotes();

        //Agregar mas materias y ...array grade que imprime multiples veces en un method
        //Crea n objetos Student

        do {
            register[i] = new Student();                                    //Crea un nuevo objeto estudiante

            System.out.println("Ingresa nombre de estudiante ");
            name = kb.nextLine();

            System.out.println("Ingresa apellido de estudiante ");
            surname = kb.nextLine();

            System.out.println("Ingresa identificacion de estudiante ");
            identification = kb.nextLine();

            register[i].setNotes();

            register[i].setRegistration(name, surname, identification);

            //Pregunta para repetir funcion
            System.out.println("Desea agregar a otro estudiante: " + "\n1.Si \n2.No");
            option = kb.nextInt();
            i++;                                                            //N veces que se crea un estudiante
            kb.nextLine();

        }while (option == 1);
        System.out.println("Termina programa");
        //Imprime los registros
        for(int j = 0; j < i; j++)
        {
            //register[j].getRegistration();
            register[j].getNotes();
        }

        System.out.println("Termina programa");
    }
}