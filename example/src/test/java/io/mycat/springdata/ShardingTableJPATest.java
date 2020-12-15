package io.mycat.springdata;

import org.junit.Before;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
@net.jcip.annotations.NotThreadSafe
@SpringBootApplication
public class ShardingTableJPATest extends TableJPATemplateTest {
    @Before
    public void before() throws Exception {
        SpringApplication springApplication = new SpringApplication(ShardingTableJPATest.class);
        this.applicationContext = springApplication.run();
        runInitSQL(ShardingTableJPATest.class,CreateTableSQLType.SHARDING);
        this.repository = applicationContext.getBean(CustomerRepository.class);
    }
}