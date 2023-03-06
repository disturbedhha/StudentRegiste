package StudentRegistration;

public class Student{
    private String name;
    private String surname;
    private String identification;
    private double grade;
    public void setRegistration(String n, String sn, String id, double gr)
    {
        name = n;
        surname = sn;
        identification = id;
        grade = gr;
    }
    public void getRegistration()
    {
        System.out.println("\nnombre estudiante: "+name +" "+surname);
        System.out.println("\nnumero identificacion estudiante: "+identification);
        System.out.printf("\nnotas estudiante: %.2f", grade);

    }
}
