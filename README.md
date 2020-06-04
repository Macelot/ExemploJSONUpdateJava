# ExemploJSONUpdateJava
Exemplo de manipulação de JSON em Java
Neste exemplo um objeto JSON é criado a partir de uma string que pode ser recebida via API REST.
{"id":1,"meses":["112","124","136","148"],"valor":["2.802","3.174","3.564","3.971"]}

No JSON é adicionado um novo elemento, chamado mesesAlternativo, com o valor 12 e 24 em String.
Depois o elemento meses recebe um novo valor, que é o 12, ficando assim "112","124","136","148","12".
É feita a ordenação para ficar assim: "12","112","124","136","148".
A ordenção foi feita usando Comparator.

