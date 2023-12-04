public class Main {
    public static void main(String[] args) {
        WorkerBook workerBook = new WorkerBook();
        Worker w6 = new Worker("1234", "1234567", "Александра", 17);
        System.out.println(workerBook.searchByExperience(5));
        System.out.println(workerBook.searchByName("Анна"));
        System.out.println(workerBook.searchByPersonalNumber("112"));
        workerBook.addWorker(w6);
        System.out.println(workerBook.getWorkers());
    }
}