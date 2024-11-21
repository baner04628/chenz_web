package com.chenz.website.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

/**
 * @author czy
 * @version 1.0
 * {@code @description} 基础实体类
 * {@code @date} 2024/11/21
 */
@Schema(description = "基础实体类")
@Data
public class BaseEntity {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    private Date createTime;

    @TableField(fill = FieldFill.INSERT)
    private Long creator;

    private Date modifyTime;

    @TableField(fill = FieldFill.UPDATE)
    private Long modifier;

    @TableField("is_del")
    @TableLogic
    private Integer del;

    @Version
    private Integer version;
}
