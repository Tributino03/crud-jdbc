import dominio.Producer;
import jdbc.ConnectionFactory;
import lombok.extern.log4j.Log4j2;
import repository.ProducerRepository;
import service.ProducerService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(10).name("MADHOUSE").build();
//        ProducerService.save(producer);
//        ProducerService.delete(5);
//        ProducerService.update(producerToUpdate);
//        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers = ProducerService.findByName("Mad");
//        log.info("Producers found '{}'", producers);
        ProducerService.showProducerMetadata();
    }
}