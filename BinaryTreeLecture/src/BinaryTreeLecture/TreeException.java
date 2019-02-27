package BinaryTreeLecture;

public class TreeException extends RuntimeException
{
    public TreeException(String s)
{ super("Attempted to apply " + s +
        " to empty BTree");
}}