package Classes;

public class NormalPrintStrategy implements Strategy {
    @Override
    public void print(BinaryTreeNode pRoot) {
        System.out.print("Model : Root(Left Leaf,Right Leaf)"+"\n");
        System.out.println(whatToPrint(pRoot));
    }
    private String whatToPrint(BinaryTreeNode pCurrent){
        if(pCurrent==null)
            return "Null";
        else{
            return String.valueOf(pCurrent.getItem())+"("+whatToPrint(pCurrent.getLeft())+","+whatToPrint(pCurrent.getRight())+")";
        }
    }
}
