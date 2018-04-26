package org.linlinjava.litemall.db.domain;

public class LitemallRegionProvince {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region_province.code
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    private Integer code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column litemall_region_province.name
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region_province.code
     *
     * @return the value of litemall_region_province.code
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    public Integer getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region_province.code
     *
     * @param code the value for litemall_region_province.code
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column litemall_region_province.name
     *
     * @return the value of litemall_region_province.name
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column litemall_region_province.name
     *
     * @param name the value for litemall_region_province.name
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LitemallRegionProvince other = (LitemallRegionProvince) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_region_province
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table litemall_region_province
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        code("code"),
        name("name");

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table litemall_region_province
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_province
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_province
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_province
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column) {
            this.column = column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_province
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.column + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table litemall_region_province
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.column + " ASC";
        }
    }
}