package eu.numerocinque.matrix;

public class Matrix {
    private final Object[][] matrix;

    public Matrix(int x, int y) {
        matrix = new Object[x][y];
    }

    public Object[][] getMatrix() {
        return matrix;
    }
}
