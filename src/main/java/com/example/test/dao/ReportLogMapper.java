package com.example.test.dao;

import com.example.test.dao.ReportLog;
import com.example.test.dao.ReportLogExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface ReportLogMapper {
    @SelectProvider(type=ReportLogSqlProvider.class, method="countByExample")
    int countByExample(ReportLogExample example);

    @DeleteProvider(type=ReportLogSqlProvider.class, method="deleteByExample")
    int deleteByExample(ReportLogExample example);

    @Delete({
        "delete from SMARTCITY.T_REPORT_LOG",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into SMARTCITY.T_REPORT_LOG (ID, ORG_ID, ",
        "TYPE, PLATFORM_COUNT, ",
        "UDP_COUNT, TOTAL_COUNT, ",
        "ONLINE_COUNT, OFFLINE_COUNT, ",
        "ALARM_COUNT, DATE_TIME, ",
        "LIGHT_ON_COUNT, LIGHT_OFF_COUNT)",
        "values (#{id,jdbcType=VARCHAR}, #{orgId,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=DECIMAL}, #{platformCount,jdbcType=DECIMAL}, ",
        "#{udpCount,jdbcType=DECIMAL}, #{totalCount,jdbcType=DECIMAL}, ",
        "#{onlineCount,jdbcType=DECIMAL}, #{offlineCount,jdbcType=DECIMAL}, ",
        "#{alarmCount,jdbcType=DECIMAL}, #{dateTime,jdbcType=TIMESTAMP}, ",
        "#{lightOnCount,jdbcType=DECIMAL}, #{lightOffCount,jdbcType=DECIMAL})"
    })
    int insert(ReportLog record);

    @InsertProvider(type=ReportLogSqlProvider.class, method="insertSelective")
    int insertSelective(ReportLog record);

    @SelectProvider(type=ReportLogSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="ID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="ORG_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TYPE", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="PLATFORM_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="UDP_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TOTAL_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ONLINE_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="OFFLINE_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ALARM_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="DATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="LIGHT_ON_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="LIGHT_OFF_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL)
    })
    List<ReportLog> selectByExample(ReportLogExample example);

    @Select({
        "select",
        "ID, ORG_ID, TYPE, PLATFORM_COUNT, UDP_COUNT, TOTAL_COUNT, ONLINE_COUNT, OFFLINE_COUNT, ",
        "ALARM_COUNT, DATE_TIME, LIGHT_ON_COUNT, LIGHT_OFF_COUNT",
        "from SMARTCITY.T_REPORT_LOG",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="ORG_ID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TYPE", javaType=Short.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="PLATFORM_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="UDP_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TOTAL_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ONLINE_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="OFFLINE_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ALARM_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="DATE_TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="LIGHT_ON_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="LIGHT_OFF_COUNT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL)
    })
    ReportLog selectByPrimaryKey(String id);

    @UpdateProvider(type=ReportLogSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") ReportLog record, @Param("example") ReportLogExample example);

    @UpdateProvider(type=ReportLogSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") ReportLog record, @Param("example") ReportLogExample example);

    @UpdateProvider(type=ReportLogSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(ReportLog record);

    @Update({
        "update SMARTCITY.T_REPORT_LOG",
        "set ORG_ID = #{orgId,jdbcType=VARCHAR},",
          "TYPE = #{type,jdbcType=DECIMAL},",
          "PLATFORM_COUNT = #{platformCount,jdbcType=DECIMAL},",
          "UDP_COUNT = #{udpCount,jdbcType=DECIMAL},",
          "TOTAL_COUNT = #{totalCount,jdbcType=DECIMAL},",
          "ONLINE_COUNT = #{onlineCount,jdbcType=DECIMAL},",
          "OFFLINE_COUNT = #{offlineCount,jdbcType=DECIMAL},",
          "ALARM_COUNT = #{alarmCount,jdbcType=DECIMAL},",
          "DATE_TIME = #{dateTime,jdbcType=TIMESTAMP},",
          "LIGHT_ON_COUNT = #{lightOnCount,jdbcType=DECIMAL},",
          "LIGHT_OFF_COUNT = #{lightOffCount,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ReportLog record);
}