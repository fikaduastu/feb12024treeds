class BinarySearchTreeRunner{
    public static void main(String[] args) {
        
    }
}

class BinarySearchTree{

    TreeNode root;

    public BinarySearchTree(){
        root = null;
    }

    public void inorder(){}
    public void preorder(){}
    public void postorder(){}
    public void theMinimumNode(){}
    public void theMaximumNode(){}
    public void topToLeft(){}
    public void topToRight(){}
    public void leftToTop(){}
    public void rightToTop(){}
    
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}