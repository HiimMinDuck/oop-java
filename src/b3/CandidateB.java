package b3;

public class CandidateB extends Candidate {

    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public CandidateB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "KhoiB{" +
                " So bao danh '" + id + '\'' +
                ", Ho ten '" + name + '\'' +
                ", Dia chi '" + address + '\'' +
                ", Muc uu tien " + priority + ", Mon thi " + MON_TOAN + " - " + MON_SINH + " - " + MON_HOA +
                '}';
    }
}
