package fi.hovukas.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev"})
@Service
public class DevDataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "dev";
    }
}
