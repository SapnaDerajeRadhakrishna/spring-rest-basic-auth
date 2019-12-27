package org.maxwell;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@EnableMongoRepositories("org.maxwell.repository")
public class SpringBootRestAuth {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringBootRestAuth.class);
        app.setBannerMode(Mode.OFF);
        app.run(args);
    }

}
