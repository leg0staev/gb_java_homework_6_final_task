# домашнее задание Geek Brains
## Java: знакомство и как пользоваться базовым API

### Урок 6. Хранение и обработка данных ч3: множество коллекций Set
----

**задача**

Учитывая двоичного дерева, верните порядок обхода значений его узлов.

пример

Input: root = [1,null,2,3]
Output: [1,2,3]

```
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
```

**решение**

Чтобы получить порядок обхода значений узлов двоичного дерева в порядке «префиксного обхода» (pre-order traversal), мы начинаем с корневого узла, затем обходим его левое поддерево, а затем правое поддерево.

Мы можем использовать рекурсию, чтобы реализовать этот алгоритм. Для каждого узла мы сначала добавляем его значение в список результатов, затем вызываем рекурсивно эту же функцию для его левого и правого поддерева. Когда мы доходим до листовых узлов (узлов без дочерних элементов), рекурсия заканчивается.

```
public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    if (root != null) {
        result.add(root.val);  // Добавляем значение корневого узла
        result.addAll(preorderTraversal(root.left));  // Обходим левое поддерево
        result.addAll(preorderTraversal(root.right));  // Обходим правое поддерево
    }
    return result;
}
```
