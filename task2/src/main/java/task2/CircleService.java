package task2;

import java.util.List;

public class CircleService {
    public static void process(List<Coordinates> coordinates, Circle circle) {
        for(Coordinates coordinate : coordinates){
            System.out.println(processCoordinates(coordinate, circle));
        }
    }
    private static int processCoordinates(Coordinates coordinates, Circle circle) {
        int result = 2;
        float d = distance(coordinates, circle.center);
        if (Math.pow(coordinates.x - circle.center.x, 2) + Math.pow(coordinates.y - circle.center.y, 2) < Math.pow(circle.radius, 2))
            result = 1;
        if (Math.pow(coordinates.x - circle.center.x, 2) + Math.pow(coordinates.y - circle.center.y, 2) == Math.pow(circle.radius, 2))
            result = 0;
         return  result;
    }
    private static float distance(Coordinates firstCoordinate, Coordinates secondCoordinate){
        return (float) Math.sqrt(Math.pow(secondCoordinate.x - firstCoordinate.x, 2) + Math.pow(secondCoordinate.y - firstCoordinate.y, 2));
    }
}