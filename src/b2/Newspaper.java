package b2;

public class Newspaper extends Document {
    private int dayIssue;

    public Newspaper(String id, String nxb, int number, int dayIssue) {
        super(id, nxb, number);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Bao{" +
                " Ngay phat hanh " + dayIssue +
                ", Ma tai lieu '" + id + '\'' +
                ", Nha xuat ban '" + nxb + '\'' +
                ", So ban phat hanh '" + number + '\'' +
                '}';
    }
}
