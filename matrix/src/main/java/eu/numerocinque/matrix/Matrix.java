package eu.numerocinque.matrix;

import static eu.numerocinque.matrix.Coordinates.getCoordinatesX;
import static eu.numerocinque.matrix.Coordinates.getCoordinatesY;

public class Matrix {
    private final Object[][] matrix;

    public Matrix(int x, int y) {
        matrix = new Object[x][y];
    }

    public Object[][] getMatrix() {
        return matrix;
    }

    private boolean check(int x, int y) {
        return (x >= 0 && x < matrix.length && y >= 0 && y < matrix[0].length);
    }

    public void set(String coordinates, Object thisObject) {
        int x = getCoordinatesX(coordinates);
        int y = getCoordinatesY(coordinates);

        if (check(x, y)) matrix[x][y] = thisObject;
    }

    public Object get(String coordinates) {
        Object thisObject = null;

        int x = getCoordinatesX(coordinates);
        int y = getCoordinatesY(coordinates);

        if (check(x, y)) thisObject = matrix[x][y];

        return thisObject;
    }

}
