/*This program is responsible for adding, subtracting, transpose, and multiplication of matrices using
   object oriented approach
*/ 



package pkg2darray;
//importing a package for inputting data from keyboard
import java.util.Scanner;

//class Matrix for performing operations on matrices

class Matrix {
    
    //instance variable for class in which matrix1 and matrix2 are responsible for storing elements of two matrices
    int[][] matrix1;
    int[][] matrix2;
    
    //m and n are representing rows and columns for 2D array
    
    int m;
    int n;

    //constructor for initilizing values values of m and n to instance variableswhere scanner is objject for inputting
    
    public void input(Scanner scanner, int m, int n) {
        this.m = m;
        this.n = n;

        matrix1 = new int[m][n];
        matrix2 = new int[m][n];

        System.out.println("Enter elements for Matrix 1:");
        inputMatrix(scanner, matrix1);

        System.out.println("Enter elements for Matrix 2:");
        inputMatrix(scanner, matrix2);
    }//End of constructor

    
    
    //Method for inputting matrix
    
    private void inputMatrix(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    
    //Methods for displaying elements of matrix
    public void show() {
        System.out.println( "Elements of Matrix 1:");
        showMatrix(matrix1);

        System.out.println("Elements of Matrix 2:");
        showMatrix(matrix2);
    }

    private void showMatrix(int[][] matrix) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    
    //Method for displaying sum of two matrices 
    public void sum() {
        System.out.println("Sum of Matrices:");
        int[][] sumMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    
    //Method for displaying Subtraction of two matrices
    
    public void differnce() {
        System.out.println("Subtraction of Matrices:");
        int[][] subtraction = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                subtraction[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(subtraction[i][j] + " ");
            }
            System.out.println();
        }
    }
   
    
    
    //Methods for disp;aying transpose of two matrices
    
    public void transpose() {
        System.out.println("Transpose of Matrix 1:");
        transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 2:");
        transposeMatrix(matrix2);
    }

    
  
    private void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
    
   
    // Method for displaying product of two matrices
    
public void product() {
    
    int[][] productMatrix = new int[m][n];
    System.out.println("Product of two matrices is: ");
    
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            
            for (int k = 0; k < n; k++) {
                
                productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
            }
            System.out.print(productMatrix[i][j] + " ");
        }
        System.out.println();
    }
}


public void product2(){
    int[][] productMatrix = new int[m][n];
    
      for(int i=0;i<m;i++){
          
          for(int j = 0 ; j<n ; j++){
              
              productMatrix[i][j] = matrix1[i][j]*matrix2[j][i];
              
          }
      }
    
    
}
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix practice = new Matrix();

        System.out.println("How many rows do you want to use: ");
        int m = scanner.nextInt();

        System.out.println("How many columns do you want to use: ");
        int n = scanner.nextInt();

        practice.input(scanner, m, n);
        practice.show();
        practice.sum();
        practice.differnce();
        practice.transpose();
        practice.product();
    }
}
