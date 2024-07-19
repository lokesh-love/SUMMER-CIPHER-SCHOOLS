class Node{

    int data;
    Node left;
    Node right;;
    Node(int data){
        this.data=data;
        Node left = null;
        Node right = null;
    }

}


public class Bst {
    Node root;
    public Bst(int data) {
        this.root=new Node(data);
    }

    int treesum(Node root){
        if(root==null) return 0; 
        return root.data +treesum(root.left)+treesum(root.right);
    }
    int treesumn(Node root){
        if(root==null) return 0; 
        return 1 +treesumn(root.left)+treesumn(root.right);
    }
    int nonodes(Node root){
        if(root==null) return 0;
        // if(root.left == null&& root.right ==null) return 1;
        if(root.left==null && root.right==null) return 1;
        return nonodes(root.left)+nonodes(root.right);

    }

    int heighttre(Node root){
        if(root==null) return -1;
        return 1+Math.max(heighttre(root.left),heighttre(root.right));
    }

    void printele(Node root,int lev){
        if(root==null) return;
        if(lev==0) System.out.print(root.data+" ");

        printele(root.left,lev -1);
        printele(root.right,lev-1);
;    }

    public static void main(String [] args){

        Bst bst = new Bst(2);
        System.out.println(bst.root.data);
        bst.root.left = new Node(3);
        bst.root.left.left = new Node(9);
        bst.root.right = new Node(5);
        bst.root.right.left = new Node(7);
        System.out.println(bst.treesum(bst.root));
        System.out.println(bst.treesumn(bst.root));//total no of nodes
        System.out.println(bst.nonodes(bst.root));
        System.out.println(bst.heighttre(bst.root));

        bst.printele(bst.root,1);//printin elements at each level

        System.out.println();

        bst.printele(bst.root,2);

    }
    
}

