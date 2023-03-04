package DemSoLuongSinhVienThiDo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] list;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("tạo số phần tử trong mảng: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("không được nhập quá 30");
        } while (size > 30);
        list = new int[size];
        int i = 0;
        while (i < list.length) {
            System.out.print("Nhập điểm của học sinh " + (i + 1) + " : ");
            list[i] = scanner.nextInt();
            i++;
        }
        System.out.println("mảng điểm: " + "\n" + Arrays.toString(list));
        int count = 0;
        for (int j = 0; j < list.length; j++) {
            if (list[j] >= 5 && list[j] <= 10)
                count++;
        }
        System.out.println("\n số học sinh thi đạt là: " + count);
    }
}
