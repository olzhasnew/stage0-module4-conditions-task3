package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if ((salary > 0 && salary < 10000) || salary == 10000) {
            System.out.println(salary*.85);
        } else if ((salary > 10000 && salary < 20000) || salary == 20000) {
            System.out.println(salary*.82);
        } else if (salary > 20000) {
            System.out.println(salary*.80);
        } else {
            System.out.println("wrong input!");
        }
    }
}
