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
		
		dataset.addValue(130, "����", "��֦");
		dataset.addValue(10, "����", "ƻ��");
		dataset.addValue(550, "����", "�㽶");
		dataset.addValue(220, "����", "����");
		
		dataset.addValue(120, "���", "��֦");
		dataset.addValue(40, "���", "ƻ��");
		dataset.addValue(600, "���", "�㽶");
		dataset.addValue(50, "���", "����");
		
		dataset.addValue(40, "����", "��֦");
		dataset.addValue(40, "����", "ƻ��");
		dataset.addValue(40, "����", "�㽶");
		dataset.addValue(40, "����", "����");
		
		dataset.addValue(60, "֣��", "��֦");
		dataset.addValue(70, "֣��", "ƻ��");
		dataset.addValue(90, "֣��", "�㽶");
		dataset.addValue(20, "֣��", "����");
		
		JFreeChart chart = ChartFactory.createBarChart3D("ˮ������ͼ", "ˮ��", "����", dataset, PlotOrientation.VERTICAL, true, true, false);
		FileOutputStream out = new FileOutputStream("d:\\chart\\bar1.jpg");
		
		ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
		System.out.println("ok");
	}
}
