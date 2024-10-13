package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读取随机整数的个数
        int n = scanner.nextInt();
        Set<Integer> numbers = new TreeSet<>(); // 使用 TreeSet 去重并排序

        // 读取 N 个整数
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number); // 自动去重并排序
        }

        // 输出结果
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
