package com.theembers.iot.router;

/**
 * @author TheEmbers Guo
 * createTime 2019-11-13 14:45
 */
public interface LinkedRule extends Rule<String[]> {
    String[] getKey();
}
