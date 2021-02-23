package cafeteria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalePageRepository extends CrudRepository<SalePage, Long> {

    List<> findByPhoneNumber(String phoneNumber);


}
