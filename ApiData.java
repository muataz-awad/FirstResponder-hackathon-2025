public class ApiData {
    private String incidentId;
    private String location;
    private String description;

    public ApiData(String incidentId, String location, String description) {
        this.incidentId = incidentId;
        this.location = location;
        this.description = description;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ApiData{" +
                "incidentId='" + incidentId + '\'' +
                ", location='" + location + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
