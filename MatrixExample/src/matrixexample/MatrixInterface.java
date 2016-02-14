package matrixexample;

public interface MatrixInterface {
    Matrix transpose();
    Matrix plus(Matrix B);
    Matrix minus(Matrix B);
    Matrix times(Matrix B);
    public void show();
}
