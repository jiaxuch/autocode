package com.jiaxuch.autocode.model;

import java.util.ArrayList;
import java.util.Arrays;
import lombok.Data;

@Data
public class AutoArea {
    private Integer areaid;

    private String areacode;

    private String areaname;

    private Byte level;

    private String citycode;

    private String center;

    private Integer parentid;

    public static AutoArea.Builder builder() {
        return new AutoArea.Builder();
    }

    public static class Builder {
        private AutoArea obj;

        public Builder() {
            this.obj = new AutoArea();
        }

        public Builder areaid(Integer areaid) {
            obj.setAreaid(areaid);
            return this;
        }

        public Builder areacode(String areacode) {
            obj.setAreacode(areacode);
            return this;
        }

        public Builder areaname(String areaname) {
            obj.setAreaname(areaname);
            return this;
        }

        public Builder level(Byte level) {
            obj.setLevel(level);
            return this;
        }

        public Builder citycode(String citycode) {
            obj.setCitycode(citycode);
            return this;
        }

        public Builder center(String center) {
            obj.setCenter(center);
            return this;
        }

        public Builder parentid(Integer parentid) {
            obj.setParentid(parentid);
            return this;
        }

        public AutoArea build() {
            return this.obj;
        }
    }

    public enum Column {
        areaid("areaId", "areaid", "INTEGER", false),
        areacode("areaCode", "areacode", "VARCHAR", false),
        areaname("areaName", "areaname", "VARCHAR", false),
        level("level", "level", "TINYINT", false),
        citycode("cityCode", "citycode", "VARCHAR", false),
        center("center", "center", "VARCHAR", false),
        parentid("parentId", "parentid", "INTEGER", false);

        private static final String BEGINNING_DELIMITER = "\"";

        private static final String ENDING_DELIMITER = "\"";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public static Column[] all() {
            return Column.values();
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}