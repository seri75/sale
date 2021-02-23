package cafeteria;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Sales_table")
public class Sales {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String phoneNumber;
    private String yyyymm;
    private Integer sumAmt;

    @PostUpdate
    public void onPostUpdate(){
        SalesAdded salesAdded = new SalesAdded();
        BeanUtils.copyProperties(this, salesAdded);
        salesAdded.publishAfterCommit();


        SalesSubtracted salesSubtracted = new SalesSubtracted();
        BeanUtils.copyProperties(this, salesSubtracted);
        salesSubtracted.publishAfterCommit();


    }


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
