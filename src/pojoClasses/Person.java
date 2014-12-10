package pojoClasses;

/**
 * Created by Illya on 10.12.2014.
 */
public class Person implements PersonCanDo {

   private final String name;
   private final String secodName;
    private final int age;
    private JobTitle job;

    public Person(String name, String secodName, int age, JobTitle job) {
        this.name = name;
        this.secodName = secodName;
        this.age = age;
        this.job = job;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSecodName() {
        return secodName;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public JobTitle getJob() {
        return job;
    }

    @Override
    public void setJob(JobTitle job) {
        this.job = job;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (job != person.job) return false;
        if (!name.equals(person.name)) return false;
        if (!secodName.equals(person.secodName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + secodName.hashCode();
        result = 31 * result + age;
        result = 31 * result + job.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secodName='" + secodName + '\'' +
                ", age=" + age +
                ", job=" + job +
                '}';
    }
}
