package model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class LogisticMap {
    private Map<HubNode, List<Map.Entry<HubNode, Integer>>> map;

    public LogisticMap(Map<HubNode, List<Map.Entry<HubNode, Integer>>> map) {
        this.map = map;
    }

    public Map<HubNode, List<Map.Entry<HubNode, Integer>>> getMap() {
        return map;
    }

    public void setMap(Map<HubNode, List<Map.Entry<HubNode, Integer>>> map) {
        this.map = map;
    }

    public Integer locateHubForStationNode(Integer stationId) {
        Integer idOfFoundHub = null;
        Set<HubNode> set = map.keySet();

        for (HubNode HubNode : set) {
            Set<ContainerStationNode> setOfStations = HubNode.getContainerStationNodesAndDistances().keySet();

//            ContainerStationNode foundContainerStationNode = setOfStations.stream().findFirst(containerStationNode -> containerStationNode==stationId);
            for (ContainerStationNode containerStationNode : setOfStations) {
                if (containerStationNode.getId() == stationId) {
                    System.out.println("FOUND!");
                    idOfFoundHub = HubNode.getId();
                }
            }
        }

        return idOfFoundHub;
    }
}
