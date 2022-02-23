package HomeWorkJava1Lesson5;

public class Main {
    public static void main(String args[]) {

        Worker worker1 = new Worker("Абитов Авраам Александрович", "Рабочий", "Почта", 123456789, 10, 16);
        Worker worker2 = new Worker("Большаков Борис Богданович", "Рабочий", "Почта", 987654321, 15, 45);
worker1.infoWorkers();
        Worker[] workers = new Worker[5];
        workers[0] = new Worker("Вовненко Владислав Витальевич", " Старший рабочий", "почта.ком", 1234, 20, 50);
        workers[1] = new Worker("Громов Григорий Гвидонович", "Начальник", "почта.ком", 321, 45, 55);
        workers[2] = new Worker("Данилюк Данила Давидович", "Сверехначальник", "почта.юа", 456, 90, 60);
        workers[3] = new Worker("Eгерь Егор Евгеньевич", "Босс", "почта.ру", 678, 100, 20);
        workers[4] = new Worker("Ёж Ёлка Ёк", "Владелец", "почта.гмаил", 398, 120, 35);
        workers[0].infoWorkers();

        for (Worker worker : workers)
            if (worker.age >= 40) {
                System.out.println("Сотрудник с возврастом 40 и старше" + " ФИО " + worker.fullName + "; Должность-" + worker.post + "; Email:" + worker.email + "; Номер телефона:" + worker.phoneNumber + "; Зарплата: " + worker.salary + "; Возвраст-" + worker.age);

            }
    }
}