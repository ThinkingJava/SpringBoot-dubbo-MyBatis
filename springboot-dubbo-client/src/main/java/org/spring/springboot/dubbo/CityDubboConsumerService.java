package org.spring.springboot.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.spring.springboot.domain.City;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 城市 Dubbo 服务消费者
 *
 * Created by bysocket on 28/02/2017.
 */
@Service
public class CityDubboConsumerService implements CityDubboService {

    @Reference(version = "1.0.0")
    CityDubboService cityDubboService;

    public City findCityByName(String cityName){
        return cityDubboService.findCityByName(cityName);
    }
}
