# Explorando a ilha Kotlin

Repositório de estudo focado em ir além da sintaxe básica de Kotlin — controle de fluxo, funções, null safety, coleções, generics, scope functions, exceções e, principalmente, POO aplicada com **DDD** (Entity, Value Object, Repository, Domain Service).

Diferente dos repositórios `Hora-de-codar-*` (que seguem atividades específicas), este é um espaço livre pra treinar cada conceito isoladamente antes de aplicar num exercício real.

## Como está organizado

Cada exercício vive em seu próprio arquivo/pacote Kotlin, agrupado por conceito. A lista abaixo é o roteiro seguido — do controle de fluxo básico até o "ensaio" final de arquitetura DDD.

## Lista de exercícios

### Controle de fluxo
- [X] `classificarNota(nota: Double): String` usando `when` sem argumento
- [X] Tabuada (1 a 10) de um número usando `for` (joinToString usado)
- [ ] Menu numerado a partir de uma `List<String>`, usando `withIndex()`

### Funções
- [ ] Extension function `String.ehPalindromo(): Boolean`
- [ ] Função de alta ordem `repetir(vezes: Int, acao: () -> Unit)`
- [ ] `criarPedido(item, quantidade = 1, urgente = false)` chamada com argumentos nomeados

### Null safety
- [ ] `buscarPorId(lista: List<Produto>, id: Int): Produto?` + tratamento com `?.let` e `?:`
- [ ] Safe call encadeado sobre um input simulado (`String?`)

### Coleções
- [ ] Somar o dobro dos números pares de uma `List<Int>` (`filter` + `map` + `sum`)
- [ ] Agrupar produtos por categoria com `groupBy`
- [ ] Mapa nome→produto com `associateBy` + busca

### Classes e POO
- [ ] `data class Livro(titulo, autor, paginas)` + uso de `.copy()`
- [ ] `sealed class FormaGeometrica` (Circulo, Retangulo) + `area()` com `when` exaustivo
- [ ] `enum class DiaDaSemana` com propriedade `ehFimDeSemana`

### Generics
- [ ] `class Pilha<T>` com `push`, `pop`, `peek`

### Scope functions
- [ ] Configurar um objeto com `apply`
- [ ] Tratar retorno nullable com `let` + `?:`

### Exceções
- [ ] `dividir(a, b)` com tratamento de divisão por zero em loop até funcionar

### Outros pontos
- [ ] Sobrecarregar `*` numa `data class Vetor2D`
- [ ] `by lazy` provando carregamento único

### POO + DDD (ensaio pro exercício com arquitetura real)
- [ ] **Encapsulamento** — `ContaBancaria` com saldo privado (`private set`) e `require()` no saque
- [ ] **Sealed class de resultado** — `ResultadoSaque` (Sucesso / SaldoInsuficiente) tratado com `when` exaustivo
- [ ] **Value Object vs Entity** — modelar `Pedido` (Entity) e `Endereco` (Value Object)
- [ ] **Repository** — `interface ProdutoRepository` + `InMemoryProdutoRepository`
- [ ] **Domain Service** — `CarrinhoService` usando o repository, sem I/O direto
- [ ] **Composição** — `interface Logger` injetada no `CarrinhoService`, sem `println` direto
- [ ] **Ensaio final** — domínio pequeno à escolha, juntando todos os itens acima