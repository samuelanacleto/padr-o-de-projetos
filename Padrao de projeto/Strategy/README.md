# **Markdown**
## 1. **Pattern Name and Classification:**
* Padrão strategy
* Padrão Comportamental
## 2. **Intent:**
*  Delega responsabilidades, aumentando coesão e aprimorando a comunicação entre objetos.
* Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam.
## 3. **Motivation:**
* Permite definir novos algoritmos sem alterar as classes dos elementos sobre os quais opera. Facilitar a escolha dos algoritmos criados para uma determinada função.
## 4. **Applicability:**
* Quando se tem muitas classes que se relacionam e que diferem no modo de atuação.
* Quando há a necessidade de variar (intercambiar) o algoritmo de acordo com as condições da chamada.
## 5. **Structure:**
![Strategy](https://github.com/samuelanacleto/assets/blob/master/Strategypattern.png)
## 6. **Participants:**
######    **Context:**
* Define e mantém a referência para um classe Strategy específica
######    **Strategy:**
* Interface (ou classe abstrata) comum a todos os algoritmos suportados.
######    **ConcreteStrategy:**
* Um ou mais algoritmos fornecidos para a aplicação.

## 7. **Sample Code:**
1. [github.com/samuelanacleto/programacaoavancada/Padrao de projeto/Strategy/Strategy Pattern](https://github.com/samuelanacleto/programacaoavancada/tree/master/Padrao%20de%20projeto/Strategy/Strategy%20Pattern)
* Neste exemplo o padrão strategy ficou responsavel por aplicar um desconto segundo a data comemorativa que fosse efetuado a compra.
