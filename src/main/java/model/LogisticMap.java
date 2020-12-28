package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LogisticMap {
    private List<HubNode> hubNodes = new ArrayList<>();

    public LogisticMap() {
    }

    public LogisticMap(List<HubNode> hubNodes) {
        this.hubNodes = hubNodes;
    }

    public List<HubNode> getHubNodes() {
        return hubNodes;
    }

    public void setHubNodes(List<HubNode> hubNodes) {
        this.hubNodes = hubNodes;
    }

    public void addHub(HubNode hubNode) {
        hubNodes.add(hubNode);
    }

    public Integer locateHubForStationNode(Integer stationId) {
        Integer idOfFoundHub = null;
//        Set<HubNode> set = map.keySet();
//
//        for (HubNode HubNode : set) {
//            Set<ContainerStationNode> setOfStations = HubNode.getContainerStationNodesAndDistances().keySet();
//
////            ContainerStationNode foundContainerStationNode = setOfStations.stream().findFirst(containerStationNode -> containerStationNode==stationId);
//            for (ContainerStationNode containerStationNode : setOfStations) {
//                if (containerStationNode.getId() == stationId) {
//                    System.out.println("FOUND!");
//                    idOfFoundHub = HubNode.getId();
//                }
//            }
//        }


        return idOfFoundHub;
    }
}
