public class GraphNode implements GNode {

    private String name;
    private GraphNode[] children;

    /**
     * Single argument constructor.
     * Use this constructor for leaf nodes
     *
     * @param name String representing data held in the node
     */
    public GraphNode(String name) {
        this(name, new GraphNode[0]);
    }

    /**
     * 2-argument constructor
     * Use this constructor for all nodes that are not leaves
     *
     * @param name String representing data held in the node
     * @param children array of GraphNode representing all of this node's children
     */
    public GraphNode(String name, GraphNode[] children) {
        this.name = name;
        this.children = children;
    }


    /**
     * Getter for name (String) instance variable
     *
     * @return data held in the node
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Getter for children (GraphNode[]) instance variable
     *
     * @return array of children of this node
     */
    @Override
    public GraphNode[] getChildren() {
        return children;
    }

    /**
     * Mainly used for testing purposes. Displays node's name (data)
     *
     * @return String representation of the data held in the node
     */
    @Override
    public String toString() {
        return "Node containing: " + name;
    }
}
