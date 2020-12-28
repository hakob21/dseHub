package model;

import java.util.Map;

public class HubNode {
    private int id;
    private Map<ContainerStationNode, Integer> containerStationNodesAndDistances;
    private Map<HubNode, Integer> hubNodeDestinations;

    public HubNode(int id, Map<ContainerStationNode, Integer> containerStationNodesAndDistances, Map<HubNode, Integer> hubNodeDestinations) {
        this.id = id;
        this.containerStationNodesAndDistances = containerStationNodesAndDistances;
        this.hubNodeDestinations = hubNodeDestinations;
    }

    public int getId() {
        return id;
    }

    public Map<ContainerStationNode, Integer> getContainerStationNodesAndDistances() {
        return containerStationNodesAndDistances;
    }

    public void setContainerStationNodesAndDistances(Map<ContainerStationNode, Integer> containerStationNodesAndDistances) {
        this.containerStationNodesAndDistances = containerStationNodesAndDistances;
    }
}
