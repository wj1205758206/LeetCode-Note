<p>请完成一个函数，输入一个二叉树，该函数输出它的镜像。</p>

<p>例如输入：</p>

<p><code>&nbsp; &nbsp; &nbsp;4<br>
&nbsp; &nbsp;/ &nbsp; \<br>
&nbsp; 2 &nbsp; &nbsp; 7<br>
&nbsp;/ \ &nbsp; / \<br>
1 &nbsp; 3 6 &nbsp; 9</code><br>
镜像输出：</p>

<p><code>&nbsp; &nbsp; &nbsp;4<br>
&nbsp; &nbsp;/ &nbsp; \<br>
&nbsp; 7 &nbsp; &nbsp; 2<br>
&nbsp;/ \ &nbsp; / \<br>
9 &nbsp; 6 3&nbsp; &nbsp;1</code></p>

<p>&nbsp;</p>

<p><strong>示例 1：</strong></p>

<pre><strong>输入：</strong>root = [4,2,7,1,3,6,9]
<strong>输出：</strong>[4,7,2,9,6,3,1]
</pre>

<p>&nbsp;</p>

<p><strong>限制：</strong></p>

<p><code>0 &lt;= 节点个数 &lt;= 1000</code></p>

<p>注意：本题与主站 226 题相同：<a href="https://leetcode-cn.com/problems/invert-binary-tree/">https://leetcode-cn.com/problems/invert-binary-tree/</a></p>
<details><summary><strong>Related Topics</strong></summary>树 | 深度优先搜索 | 广度优先搜索 | 二叉树</details><br>

<div>👍 280, 👎 0</div>

<div id="labuladong"><hr>

**通知：[数据结构精品课 V1.7](https://aep.h5.xeknow.com/s/1XJHEO) 持续更新中；B 站可查看 [核心算法框架系列视频](https://space.bilibili.com/14089380/channel/series)。**



<p><strong><a href="https://labuladong.github.io/article?qno=剑指Offer27" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这道题和 [226. 翻转二叉树](/problems/invert-binary-tree) 相同。

> 本文有视频版：[二叉树/递归的框架思维（纲领篇）](https://www.bilibili.com/video/BV1nG411x77H)

前文 [手把手刷二叉树总结篇](https://labuladong.github.io/article/fname.html?fname=二叉树总结) 说过二叉树的递归分为「遍历」和「分解问题」两种思维模式，这道题可以同时使用两种思维模式。

如何翻转二叉树？其实就是把二叉树上的每个节点的左右子节点都交换一下，我同时给出两种思维模式下的解法供你对比。

**详细题解：[东哥带你刷二叉树（思路篇）](https://labuladong.github.io/article/fname.html?fname=二叉树系列1)**

**标签：[二叉树](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=2121994699837177859)，[数据结构](https://mp.weixin.qq.com/mp/appmsgalbum?__biz=MzAxODQxMDM0Mw==&action=getalbum&album_id=1318892385270808576)**

## 解法代码

```java
// 「遍历」的思路
class Solution {
    // 主函数
    public TreeNode invertTree(TreeNode root) {
        // 遍历二叉树，交换每个节点的子节点
        traverse(root);
        return root;
    }

    // 二叉树遍历函数
    void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        /**** 前序位置 ****/
        // 每一个节点需要做的事就是交换它的左右子节点
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // 遍历框架，去遍历左右子树的节点
        traverse(root.left);
        traverse(root.right);
    }
}

// 「分解问题」的思路
class Solution2 {
    // 定义：将以 root 为根的这棵二叉树翻转，返回翻转后的二叉树的根节点
    TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // 利用函数定义，先翻转左右子树
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // 然后交换左右子节点
        root.left = right;
        root.right = left;

        // 和定义逻辑自恰：以 root 为根的这棵二叉树已经被翻转，返回 root
        return root;
    }
}
```

**类似题目**：
  - [114. 二叉树展开为链表 🟠](/problems/flatten-binary-tree-to-linked-list)
  - [116. 填充每个节点的下一个右侧节点指针 🟠](/problems/populating-next-right-pointers-in-each-node)
  - [剑指 Offer 27. 二叉树的镜像 🟢](/problems/er-cha-shu-de-jing-xiang-lcof)

</details>
</div>









