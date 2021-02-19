package cafeterianew;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="SalesPage_table")
public class SalesPage {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private String productName;
        private Integer amt;
        private String yyyymm;
        private String phoneNumber;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
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
        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

}
