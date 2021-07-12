package com.example.demo.common.vo;

import com.example.demo.common.constant.OrderDirectEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author Ryan Miao 01399596
 * @date 2021/7/7
 */
@Data
public class LastPageReq<T> {

    @ApiModelProperty("上一页的最后id")
    private Long lastId;
    @ApiModelProperty("分页条数")
    private Integer limit;
    /**
     * asc desc
     */
    @ApiModelProperty("ASC:升序， DESC:降序")
    private OrderDirectEnum direct;

    private T condition;
}
