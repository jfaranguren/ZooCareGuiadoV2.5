package model;

/**
 * Represents an Animal with specific attributes such as name, weight, diet
 * type, life stage, and health status.
 */
public class Animal {

    private String name;
    private double weight;
    private String dietType;
    private String lifeStage;
    private String healthStatus;

    /**
     * Constructs an Animal object with the specified attributes.
     *
     * @param name         The name of the animal.
     * @param weight       The weight of the animal in kilograms.
     * @param dietType     The type of diet the animal follows (e.g., herbivore,
     *                     carnivore, omnivore).
     * @param lifeStage    The life stage of the animal (e.g., juvenile, adult,
     *                     senior).
     * @param healthStatus The health status of the animal (e.g., healthy, sick,
     *                     injured).
     */
    public Animal(String name, double weight, String dietType, String lifeStage, String healthStatus) {
        this.name = name;
        this.weight = weight;
        this.dietType = dietType;
        this.lifeStage = lifeStage;
        this.healthStatus = healthStatus;
    }

    /**
     * Calculates the monthly ration cost for an animal based on its diet type,
     * weight, life stage, and health status.
     *
     * The method determines the ration factor and food unit cost based on the diet
     * type.
     * 
     * It also applies an increment percentage based on the life stage or health
     * status of the animal.
     * 
     * The final cost is calculated by multiplying the weight, ration factor,
     * increment percentage, food unit cost, and the number of days in a month (30).
     *
     * @return The calculated monthly ration cost as a double.
     */

    public double calculateMonthlyRationCost() {

        double rationFactor = 0.0;
        double foodUnitCost = 0.0;
        double incrementPercentage = 0.0;

        switch (dietType) {
            case "carnivora":
                rationFactor = 0.03;
                foodUnitCost = 25500;
                break;
            case "herbivora":
                rationFactor = 0.04;
                foodUnitCost = 8800;
                break;

            case "omnivora":
                rationFactor = 0.035;
                foodUnitCost = 15200;
                break;

            case "insectivora":
                rationFactor = 0.025;
                foodUnitCost = 18300;
                break;

        }

        if (lifeStage.equals("juvenil")) {
            incrementPercentage = 0.2;
        } else if (healthStatus.equals("cuarentena") || healthStatus.equals("recuperacion")) {
            incrementPercentage = 0.15;
        } else if (healthStatus.equals("en observacion")) {
            incrementPercentage = 0.1;
        }

        return (weight * rationFactor) * (1 + incrementPercentage) * foodUnitCost * 30;
    }

    /**
     * Retrieves the name of the animal.
     *
     * @return The name of the animal as a String.
     */
    public String getName() {

        return name;

    }
}
