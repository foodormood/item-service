CREATE TABLE item (
    id uuid primary key not null default gen_random_uuid(),
    category_id uuid,
    name varchar(255),
    name_en varchar(255),
    img_url varchar (255)
)
