# **Markdown**
## 1. **Pattern Name and Classification:**
- Singleton, Padrao de Criacional
## 2. **Intent:**
- O Padrão Singleton define que uma, e somente uma instância concorrente de uma classe existirá no ciclo de vida da aplicação
## 3. **Motivition:**
- Temos diversas implementações de um algoritmo ou classe que seguem um “esqueleto” comum, mas que variam em alguns pequenos aspectos
## 4. **Applicability:**
- Aplicável para casos em que se precisa controlar a forma como a classe é instanciada.
 - O construtor da classe é protegido
 - Todo o programa usa o Singleton para acessar os comportamentos nele definidos.
## 5. **Structure:**
 ![Structure Singleton Basic] (https://github.com/samuelanacleto/assets/blob/master/Singleton.png)
## 6. **Participants:**
1. Singleton:
   - É a única classe deste padrão.
   - O construtor é privado, não sendo acessível externamente.
2. Client:
   - Usuario do Singleton.
   - Está interessado na instância, não importa se é uma só no programa todo.

###### 7. **Sample Code:**
[Singleton 1](https://github.com/samuelanacleto/programacaoavancada/tree/master/Padrao%20de%20projeto/Singleton/Singleton1)
[Singleton 2](https://github.com/samuelanacleto/programacaoavancada/tree/master/Padrao%20de%20projeto/Singleton/Singleton2)
