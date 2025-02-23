import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

public class Building_UT {

    @Test
    public void createOneBuildingWithOneResident() {
        Building oneBuilding = new Building(1, "Horst");
        LinkedList<String> expected = new LinkedList<>();
        expected.add("Horst");
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }

    @Test
    public void createOneBuildingWithManyResidents() {
        String[] residents = {"Horst", "Franz", "Sisi", "Carl"};
        Building oneBuilding = new Building(1, residents);
        LinkedList<String> expected = new LinkedList<>();
        expected.addAll(List.of(residents));
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }

    @Test
    public void createOneBuildingWithOneResidentAndAddOne() {
        Building oneBuilding = new Building(1, "Horst");
        oneBuilding.addResident("Toni");
        LinkedList<String> expected = new LinkedList<>();
        expected.add("Horst");
        expected.add("Toni");
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }

    @Test
    public void createOneBuildingWithOneResidentAndAddMany() {
        String[] residents = {"Franz", "Sisi", "Carl"};
        Building oneBuilding = new Building(1, "Horst");
        oneBuilding.addResident(residents);
        LinkedList<String> expected = new LinkedList<>();
        expected.add("Horst");
        expected.addAll(List.of(residents));
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }

    @Test
    public void createOneBuildingWithOneResidentAndAddTheSame() {
        Building oneBuilding = new Building(1, "Horst");
        oneBuilding.addResident("Horst");
        LinkedList<String> expected = new LinkedList<>();
        expected.add("Horst");
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }

    @Test
    public void createOneBuildingWithManyResidentsAndAddAllSame() {
        String[] residents = {"Horst", "Franz", "Sisi", "Carl"};
        Building oneBuilding = new Building(1, residents);
        oneBuilding.addResident(residents);
        LinkedList<String> expected = new LinkedList<>();
        expected.addAll(List.of(residents));
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }

    @Test
    public void createOneBuildingWithManyResidentsAndAddSomeSame() {
        String[] residents = {"Horst", "Franz", "Sisi", "Carl"};
        Building oneBuilding = new Building(1, new String[]{"Horst", "Franz"});
        oneBuilding.addResident(residents);
        LinkedList<String> expected = new LinkedList<>();
        expected.addAll(List.of(residents));
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }

    @Test
    public void createOneBuildingWithOneResidentAndRemoveOneResident() {
        Building oneBuilding = new Building(1, "Horst");
        oneBuilding.removeResident("Horst");
        LinkedList<String> expected = new LinkedList<>();
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }

    @Test
    public void createOneBuildingWithOneResidentAndRemoveANonExistingResident() {
        Building oneBuilding = new Building(1, "Horst");
        oneBuilding.removeResident("Susi");
        LinkedList<String> expected = new LinkedList<>();
        expected.add("Horst");
        Assertions.assertEquals(expected, oneBuilding.getResident());
    }

    @Test
    public void createOneBuildingWithOneResidentAndGetNumberOfResident() {
        Building oneBuilding = new Building(1, "Horst");
        int expectedResidents = 1;
        Assertions.assertEquals(expectedResidents, oneBuilding.getNumberOfResident());
    }

    @Test
    public void createOneBuildingWithManyResidentAndGetNumberOfResident() {
        Building oneBuilding = new Building(1, new String[]{"Horst", "Franz", "Sisi", "Carl"});
        int expectedResidents = 4;
        Assertions.assertEquals(expectedResidents, oneBuilding.getNumberOfResident());
    }
}
