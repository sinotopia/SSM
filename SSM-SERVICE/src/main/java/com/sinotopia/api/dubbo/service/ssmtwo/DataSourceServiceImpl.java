package com.sinotopia.api.dubbo.service.ssmtwo;

import com.sinotopia.api.dubbo.dao.DatasourceMapper;
import com.sinotopia.api.dubbo.pojo.Datasource;
import com.sinotopia.api.dubbo.pojo.DatasourceExample;
import com.sinotopia.api.dubbo.service.DataSourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Function:
 *
 * @author chenjiec
 *         Date: 2017/1/2 下午8:00
 * @since JDK 1.7
 */
@Service
public class DataSourceServiceImpl implements DataSourceService {

    @Autowired
    private DatasourceMapper datasourceMapper;

    @Override
    public List<Datasource> selectByExample(DatasourceExample example) {
        return datasourceMapper.selectByExample(example);
    }

    @Override
    public Datasource selectByPrimaryKey(Integer id) {
        return datasourceMapper.selectByPrimaryKey(id);
    }
}
