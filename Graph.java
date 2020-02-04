import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class Graph {

    private GraphNode[] nodes;
    private int size;

    /**
     * Single argument Graph constructor
     *
     * @param nodes array of GraphNode for all nodes in this graph
     *              assumes there are no null values in the array
     */
    public Graph(GraphNode[] nodes) {
        this.nodes = nodes;
        this.size = nodes.length;
    }

    /**
     * Getter method for number of nodes in the graph
     * @return integer for number of nodes in the graph
     */
    public int size() {
        return size;
    }

    /**
     * Breadth-first walk through Graph
     *
     * @param start arbitrary GraphNode in this Graph
     * @return ArrayList of all nodes in the graph
     */
    public ArrayList walkGraph(GraphNode start) {
        Set<GraphNode> visited = new HashSet<>(size());
        Deque<GraphNode> queue = new ArrayDeque<>();
        queue.add(start);

        ArrayList<GraphNode> list = new ArrayList<>();
        while (!queue.isEmpty()) {
            GraphNode current = queue.pop();
            list.add(current);

            if (!visited.contains(current)) {
                visited.add(current);
                GraphNode[] children = current.getChildren();

                for (GraphNode child : children) {
                    if (!visited.contains(child)) {
                        queue.add(child);
                    }
                }
            }
        }
        return list;
    }

    /**
     * Public wrapper method
     *
     * @param node arbitrary starting node in the graph
     * @return ArrayList of ArrayList: all paths beginning at node
     */
    public ArrayList paths(GraphNode node) {
        ArrayList<ArrayList<GraphNode>> paths = new ArrayList<>();
        ArrayList<GraphNode> curPath = new ArrayList<>();

        curPath.add(node);
        pathsRec(node, paths, curPath);

        return paths;
    }

    /**
     * Private recursive method for paths()
     * Utilizes a depth-first walk through each path from node to leaf node
     *
     * @param node current node being traversed
     * @param paths current ArrayList of all paths
     * @param curPath current sub-path being traversed
     */
    private void pathsRec(GraphNode node,
                               ArrayList<ArrayList<GraphNode>> paths,
                               ArrayList<GraphNode> curPath) {

        if (node.getChildren().length == 0) {
            paths.add(new ArrayList<GraphNode>(curPath));
            return;
        }

        for (GraphNode child : node.getChildren()) {
            curPath.add(child);
            pathsRec(child, paths, curPath);
            curPath.remove(curPath.size() - 1);
        }
    }
}
