# **Markdown**
## 1. **Pattern Name and Classification:**
* Padrão Factory
* Padrão Criacional
## 2. **Intent:**
* Disponibilizar método que permite criar objetos, centralizando as dependências em um único ponto
* Reduzir acoplamento por meio do princípio da responsabilidade única.
## 3. **Motivation:**
* ele permite criar objetos, centralizando as dependências em um único ponto, e é especialmente útil quando a criação envolve uma série de objetos (hierarquia).
## 4. **Applicability:**
* Quando se tem uma estrutura complexa de classes que demanda dependência com vários tipos.
* Quando se deseja reduzir o acoplamento entre as classes, com um único ponto de responsabilidade
## 5. **Structure:**
![Strategy](https://github.com/samuelanacleto/assets/blob/master/factory.jpg)
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
1. [github.com/samuelanacleto/programacaoavancada/Padrao de projeto/Factory Method/FactoryMethodPattern](https://github.com/samuelanacleto/programacaoavancada/tree/master/Padrao%20de%20projeto/Factory%20Method/FactoryMethodPattern)
* Neste exemplo do padrão Factory, criamos uma maquina de bebidas que oferecia dois tipos de bebidas, café ou refrigerante.
