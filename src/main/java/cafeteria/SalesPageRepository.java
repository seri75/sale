package cafeteria;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalesPageRepository extends CrudRepository<SalesPage, Long> {

    List<> findByPhoneNumber(String phoneNumber);
    List<> findByPhoneNumber(String phoneNumber);

}