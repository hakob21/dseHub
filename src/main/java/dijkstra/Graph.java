package dijkstra;

import model.HubNode;
import model.LogisticMap;

import java.util.*;
import java.util.Map.Entry;

public class Graph {
    private Set<GraphNode> nodes = new HashSet<>();

    public void addNode(GraphNode nodeA) {
        nodes.add(nodeA);
    }

    public void init(LogisticMap logisticMapNew) {
        Set<HubNode> settled = new HashSet<>();


        Entry<HubNode, List<Entry<HubNode, Integer>>> startingFromEntry = null;

        for (Entry<HubNode, List<Entry<HubNode, Integer>>> entry : logisticMapNew.getMap().entrySet()) {

            if (entry.getKey().equals(startingFrom)) {
                startingFromEntry = entry;
            }

//            GraphNode graphNode = new GraphNode(Integer.toString(entry.getKey().getId()));
//
//            List<GraphNode> destinationNodes = new ArrayList<>();
//
//            for (HubNode candidate : entry.getValue()) {
//                for (HubNode settledHubNode : settled) {
//                    if (!candidate.equals(settledHubNode)) {
//                        destinationNodes.add(graphNode);
//                    }
//                }
//            }
        }

        while (true) {
            startingFromEntry.getValue()
        }


    }

    public Set<GraphNode> getNodes() {
        return nodes;
    }

    public void setNodes(Set<GraphNode> nodes) {
        this.nodes = nodes;
    }

//    public static Graph calculateShortestPathFromSource(Graph graph, Node source) {
//        source.setDistance(0);
//
//        Set<Node> settledNodes = new HashSet<>();
//        Set<Node> unsettledNodes = new HashSet<>();
//
//        unsettledNodes.add(source);
//
//        while (unsettledNodes.size() != 0) {
//            Node currentNode = getLowestDistanceNode(unsettledNodes);
//            unsettledNodes.remove(currentNode);
//            for (Map.Entry< Node, Integer> adjacencyPair:
//                    currentNode.getAdjacentNodes().entrySet()) {
//                Node adjacentNode = adjacencyPair.getKey();
//                Integer edgeWeight = adjacencyPair.getValue();
//                if (!settledNodes.contains(adjacentNode)) {
//                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
//                    unsettledNodes.add(adjacentNode);
//                }
//            }
//            settledNodes.add(currentNode);
//        }
//        return graph;
//    }

}
