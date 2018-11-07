package Classes;

import java.util.Stack;

public class DFSStrategy implements Strategy {
    @Override
    public void print(BinaryTreeNode pRoot) {
        if(pRoot == null)
            return;
        System.out.print("DFS: ");
        Stack<BinaryTreeNode> res = new Stack<BinaryTreeNode>();
        res.add(pRoot);
        while(res.size()>0){
            BinaryTreeNode top = res.pop();
            System.out.print(top.getItem() + " ");
            if(top.getLeft()!=null)
                res.add(top.getLeft());
            if(top.getRight()!=null)
                res.add(top.getRight());

        }
        System.out.print("\n");
    }
}
