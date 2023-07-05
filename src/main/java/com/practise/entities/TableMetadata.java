package com.practise.entities;

import java.util.List;

public class TableMetadata {
private List<TableColumn> columns;

public List<TableColumn> getColumns() {
	return columns;
}

public void setColumns(List<TableColumn> columns) {
	this.columns = columns;
}

public TableMetadata(List<TableColumn> columns) {
	super();
	this.columns = columns;
}

public TableMetadata() {
	super();
	// TODO Auto-generated constructor stub
}



}
