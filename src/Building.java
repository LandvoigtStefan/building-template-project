import java.util.LinkedList;
import java.util.List;

public class Building {
    private int id;
    private LinkedList<String> residents = new LinkedList<>();

    private Building(){}

    public Building(int id, String resident){
        this.id = id;
        addResident(resident);
    }

    public Building(int id, String[] residents){
        this.id = id;
        addResident(residents);
    }

    public void addResident(String resident){
        if(!this.residents.contains(resident))
            this.residents.add(resident);
    }

    public void addResident(String[] residents){
        this.residents.addAll(List.of(residents));
    }

    public LinkedList<String> getResident(){
        return residents;
    }
}
