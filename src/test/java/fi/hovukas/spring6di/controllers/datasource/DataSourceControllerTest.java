package fi.hovukas.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles({"prod", "default"})
@SpringBootTest
class DataSourceControllerTest {

    @Autowired
    private DataSourceController dataSourceController;
    @Test
    void getDataSource() {
        System.out.println(dataSourceController.getDataSource());
    }
}