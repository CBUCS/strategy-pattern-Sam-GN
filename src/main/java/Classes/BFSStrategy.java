package Classes;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BFSStrategy implements Strategy {

    @Override
    public void print(BinaryTreeNode pRoot) {
        if(pRoot == null)
            return;
        System.out.print("BFS: ");
        Queue<BinaryTreeNode> queue= new ConcurrentLinkedQueue<BinaryTreeNode>();
        queue.add(pRoot);
        while (queue.size()>0)
        {

            BinaryTreeNode tempNode = queue.poll();
            System.out.print(tempNode.getItem() + " ");

            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }
            if (tempNode.getRight() != null) {
                queue.add(tempNode.getRight());
            }


        }
        System.out.print("\n");
    }
}
