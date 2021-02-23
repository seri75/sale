package cafeteria;

import cafeteria.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class SalePageViewHandler {


    @Autowired
    private SalePageRepository salePageRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenPaymentApproved_then_CREATE_1 (@Payload PaymentApproved paymentApproved) {
        try {
            if (paymentApproved.isMe()) {
                // view 객체 생성
                  = new ();
                // view 객체에 이벤트의 Value 를 set 함
                .setOrderId(.getOrderId());
                .setPhoneNumber(.getPhoneNumber());
                .setAmt(.getAmt());
                // view 레파지 토리에 save
                Repository.save();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenSaleAdded_then_UPDATE_1(@Payload SaleAdded saleAdded) {
        try {
            if (saleAdded.isMe()) {
                // view 객체 조회
                List<> List = Repository.findByPhoneNumber(.getPhoneNumber());
                for(  : List){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    // view 레파지 토리에 save
                    Repository.save();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenSaleSubtracted_then_UPDATE_2(@Payload SaleSubtracted saleSubtracted) {
        try {
            if (saleSubtracted.isMe()) {
                // view 객체 조회
                List<> List = Repository.findByPhoneNumber(.getPhoneNumber());
                for(  : List){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    // view 레파지 토리에 save
                    Repository.save();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}