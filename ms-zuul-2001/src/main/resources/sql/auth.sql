# 创建数据库
create database db_cloud2021_user;

# 使用db_cloud2021_user数据库实例
use db_cloud2021_user;

# 建立角色表
create table t_role
(
    id        int(12)     not null auto_increment,
    role_name varchar(60) not null,
    note      varchar(256),
    primary key (id),
    unique (role_name)
);

/*用户表*/
create table t_user
(
    id        int(12)      not null auto_increment,
    user_name varchar(60)  not null,
    pwd       varchar(100) not null,
    /*1表示可用，0表示不可用*/
    available INT(1) default 1 check ( available in (0, 1)),
    note      varchar(256),
    primary key (id),
    unique (user_name)
);

/*用户角色表*/
create table t_user_role
(
    id      int(12) not null auto_increment,
    role_id int(12) not null,
    user_id int(12) not null,
    primary key (id),
    unique (user_id, role_id)
);

# 插入用户数据
insert into t_role(role_name, note) values('ROLE_ADMIN','管理员');
insert into t_role(role_name, note) values('ROLE_USER','普通用户');

# 用户user，密码明文 user123
insert into t_user(user_name, pwd, available, note) values('user','$2a$10$0piudWCJh40YPf/Mr5phleO6GMFTd70se7oAXnT38qIN0WivKYsfq','1','普通用户');

# 用户admin，密码明文 admin123
insert into t_user(user_name, pwd, available, note) values('admin','$2a$10$4TEP0tnwqiDMVfkuRydGSOA94xGmJtTpAFZ1di/9XWhrp3GturQ6i','1','系统管理员');

# 用户角色数据
insert into t_user_role(role_id, user_id) values (1,1);
insert into t_user_role(role_id, user_id) values (2,1);
insert into t_user_role(role_id, user_id) values (2,2);