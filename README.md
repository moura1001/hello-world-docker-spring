Dockerized: Maven + Spring MVC
============================

Neste exemplo é utilizado o conceito de *"multi-stage"* para construir, em apenas um único Dockerfile, uma imagem que empacota e executa o código fonte de um projeto Spring num arquivo jar.

Como executar?
-------------------
Para construir e iniciar o container:

   ``docker build -t dockerHubID/containerName:tagVersion . && docker run -p 8484:8080 --rm -it dockerHubID/containerName:tagVersion``

   ou

   ``docker-compose up``

Acesse através do browser http://localhost:8484/

Obs: No caso de utilização do Docker Toolbox, deve-se utilizar o endereço IP da máquina virtual Dokcer Toolbox e não o endereço localhost.

Para descobrir o endereço IP da máquina virtual Dokcer Toolbox:

``docker-machine ip default``