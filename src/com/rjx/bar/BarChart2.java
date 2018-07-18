package com.rjx.bar;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer3D;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.ui.TextAnchor;

public class BarChart2 {
	
	public static void main(String[] args) throws IOException {
		
		double[][] data = {{100,120,140,110},{150,130,190,200},{180,300,200,400},{500,300,200,400}};
		
		String[] rowKeys = {"苹果","香蕉","荔枝","西瓜"};
		
		String[] columsKeys = {"北京","天津","郑州","杭州"};
		
		CategoryDataset dataset = DatasetUtilities.createCategoryDataset(rowKeys, columsKeys, data);
		
		JFreeChart chart = ChartFactory.createBarChart3D("水果销量图", "水果", "销量", dataset, PlotOrientation.VERTICAL, true, true, false);
		
		CategoryPlot plot = chart.getCategoryPlot();
		
		plot.setBackgroundPaint(Color.white);
		
		BarRenderer3D renderer3d = new BarRenderer3D();
		renderer3d.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}",NumberFormat.getNumberInstance()));
		renderer3d.setBaseItemLabelsVisible(true);
		renderer3d.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12,TextAnchor.BASELINE_LEFT));
		renderer3d.setItemLabelAnchorOffset(10D);
		
		plot.setRenderer(renderer3d);
		
		FileOutputStream out = new FileOutputStream("d:/chart/bar2.jpg");
		ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
		
		System.out.println("ok");
		
	}
}
