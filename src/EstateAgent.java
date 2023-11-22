/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kuhle Langa
 */
public class EstateAgent implements IEstateAgent {
    
    public double CalculateCommission(String propertyPrice, String agentCommission) {
        double price = Double.parseDouble(propertyPrice);
        double commissionPercentage = Double.parseDouble(agentCommission);
        return price * (commissionPercentage / 100.0);
    }

    
    public boolean ValidateData(Data dataToValidate) {
        return isValidAgentLocation(dataToValidate.getAgentLocation()) &&
               isValidAgentName(dataToValidate.getAgentName()) &&
               isValidPropertyPrice(dataToValidate.getPropertyPrice()) &&
               isValidCommissionPercentage(dataToValidate.getCommissionPercentage());
    }

    private boolean isValidAgentLocation(String agentLocation) {
        return !agentLocation.isEmpty();
    }

    private boolean isValidAgentName(String agentName) {
        return !agentName.isEmpty();
    }

    private boolean isValidPropertyPrice(String propertyPrice) {
        try {
            double price = Double.parseDouble(propertyPrice);
            return price > 0;
        } catch (NumberFormatException e) {
            return false; // Invalid numeric format
        }
    }

    private boolean isValidCommissionPercentage(String agentCommission) {
        try {
            double commission = Double.parseDouble(agentCommission);
            return commission > 0;
        } catch (NumberFormatException e) {
            return false; // Invalid numeric format
        }
    }
}
