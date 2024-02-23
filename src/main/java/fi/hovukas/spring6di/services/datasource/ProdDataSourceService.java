package fi.hovukas.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class ProdDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "prod";
    }
}
