
abstract class BaseWorker {
    protected String name;
    BaseWorker(String name)
    {
        this.name = name;
    }
    abstract double averageSalary();
    abstract void printAvSal();

}
