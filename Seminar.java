import java.util.ArrayList;
import java.util.List;

class Seminar {

    public static void main(String[] args) {
        // Учитывая двоичного дерева, верните порядок обхода значений его узлов.
        // пример
        // Input: root = [1,null,2,3]
        // Output: [1,2,3]

        
        TreeNode newRoot = new TreeNode(1); // Создаем корневой узел со значением 1
        newRoot.left = null; // Создаем левого потомка корневого узла Null
        newRoot.right = new TreeNode(2); // Создаем правого потомка корневого узла со значением 2
        newRoot.right.left = new TreeNode(3); // Создаем левого потомка узла 2 со значением 3
    
        System.out.println(preorderTraversal(newRoot));
    }
    
 

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root != null) {
            result.add(root.val); // Добавляем значение корневого узла
            result.addAll(preorderTraversal(root.left)); // Обходим левое поддерево
            result.addAll(preorderTraversal(root.right)); // Обходим правое поддерево
        }
        return result;
    }

}