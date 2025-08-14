import dominio.Producer;
import jdbc.ConnectionFactory;
import lombok.extern.log4j.Log4j2;
import repository.ProducerRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


@Log4j2
public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        ProducerRepository.save(producer);
    }
}