package domain;

public class BinaryTree<E> {
    private E data;
    private BinaryTree<E> leftTree, rightTree;

    public BinaryTree(E data) {
        this(data, null, null);
    }

    public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
        if (data == null) {
            throw new IllegalArgumentException();
        }
        this.data = data;
        this.leftTree = leftTree;
        this.rightTree = rightTree;
    }

    public void printPreorder() {
        System.out.print(this.data + " ");
        if (this.leftTree != null) this.leftTree.printPreorder();
        if (this.rightTree != null) this.rightTree.printPreorder();
    }

    public void printInorder() {
        if (this.leftTree != null) this.leftTree.printInorder();
        System.out.print(this.data + " ");
        if (this.rightTree != null) this.rightTree.printInorder();
    }

    public void printPostorder() {
        if (this.leftTree != null) this.leftTree.printPostorder();
        if (this.rightTree != null) this.rightTree.printPostorder();
        System.out.print(this.data + " ");
    }

    public int countNodes(BinaryTree<String> root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + countNodes(root.leftTree) + countNodes(root.rightTree);
        }
    }

    public int getDepth(BinaryTree<String> root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = getDepth(root.leftTree);
            int rightDepth = getDepth(root.rightTree);

            if (leftDepth > rightDepth) {
                return leftDepth + 1;
            } else {
                return rightDepth + 1;
            }
        }
    }

    public boolean isLeaf(BinaryTree<String> node) {
        return node.leftTree == null && node.rightTree == null;
    }


}
