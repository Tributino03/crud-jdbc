import dominio.Producer;
import jdbc.ConnectionFactory;
import lombok.extern.log4j.Log4j2;
import repository.ProducerRepository;
import service.ProducerService;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        //ProducerService.save(producer);
        ProducerService.delete(4);
        ProducerService.delete(5);
        ProducerService.delete(6);
        ProducerService.delete(7);
        ProducerService.delete(8);
        ProducerService.delete(9);

    }
}