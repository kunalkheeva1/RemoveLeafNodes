public class RemoveLeafNodes {

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

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if(root.left == null && root.right == null && root.val == target ){
            return null;
        }
        return root;
    }


    public static void main(String[] args) {

    }
}
