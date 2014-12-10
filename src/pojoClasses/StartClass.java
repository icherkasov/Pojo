package pojoClasses;

/**
 * Created by Illya on 10.12.2014.
 */
public class StartClass {
    public static void main(String [] args){
    Person pers1 = new Person("Ben","White",35, JobTitle.Director);
    Person pers2 = new Person("Ben","White",35, JobTitle.Director);
        doEquals(pers1,pers2);
}

    private static void doEquals(Person pers1, Person pers2) {
        System.out.println("Equals verification for simmilar fields = "+pers1.equals(pers2));
        System.out.println(pers1);
        System.out.println(pers2);
        System.out.println("Compare by links");
        System.out.println(pers1 == pers2);
        System.out.println("Changing job for pers1");
        pers1.setJob(JobTitle.QA);
        System.out.println("Equals with changed object = " +pers1.equals(pers2));
        System.out.println(pers1);
        System.out.println("Compare by links");
        System.out.println(pers1 == pers2);

    }
}