package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    String name;
    LabStatus status;

    public Lab() {
        this(null);
    }

    public Lab(String labName) {
        this.name = labName;
        this.status = LabStatus.PENDING;
    }

    public String getName() {
        return this.name;
    }

    public void setStatus(LabStatus labStatus) {
        this.status = labStatus;
    }

    public LabStatus getStatus() {
        return this.status;
    }


}
