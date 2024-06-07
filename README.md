## Conversor de Moedas - Alura Challenge

Este é um projeto de conversão de moedas desenvolvido durante o curso de Java da Alura. O programa utiliza a API ExchangeRate-API ([https://www.exchangerate-api.com/](https://www.exchangerate-api.com/)) para obter taxas de câmbio em tempo real e realizar conversões entre diferentes moedas.

### Funcionalidades

- **Conversão de moedas:**
  - USD para BRL
  - BRL para USD
  - EUR para BRL
  - BRL para EUR
  - GBP para BRL
  - BRL para GBP

- **Menu interativo:** Permite ao usuário selecionar a conversão desejada.
- **Busca de taxas de câmbio:** Utiliza a API ExchangeRate-API para obter as taxas atualizadas.
- **Tratamento de erros:** Lida com erros de entrada do usuário e problemas de conexão com a API.

### Pré-requisitos

- **Java Development Kit (JDK):** Certifique-se de ter o JDK instalado em sua máquina.
- **API Key:** Obtenha uma chave de API gratuita no site da ExchangeRate-API.
- **Gson:** A biblioteca Gson é utilizada para lidar com o formato JSON retornado pela API. Você pode adicioná-la ao seu projeto como uma dependência.

### Como usar

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/victorferreiradev/ConversorDeMoedas.git
   ```

2. **Substitua a chave da API:**
   - Abra o arquivo `ConversorAPI.java`.
   - Substitua `"sua key"` pela sua chave de API obtida no site da ExchangeRate-API.

3. **Compile e execute:**
   ```bash
   javac -cp ".;gson-2.10.1.jar" challenge/java/alura/*.java challenge/java/alura/menu/*.java
   java -cp ".;gson-2.10.1.jar" App
   ```

4. **Utilize o menu interativo:**
   - Escolha a opção de conversão desejada.
   - Digite o valor a ser convertido.
   - O resultado da conversão será exibido.

### Estrutura do projeto

- `App.java`: Classe principal que inicia o programa.
- `ConversorAPI.java`: Responsável por buscar as taxas de câmbio na API.
- `Moedas.java`: Representa os dados de uma moeda (código, taxa de câmbio, valor convertido).
- `Menu.java`: Contém o menu interativo e a lógica para processar as opções do usuário.
- `challenge.java.alura`: Pacote que contém as classes do projeto.
- `challenge.java.alura.menu`: Pacote que contém a classe Menu.

### Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

---
**Observação:** Este projeto foi criado para fins de aprendizado. Para uso em produção, considere utilizar bibliotecas mais robustas para lidar com conversões de moeda e APIs financeiras.
