# Juego del Ahorcado en Consola con Java

## Descripción del Proyecto
El "Juego del Ahorcado en Consola" es una implementación en Java de uno de los juegos clásicos más populares. En este juego, el jugador tiene que adivinar una palabra secreta letra por letra, con un número limitado de intentos. Cada letra correcta será revelada en la palabra, mientras que una letra incorrecta reducirá los intentos restantes. El jugador gana si adivina la palabra antes de quedarse sin intentos, o pierde si los agota.

Este proyecto tiene como objetivo practicar conceptos fundamentales de la programación en Java, tales como el manejo de bucles, condiciones, arrays, e interacción con la consola. Es un proyecto ideal para principiantes en Java que buscan consolidar su conocimiento en estas áreas.

### Características:
- **Palabra secreta**: El jugador debe adivinar una palabra predefinida en el código.
- **Intentos limitados**: El jugador tiene un número máximo de intentos (6 por defecto).
- **Interfaz de consola**: El juego muestra el progreso del jugador y le permite ingresar letras hasta que gane o pierda.
- **Verificación de letras**: El programa verifica si las letras ingresadas forman parte de la palabra secreta y ajusta el estado del juego en consecuencia.
- **Condiciones de victoria o derrota**: El juego finaliza cuando el jugador adivina la palabra o se queda sin intentos.

### Requisitos:
- Java Development Kit (JDK) instalado.
- Un editor de texto o IDE para ejecutar el programa.

### Clases Utilizadas
Este proyecto es simple y está compuesto por una sola clase principal que contiene toda la lógica del juego. Aquí está la descripción de las clases:

1. **Clase Principal: `Ahorcado`**
   - **Función**: Contiene la lógica principal del juego, incluyendo la inicialización de la palabra secreta, el número de intentos, la captura de letras del jugador y la verificación del estado del juego.
   - **Método `main`**: El método de entrada del programa, donde se ejecuta el juego.
   - **Atributos**:
     - `palabraSecreta`: La palabra que el jugador debe adivinar.
     - `palabraAdivinada`: Un array que contiene el estado actual de las letras adivinadas.
     - `intentosRestantes`: El número de intentos restantes antes de que el jugador pierda.
   - **Métodos principales**:
     - **Captura de entrada**: Utiliza la clase `Scanner` para recibir la letra ingresada por el jugador.
     - **Verificación de letra**: Verifica si la letra ingresada está presente en la palabra secreta.
     - **Estado del juego**: Actualiza el número de intentos y el progreso del jugador.
     - **Condiciones de fin de juego**: Determina si el jugador ha ganado o perdido y finaliza el ciclo del juego.

### Ejecución del Juego
Para ejecutar el juego, sigue estos pasos:

1. Clona este repositorio en tu máquina local.
2. Abre tu editor de texto o IDE favorito.
3. Compila y ejecuta el archivo `Ahorcado.java`.
4. Sigue las instrucciones en la consola para ingresar letras e intentar adivinar la palabra.

### Ejemplo de Ejecución:
Palabra: _ _ _ _ Intentos restantes: 6 Ingresa una letra: J Palabra: J _ _ _ Intentos restantes: 6 Ingresa una letra: A Palabra: J A _ A Intentos restantes: 6 Ingresa una letra: V Palabra: J A V A ¡Felicidades! Has adivinado la palabra: JAVA

## Autor:
Este proyecto fue desarrollado por Jorge Ernesto Chavez Puente como una práctica para mejorar las habilidades en el lenguaje de programación Java.