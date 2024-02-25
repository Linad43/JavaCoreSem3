public class Worker extends BaseWorker{

    private double salary;
    Worker(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    double averageSalary() {
        return salary;
    }

    @Override
    void printAvSal() {
        System.out.println("Average salary (Worker) " + name + " is " + averageSalary());
    }
}
