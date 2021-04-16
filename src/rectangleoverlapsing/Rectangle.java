package rectangleoverlapsing;

public class Rectangle {
    private final int matrixSize = 100;
    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    
    private final char[][] rectangleMatrix = new char[matrixSize][matrixSize];
    
    public char[][] getRectangleMatrix() {
        return rectangleMatrix;
    }
    
    Rectangle(String input) {
        String[] points = input.split(" ");
        
        x1 = Integer.parseInt(points[0]);
        y1 = Integer.parseInt(points[1]);
        x2 = Integer.parseInt(points[2]);
        y2 = Integer.parseInt(points[3]);
        
        for (int x = 0; x < rectangleMatrix.length; x++) {
            for (int y = 0; y < rectangleMatrix.length; y++) {
                if ((x == y1 || x == y2) && ((y >= x1 && y <= x2) || (y <= x1 && y >= x2))) {
                    rectangleMatrix[x][y] = '#';
                } else if ((y == x1 || y == x2) && ((x >= y1 && x <= y2) || (x <= y1 && x >= y2))) {
                    rectangleMatrix[x][y] = '#';
                } else {
                    rectangleMatrix[x][y] = '_';
                }
            }
        }
    }
    
    public void drawRectangle(int size) {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                System.out.print(rectangleMatrix[x][y]);
            }
            System.out.println("");
        }
    }
    
    public static void rectangleOverlapsing(int size, Rectangle rectangle1, Rectangle rectangle2) {
        String overlapse = "None";
        
        char[][] mat1 = rectangle1.getRectangleMatrix();
        char[][] mat2 = rectangle2.getRectangleMatrix();
        
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (mat1[x][y] == '#' && mat2[x][y] == '#') {
                    System.out.print('#');
                    
                    if (overlapse.equals("None")) {
                        overlapse = "Total";
                    }
                } else if (mat1[x][y] == '#' || mat2[x][y] == '#') {
                    System.out.print('#');
                    
                    if (overlapse.equals("Total")) {
                        overlapse = "Partial";
                    }
                } else {
                    System.out.print('_');
                }
            }
            System.out.println("");
        }
        
        System.out.println("\nOverlapse : " + overlapse);
    }
}
