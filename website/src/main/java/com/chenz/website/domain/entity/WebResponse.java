package com.chenz.website.domain.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author czy
 * @version 1.0
 * {@code @description} web接口响应实体
 * {@code @date} 2024/11/21
 */
@Schema(description = "web接口响应实体")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WebResponse<T> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Schema(description = "响应码, 200表示成功，其他表示失败")
    private int code = HttpStatus.OK.value();

    @Schema(description = "响应消息")
    private String msg = "响应成功";

    @Schema(description = "请求id，一般在出错的时候返回，可以提供该id方便排查问题")
    private String requestId;

    @Schema(description = "响应参数")
    private T data;

    public WebResponse(T data) {
        this.data = data;
    }

}
