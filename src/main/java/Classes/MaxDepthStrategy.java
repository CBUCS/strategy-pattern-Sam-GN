package Classes;

public class MaxDepthStrategy implements Strategy {

    @Override
    public void print(BinaryTreeNode pRoot) {

        System.out.println("Max Depth: "+calculateHeight(pRoot));
    }
    private int calculateHeight(BinaryTreeNode pCurrent){
        if(pCurrent==null)
            return 0;
        else{
            int left = calculateHeight(pCurrent.getLeft());
            int right = calculateHeight(pCurrent.getRight());
            return Math.max(left, right) + 1;

        }
    }
}
