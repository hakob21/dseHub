package service;

import dijkstra.Graph;
import model.ContainerStationNode;
import model.Hub;
import model.HubNode;

public class RouteCalculationService {
    private Graph graph;
    private HubNode thisHubNode;

    public RouteCalculationService(Graph graph, HubNode thisHubNode) {
        this.graph = graph;
        this.thisHubNode = thisHubNode;
    }

    public void calculateRoute(ContainerStationNode from, ContainerStationNode to) {

    }

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }
}
