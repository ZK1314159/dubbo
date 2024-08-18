package com.example.dubbo.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import com.example.dubbo.service.DubboProvider;

/**
 * Description：<br>
 *
 * @author zeng.kai <br>
 * CreateDate：2020/7/8 21:01 <br>
 */
@DubboService
@Service
public class DubboProviderImpl implements DubboProvider {

    @Override
    public String say(String word) {
        return word;
    }
}
