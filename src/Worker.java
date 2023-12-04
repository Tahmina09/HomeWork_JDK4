import java.util.Objects;

public class Worker {
    private String personalNumber;
    private String phoneNumber;
    private String name;
    private int experience;
    public Worker(String personalNumber, String phoneNumber, String name, int experience) {
        this.personalNumber = personalNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Worker:" +
                "Personal number = " + personalNumber + ' ' +
                ", Phone number = " + phoneNumber + ' ' +
                ", name = " + name + ' ' +
                ", experience = " + experience + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return experience == worker.experience && Objects.equals(personalNumber, worker.personalNumber) && Objects.equals(phoneNumber, worker.phoneNumber) && Objects.equals(name, worker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personalNumber, phoneNumber, name, experience);
    }
}
