package org.easyframework.report.engine.query;

import java.sql.Connection;
import java.util.List;

import org.easyframework.report.engine.data.ReportMetaDataColumn;
import org.easyframework.report.engine.data.ReportMetaDataRow;
import org.easyframework.report.engine.data.ReportQueryParamItem;

/**
 * 报表查询器接口
 * 
 *
 */
public interface Queryer {

	/**
	 * 获取当前报表查询器的JDBC Connection对象
	 * 
	 * @return Connection
	 */
	Connection getJdbcConnection();

	/**
	 * 从sql语句中解析出报表元数据列集合
	 * 
	 * @param sqlText
	 *            sql语句
	 * @return List<ReportMetaDataColumn>
	 */
	List<ReportMetaDataColumn> parseMetaDataColumns(String sqlText);

	/**
	 * 从sql语句中解析出报表查询参数(如下拉列表参数）的列表项集合
	 * 
	 * @param sqlText
	 *            sql语句
	 * @return List<ReportQueryParamItem>
	 */
	List<ReportQueryParamItem> parseQueryParamItems(String sqlText);

	/**
	 * 获取报表原始数据行集合
	 * 
	 * @return List<ReportMetaDataRow>
	 */
	List<ReportMetaDataRow> getMetaDataRows();

	/**
	 * 获取报表原始数据列集合
	 * 
	 * @return List<ReportMetaDataColumn>
	 */
	List<ReportMetaDataColumn> getMetaDataColumns();
}