package com.practise.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TableData {
	    private String filePath;

	    public TableData(String filePath) {
	        this.filePath = filePath;
	    }

	    public void saveData(List<List<String>> data) {
	        try (PrintWriter writer = new PrintWriter(filePath)) {
	            for (List<String> row : data) {
	                String rowData = String.join(",", row);
	                writer.println(rowData);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public List<List<String>> loadData() {
	        List<List<String>> data = new ArrayList<>();
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                List<String> row = Arrays.asList(line.split(","));
	                data.add(row);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return data;
	    }
	}

