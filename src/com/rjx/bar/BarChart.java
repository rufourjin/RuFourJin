package com.rjx.bar;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart {
	public static void main(String[] args) throws IOException {
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		dataset.addValue(130, "北京", "荔枝");
		dataset.addValue(10, "北京", "苹果");
		dataset.addValue(550, "北京", "香蕉");
		dataset.addValue(220, "北京", "橙子");
		
		dataset.addValue(120, "天津", "荔枝");
		dataset.addValue(40, "天津", "苹果");
		dataset.addValue(600, "天津", "香蕉");
		dataset.addValue(50, "天津", "橙子");
		
		dataset.addValue(40, "杭州", "荔枝");
		dataset.addValue(40, "杭州", "苹果");
		dataset.addValue(40, "杭州", "香蕉");
		dataset.addValue(40, "杭州", "橙子");
		
		dataset.addValue(60, "郑州", "荔枝");
		dataset.addValue(70, "郑州", "苹果");
		dataset.addValue(90, "郑州", "香蕉");
		dataset.addValue(20, "郑州", "橙子");
		
		JFreeChart chart = ChartFactory.createBarChart3D("水果销售图", "水果", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);
		FileOutputStream out = new FileOutputStream("d:\\chart\\bar1.jpg");
		
		ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
		System.out.println("ok");
	}
}
