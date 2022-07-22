public class RemoveLeafNodes {
    //node class
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    static Node removeLeafNodes(Node root, int target){
        if(root == null) return null;

        //movement of left and right with target
        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        // if left and right and value is reached then return null there
        if(root.left == null && root.right == null && root.val == target ){
            return null;
        }
        return root;
    }


    public static void main(String[] args) {

    }
}
