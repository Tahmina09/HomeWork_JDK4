import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class WorkerBook {
    Worker w1 = new Worker("112", "234567", "Алексей", 5);
    Worker w2 = new Worker("102", "234", "Михаил", 12);
    Worker w3 = new Worker("122", "2567", "Мария", 1);
    Worker w4 = new Worker("212", "4567", "Ольга", 20);
    Worker w5 = new Worker("222", "23456789", "Анна", 9);
    List<Worker> listWorker = Arrays.asList(w1, w2, w3, w4, w5);
    ArrayList<Worker> workers = new ArrayList<>(listWorker);

    public List<Worker> getWorkers() {
        return workers;
    }

    public List<Worker> searchByExperience(int experience) {
        ArrayList<Worker> workers1 = new ArrayList<>();
        for (Worker w: this.workers) {
            if (w.getExperience() == experience) {
                workers1.add(w);
            }
        }

        return workers1;
    }

    public List<String> searchByName(String name) {
        ArrayList<String> phones = new ArrayList<>();
        for (Worker worker: this.workers) {
            if (Objects.equals(worker.getName(), name)) {

                phones.add(worker.getPhoneNumber());
            }
        }

        return phones;
    }

    public List<Worker> searchByPersonalNumber(String personalNumber) {
        ArrayList<Worker> workers2 = new ArrayList<>();
        for (Worker w: workers) {
            if (Objects.equals(w.getPersonalNumber(), personalNumber)) {
                workers2.add(w);
            }
        }

        return workers2;
    }

    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }
}


