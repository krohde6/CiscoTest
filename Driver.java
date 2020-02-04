import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {

        GraphNode kyle = new GraphNode("Kyle");
        GraphNode katie = new GraphNode("Katie");
        GraphNode evan = new GraphNode("Evan");
        GraphNode emma = new GraphNode("Emma");
        GraphNode sara = new GraphNode("Sara");
        GraphNode rick = new GraphNode("Rick");
        GraphNode janie = new GraphNode("Janie");
        GraphNode joel = new GraphNode("Joel");

        GraphNode[] kathyChildren = new GraphNode[]{kyle, katie};
        GraphNode[] kerryChildren = new GraphNode[]{evan, emma};
        GraphNode[] shawnChildren = new GraphNode[]{sara, rick};
        GraphNode[] karlChildren = new GraphNode[]{janie, joel};

        GraphNode kathy = new GraphNode("Kathy", kathyChildren);
        GraphNode kerry = new GraphNode("Kerry", kerryChildren);
        GraphNode shawn = new GraphNode("Shawn", shawnChildren);
        GraphNode karl = new GraphNode("Karl", karlChildren);

        GraphNode[] gennyChildren = new GraphNode[]{kathy, kerry, shawn, karl};

        GraphNode genny = new GraphNode("Genny", gennyChildren);

        GraphNode[] family = new GraphNode[]{kyle, katie, evan, emma, sara, rick, janie, joel, kathy, kerry, shawn, karl, genny};

        Graph myFamily = new Graph(family);

        ArrayList<ArrayList<GraphNode>> paths = myFamily.paths(genny);

//        for (ArrayList<GraphNode> path : paths) {
//            for (GraphNode node : path) {
//                System.out.println(node);
//            }
//            System.out.println();
//        }


        GraphNode e = new GraphNode("E");
        GraphNode f = new GraphNode("F");
        GraphNode g = new GraphNode("G");
        GraphNode h = new GraphNode("H");
        GraphNode i = new GraphNode("I");
        GraphNode j = new GraphNode("J");

        GraphNode[] bChildren = new GraphNode[]{e, f};
        GraphNode[] cChildren = new GraphNode[]{g, h, i};
        GraphNode[] dChildren = new GraphNode[]{j};

        GraphNode b = new GraphNode("B", bChildren);
        GraphNode c = new GraphNode("C", cChildren);
        GraphNode d = new GraphNode("D", dChildren);

        GraphNode[] aChildren = new GraphNode[]{b, c, d};

        GraphNode a = new GraphNode("A", aChildren);

        GraphNode[] graphNodes = new GraphNode[]{a, b, c, d, e, f, g, h, i, j};

        Graph graph = new Graph(graphNodes);

        ArrayList<ArrayList<GraphNode>> graphPaths = graph.paths(a);

        for (ArrayList<GraphNode> path : graphPaths) {
            for (GraphNode node : path) {
                System.out.println(node);
            }
            System.out.println();
        }
    }
}
