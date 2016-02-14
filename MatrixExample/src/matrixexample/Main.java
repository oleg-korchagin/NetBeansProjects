package matrixexample;

public class Main {
    public static void main(String[] args) {
        double[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 9, 1, 3} };
        Matrix D = new Matrix(d);
        D.show();        
        System.out.println();        

        Matrix A = Matrix.random(5, 5);
        A.show(); 
        System.out.println();

        A.swap(1, 2);
        System.err.println("A");
        A.show(); 
        System.out.println();

        System.err.println("B");
        Matrix B = A.transpose();
        B.show(); 
        System.out.println();

        Matrix C = Matrix.identity(5);
        C.show(); 
        System.out.println();
        
        System.err.println("A + B");
        A.plus(B).show();
        System.out.println();

        System.err.println("A * B");
        B.times(A).show();
        System.out.println();
        
        // shouldn't be equal since AB != BA in general    
        System.out.println(A.times(B).equals(B.times(A)));
        System.out.println();        
    }
}
