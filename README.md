# Máquina de Café — Práctica TDD

Proyecto Java 11+ con JUnit 4 y Maven, basado en los casos de prueba de la guía del profesor.

## Ejecutar
1. Instalar JDK 11 o superior y Maven.
2. Abrir esta carpeta en VS Code (Extension Pack for Java), IntelliJ o Eclipse.
3. Ejecutar `mvn test` en la carpeta del proyecto, o ejecutar los tests JUnit desde el IDE.
4. Los tests se encuentran en `src/test/java/com/itla/cafe`.

## Cómo documentar el proceso TDD de forma auténtica
El proyecto se entrega en su versión final. Para demostrar Rojo → Verde → Refactorizar, reproduce ciclos reales:
1. Guarda una copia del proyecto final antes de experimentar.
2. Elige un test, por ejemplo `deberiaRestarCafe`.
3. En una rama de trabajo, modifica temporalmente `giveCafe` para que no reste; ejecuta la prueba y captura el resultado rojo.
4. Restaura la implementación correcta, ejecuta nuevamente y captura el resultado verde.
5. Mejora el nombre de una variable o extrae una condición sin cambiar el comportamiento; ejecuta todas las pruebas y captura el resultado.
6. Identifica estas evidencias como **reconstrucción didáctica del ciclo**, no como historial original de desarrollo.

Para documentar un proceso TDD genuino desde el inicio, empieza con las pruebas y escribe la implementación una por una, tomando las capturas durante cada ciclo.

## Notas de interpretación
- La guía muestra `Vaso(5,10)`: el primer parámetro se interpreta como onzas por vaso y el segundo como inventario.
- Se implementaron 3/5/7 onzas por vaso pequeño/mediano/grande, respectivamente.
- La cantidad de azúcar solicitada se interpreta como cucharadas **por vaso**.
- Los mensajes se mantienen como en la guía: `No hay Vasos`, `No hay Cafe`, `No hay Azucar`, `Felicitaciones`.
- Se añadieron validaciones para cantidades inválidas y una prueba extra de no descuento cuando falta café.
- La diapositiva 17 de la guía muestra una resta de café que parece corresponder a 10 unidades por vaso, aunque la diapositiva 5 indica 3 oz para el vaso pequeño. Se priorizó la especificación explícita de 3/5/7 oz; confirma con el profesor si espera la otra interpretación.

No se incluyen capturas de pruebas ejecutadas: deben generarse desde tu IDE al realizar la práctica.
