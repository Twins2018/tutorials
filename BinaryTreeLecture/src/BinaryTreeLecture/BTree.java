package BinaryTreeLecture;

public class BTree<T>
{
    private BTNode<T> root;
    public BTree()
    { root = null;
    }
    //constructor
    public BTree(T o, BTree<T> l, BTree<T> r)
    { root = new BTNode<T>(o, l.root, r.root);
    }

    //constructor
    private BTree(BTNode<T> n)
    { root = n;
    }
    // class BTree<T> (continued)
public boolean isEmpty()
{ return root==null;
}
    public T value()
    { if (root==null)
        throw new TreeException("value");
    else
        return root.data;
    }

     // class BTree<T> (continued)

    public BTree<T> leftChild()
{ if (root==null)
    throw new TreeException("leftChild");
else
    return new BTree<T>(root.left);
}


public BTree<T> rightChild()
    { if (root==null)
        throw new TreeException("rightChild");
    else
        return new BTree<T>(root.right);
    }
}