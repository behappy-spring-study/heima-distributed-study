package cn.itcast.hotel.service;

import cn.itcast.hotel.dto.RequestParams;
import cn.itcast.hotel.pojo.Hotel;
import cn.itcast.hotel.vo.PageResult;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;

public interface IHotelService extends IService<Hotel> {
    PageResult search(RequestParams requestParams);

    Map<String, List<String>> filters(RequestParams requestParams);

    List<String> suggestion(String key);
}
