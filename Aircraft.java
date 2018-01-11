import java.lang.Comparable;

public class Aircraft {
    private String type;
    private double maxSpd;
    public int totalProduction;

    /**
     * Build a cool airplane
     */

    public Aircraft(String actype, double acmaxSpd)
    {
        this.type = actype;
        this.maxSpd = acmaxSpd;
    }

    /**
     * Set instance vars
     */

    public void setType(String actype)
    {
       this.type = actype;
    }

    public void setMaxSpd(Double acmaxSpd)
    {
        this.maxSpd = acmaxSpd;
    }

    /**
     * Just some getters because why not
     */

    public String getType()
    {
        return this.type;
    }

    public double getMaxSpd()
    {
        return this.maxSpd;
    }

    /**
     * Calculate the rotation speed assuming a full tank of fuel
     */

    public double calcVx()
    {
        double vx;
        vx = 0.3 * this.maxSpd;
        return vx;
    }

    public String toString()
    {
        return "This is a " + this.type + " aircraft with a rotation speed of " + this.calcVx() + " knots";
    }

    public String compareTo(Aircraft otherAircraft)
    {
        String otherAircraftType = ((Aircraft) otherAircraft).getType();
        return otherAircraftType;
    }
}
