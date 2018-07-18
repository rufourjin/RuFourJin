package com.rjx.pie;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.NumberFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

public class PieChart {
	
	public static void main(String[] args) throws IOException {
		DefaultPieDataset dataset = new DefaultPieDataset();
		
		dataset.setValue("JAVA", 20);
		dataset.setValue("PHP", 19);
		dataset.setValue("WEB", 30);
		dataset.setValue("UI", 22);
		
		JFreeChart chart = ChartFactory.createPieChart3D("�й�U��ҵѧԱ����", dataset, true, true, false);
		
		chart.addSubtitle(new TextTitle("2013���"));
		PiePlot pieplot = (PiePlot)chart.getPlot();
		pieplot.setLabelFont(new Font("����",0,11));
		
		pieplot.setCircular(true);
		
		pieplot.setNoDataMessage("��������ʾ");
		
		pieplot.setLabelGenerator(new StandardPieSectionLabelGenerator("{0}:{1}--{2}",NumberFormat.getNumberInstance(),NumberFormat.getPercentInstance()));
		
		
		pieplot.setStartAngle(120D);
		pieplot.setDirection(Rotation.CLOCKWISE);
		
		pieplot.setForegroundAlpha(0.7F);
		
		
		FileOutputStream out = new FileOutputStream("d:/chart/pie1.jpg");
		ChartUtilities.writeChartAsJPEG(out, chart, 700, 500);
		System.out.println("ok");
		
	}
}
