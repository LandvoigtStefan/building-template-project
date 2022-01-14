import java.util.LinkedList;
import java.util.List;

public class Building {
    private int id;
    private int numberOfResident = 0;
    private LinkedList<String> residents = new LinkedList<>();

    private Building() {
    }

    public Building(int id, String resident) {
        this.id = id;
        addResident(resident);
    }

    public Building(int id, String[] residents) {
        this.id = id;
        addResident(residents);
    }

    public void addResident(String resident) {
        if (!this.residents.contains(resident))
            this.residents.add(resident);
    }

    public void addResident(String[] residents) {
        for (String resident : residents) {
            addResident(resident);
        }
    }

    public LinkedList<String> getResident() {
        return residents;
    }

    public void removeResident(String resident) {
        this.residents.remove(resident);
    }

    public int getNumberOfResident() {
        return residents.size();
    }
}
