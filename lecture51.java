class bsttnode {
    int data;
    bsttnode left;
    bsttnode right;

    bsttnode(int data) {
        this.data = data;
        left = right = null;
    }
}

public class newbst {
    bsttnode root;

    newbst() {
        root = null;
    }

    newbst(int data) {
        root = new bsttnode(data);
    }

    bsttnode search(bsttnode root, int data) {
        if (root == null || root.data == data) {
            return root;
        }
        if (data < root.data) {
            return search(root.left, data);
        } else {
            return search(root.right, data);
        }
    }

    void insert(int data) {
        root = insertRec(root, data);
    }

    bsttnode insertRec(bsttnode root, int data) {
        if (root == null) {
            root = new bsttnode(data);
            return root;
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        newbst bt = new newbst(15);
        bt.insert(10);
        bt.insert(20);
        bt.insert(8);
        bt.insert(12);
        bt.insert(17);
        bt.insert(25);

        // Example of searching a node
        bsttnode result = bt.search(bt.root, 10);
        if (result != null) {
            System.out.println("Node with data 10 found.");
        } else {
            System.out.println("Node with data 10 not found.");
        }
    }
}
