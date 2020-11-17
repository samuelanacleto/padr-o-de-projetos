# **Markdown**
## 1. **Pattern Name and Classification:**
* Padrão Abstract Factory
* Padrão Criacional
## 2. **Intent:**
* Fornece uma interface para criar famílias de objetos dependentes ou relacionados sem especificar as classes concretas e utilizando uma única interface
## 3. **Motivation:**
* Prover uma interface para criar uma família de objetos relacionados ou dependentes sem especificar suas classes concretas
* Reduzir acoplamento entre objetos mesmo quando estes tem dependência entre eles
## 4. **Applicability:**
* Quando um sistema deve ser independente de como seus produtos são criados, compostos e representados
* Quando uma família de produtos relacionados foi projetada para uso conjunto e você deve implementar essa restrição
## 5. **Structure:**
![Strategy](https://github.com/samuelanacleto/assets/blob/master/Abstract%20factory.png)
## 6. **Participants:**
######    **Client:**
* É quem tem dependência com IProduct.
######    **Creator:**
* Define o Factory Method para retornar instância do ConcreteProduct.
######    **IProduct:**
* Define a interface de objetos que o Factory cria.
######    **ProductA, ProductB:**
* implementa a interface do Product.

## 7. **Sample Code:**
1. [github.com/samuelanacleto/programacaoavancada/Padrao de projeto/Abstract Factory/AbstractFactoryPattern](https://github.com/samuelanacleto/programacaoavancada/tree/master/Padrao%20de%20projeto/Abstract%20Factory/AbstractFactoryPattern)
* neste exemplo usamos um codigo aonde é solicitado qual familia você quer usar e então implementa segunda sua escolha.
