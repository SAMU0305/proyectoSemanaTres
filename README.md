# Aplicación Java - Cálculo de Costo de Despacho

## 📌 Descripción del proyecto
Esta aplicación en Java permite registrar datos de vehículos y calcular automáticamente el costo de despacho según las reglas de negocio de una distribuidora de alimentos.  
El prototipo se ejecuta en consola, es una versión básica desarrollada en **Visual Studio Code** y sirve como base para futuras mejoras.

## 📝 Datos de entrada y salida

**Datos de Entrada:**
- Marca
- Modelo
- Cilindrada
- Tipo de combustible
- Capacidad en pasajeros

**Datos de Salida:**
- La marca que ha ingresado es: XXXX
- El modelo que ha ingresado es: XXXX
- La cilindrada que ha ingresado es: XXXX
- El tipo de combustible es: XXXX
- Tiene una capacidad de XXXX pasajeros.
- Costo de despacho calculado según reglas de negocio.

## ⚙️ Requerimientos Funcionales

- Registrar usuarios utilizando una cuenta Gmail.

- Calcular el monto total de la compra.

- Calcular la distancia en kilómetros hasta el domicilio.

- Calcular el costo de despacho según las reglas de negocio:
  - Compras ≥ $50.000 y distancia ≤ 20 km → despacho gratuito.
  - Compras entre $25.000 y $49.999 → $150 por km.
  - Compras < $25.000 → $300 por km.

 - Solicitar datos del trasporte: marca, modelo, cilindrada, tipo de combustible y capacidad de pasajeros.

- Mostrar en pantalla la información ingresada por el usuario.

- Mostrar al usuario el costo final del despacho.



## 🔒 Requerimientos No Funcionales
- Claridad: mensajes comprensibles para el usuario.
- Usabilidad: programa sencillo de usar, sin conocimientos técnicos avanzados.
- Confiabilidad: manejo de entradas inválidas para evitar errores de ejecución.
- Rendimiento: cálculo del costo de despacho inmediato.
- Mantenibilidad: código estructurado y comentado línea por línea.


## 👤 Historias de Usuario

- **Usuario – Ingreso de datos del vehículo**  
  💡 *Como usuario, quiero ingresar los datos del vehículo (marca, modelo, cilindrada, tipo de combustible y capacidad de pasajeros) para recibir un resumen de la información ingresada.*

- **Usuario – Visualización de resultados**  
  💡 *Como usuario, quiero que la aplicación muestre claramente los datos ingresados y el costo de despacho calculado, para verificar que la información es correcta y confiable.*

- **Administrador – Cálculo automático de despacho**  
  💡 *Como administrador, quiero que la aplicación calcule automáticamente el costo de despacho según las reglas de negocio, para entregar resultados precisos sin intervención manual.*

- **Administrador – Manejo de entradas inválidas**  
  💡 *Como administrador, quiero que la aplicación valide los datos ingresados (por ejemplo, que no se ingresen letras en campos numéricos), para asegurar que el cálculo del despacho no falle.*

- **Usuario – Facilidad de uso**  
  💡 *Como usuario, quiero que el programa sea sencillo de utilizar y que no requiera conocimientos técnicos avanzados, para poder ingresar mis datos y obtener resultados rápidamente.*

- **Administrador – Documentación y mantenimiento**  
  💡 *Como administrador, quiero que el código esté documentado línea por línea, para facilitar futuras mejoras y correcciones del programa.*


## 📅 Cronograma Inicial (7 días)

| Día | Actividad |
|-----|-----------|
| 1   | Planificación del proyecto: lectura del enunciado, análisis del caso de estudio, identificación de datos de entrada/salida y reglas de negocio. |
| 2   | Diseño del programa: definir variables, estructura del código, lógica de cálculo de despacho y flujo de captura de datos. |
| 3   | Desarrollo del código base: implementación de la captura de datos (marca, modelo, cilindrada, tipo de combustible, capacidad de pasajeros) y salida en pantalla. |
| 4   | Implementación del cálculo de despacho: codificar la lógica según los rangos de compra y distancia, usando condiciones `if/else`. |
| 5   | Documentación línea por línea: agregar comentarios explicativos directamente en el código para cada instrucción. |
| 6   | Pruebas y corrección de errores: ejecutar el programa, revisar resultados, probar distintos escenarios y corregir posibles fallos. |
| 7   | Preparación de repositorio y documentación: subir código a GitHub, agregar README.md con requerimientos, historias de usuario, cronograma y evidencia del funcionamiento (screenshots). |

## 📸 Evidencia del Funcionamiento
Se incluyen screenshots de la ejecución del programa en **Visual Studio Code**, mostrando la correcta captura de datos y el cálculo del costo de despacho. se pueden encontrar en el repositorio en la carpeta img.

## 🔗 Enlace al Repositorio
[Repositorio GitHub del proyecto](https://github.com/SAMU0305/proyectoSemanaTres.git)
