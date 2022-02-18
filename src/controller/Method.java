package controller;

import model.Employee;
import model.FullTimeEmployee;
import model.PartTimeEmployee;

import java.util.Arrays;
import java.util.Scanner;

public class Method {
    public static void displayEmployee(Employee[] employees) {
        for (Employee e : employees
        ) {
            System.out.println(e);
        }
    }

    public static Employee[] addNewEmployee(Employee[] employees, Employee newEmployee) {
        Employee[] newEmployeeList = new Employee[employees.length + 1];
        for (int i = 0; i < employees.length; i++) {
            newEmployeeList[i] = employees[i];
        }
        newEmployeeList[employees.length] = newEmployee;
        return newEmployeeList;
    }

    public static PartTimeEmployee createNewPartTimeEmployee() {
        Scanner inputIDPT = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên PartTime: ");
        String employeeID = inputIDPT.nextLine();

        Scanner inputFullNamePT = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên PartTime: ");
        String fullName = inputFullNamePT.nextLine();

        Scanner inputAgePT = new Scanner(System.in);
        System.out.println("Nhập tuổi của nhân viên PartTime");
        int age = inputAgePT.nextInt();

        Scanner inputPhonePT = new Scanner(System.in);
        System.out.println("Nhập số điện thoại nhân viên PartTime: ");
        String phoneNumber = inputPhonePT.nextLine();

        Scanner inputEmailPT = new Scanner(System.in);
        System.out.println("Nhập email nhân viên PartTime: ");
        String email = inputEmailPT.nextLine();

        Scanner inputHourPT = new Scanner(System.in);
        System.out.println("Nhập số giờ làm nhân viên PartTime: ");
        double hour = inputHourPT.nextDouble();

        PartTimeEmployee newPartTimeEmployee = new PartTimeEmployee(employeeID, fullName, age, phoneNumber, email, hour);
        return newPartTimeEmployee;
    }

    public static FullTimeEmployee createNewFullTimeEmployee() {
        Scanner inputIDFT = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên FullTime: ");
        String employeeID = inputIDFT.nextLine();

        Scanner inputFullNameFT = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên FullTime: ");
        String fullName = inputFullNameFT.nextLine();

        Scanner inputAgeFT = new Scanner(System.in);
        System.out.println("Nhập tuổi của nhân viên FullTime");
        int age = inputAgeFT.nextInt();

        Scanner inputPhoneFT = new Scanner(System.in);
        System.out.println("Nhập số điện thoại nhân viên FullTime: ");
        String phoneNumber = inputPhoneFT.nextLine();

        Scanner inputEmailFT = new Scanner(System.in);
        System.out.println("Nhập email nhân viên FullTime: ");
        String email = inputEmailFT.nextLine();

        Scanner inputBonus = new Scanner(System.in);
        System.out.println("Nhập số tiền thưởng: ");
        double bonus = inputBonus.nextDouble();

        Scanner inputFineMoney = new Scanner(System.in);
        System.out.println("Nhập số tiền phạt: ");
        double fineMoney = inputFineMoney.nextDouble();

        Scanner inputBasicSalary = new Scanner(System.in);
        System.out.println("Nhập số lương cơ bản: ");
        double basicSalary = inputBasicSalary.nextDouble();

        FullTimeEmployee newFullTimeEmployee = new FullTimeEmployee(employeeID, fullName, age, phoneNumber, email, bonus, fineMoney, basicSalary);
        return newFullTimeEmployee;
    }

    public static double getAverageSalary(Employee[] arr) {
        double sum = 0;
        double avg;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i].getNetSalary();
            count++;
        }
        avg = sum / count;
        return avg;
    }

    public static void displayEmployeeLessThanAvgSalary(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof FullTimeEmployee) {
                if (arr[i].getNetSalary() < getAverageSalary(arr)) {
                    System.out.println(arr[i].getFullName());
                }
            }
        }
    }

    public static double displaySumSalaryPartTime(Employee[] arr) {
        double sum = 0;
        for (Employee e : arr
        ) {
            if (e instanceof PartTimeEmployee) {
                sum += e.getNetSalary();
            }
        }
        return sum;
    }

    public static void sortSalaryFullTime(Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] instanceof FullTimeEmployee) {
                    if ( arr[j].getNetSalary() > arr[j+1].getNetSalary()) {
                        FullTimeEmployee temp = (FullTimeEmployee) arr[j];
                        arr[j] = arr [j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }
        int stt = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof FullTimeEmployee) {
                System.out.println(stt + ". " + arr[i].getFullName());
                stt ++;
            }
        }
    }
}
