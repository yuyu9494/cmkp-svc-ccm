package com.sktelecom.cmkp.ccm.type;

import org.springframework.jdbc.support.JdbcUtils;

import java.util.HashMap;

public class CamelCaseMap extends HashMap {

    @Override
    public Object put(Object key, Object value) {

        return super.put(JdbcUtils.convertUnderscoreNameToPropertyName((String)key), value);
    }

}
