# swms

# 模块介绍

| 模块名      | 模块中文名   | 描述                 |
|----------|---------|--------------------|
| swms-aus | 认证服务    | 社交登录、Oauth2.0、单点登录 |
| swms-cms | 公共模块    | 统计服务               |
| swms-gws | 网关模块    | 网关接收前端请求做统一转发      |
| swms-ses | 搜索服务    | Elasticsearch 操作服务 |
| swms-tps | 第三方整合服务 | 第三方服务              |
| swms-dms | 设备管理服务  | 设备管理               |
| swms-fms | 文件管理服务  | 文件管理               |

# 端口规划

| 服务类型   | 服务描述   | 端口端         |
|--------|--------|-------------|
| 三方服务   | 三方服务组件 | 20000-21000 |
| swms服务 | 公共模块   | 21000-22000 |
| 二次开发服务 | 二次开发服务 | 22000-23000 |

# 端口描述

| 模块名      | 模块中文名   | 端口    |
|----------|---------|-------|
| swms-aus | 认证服务    | 21001 |
| swms-cms | 公共模块    | 21002 |
| swms-gws | 网关模块    | 21003 |
| swms-ses | 搜索服务    | 21004 |
| swms-tps | 第三方整合服务 | 21005 |
| swms-dms | 设备管理服务  | 21006 |
| swms-fms | 文件管理服务  | 21007 |