package DataStructure.sparsearray;

public class SparseArray {
    public static void main(String[] args) {

        // 1、创建二维数组
        int[][] ints = new int[11][11];

        // 2 二位数组赋值
        ints[1][2] = 1;
        ints[2][3] = 2;

        // 3 遍历数组

        for(int[] data : ints) {
            for(int data1 : data) {
                System.out.printf("%d\t" ,data1);
            }
            System.out.println();
        }
    }
}
