public class Main {
    public static void main(String[] args) {
        BaseWorker[] baseWorkers = new BaseWorker[]
                {
                        new Freelancer("Freelanser1", 100),
                        new Freelancer("Freelanser2", 80),
                        new Freelancer("Freelanser3", 120),
                        new Worker("Worker1", 100000),
                        new Worker("Worker2", 80000),
                        new Worker("Worker3", 120000)
                };
        for(BaseWorker baseWorker: baseWorkers)
        {
            baseWorker.printAvSal();
        }
    }
}