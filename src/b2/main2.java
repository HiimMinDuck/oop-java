package b2;

import java.util.Scanner;

public class main2 {

    public static void main(String[] arStringsgs) {
        Scanner scanner = new Scanner(System.in);
        ManagerDocument managerDocument = new ManagerDocument();
        while (true) {
            System.out.println("QUAN LY SACH");
            System.out.println("Nhan so 1: Them moi tai lieu");
            System.out.println("Nhan so 2: Tim kiem tai lieu ");
            System.out.println("Nhan so 3: Hien thi thong tin ve tai lieu");
            System.out.println("Nhan so 4: Xoa tai lieu theo ma tai lieu");
            System.out.println("Nhan so 5: Thoat khoi chuong trinh");
            System.out.println("Xin moi nhap so");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhap a: Them moi Sach");
                    System.out.println("Nhap b: Them moi Bao");
                    System.out.println("Nhap c: Them moi Tap chi");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhap ma tai lieu: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhap nha xuat ban:");
                            String nxb = scanner.nextLine();
                            System.out.print("Nhap so ban phat hanh: ");
                            int number = scanner.nextInt();
                            System.out.print("Nhap ten tac gia: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            System.out.print("Nhap so trang: ");
                            int pageNumber = scanner.nextInt();
                            Document book = new Book(id, nxb, number, author, pageNumber);
                            managerDocument.addDocument(book);
                            System.out.println(book.toString());
                            scanner.nextLine();
                            break;

                        }
                        case "b": {
                            System.out.print("Nhap ma tai lieu: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhap nha xuat ban:");
                            String nxb = scanner.nextLine();
                            System.out.print("Nhap so ban phat hanh: ");
                            int number = scanner.nextInt();
                            System.out.print("Nhap ngay phat hanh: ");
                            int dayIssue = scanner.nextInt();
                            Document newspaper = new Newspaper(id, nxb, number, dayIssue);
                            managerDocument.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Nhap ma tai lieu: ");
                            String id = scanner.nextLine();
                            System.out.print("Nhap nha xuat ban:");
                            String nxb = scanner.nextLine();
                            System.out.print("Nhap so ban phat hanh: ");
                            int number = scanner.nextInt();
                            System.out.print("Nhap so phat hanh: ");
                            int issueNumber = scanner.nextInt();
                            System.out.print("Nhap thang phat hanh: ");
                            int issueMonth = scanner.nextInt();
                            Document journal = new Journal(id, nxb, number, issueNumber, issueMonth);
                            managerDocument.addDocument(journal);
                            System.out.println(journal.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Nhap a: Tim kiem Sach");
                    System.out.println("Nhap b: Tim kiem Bao");
                    System.out.println("Nhap c: Tim kiem Tap chi");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            managerDocument.searchByBook();
                            break;
                        }
                        case "b": {
                            managerDocument.searchByNewspaper();
                            break;
                        }
                        case "c":
                            managerDocument.searchByJournal();
                            break;
                        default:
                            System.out.println("Khong hop le");
                            break;
                    }
                    break;
                }
                case "3": {
                    managerDocument.showInfor();
                    break;
                }
                case "4": {
                    System.out.print("Nhap ma tai lieu muon xoa: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Thanh cong" : "That bai");
                }
                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Khong hop le");
                    continue;
            }

        }
    }

}
