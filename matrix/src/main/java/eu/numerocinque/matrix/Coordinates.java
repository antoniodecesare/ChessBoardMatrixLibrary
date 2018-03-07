package eu.numerocinque.matrix;

import android.support.annotation.NonNull;

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

    @NonNull
    public static String getRow(String coordinates) {
        return coordinates.substring(1, 2);
    }

    @NonNull
    public static String getCol(String coordinates) {
        return coordinates.substring(0, 1);
    }

    public static String nextCoordinates(String coordinates, Object[][] objects, boolean forward) {
        String next = null;

        int x = getCoordinatesX(coordinates) + 1;
        int y = getCoordinatesY(coordinates);

        if (x + 1 > objects.length) {
            x = 0;
            if (forward) y = y + 1;
            else y = y - 1;
        }

        if (forward) {
            if (!(y + 1 > objects[0].length))
                next = Character.toString((char) (x + 97)) + Character.toString((char) (y + 49));
        } else if (!(y < 0))
            next = Character.toString((char) (x + 97)) + Character.toString((char) (y + 49));

        return next;
    }

    public static String nextCoordinates(String coordinates, Matrix matrix, boolean forward) {
        return nextCoordinates(coordinates, matrix.getMatrix(), forward);
    }

    public static String xyToCoordinates(int x, int y) {
        return Character.toString((char) (x + 97)) + Character.toString((char) (y + 49));
    }
}
