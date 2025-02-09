# chenz-web

#### 介绍
个人网页项目

#### 版本规划
- 2024/11/21
  - 总体规划
    - 使用前端模板搭建前端
    - 规划个人网页功能点：
      - 前台：
          - 趣味功能
          - 博客地址
          - 角色菜单权限管理（RBAC）
          - 各种有用网站的数据收集
          - 连接大语言模型接口
          - 参考：
            - 导航：https://zhuanlan.zhihu.com/p/336410564
            - 推荐：https://github.com/dmego/home.github.io
      - 后台：
        - 角色菜单权限管理（RBAC）游客+超级管理员
        - 访问量监听
        - 参考：
          - 导航：https://zhuanlan.zhihu.com/p/457512240
          - 推荐：个人仓库中
      - 网关：
        - 限流：每个IP/账号访问次数1分钟内只能访问30次接口
        - 降级处理：返回静态页面（5分钟后再试）
      - nginx：
        - 暂时只保留请求转发功能
    - 增加鉴权
    - 增加网关

#### 软件架构
基于JDK21 + Spring Cloud + gateway + nginx


#### 安装教程

1.  xxxx
2.  xxxx
3.  xxxx

#### 使用说明

1.  xxxx
2.  xxxx
3.  xxxx

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
