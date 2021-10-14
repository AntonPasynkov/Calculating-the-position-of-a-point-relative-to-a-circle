package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a path 1");
        String firstFilePath = "test1.txt";//sc.nextLine();
        Circle circle = FileReader.readFromFirstFile(firstFilePath);
        System.out.println("Input a path 2");
        String secondFilePath ="test2.txt"; //sc.nextLine();
        List<Coordinates> coordinates = FileReader.readFromSecondFile(secondFilePath);
        CircleService.process(coordinates, circle);
    }
}
