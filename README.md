# swms

# 模块介绍

| 模块名           | 模块中文名     | 描述                                                   |
| ---------------- | -------------- | ------------------------------------------------------ |
| swms-auth-server | 认证服务       | 社交登录、Oauth2.0、单点登录                           |
| swms-common      | 公共模块       | 保存常量、异常码、工具类、通用实体等                    |
| swms-gateway     | 网关模块       | 网关接收前端请求做统一转发                              |
| swms-search      | 搜索服务       | Elasticsearch 操作服务                                 |
| swms-third-party | 第三方整合服务 | 第三方服务、阿里云OSS等                                |
| renren-fast      | 人人后台生成   | [人人开源](https://gitee.com/renrenio) 后端快速开发平台 |
| renren-fast-vue  | 后台管理前端   | [人人开源](https://gitee.com/renrenio) 前端快速开发平台 |

# 端口规划

| 服务类型   | 服务描述   | 端口端         |
|--------|--------|-------------|
| 三方服务   | 三方服务组件 | 20000-21000 |
| swms服务 | 公共模块   | 21000-22000 |
| 二次开发服务 | 二次开发服务 | 22000-23000 |

# 端口描述

| 服务               | 服务描述    | 端口                                          |
|------------------|---------|---------------------------------------------|
| swms-auth-server | 认证服务    | 社交登录、Oauth2.0、单点登录                          |
| swms-common      | 公共模块    | 保存常量、异常码、工具类、通用实体等                          |
| swms-gateway     | 网关模块    | 网关接收前端请求做统一转发                               |
| swms-search      | 搜索服务    | Elasticsearch 操作服务                          |
| swms-third-party | 第三方整合服务 | 第三方服务、阿里云OSS等                               |
| renren-fast      | 人人后台生成  | [人人开源](https://gitee.com/renrenio) 后端快速开发平台 |
| renren-fast-vue  | 后台管理前端  | [人人开源](https://gitee.com/renrenio) 前端快速开发平台 |