import model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Creaete Hubs
//        HubNode hubNode1 = new HubNode(1);
//        HubNode hubNode2 = new HubNode(2);
//        HubNode hubNode3 = new HubNode(3);
//        HubNode hubNode4 = new HubNode(4);
//
//        //Creaete connected Hub nodes for ContainerStationNode1
//        Map<HubNode, Integer> connectedHubNodesAndDistances1 = new HashMap<>();
//        connectedHubNodesAndDistances1.put(hubNode1, 4);
//        //Create ContainerStationNode1
//        ContainerStationNode containerStationNode1 = new ContainerStationNode(1);
//
//
//
//        //Creaete connected Hub nodes for ContainerStationNode2
//        Map<HubNode, Integer> connectedHubNodesAndDistances2 = new HashMap<>();
//        connectedHubNodesAndDistances2.put(hubNode1, 5);
//        //Create ContainerStationNode2
//        ContainerStationNode containerStationNode2 = new ContainerStationNode(2);
//
//        //Creaete connected Hub nodes for ContainerStationNode7
//        Map<HubNode, Integer> connectedHubNodesAndDistances7 = new HashMap<>();
//        connectedHubNodesAndDistances7.put(hubNode3, 5);
//        //Create ContainerStationNode7
//        ContainerStationNode containerStationNode7 = new ContainerStationNode(7);
//
//
//
//        //Create List of hub nodes
//        List<HubNode> hubNodeList = new ArrayList<>();
//        hubNodeList.add(hubNode1);
//        hubNodeList.add(hubNode3);
//
//        LogisticMap logisticMap = new LogisticMap(hubNodeList, );

        //For this hub
        //HUB 1
        Map<ContainerStationNode, Integer> containerStationNodesAndDistancesForHub1 = new HashMap<>();
        containerStationNodesAndDistancesForHub1.put(new ContainerStationNode(1), 4);
        containerStationNodesAndDistancesForHub1.put(new ContainerStationNode(2), 5);
        containerStationNodesAndDistancesForHub1.put(new ContainerStationNode(3), 3);

        Map<HubNode, Integer> hubNodeDestinationsForHub1 = new HashMap<>();
        hubNodeDestinationsForHub1.put()
        //this hub node
        HubNode thisHub = new HubNode(1, containerStationNodesAndDistancesForHub1, hubNodeDestinations);


        //Will get from other nodes
        //HUB 3
        Map<ContainerStationNode, Integer> containerStationNodesAndDistancesForHub3 = new HashMap<>();

        //test container station
        ContainerStationNode testContainerStationNode11 = new ContainerStationNode(11);

        containerStationNodesAndDistancesForHub3.put(new ContainerStationNode(7), 2);
        containerStationNodesAndDistancesForHub3.put(new ContainerStationNode(6), 2);
        containerStationNodesAndDistancesForHub3.put(new ContainerStationNode(8), 3);
        containerStationNodesAndDistancesForHub3.put(testContainerStationNode11, 10);
        HubNode HubNode3 = new HubNode(3, containerStationNodesAndDistancesForHub3, hubNodeDestinations);

        //Will get from other nodes
        //HUB 4
        Map<ContainerStationNode, Integer> containerStationNodesAndDistancesForHub4 = new HashMap<>();
        containerStationNodesAndDistancesForHub4.put(new ContainerStationNode(9), 7);
        containerStationNodesAndDistancesForHub4.put(testContainerStationNode11, 16);
        HubNode HubNode4 = new HubNode(4, containerStationNodesAndDistancesForHub4, hubNodeDestinations);


        Map<HubNode, List<Map.Entry<HubNode, Integer>>> logisticMap = new HashMap<>();
        logisticMap.put(thisHub, Arrays.asList(new AbstractMap.SimpleEntry(HubNode3, 7)));
        logisticMap.put(HubNode3, Arrays.asList(new AbstractMap.SimpleEntry(thisHub, 7), new AbstractMap.SimpleEntry<>(HubNode4, 12)));
        logisticMap.put(HubNode4, Arrays.asList(new AbstractMap.SimpleEntry<>(HubNode3, 12)));

        LogisticMap logisticMapNew = new LogisticMap(logisticMap);

        System.out.println("Hub No: " + logisticMapNew.locateHubForStationNode(11));

    }

    public static void newContainer(Integer fromHub, Integer toHub) {

    }
}
