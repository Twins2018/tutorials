package BinaryTreeLecture;

class BTNode<T>
{
    T data;
    BTNode<T> left, right;

    BTNode(T o) // constructor for a leaf
    { data = o; left = right = null;
    }
    BTNode(T o, BTNode<T> l, BTNode<T> r)
    { data = o; left = l; right = r;
    }
}