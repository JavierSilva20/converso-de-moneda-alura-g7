<h1>Conversor de Moneda en Java (ALURA G7)</h1>
<p>Este es un programa simple en Java para realizar conversiones entre distintas monedas utilizando
tasa de cambio en tiempo real proporcionadas por la API <a href="https://www.exchangerate-api.com/">ExchangeRate-API.</a> El programa permite 
convertir entre dólares estadounidenses (USD), pesos argentinos (ARS), reales brasileños (BRL) y pesos colombianos (COP)</p>

<h2>Funcionalidades</h2>
<ol>
  <li>Dólar estadounidense (USD) → Peso argentino (ARS)</li>
  <li>Peso argentino (ARS) → Dólar estadounidense (USD)</li>
  <li>Dólar estadounidense (USD) → Real brasileño (BRL)</li>
  <li>Real brasileño (BRL) → Dólar estadounidense (USD)</li>
  <li>Dólar estadounidense (USD) → Peso colombiano (COP)</li>
  <li>Peso colombiano (COP) → Dólar estadounidense (USD)</li>
</ol>
<p>El programa obtiene las tasas de cambio actualizadas en tiempo real y permite al usuario seleccionar 
una conversión específica ingresando una opción del 1 al 6.</p>

<h2>Requisitos</h2>
<ul>
  <li><b>Java 11</b> o superior</li>
  <li><b>Gson</b> para el procesamiento del JSON</li>
</ul>

<h2>Instalacion y Ejecucion</h2>
<ol>
  <li>Clona este repositorio o descarga los archivos del proyecto</li>
  <li>Asegurese de tener <b>Gson</b> configurado en su proyecto</li>
  <li>Compila y ejecuta el archivo <b>Principal.java</b></li>
</ol>

<h2>Uso</h2>
<ol>
  <li>Ejecuta el programa desde la línea de comandos o tu IDE preferido</li>
  <li>Selecciona la opción de conversión ingresando un número del 1 al 6</li>
  <li>Si la opción es válida, ingresa la cantidad a convertir</li>
  <li>El programa mostrará el resultado de la conversión en pantalla y finalizara</li>
</ol>
<p>Si se ingresa un número fuera del rango de 1 a 6, el programa mostrará un mensaje de error y finalizará</p>

<h2>Estructura del Codigo</h2>
<ul>
  <li><b>Principal.java</b>: Contiene el método principal (<b>main,/) y la lógica de conversión</li>
  <li><b>ConsultaMoneda.java</b>: Clase para realizar la consulta a la API y obtener las tasas de cambio actuales</li>
  <li><b>Moneda.java</b>: Un <b>Record</b> que almacena las tasas de cambio obtenidas de la API en un <b>Map</b></li>
</ul>

<h2>Agradecimientos</h2>
<p>Quiero expresar mi más sincero agradecimiento a <b>ONE (Oracle Next Education) y Alura Latam</b> por 
la oportunidad de estudiar en su bootcamp de programación. La formación y el apoyo que he recibido 
me han permitido obtener y mejorar mis habilidades y asi poder desarrollar proyectos como este conversor de moneda en Java. 
Estoy profundamente agradecido por los conocimientos adquiridos y por el acompañamiento en este camino 
hacia una carrera en tecnología. ¡Gracias por esta experiencia tan valiosa!</p>
