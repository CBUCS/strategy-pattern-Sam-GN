package Classes;

public class MinDepthStrategy implements Strategy {

    @Override
    public void print(BinaryTreeNode pRoot) {
        System.out.println("Min Depth "+calculateHeight(pRoot));
    }

    private int calculateHeight(BinaryTreeNode pCurrent){
        if(pCurrent==null)
            return 0;
        else{
            int left = calculateHeight(pCurrent.getLeft());
            int right = calculateHeight(pCurrent.getRight());
            return Math.min(left, right) + 1;

        }
    }
}
