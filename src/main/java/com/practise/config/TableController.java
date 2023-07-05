package com.practise.config;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.service.RedisLogService;
import com.practise.service.TableService;

@RestController
public class TableController {
    private TableService tableService;
    private RedisLogService redisLogService;

    public TableController(TableService tableService, RedisLogService redisLogService) {
        this.tableService = tableService;
        this.redisLogService = redisLogService;
    }

    @PostMapping("/tables/{tableName}")
    public void createTable(@PathVariable String tableName, @RequestBody List<String> columns) {
        tableService.createTable(tableName, columns);
    }

    @PostMapping("/tables/{tableName}/data")
    public void insertData(@PathVariable String tableName, @RequestBody List<String> rowData) {
        tableService.insertData(tableName, rowData);
    }

    @GetMapping("/tables/{tableName}/data")
    public List<List<String>> getTableData(@PathVariable String tableName) {
        return tableService.getTableData(tableName);
    }

    @PostMapping("/logs")
    public void logSqlStatement(@RequestParam String sql, @RequestParam boolean success) {
        redisLogService.logSqlStatement(sql, success);
    }
}