package no.hib.models;

public class Symptom {
    private String uuid;
    private String name;
    private String description;
    private String severity;
    private String change;
    private boolean important;

    public Symptom(String name, String description, String severity, String change, boolean important) {
        this.name = name;
        this.description = description;
        this.severity = severity;
        this.change = change;
        this.important = important;
    }

    public Symptom(String uuid, String name, String description, String severity, String change, boolean important) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.severity = severity;
        this.change = change;
        this.important = important;
    }

    public Symptom() {

    }

    public String getId() {
        return uuid;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public boolean isImportant() {
        return important;
    }

    public void setImportant(boolean important) {
        this.important = important;
    }
}
