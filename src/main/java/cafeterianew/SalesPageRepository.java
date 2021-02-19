package cafeterianew;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SalesPageRepository extends CrudRepository<SalesPage, Long> {

    List<> findByProductName(String productName);
    List<> findByAmt(Integer amt);

}