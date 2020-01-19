package ps.learn.tcpdemo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class TcpConfig {

    @Bean
    @ConditionalOnProperty(
            value = "application.type",
            havingValue = "server",
            matchIfMissing = true
    )
    TcpServer server() {
        return new TcpServer();
    }

    @Bean
    TcpClient client() {
        return new TcpClient();
    }
}
