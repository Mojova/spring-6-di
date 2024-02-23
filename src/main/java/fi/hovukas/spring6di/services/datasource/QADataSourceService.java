package fi.hovukas.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service
public class QADataSourceService implements DataSourceService {
    @Override
    public String getDataSource() {
        return "QA";
    }
}
