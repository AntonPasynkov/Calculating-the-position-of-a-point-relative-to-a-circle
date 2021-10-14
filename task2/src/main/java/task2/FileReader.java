package task2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public static Circle readFromFirstFile(String path) {
        Circle circle = new Circle();
        Scanner scanner;
        try {
            File file = new File(path);
            System.out.println(file.getAbsolutePath());
            scanner =  new Scanner(new File(path));
            circle.center = readCoordinates(scanner);
            circle.radius = Float.parseFloat(scanner.nextLine());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return circle;
    }

    public static List<Coordinates> readFromSecondFile(String path) {
        Scanner scanner;
        List<Coordinates> coordinates = new ArrayList<>();
        try {
            scanner =  new Scanner(new File(path));
            while (scanner.hasNextLine()){
                coordinates.add(readCoordinates(scanner));
            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return coordinates;
    }

    private static Coordinates readCoordinates(Scanner sc) {
        Coordinates coordinates = new Coordinates();
        String[] line = sc.nextLine().split(" ");
        coordinates.x = Float.parseFloat(line[0]);
        coordinates.y = Float.parseFloat(line[1]);
        return coordinates;
    }

}
