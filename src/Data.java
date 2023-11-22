/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kuhle Langa
 */
class Data {
     private String agentLocation;
    private String agentName;
    private String propertyPrice;
    private String commissionPercentage;

    public Data(String agentLocation, String agentName, String propertyPrice, String commissionPercentage) {
        this.agentLocation = agentLocation;
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
        this.commissionPercentage = commissionPercentage; 
}

    public String getAgentLocation() {
        return agentLocation;
    }

    public String getAgentName() {
        return agentName;
    }

    public String getPropertyPrice() {
        return propertyPrice;
    }

    public String getCommissionPercentage() {
        return commissionPercentage;
    }
}
