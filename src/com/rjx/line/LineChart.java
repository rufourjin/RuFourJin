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
		
		dataset.addValue(100, "����", "��֦");
		dataset.addValue(30, "�Ϻ�", "��֦");
		dataset.addValue(50, "���", "��֦");
		dataset.addValue(20, "����", "��֦");
		dataset.addValue(210, "����", "�㽶");
		dataset.addValue(160, "�Ϻ�", "�㽶");
		dataset.addValue(120, "���", "�㽶");
		dataset.addValue(150, "����", "�㽶");
		dataset.addValue(30, "����", "ƻ��");
		dataset.addValue(90, "�Ϻ�", "ƻ��");
		dataset.addValue(20, "���", "ƻ��");
		dataset.addValue(60, "����", "ƻ��");
		
		JFreeChart chart = ChartFactory.createLineChart3D("ˮ�����۱�", "ˮ��", "����", dataset, PlotOrientation.VERTICAL, true, true, false);
		CategoryPlot plot = chart.getCategoryPlot();
		
		LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
		
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		
		renderer.setItemLabelsVisible(true);
		
		FileOutputStream out = new FileOutputStream("d:/chart/line1.jpg");
		ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
		
		System.out.println("ok");
	}
}
