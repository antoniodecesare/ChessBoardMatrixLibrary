package eu.numerocinque.chessboardmatrixlibrary;

import android.support.annotation.NonNull;

public class Coordinates {
    private static String RANGEX, RANGEY;

    static void init(String getRANGEX, String getRANGEY) {
        RANGEX = getRANGEX;
        RANGEY = getRANGEY;
    }

    static int getCoordinatesX(String coordinates) {
        int x = -1;

        String coordX = coordinates.substring(0, 1).toLowerCase();
        if (RANGEX.contains(coordX)) x = coordX.charAt(0) - 97;

        return x;
    }

    static int getCoordinatesY(String coordinates) {
        int y = -1;

        String coordY = coordinates.substring(1, 2).toLowerCase();
        if (RANGEY.contains(coordY)) y = coordY.charAt(0) - 49;

        return y;
    }

    @NonNull
    static String getRow(String coordinates) {
        return coordinates.substring(1, 2);
    }

    @NonNull
    static String getCol(String coordinates) {
        return coordinates.substring(0, 1);
    }

    private static String nextCoordinates(String coordinates, Object[][] objects, boolean forward) {
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

    static String nextCoordinates(String coordinates, Matrix matrix, boolean forward) {
        return nextCoordinates(coordinates, matrix.getMatrix(), forward);
    }
}
