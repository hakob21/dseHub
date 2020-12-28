package model;

import java.util.List;

public class Hub {
    private int id;
    private double capacity;
    private double fillingVehicle;
    private List<Container> containers;
//    private List<ContainerStation> connectedContainerStations;

    public Hub(int id, double capacity, double fillingVehicle, List<Container> containers
//            , List<ContainerStation> connectedContainerStations
    ) {
        this.id = id;
        this.capacity = capacity;
        this.fillingVehicle = fillingVehicle;
        this.containers = containers;
//        this.connectedContainerStations = connectedContainerStations;
    }

    public int getId() {
        return id;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getFillingVehicle() {
        return fillingVehicle;
    }

    public void setFillingVehicle(double fillingVehicle) {
        this.fillingVehicle = fillingVehicle;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

//    public List<ContainerStation> getConnectedContainerStations() {
//        return connectedContainerStations;
//    }
//
//    public void setConnectedContainerStations(List<ContainerStation> connectedContainerStations) {
//        this.connectedContainerStations = connectedContainerStations;
//    }
}
