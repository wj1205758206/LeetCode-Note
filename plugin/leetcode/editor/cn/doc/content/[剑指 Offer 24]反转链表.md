<p>定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。</p>

<p>&nbsp;</p>

<p><strong>示例:</strong></p>

<pre><strong>输入:</strong> 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;NULL
<strong>输出:</strong> 5-&gt;4-&gt;3-&gt;2-&gt;1-&gt;NULL</pre>

<p>&nbsp;</p>

<p><strong>限制：</strong></p>

<p><code>0 &lt;= 节点个数 &lt;= 5000</code></p>

<p>&nbsp;</p>

<p><strong>注意</strong>：本题与主站 206 题相同：<a href="https://leetcode-cn.com/problems/reverse-linked-list/">https://leetcode-cn.com/problems/reverse-linked-list/</a></p>
<details><summary><strong>Related Topics</strong></summary>递归 | 链表</details><br>

<div>👍 462, 👎 0</div>

<div id="labuladong"><hr>

**通知：[数据结构精品课 V1.7](https://aep.h5.xeknow.com/s/1XJHEO) 持续更新中；B 站可查看 [核心算法框架系列视频](https://space.bilibili.com/14089380/channel/series)。**



<p><strong><a href="https://labuladong.github.io/article?qno=剑指Offer24" target="_blank">⭐️labuladong 题解</a></strong></p>
<details><summary><strong>labuladong 思路</strong></summary>

## 基本思路

这道题和 [206. 反转链表](/problems/reverse-linked-list) 相同。

递归实现反转链表常常用来考察递归思想，我这里就用纯递归来翻转链表。


**对于递归算法，最重要的就是明确递归函数的定义**。具体来说，我们的 `reverse` 函数定义是这样的：

**输入一个节点 `head`，将「以 `head` 为起点」的链表反转，并返回反转之后的头结点**。

明白了函数的定义，再来看这个问题。比如说我们想反转这个链表：

![](https://labuladong.github.io/algo/images/反转链表/1.jpg)

那么输入 `reverse(head)` 后，会在这里进行递归：

```java
ListNode last = reverse(head.next);
```

不要跳进递归（你的脑袋能压几个栈呀？），而是要根据刚才的函数定义，来弄清楚这段代码会产生什么结果：

![](https://labuladong.github.io/algo/images/反转链表/2.jpg)

这个 `reverse(head.next)` 执行完成后，整个链表就成了这样：

![](https://labuladong.github.io/algo/images/反转链表/3.jpg)

并且根据函数定义，`reverse` 函数会返回反转之后的头结点，我们用变量 `last` 接收了。

现在再来看下面的代码：

```java
head.next.next = head;
```

![](https://labuladong.github.io/algo/images/反转链表/4.jpg)

接下来：

```java
head.next = null;
return last;
```

![](https://labuladong.github.io/algo/images/反转链表/5.jpg)

神不神奇，这样整个链表就反转过来了！

**详细题解：[递归魔法：反转单链表](https://labuladong.github.io/article/fname.html?fname=递归反转链表的一部分)**

**标签：单链表**

## 解法代码

```java
return last;
    }
}
```

**类似题目**：
  - [92. 反转链表 II 🟠](/problems/reverse-linked-list-ii)
  - [剑指 Offer 24. 反转链表 🟢](/problems/fan-zhuan-lian-biao-lcof)
  - [剑指 Offer II 024. 反转链表 🟢](/problems/UHnkqh)

</details>
</div>



