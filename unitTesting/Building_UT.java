import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class Building_UT {

    @Test
    public void createOneBuildingWithOneResident(){
        Building oneBuilding = new Building(1, "Horst");
        LinkedList<String> expected = new LinkedList<>();
        expected.add("Horst");
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }
}
