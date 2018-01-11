import java.lang.Comparable;

public class Route {
    private Aircraft plane = new Aircraft("Airbus", 420.0);
    private String departureField;
    private String arrivalField;

    public Route(String depField, String arrField)
    {
        this.departureField = depField;
        this.arrivalField = arrField;
    }

    public void setDepartureField(String depField)
    {
        this.departureField = depField;
    }

    public void setArrivalFiel(String arrField)
    {
        this.arrivalField = arrField;
    }

    public String getDepartureField()
    {
        return this.departureField;
    }

    public String getArrivalField()
    {
        return this.arrivalField;
    }

    public String toString()
    {
        return "This flight departs from " + this.departureField + " and arrives in " + this.arrivalField + " and is operated by a " + plane.getType();
    }

    public String compareTo(Route otherRoute)
    {
        String otherRouteArr = ((Route) otherRoute).getArrivalField();
        return otherRouteArr;
    }
}
