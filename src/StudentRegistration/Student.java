package StudentRegistration;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Student{
    private String name;
    private String surname;
    private String identification;
    private double grade[] = {0,1,2,3,4,5};
    private String materias[] = {"Matematicas", "Informatica", "Biologia", "Lenguaje de español", "Fisica"};
    public void setRegistration(String n, String sn, String id)
    {
        name = n;
        surname = sn;
        identification = id;
    }
    public void getRegistration()
    {
        System.out.println("\nnombre estudiante: "+name +" "+surname);
        System.out.println("\nnumero identificacion estudiante: "+identification);
    }
    //Crea multiples materias en un ciclo
    //Matematicas, informatica, biologia, lenguage y fisica.
    //Crear un metodo array setNotes que almacena las notas en un ciclo do while
    //Crear un array de string matematica,informatica... e imprimir en getNotes
    public void setNotes()
    {
        int opt = 0;
        int times = 0;
        Scanner input = new Scanner(System.in);

        do {

            System.out.println("Adicionar la nota de "+materias[times]+": ");
            grade[times] = input.nextDouble();

            input.nextLine();                                                   //Quita el error al cambiar el tipo de dato de scanner

            System.out.println("\nDesea agregar otra materia: "+"\n1.Si"+"\n2.No");
            opt = input.nextInt();
            times++;
            input.nextLine();

        }while ((opt == 1) && (times < 5));

        System.out.println("\nNo puede agregar mas notas ");
    }
    public void getNotes()
    {
        for(int i = 0; i < 5; i++)
        {
            //JOptionPane.showMessageDialog(null,"\n"+materias[i]+": "+grade[i]);
            System.out.println("\n" + materias[i] + ": " + grade[i]);
        }
    }
}
