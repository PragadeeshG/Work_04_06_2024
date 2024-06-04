create table if not exists agent_banks(
agent_id Integer not null,
vendor varchar(255) null,
agent_bank_country varchar(255) null,
agent_bank varchar(255) null,
email_address varchar(255) null,
locale Integer null,
country_code varchar(255) null,
target_balance varchar(255) null,
funded_by varchar(255) null,
entity_state varchar(255) null,
constraint agent_banks_pk primary key(agent_id));