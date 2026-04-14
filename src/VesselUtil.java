import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    public List<Vessel> getVesselList() {
        return vesselList;
    }

    public void setVesselList(List<Vessel> vesselList) {
        this.vesselList = vesselList;
    }

    // UC2
    public void addVesselPerformance(Vessel vessel) {

        vesselList.add(vessel);
    }

    // UC3
    public Vessel getVesselById(String vesselId) {

        for (Vessel v : vesselList) {

            if (v.getVesselId().equals(vesselId)) {

                return v;
            }
        }

        return null;
    }

    // UC4
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> result = new ArrayList<>();

        double maxSpeed = 0;

        for (Vessel v : vesselList) {

            if (v.getAverageSpeed() > maxSpeed) {

                maxSpeed = v.getAverageSpeed();
            }
        }

        for (Vessel v : vesselList) {

            if (v.getAverageSpeed() == maxSpeed) {

                result.add(v);
            }
        }

        return result;
    }
}