package guru.springframework.sfgpetclinic.model;

/**
 * @author Jack Tran
 */
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
