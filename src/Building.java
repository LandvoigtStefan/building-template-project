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

    public Building(int id, String[] resident){

    }

    public void addResident(String resident){
        this.residents.add(resident);
    }

    public void addResident(String[] residents){
    }

    public LinkedList<String> getResident(){
        return residents;
    }
}
