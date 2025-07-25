1 - Escreva um código que cria uma calculadora para as operações de soma e subtração, o usuário deve informar todos os números que serão usados na conta de uma só vez utilizando virgulas para separa-los.

2 - Escreva um código que receba entradas sem formatação e as retorne formatadas, os tipos de entradas que o código deve retornar são as seguintes:
  * Telefone fixo (8 dígitos sem DDD xxxx-xxxx, 10 Dígitos com DDD (xx)xxxx-xxxx);
  * Celular (9 dígitos sem DDD xxxxx-xxxx, 11 dígitos (xx)xxxxx-xxxx);

O código deve ser capaz de detectar as seguintes situações:

  * Se receber somente números detectar se corresponde com algum dos formatos aceitos e retornar formatado;
  * Se receber uma entrada com quantidade de números diferentes dos padrões descritos acima, informar que não se trata de um número válido;
  * Se receber um número formatado, retorna-lo do mesmo jeito e informar de qual tipo de dispositivo se trata;
  * Se receber com mascara incorreta, corrigir e retornar
  * Se receber qualquer entrada que tenha números e outros caracteres verificar se tem números para compor um dos tipos aceitos e retornar do que se trata ou retornar que foi uma entrada inválida. 

3 - Escreva um código que receba 3 valores separados por um caracter de sua escolha n vezes ( n é o número de vezes que o usuário desejar informar) ex.: nome;Lucas;Texto. Quando o usuário parar de informar valores o código deve retornar todos esses campos compondo um json, um xml e um yaml (Json: https://pt.wikipedia.org/wiki/JSON, XML: https://pt.wikipedia.org/wiki/XML, yaml: https://www.treinaweb.com.br/blog/o-que-e-yaml) as entradas devem seguir o seguinte padrão:
  * NOME_CAMPO;VALOR;TIPO;
  * Os tipos que devem ser aceitos são: texto, datas, data e hora, números inteiros, números com pontos flutuantes, boleanos, array dos tipos anteriores ( opcional, possibilitar definir arrays de objetos e objetos internos).