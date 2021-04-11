package helix;

public class MatrixHelixMorph {

    public static void main(String[] args) {
        int[][] inMatrix  = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20} };
        helix(inMatrix);
    }

    /**
     * @param inMatrix
     * @return a matrix that is morphed into a helix version of inMatrix
     */
    public static int[][] helix( int[][] inMatrix) {
        int[][] outMatrix = new int[inMatrix.length][inMatrix[0].length];

        int colLength = inMatrix.length;
        int rowLength = inMatrix[0].length;
        int count = 0;
        boolean flag = true;

        int rowIndex = 0;
        int colIndex = 0;
        boolean invertedFlag = false;

        for (int i = 0; i < inMatrix.length; i++){
            for (int j = 0; j < inMatrix[0].length; j++){
                // iterate through the first row
                outMatrix[rowIndex][colIndex] = inMatrix[i][j];
                count++;
                if(flag){
                    if (count == rowLength) {
                        flag = false;
                        count = 0;
                        colLength = colLength - 1;
                        rowIndex = invertedFlag ? rowIndex - 1: rowIndex + 1;
                    }
                    else {
                        colIndex = invertedFlag ? colIndex - 1: colIndex + 1;
                    }
                } else {
                     if (count == colLength) {
                        flag = true;
                        count = 0;
                        rowLength = rowLength - 1;
                        invertedFlag = invertedFlag ? false : true;
                        colIndex = invertedFlag? colIndex - 1 :  colIndex + 1;
                    }
                    else {
                        rowIndex = invertedFlag ? rowIndex - 1: rowIndex + 1;
                    }
                }


                // iterate through the last col (row length - 1)
                // iterate through the last row (col length - 1)
                // iterate through the first col (row length - 2)
            }
        }
        return outMatrix; //MODIFY THIS METHOD
    }
}