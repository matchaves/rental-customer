# Rental-rental

branch com initial conf application.yaml

```
base-path /customer
```

```
GET /customer/catalog
busca a lista de customers
```


###CMD PARA PEGAR AS INFOS DO CLIENTE PELO ID
```
GET /customer?customer_id=X
esse endpoint faz uma pré-alocação do registrando na tabela rental um registro com
status "processando"
```

branch com initial conf application.yaml com jib configurado

###CMD BUILD USANDO JIB PARA BUILD DOCKER IMAGE COM A TAG PASSADA VIA ARGUMENTO
gradle jibDockerBuild -Ptag=100 # tag do build da imagem docker

###CMD RODA CONTAINER SETANDO O IP DO PG E A PORTA PARA A API CONECTAR NO BANCO
###VARIAVEIS IP_PG e PORT ESTÃO REFERENCIADAS NO application.yaml
docker run -d --name customer --env ip_pg=192.160.XX.XX colabdevops/rental:1
-env PORT=5436