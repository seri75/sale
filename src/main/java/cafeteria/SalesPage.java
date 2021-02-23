package cafeteria;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="SalesPage_table")
public class SalesPage {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Integer orderId;
        private String productName;
        private String phoneNumber;
        private String yyyymm;
        private Integer sumAmt;
        private Integer amt;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Integer getOrderId() {
            return orderId;
        }

        public void setOrderId(Integer orderId) {
            this.orderId = orderId;
        }
        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
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
        public Integer getAmt() {
            return amt;
        }

        public void setAmt(Integer amt) {
            this.amt = amt;
        }

}
