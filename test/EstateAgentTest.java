/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Kuhle Langa
 */
public class EstateAgentTest {
  @Test
    public void CalculateCommission_CalculatedSuccessfully() {
        // Arrange
        IEstateAgent estateAgent = new EstateAgent();
        String propertyPrice = "1000000";
        String commissionPercentage = "2.5";

        // Act
        double commission = estateAgent.CalculateCommission(propertyPrice, commissionPercentage);

        // Assert
        assertEquals(25000.0, commission, 0.001); // Use an appropriate delta value for double comparison
    }

    @Test
    public void CalculateCommission_CalculatedUnsuccessfully() {
        // Arrange
        IEstateAgent estateAgent = new EstateAgent();
        String propertyPrice = "invalidPrice";
        String commissionPercentage = "2.5";

        // Act & Assert
        try {
            double commission = estateAgent.CalculateCommission(propertyPrice, commissionPercentage);
            fail("Expected NumberFormatException, but got commission: " + commission);
        } catch (NumberFormatException e) {
            // Expected exception
        }
    }

    @Test
    public void ValidationTest() {
        // Arrange
        IEstateAgent estateAgent = new EstateAgent();
        Data validData = new Data("Cape Town", "John Doe", "100000", "2.5");
        Data invalidData = new Data("", "", "-500", "0");

        // Act & Assert
        assertTrue(estateAgent.ValidateData(validData));
        assertFalse(estateAgent.ValidateData(invalidData));
    }  
    
    
}
