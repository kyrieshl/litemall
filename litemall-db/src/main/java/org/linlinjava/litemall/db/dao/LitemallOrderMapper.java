package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.LitemallOrder;
import org.linlinjava.litemall.db.domain.LitemallOrderExample;

public interface LitemallOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    long countByExample(LitemallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByExample(LitemallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insert(LitemallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int insertSelective(LitemallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    List<LitemallOrder> selectByExample(LitemallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<LitemallOrder> selectByExampleSelective(@Param("example") LitemallOrderExample example, @Param("selective") LitemallOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    LitemallOrder selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallOrder selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") LitemallOrder.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExampleSelective(@Param("record") LitemallOrder record, @Param("example") LitemallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByExample(@Param("record") LitemallOrder record, @Param("example") LitemallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKeySelective(LitemallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated Sat Apr 07 10:22:31 CST 2018
     */
    int updateByPrimaryKey(LitemallOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallOrder selectOneByExample(LitemallOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table litemall_order
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    LitemallOrder selectOneByExampleSelective(@Param("example") LitemallOrderExample example, @Param("selective") LitemallOrder.Column ... selective);
}