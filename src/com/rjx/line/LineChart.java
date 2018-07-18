package com.rjx.line;

import java.io.FileOutputStream;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart {

	public static void main(String[] args) throws IOException {
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		dataset.addValue(100, "北京", "荔枝");
		dataset.addValue(30, "上海", "荔枝");
		dataset.addValue(50, "天津", "荔枝");
		dataset.addValue(20, "广州", "荔枝");
		dataset.addValue(210, "北京", "香蕉");
		dataset.addValue(160, "上海", "香蕉");
		dataset.addValue(120, "天津", "香蕉");
		dataset.addValue(150, "广州", "香蕉");
		dataset.addValue(30, "北京", "苹果");
		dataset.addValue(90, "上海", "苹果");
		dataset.addValue(20, "天津", "苹果");
		dataset.addValue(60, "广州", "苹果");
		
		JFreeChart chart = ChartFactory.createLineChart3D("水果销售表", "水果", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);
		CategoryPlot plot = chart.getCategoryPlot();
		
		LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
		
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		
		renderer.setItemLabelsVisible(true);
		
		FileOutputStream out = new FileOutputStream("d:/chart/line1.jpg");
		ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
		
		System.out.println("ok");
	}
}
