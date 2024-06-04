create table if not exists gm_derivatives(
gm_derivative_product_code varchar(255) not null,
gm_derivative_product_code_description varchar(255) null,
gm_product_code varchar(255) null,
gm_product_code_description varchar(255) null,
gm_trade_product_code varchar(255) null,
gm_trade_product_code_description varchar(255) null,
gm_underlying_asset_code varchar(255) null,
gm_underlying_asset_code_description Integer null,
balance_type_code varchar(255) null,
balance_type_code_description varchar(255) null,
entity_state varchar(255) null,
constraint gm_derivatives_pk primary key(gm_derivative_product_code));