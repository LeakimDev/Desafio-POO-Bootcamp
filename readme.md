<div style="text-align: center;">

# 🎓 Bootcamp POO

### Abstraindo um Bootcamp usando Orientação a Objetos em Java

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![POO](https://img.shields.io/badge/paradigma-POO-6A5ACD?style=for-the-badge)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-yellow?style=for-the-badge)
![License](https://img.shields.io/badge/licença-MIT-blue?style=for-the-badge)

</div>

<br>

<p style="text-align: center;">
  Este projeto modela, em Java, o funcionamento de um <b>bootcamp</b> — seus cursos, mentorias
  e o progresso dos desenvolvedores inscritos — aplicando os quatro pilares da
  <b>Orientação a Objetos</b>: abstração, encapsulamento, herança e polimorfismo. 🚀
</p>

---

## ✨ Visão geral

```
╔════════════════════════════════════════════╗
║         🎓  BOOTCAMP OOP - JAVA             ║
╠════════════════════════════════════════════╣
║  Bootcamp: "Java Developer"                 ║
║  Devs inscritos: 3                          ║
║  Conteúdos: 5                               ║
╚════════════════════════════════════════════╝

  👨‍💻 Dev: João
  ⏳ Inscrevendo no bootcamp ▓▓▓▓▓▓▓▓░░ 80%
  ✅ João inscrito com sucesso!
  📊 XP total: 50

  📚 Conteúdo concluído: "Introdução ao Java"
  🏆 XP ganho: +10
```

> 💡 O objetivo é reforçar conceitos de POO na prática: cada `Conteudo` (curso/mentoria)
> gera XP, cada `Dev` acumula esse XP ao concluir os conteúdos de um `Bootcamp`.

---

## 🧠 Conceitos de POO aplicados

| Pilar               | Onde é aplicado                                                        |
|----------------------|-------------------------------------------------------------------------|
| 🧩 **Abstração**     | `Conteudo` como classe abstrata, representando algo genérico "aprendível" |
| 🔒 **Encapsulamento**| Atributos privados com acesso controlado via métodos                    |
| 🧬 **Herança**       | `Curso` e `Mentoria` herdam de `Conteudo`                                |
| 🎭 **Polimorfismo**  | Cada subtipo calcula seu XP de forma diferente (`calcularXp()`)         |

---

## 🧩 Funcionalidades

- 👨‍💻 Cadastro de desenvolvedores (`Dev`)
- 📚 Cadastro de conteúdos (`Curso` e `Mentoria`)
- 🎓 Criação de bootcamps com conteúdos inscritos
- ✅ Inscrição de devs em bootcamps
- 📈 Progresso do dev: conteúdos concluídos e inscritos
- 🏆 Cálculo automático de XP por conteúdo concluído

---

## 🛠️ Tecnologias utilizadas

- ☕ **Java 17+**
- 🧱 **Programação Orientada a Objetos (POO)**
- 📦 **Collections Framework** (`List`, `Set`)

---

## 📁 Estrutura do projeto

```
bootcamp-oop/
├── src/
│   ├── Main.java
│   └── br/com/dio/desafio/dominio/
│       ├── Bootcamp.java
│       ├── Dev.java
│       ├── DevSlim.java
│       ├── Conteudo.java
│       ├── Curso.java
│       └── Mentoria.java
├── README.md
└── pom.xml (ou build.gradle)
```

---

## ▶️ Como executar

### Pré-requisitos
- Java JDK 17 ou superior instalado

### Passo a passo

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/bootcamp-oop.git
cd bootcamp-oop

# Compile o projeto
javac -d bin src/**/*.java

# Execute
java -cp bin Main
```

---

## 🗺️ Roadmap

- [x] Modelagem das classes principais (Dev, Bootcamp, Conteudo)
- [x] Herança entre Curso, Mentoria e Conteudo
- [ ] Persistência dos dados em arquivo ou banco
- [ ] Testes unitários com JUnit
- [ ] Interface gráfica simples (JavaFX ou Swing)

---

## 🤝 Contribuindo

Contribuições são muito bem-vindas! 🎉

1. Faça um **fork** do projeto
2. Crie uma branch (`git checkout -b feature/nova-funcionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Envie um push (`git push origin feature/nova-funcionalidade`)
5. Abra um **Pull Request**

---

<div style="text-align: center;">

Feito com muito ☕ por <b>Mikael</b>

Se este projeto te ajudou a entender POO, considere deixar uma estrela! ⭐ 

</div>