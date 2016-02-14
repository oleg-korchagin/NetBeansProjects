package matrixexample;

public class Matrix implements MatrixInterface {
    protected int M;             // number of rows
    protected int N;             // number of columns
    protected Complex[][] data;

    public Matrix(int M, int N) {
        this.M = M;
        this.N = N;
        this.data = new Complex[M][N];
    }

    public Matrix(Complex[][] d) {
        this.M = d.length;
        this.N = d[0].length;
        this.data = new Complex[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                this.data[i][j] = d[i][j];
            }
        }
    }

    public Matrix(double[][] d) {
        this.M = d.length;
        this.N = d[0].length;
        this.data = new Complex[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                this.data[i][j] = new Complex(d[i][j], 0.0);
            }
        }
    }
    
    public static Matrix random(int M, int N) {
        Matrix A = new Matrix(M, N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A.data[i][j] = new Complex(Math.random(), Math.random());
            }
        }
        return A;
    } 
    // swap rows i and j
    protected void swap(int i, int j) {
        Complex[] temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    // create and return the N-by-N identity matrix
    public static Matrix identity(int N) {
        Matrix I = new Matrix(N, N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    I.data[i][j] = new Complex(1, 0);
                } else {
                    I.data[i][j] = new Complex(0, 0);
                }
            }
        }
        return I;
    }
    
    public boolean equals(Object obj) {
        Matrix B = (Matrix) obj;
        if (B.M != this.M || B.N != this.N) throw new RuntimeException("Illegal matrix dimensions.");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (!this.data[i][j].equals(B.data[i][j])) return false;
            }
        }
        return true;
    }

    @Override
    public Matrix transpose() {
        Matrix A = new Matrix(N, M);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A.data[j][i] = data[i][j];
            }
        }
        return A;
    }
    
    @Override
    public Matrix plus(Matrix B) {
        if (B.M != this.M || B.N != this.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(M, N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                C.data[i][j] = this.data[i][j].plus(B.data[i][j]);
            }
        }
        return C;
    }
    
    @Override
    public Matrix minus(Matrix B) {
        if (B.M != this.M || B.N != this.N) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(M, N);
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                C.data[i][j] = this.data[i][j].minus(B.data[i][j]);
            }
        }
        return C;
    }

    @Override
    public Matrix times(Matrix B) {
        if (this.N != B.M) throw new RuntimeException("Illegal matrix dimensions.");
        Matrix C = new Matrix(this.M, B.N);
        for (int i = 0; i < C.M; i++) {
            for (int j = 0; j < C.N; j++) {
                for (int k = 0; k < this.N; k++) {
                    C.data[i][j] = this.data[i][k].times(data[k][j]);
                }
            }
        }
        return C;
    }

    @Override
    public void show() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%s ", data[i][j]);
            }
            System.out.println();
        }
    }
    
}
