package Main;
import Classes.mBinaryTree;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String... args){
        mBinaryTree<Integer>  tree = new mBinaryTree<Integer>();
        tree.add(4);
        tree.add(1);
        tree.add(3);
        tree.add(6);
        tree.add(2);
        tree.add(5);

        logger.info("Hello, world");

        tree.print();
    }
}


/* out put
[INFO ] Main.Main - Hello, world
        Model : Root(Left Leaf,Right Leaf)
        4(1(Null,3(2(Null,Null),Null)),6(5(Null,Null),Null))
        BFS: 4 1 6 3 5 2
        DFS: 4 6 5 1 3 2
        Max Depth: 4
        Min Depth 2*/
