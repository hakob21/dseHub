import model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //CREATING HUB 3
        //HUB 3 Stations
        Map<ContainerStationNode, Integer> containerStationNodesAndDistancesForHub3 = new HashMap<>();
        containerStationNodesAndDistancesForHub3.put(new ContainerStationNode(7), 2);
        containerStationNodesAndDistancesForHub3.put(new ContainerStationNode(6), 2);
        containerStationNodesAndDistancesForHub3.put(new ContainerStationNode(8), 3);
        containerStationNodesAndDistancesForHub3.put(new ContainerStationNode(10), 10);
        containerStationNodesAndDistancesForHub3.put(new ContainerStationNode(11), 16);
        //Create HubNode 3
        HubNode hubNode3 = new HubNode(3, containerStationNodesAndDistancesForHub3, null);



        //CREATING this HUB (1)
        //HUB 1 Stations
        Map<ContainerStationNode, Integer> containerStationNodesAndDistancesForThisHub = new HashMap<>();
        containerStationNodesAndDistancesForThisHub.put(new ContainerStationNode(1), 4);
        containerStationNodesAndDistancesForThisHub.put(new ContainerStationNode(2), 5);
        containerStationNodesAndDistancesForThisHub.put(new ContainerStationNode(3), 2);
        //Create HubNode destinations for this hub (1)
        Map<HubNode, Integer> hubNodeDestinationsForThisHub = new HashMap<>();
        hubNodeDestinationsForThisHub.put(hubNode3, 7);
        //Create this HubNode (1)
        HubNode thisHubNode = new HubNode(1, containerStationNodesAndDistancesForThisHub, hubNodeDestinationsForThisHub);
        //Update HubNode3 add destination to this Hub(1)
        Map<HubNode, Integer> hubNodeDestinations3 = new HashMap<>();
        hubNodeDestinations3.put(thisHubNode, 7);
        hubNode3.setHubNodeDestinations(hubNodeDestinations3);



        //CREATING HUB 4
        //HUB 4 Stations
        Map<ContainerStationNode, Integer> containerStationNodesAndDistancesForHub4 = new HashMap<>();
        containerStationNodesAndDistancesForHub4.put(new ContainerStationNode(9), 7);
        containerStationNodesAndDistancesForHub4.put(new ContainerStationNode(10), 8);
        containerStationNodesAndDistancesForHub4.put(new ContainerStationNode(11), 16);
        //Create HubNode destinations for Hub 4
        Map<HubNode, Integer> hubNodeDestinationsForHub4 = new HashMap<>();
        hubNodeDestinationsForHub4.put(hubNode3, 12);
        //Create HubNode 4
        HubNode hubNode4 = new HubNode(4, containerStationNodesAndDistancesForHub4, hubNodeDestinationsForHub4);
        //Update HubNode3 add destination to Hub 4
        hubNodeDestinations3.put(hubNode4, 12);
        hubNode3.setHubNodeDestinations(hubNodeDestinations3);



        //CREATING HUB 2
        //HUB 2 Stations
        Map<ContainerStationNode, Integer> containerStationNodesAndDistancesForHub2 = new HashMap<>();
        containerStationNodesAndDistancesForHub2.put(new ContainerStationNode(3), 7);
        containerStationNodesAndDistancesForHub2.put(new ContainerStationNode(4), 4);
        containerStationNodesAndDistancesForHub2.put(new ContainerStationNode(5), 6);
        //Create HubNode destinations for Hub 2
        Map<HubNode, Integer> hubNodeDestinationsForHub2 = new HashMap<>();
        hubNodeDestinationsForHub2.put(hubNode3, 10);
        //Create HubNode 2
        HubNode hubNode2 = new HubNode(2, containerStationNodesAndDistancesForHub2, hubNodeDestinationsForHub2);
        //Update HubNode3 add destination to Hub 2
        hubNodeDestinations3.put(hubNode2, 10);
        hubNode3.setHubNodeDestinations(hubNodeDestinations3);





        LogisticMap logisticMap = new LogisticMap();

        logisticMap.addHub(thisHubNode);
        logisticMap.addHub(hubNode3);
        logisticMap.addHub(hubNode2);
        logisticMap.addHub(hubNode4);


    }

    public static void newContainer(Integer fromHub, Integer toHub) {

    }
}
