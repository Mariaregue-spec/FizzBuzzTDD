# 🎯 FizzBuzzTDD

![Licencia: MIT](https://img.shields.io/badge/Licencia-MIT-green.svg)

<p align="center">
  <strong>Practicando Test-Driven Development con la clásica kata FizzBuzz</strong>
</p>

---

## 🧠 Sobre el proyecto

Este repositorio contiene una implementación de **FizzBuzz** aplicando la metodología **TDD (Test-Driven Development)**.

FizzBuzz es un ejercicio clásico de programación que consiste en:

- 🔢 Imprimir los números del 1 al *n*
- ✨ Sustituir múltiplos de **3** por `"Fizz"`
- 💥 Sustituir múltiplos de **5** por `"Buzz"`
- 🚀 Sustituir múltiplos de **3 y 5** por `"FizzBuzz"`

En este proyecto, la solución se desarrolla siguiendo el ciclo:

🔴 Red → 🟢 Green → 🔵 Refactor

---


Primero se escribe el test, luego el código mínimo para pasarlo, y finalmente se mejora el diseño.

---

## 🗂️ Estructura del proyecto

📦 FizzBuzzTDD
┣ 📂 src
┃ ┣ 📂 main/java → Código fuente
┃ ┗ 📂 test/java → Tests unitarios
┣ 📄 pom.xml → Configuración Maven
┗ 📄 README.md


El proyecto está gestionado con **Maven**, que permite compilar y ejecutar los tests fácilmente.

---

## 🚀 Cómo ejecutar el proyecto

### ✅ Requisitos

- ☕ Java JDK 11 o superior  
- 🛠️ Maven  

### 📥 Clonar el repositorio

```bash
git clone https://github.com/Mariaregue-spec/FizzBuzzTDD.git
cd FizzBuzzTDD

```
▶️ Ejecutar los tests

mvn clean test

Si todo está correcto, verás los tests pasar en consola ✔️

🧪 Ejemplo de comportamiento esperado

| Entrada | Salida   |
| ------- | -------- |
| 1       | 1        |
| 3       | Fizz     |
| 5       | Buzz     |
| 15      | FizzBuzz |

---

🎓 Objetivos del proyecto

✔️ Practicar TDD en un entorno real

✔️ Aprender a escribir tests antes que la implementación

✔️ Aplicar buenas prácticas de diseño

✔️ Mantener código limpio y refactorizado

🤝 Contribuciones

Las mejoras son bienvenidas:

Haz un fork 🍴

Crea una nueva rama 🌿

Abre un Pull Request 🚀

---

---

## 📄 Licencia

Este proyecto está bajo la licencia MIT.  
Copyright © 2026 María Regueiro Ramil.

Consulta el archivo `LICENSE` para más información.

