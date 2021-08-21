package b1;

import java.util.Scanner;

public class main {

    public static void main(String[] argsStrings) {
        Scanner scanner = new Scanner(System.in);
        ManagerOfficer managerOfficer = new ManagerOfficer();
        while (true) {
            System.out.println("QUAN LY CAN BO");
            System.out.println("Nhap so 1: Them moi can bo");
            System.out.println("Nhap so 2: Tim kiem theo ten");
            System.out.println("Nhap so 3: Hien thi thong tin danh sach can bo");
            System.out.println("Nhap so 4: Thoat khoi chuong trinh");
            System.out.println("Xin moi nhan phim: ");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhap a: Them moi Ky su");
                    System.out.println("Nhap b: Them moi Cong nhan");
                    System.out.println("Nhap c: Them moi Nhan vien ");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("Nhap ten: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int age = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhap nganh dao tao: ");
                            String branch = scanner.nextLine();
                            Officer engineer = new Engineer(name, age, gender, address, branch);
                            managerOfficer.addOfficer(engineer);
                            System.out.println(engineer.toString());
                            break;

                        }
                        case "b": {
                            System.out.print("Nhap ten: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhap tuoi:");
                            int age = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhap cap bac: ");
                            int level = scanner.nextInt();
                            Officer worker = new Worker(name, age, gender, address, level);
                            managerOfficer.addOfficer(worker);
                            System.out.println(worker.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("Nhap ten: ");
                            String name = scanner.nextLine();
                            System.out.print("Nhap tuoi: ");
                            int age = scanner.nextInt();
                            System.out.print("Nhap gioi tinh: ");
                            scanner.nextLine();
                            String gender = scanner.nextLine();
                            System.out.print("Nhap dia chi: ");
                            String address = scanner.nextLine();
                            System.out.print("Nhap cong viec: ");
                            String task = scanner.nextLine();
                            Officer staff = new Staff(name, age, gender, address, task);
                            managerOfficer.addOfficer(staff);
                            System.out.println(staff.toString());
                            break;
                        }
                        default:
                            System.out.println("Khong hop le");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.print("Nhap ten de tim kiem: ");
                    String name = scanner.nextLine();
                    managerOfficer.searchOfficerByName(name).forEach(officer -> {
                        System.out.println(officer.toString());
                    });
                    break;
                }
                case "3": {
                    managerOfficer.showListInforOfficer();
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

}
