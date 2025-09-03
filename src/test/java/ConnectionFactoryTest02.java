import jdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;
import jdbc.service.ProducerServiceRowSet;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producerToUpdate = Producer.builder().id(1).name("MAD2").build();
        ProducerServiceRowSet.updateCachedRowSet(producerToUpdate);
//        log.info("------------------------");
//        List<Producer> producers = ProducerServiceRowSet.findByNameJdbcRowSet("");
//        log.info(producers);
    }
}