package b3;

public class CandidateC extends Candidate {

    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public CandidateC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "KhoiC{" +
                " So bao danh '" + id + '\'' +
                ", Ho ten '" + name + '\'' +
                ", Dia chi '" + address + '\'' +
                ", Muc uu tien " + priority + ", Mon thi " + MON_VAN + " - " + MON_SU + " - " + MON_DIA +
                '}';
    }
}
