package cafeteria;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Sale_table")
public class Sale {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String phoneNumber;
    private String yyyymm;
    private Integer sumAmt;

    @PostUpdate
    public void onPostUpdate(){
        SaleAdded saleAdded = new SaleAdded();
        BeanUtils.copyProperties(this, saleAdded);
        saleAdded.publishAfterCommit();


        SaleSubtracted saleSubtracted = new SaleSubtracted();
        BeanUtils.copyProperties(this, saleSubtracted);
        saleSubtracted.publishAfterCommit();


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
