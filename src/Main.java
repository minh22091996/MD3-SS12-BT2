import javax.xml.soap.Node;

public class Main {
    public static void main(String[] args) {
        public void postorderTraversal(Node root) {
            if (root != null) {
                postorderTraversal(root.left); // duyệt cây con trái
                postorderTraversal(root.right); // duyệt cây con phải
                System.out.print(root.value + " "); // duyệt nút gốc
            }
        }
        BinarySearchTree bst = new BinarySearchTree();
// ... khởi tạo cây bst ...
        bst.postorderTraversal(bst.root);
    }


}
