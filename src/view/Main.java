package view;

import controller.Method;
import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

public class Main {
    public static Employee[] employees;

    public static void main(String[] args) {
//        int choice = -1;
//        Scanner inputChoice = new Scanner(System.in);
//        while (choice != 0) {
//            System.out.println("Menu");
//            System.out.println("1. Hiển thị thông tin các nhân viên");
//            System.out.println("2. Thêm số lượng nhân viên");
//            System.out.println("3. Thêm mới nhân viên FullTime ");
//            System.out.println("4. Thêm mới nhân viên Partime ");
//            System.out.println("0. Exit!");
//            choice = inputChoice.nextInt();
//            switch (choice) {
//                case 1:
//                    Method.displayEmployee(employees);
//                    break;
//                case 2:
//                    int size;
//                    Scanner inputSize = new Scanner(System.in);
//                    System.out.println("Nhập số nhân viên cần tạo");
//                    size = inputSize.nextInt();
//                    employees = new Employee[size];
//                    break;
//                case 3:
//                    Employee newPartTimeEmployee = Method.createNewPartTimeEmployee();
//                    employees = Method.addNewEmployee(employees, newPartTimeEmployee);
//                    break;
//                case 4:
//                    Employee newFullTimeEmployee = Method.createNewFullTimeEmployee();
//                    employees = Method.addNewEmployee(employees, newFullTimeEmployee);
//                    break;
//                case 0:
//                    System.exit(0);
//                default:
//                    System.out.println("Ơ hay! làm gì có lựa chọn này!");
//            }
//        }
        employees = new Employee[0];
        Employee hieu = new PartTimeEmployee("PT01", "Vu Minh Hieu", 19, "0367879658", "hieucave@gmail.com", 40);
        Employee duong = new PartTimeEmployee("PT02", "Tran Thai Duong", 21, "0367573937", "DuongGym@gmail.com", 60);
        Employee duc = new PartTimeEmployee("PT03", "Nguyen Trung Duc", 33, "0361234569", "DucGay@gmail.com", 30);

        Employee tuan = new FullTimeEmployee("FT01", "Kieu Minh Tuan", 35, "0364578989", "TuanBip@gmail.com", 3000000, 400000, 9000000);
        Employee giang = new FullTimeEmployee("FT02", "Vu Binh Giang", 20, "0364578915", "GiangKoi@gmail.com", 4000000, 200000, 17000000);
        Employee luong = new FullTimeEmployee("FT03", "Le Van Luong", 45, "0364578922", "LeLuong@gmail.com", 2000000, 600000, 15000000);
        Employee huy = new FullTimeEmployee("FT04", "Huynh Hieu Huy", 19, "0364578123", "HuyGG@gmail.com", 0, 100000, 5000000);
        Employee minh = new FullTimeEmployee("FT03", "Tran Van Minh", 21, "0364578456", "MinhMan@gmail.com", 0, 100000, 3000000);

        employees = Method.addNewEmployee(employees, hieu);
        employees = Method.addNewEmployee(employees, duong);
        employees = Method.addNewEmployee(employees, duc);
        employees = Method.addNewEmployee(employees, tuan);
        employees = Method.addNewEmployee(employees, giang);
        employees = Method.addNewEmployee(employees, luong);
        employees = Method.addNewEmployee(employees, huy);
        employees = Method.addNewEmployee(employees, minh);

        Method.displayEmployee(employees);

        System.out.println("Trung bình lương toàn nhân viên trong công ty là: " + Method.getAverageSalary(employees));

        System.out.println("Các nhân viên Fulltime có lương thấp hơn trung bình: ");
        Method.displayEmployeeLessThanAvgSalary(employees);

        System.out.println("Số lương phải trả cho tất cả nhân viên bán thời gian là: " + Method.displaySumSalaryPartTime(employees));

        Method.sortSalaryFullTime(employees);

        System.out.println("Thứ tự tăng dần lương của nhân viên full time: ");
        Method.sortSalaryFullTime(employees);
    }
}
