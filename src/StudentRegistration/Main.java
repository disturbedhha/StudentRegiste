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
        int times = 0;
        int i = 0;
        int option = 0;

        //Array of objects
        Student register[] = new Student[10];
        register[0] = new Student();
        Scanner kb = new Scanner(System.in);

        //Usar un ciclo do while, para agragar mas o menos estudiantes
        //Agregar mas materias y ...

        do {
            register[i] = new Student();                                    //Crea un nuevo objeto estudiante

            System.out.println("Ingresa nombre de estudiante ");
            name = kb.nextLine();

            System.out.println("Ingresa apellido de estudiante ");
            surname = kb.nextLine();

            System.out.println("Ingresa identificacion de estudiante ");
            identification = kb.nextLine();

            System.out.println("Ingresa nota de estudiante ");
            grade = kb.nextFloat();

            register[i].setRegistration(name, surname, identification, grade);

            kb.nextLine();

            //Pregunta para repetir funcion
            System.out.println("Desea agregar a otro estudiante: ");
            option = kb.nextInt();

            i++;
            times++;

        }while (option == 1);

        //Imprime los registros
        for(int j = 0; j < times; j++)
        {
            register[j].getRegistration();
        }


    }
}