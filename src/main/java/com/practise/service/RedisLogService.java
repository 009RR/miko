package com.practise.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class RedisLogService {
    private RedisTemplate<String, String> redisTemplate;

    public RedisLogService(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public void logSqlStatement(String sql, boolean success) {
        String status = success ? "Success" : "Failure";
        redisTemplate.opsForList().leftPush("sql_log", sql + " - " + status);
    }
}
