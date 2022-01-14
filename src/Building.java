import java.util.LinkedList;

public class Building {
    private int id;
    private LinkedList<String> residents = new LinkedList<>();

    private Building(){}

    public Building(int id, String resident){

    }

    public Building(int id, String[] resident){

    }

    public LinkedList<String> getResident(){
        return residents;
    }
}
