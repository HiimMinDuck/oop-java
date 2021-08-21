package b3;

import java.util.Scanner;

public class main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandidate managerCandidate = new ManagerCandidate();
        while (true) {
            System.out.println("TUYEN SINH");
            System.out.println("Nhap 1: Them moi thi sinh ");
            System.out.println("Nhap 2: Hien thi thong tin thi sinh va khoi thi cua thi sinh ");
            System.out.println("Nhap 3: Tim kiem theo so bao danh");
            System.out.println("Nhap 4: Thoat khoi chuong trinh");
            System.out.println("Xin moi nhap so");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhap a: Them thi sinh khoi A");
                    System.out.println("Nhap b: Them thi sinh khoi B");
                    System.out.println("Nhap c: Them thi sinh khoi C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            managerCandidate.add(createCadidate(scanner, "a"));
                            break;

                        }
                        case "b": {
                            managerCandidate.add(createCadidate(scanner, "b"));
                            break;
                        }
                        case "c": {
                            managerCandidate.add(createCadidate(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Khong hop le");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerCandidate.showInfor();
                    break;
                }
                case "3": {
                    System.out.print("Nhap so bao danh: ");
                    String id = scanner.nextLine();
                    Candidate candidate = managerCandidate.searchById(id);
                    if (candidate == null) {
                        System.out.println("Khong tim thay");
                    } else {
                        System.out.println(candidate.toString());
                    }
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Khong hop le");
                    continue;
            }

        }
    }

    public static Candidate createCadidate(Scanner scanner, String cate) {
        System.out.print("Nhap so bao danh: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten hoc sinh: ");
        String name = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap muc uu tien loai: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (cate.equals("a")) {
            return new CandidateA(id, name,address,priority);
        } else if (cate.equals("b")) {
            return new CandidateB(id, name,address,priority);
        } else {
            return new CandidateC(id, name,address,priority);
        }

    }
}
	