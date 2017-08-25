SELECT * FROM immobilier.maire;
update maire set nom="aaaa" where id=46;
begin;
commit;
rollback;