## Spring Boot整合MyBatis实例
1. 设置主键自动生成：那么你可以设置 useGeneratedKeys=”true”，然后再把 keyProperty 设置为目标属性就 OK 了
2. sql：这个元素可以用来定义可重用的 SQL 代码片段 `<sql id="userColumns"> ${alias}.id,${alias}.username,${alias}.password </sql>`
3. 