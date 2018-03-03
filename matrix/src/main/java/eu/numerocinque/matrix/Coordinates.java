package eu.numerocinque.matrix;

public class Coordinates {
    public static final String RANGEX = "abcdefgh";
    public static final String RANGEY = "12345678";

    public static int getCoordinatesX(String coordinates) {
        int x = -1;

        String coordX = coordinates.substring(0, 1).toLowerCase();
        if (RANGEX.contains(coordX)) x = coordX.charAt(0) - 97;

        return x;
    }

    public static int getCoordinatesY(String coordinates) {
        int y = -1;

        String coordY = coordinates.substring(1, 2).toLowerCase();
        if (RANGEY.contains(coordY)) y = coordY.charAt(0) - 49;

        return y;
    }
}
