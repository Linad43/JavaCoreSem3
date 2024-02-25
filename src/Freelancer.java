public class Freelancer extends BaseWorker {

    private double hourSalary;
    Freelancer(String name, double hourSalary) {
        super(name);
        this.hourSalary = hourSalary;
    }
    public double getSalary() {
        return hourSalary;
    }
    @Override
    double averageSalary() {
        return (20.8*8*hourSalary);
    }

    @Override
    void printAvSal() {
        System.out.println("Average salary (Freelancer) " + name + " is " + averageSalary());
    }


}
