import dominio.Producer;
import jdbc.ConnectionFactory;
import repository.ProducerRepository;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactoryTest01 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder().name("NHK").build();
        ProducerRepository.save(producer);
    }
}
