package CAFETERIANEW;

public class FirstSaled extends AbstractEvent {

    private Long id;
    private Integer amt;
    private String yyyymm;

    public FirstSaled(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getAmt() {
        return amt;
    }

    public void setAmt(Integer amt) {
        this.amt = amt;
    }
    public String getYyyymm() {
        return yyyymm;
    }

    public void setYyyymm(String yyyymm) {
        this.yyyymm = yyyymm;
    }
}