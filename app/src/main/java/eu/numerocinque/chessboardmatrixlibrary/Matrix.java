package eu.numerocinque.chessboardmatrixlibrary;

import static eu.numerocinque.chessboardmatrixlibrary.Coordinates.getCoordinatesX;
import static eu.numerocinque.chessboardmatrixlibrary.Coordinates.getCoordinatesY;

public class Matrix {
    private final Object[][] matrix;

    Matrix(int x, int y) {
        matrix = new Object[x][y];
    }

    Object[][] getMatrix() {
        return matrix;
    }

    private boolean check(int x, int y) {
        return (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length);
    }

    void set(String coordinates, Object thisObject) {
        int x = getCoordinatesX(coordinates);
        int y = getCoordinatesY(coordinates);

        if (check(x, y)) matrix[x][y] = thisObject;
    }

    Object get(String coordinates) {
        Object thisObject = null;

        int x = getCoordinatesX(coordinates);
        int y = getCoordinatesY(coordinates);

        if (check(x, y)) thisObject = matrix[x][y];

        return thisObject;
    }
}
