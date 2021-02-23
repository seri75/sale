package cafeteria;

public class SalesSubtracted extends AbstractEvent {

    private Long id;
    private String phoneNumber;
    private String yyyymm;
    private Integer sumAmt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getYyyymm() {
        return yyyymm;
    }

    public void setYyyymm(String yyyymm) {
        this.yyyymm = yyyymm;
    }
    public Integer getSumAmt() {
        return sumAmt;
    }

    public void setSumAmt(Integer sumAmt) {
        this.sumAmt = sumAmt;
    }
}