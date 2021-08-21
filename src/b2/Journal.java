package b2;

public class Journal extends Document {

    private int issueNumber;
    private int monthIssue;

    public Journal(String id, String nxb, int number, int issueNumber, int monthIssue) {
        super(id, nxb, number);
        this.issueNumber = issueNumber;
        this.monthIssue = monthIssue;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public String toString() {
        return "Tap chi{" +
                " So phat hanh " + issueNumber +
                ", Thang phat hanh " + monthIssue +
                ", Ma tai lieu '" + id + '\'' +
                ", Nha xuat ban '" + nxb + '\'' +
                ", So ban phat hanh '" + number + '\'' +
                '}';
    }
}
