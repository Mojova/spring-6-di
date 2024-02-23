package fi.hovukas.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service
public class UATDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "UAT";
    }
}
