# Pra mim é uma honra te ter aqui😊
 Aqui estou desenvolvendo um sistema em linguagem Java
  É um sistema que cadastra alunos em seus respectivos cursos.
  *ATENÇÃO, sistema em desenvolvimento, vou ficar muito feliz se você puder me ajudar😉

# Contribuições

[![GitHub release](https://img.shields.io/github/release/platane/snk.svg?style=flat-square)](https://github.com/platane/snk/releases/latest)
[![GitHub marketplace](https://img.shields.io/badge/marketplace-snake-blue?logo=github&style=flat-square)](https://github.com/marketplace/actions/generate-snake-game-from-github-contribution-grid)
![type definitions](https://img.shields.io/npm/types/typescript?style=flat-square)
![code style](https://img.shields.io/badge/code_style-prettier-ff69b4.svg?style=flat-square)

Generates a snake game from a github user contributions graph

![](https://github.com/Platane/snk/raw/output/github-contribution-grid-snake.svg)

Pull a github user's contribution graph.
Make it a snake Game, generate a snake path where the cells get eaten in an orderly fashion.

Generate a [gif](https://github.com/Platane/snk/raw/output/github-contribution-grid-snake.gif) or [svg](https://github.com/Platane/snk/raw/output/github-contribution-grid-snake.svg) image.

Available as github action. It can automatically generate a new image each day. Which makes for great [github profile readme](https://docs.github.com/en/free-pro-team@latest/github/setting-up-and-managing-your-github-profile/managing-your-profile-readme)

|
      dist/github-snake.svg
      dist/github-snake-dark.svg?palette=github-dark
      dist/ocean.gif?color_snake=orange&color_dots=#bfd6f6,#8dbdff,#64a1f4,#4b91f1,#3c7dd9
```

[example with cron job](https://github.com/Platane/Platane/blob/master/.github/workflows/main.yml#L24-L29)

If you are only interested in generating a svg, consider using this faster action: `uses: Platane/snk/svg-only@v2`

**dark mode**

Para **dark mode** support on github, use isso [special syntax](https://docs.github.com/pt/get-started/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax#specifying-the-theme-an-image-is-shown-to=) em seu readme.

```md
![GitHub Snake Light](github-snake.svg#gh-light-mode-only)
![GitHub Snake dark](github-snake-dark.svg#gh-dark-mode-only)
```

**local**

```
npm install

npm run dev:demo
```

## Implementation

[solver algorithm](./packages/solver/README.md)

