package com.practise.entities;

public class TableColumn {
private String name;
private String type;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public TableColumn(String name, String type) {
	super();
	this.name = name;
	this.type = type;
}
public TableColumn() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "TableColumn [name=" + name + ", type=" + type + "]";
}


}
