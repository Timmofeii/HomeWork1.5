package HomeWorkJava1Lesson5;

public class Worker {
    public String fullName;
    public String post;
    public String email;
    public int phoneNumber;
    public int salary;
    public int age;

    public Worker(String fullName, String post, String email, int phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;

    }

    public void infoWorkers() {
        System.out.println("ФИО " + fullName + "; Должность-" + post + "; Email:" + email + "; Номер телефона:" + phoneNumber + "; Зарплата: " + salary + "; Возвраст-" + age);

    }


}






