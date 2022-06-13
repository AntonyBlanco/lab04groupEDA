# lab03groupEDA
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>
<div align="center">
    <span style="font-weight:bold;"><h2>INFORME DE LABORATORIO 4</h2></span>
</div>


<table>
<theader>
    <tr><th colspan="6" style="width:50%; height:auto; text-align:center">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
    <tr>
        <td>ASIGNATURA:</td><td colspan="5">Estructuras de Datos y Algoritmos</td>
    </tr>
    <tr>
        <td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Sort y Listas Enlazadas</td>
    </tr>
    <tr>
        <td>NÚMERO DE PRÁCTICA:</td><td>03</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
    </tr>
    <tr>
        <td colspan="2">FECHA DE PRESENTACIÓN:</td><td>12-Jun-2022</td><td colspan="2">HORA DE PRESENTACIÓN:</td><td>11:55</td>
    </tr>
    <tr>
        <td colspan="3">INTEGRANTES:
        <ol>
        <li>Blanco Trujillo, Antony Jacob</li>
        <li>Checalla Soto, Edisson Franklin</li>
        <li>Vilca Suelo, Gionvanni Gabriel</li>
        </ol>
        </td>
        <td colspan="2"> NOTA:</td>
        <td>     </td>
    </tr>
    <tr>
        <td colspan="6">DOCENTE:<br>
        Mg. Richart Smith Escobedo Quispe
        </td>
    </tr>
</table>

#
<div align="center">
    <span style="font-weight:bold;"><h2>I. SOLUCIÓN Y RESULTADOS </h2></span>
</div>

#
## SOLUCIÓN DE EJERCICIOS/PROBLEMAS

#
### Ejercicio 1: Sort En Lista Enlazada Simple 

-   ¿Como puedo compilar este ejercicio correctamente en mi pc?

Despúes de clonar este repositorio, para poder ejecutar este ejercicio en particular es recomendable que se ejecute desde el IDE eclipse, pues su desarrollo se dio en este,y por ello mismo es que se subieron tambien los archivos necesarios para ejecutarse ahí. habiendo cumplido estas instrucciones solo necesita ejecutar el archivo "PilasIguales.java". Iniciada la compilación es bastante intuitiva de seguir, ya que el programa le indicara que es lo que tiene que hacer.

-   Enlace a código en GitHub (solo código): https://github.com/AntonyBlanco/lab03groupEDA/blob/main/Ejercicio1/src/PilasIguales.java


-ejemplo de codigo 

```sh 
	static  Stack<Integer> pila1 = new Stack<Integer>(); //Primera pila de cilindros
	static Stack<Integer> pila2 = new Stack<Integer>(); //Segunda pila de cilindros
	static Stack<Integer> pila3 = new Stack<Integer>(); //Tercera pila de cilindros
```



-   Ejecución: Sort En Lista Enlazada Doble

Más arriba hacemos mencion de que solo necesita ejecutar el programa para poder tener una vision amplia de la resolución del ejercicio, y es verdad, pero podemos pasar a detallar un poco, y es que en la primera parte de la clase Main, declaramos 3 arreglos de tipo entero, ellos alamcenaran las alturas de cada cilindro, mas adelante con ayuda de metodos adicionales que implementamos es que llenamos de forma interactiva cada arreglo (imprimiendo las indicaciones del caso):

<div align="center">

![Ejecucion](Imagenes%20para%20informe//Ejercicio1-ejecuci%C3%B3n.png)
</div>


#
### Ejercicio 2

Ejemplo de codigo
```sh
    public class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E data,Node<E> next) {
                this.data=data;
                this.next=next;
        }
        public Node(E data) {
                this(data,null);
        }
        public E getData() {
                return this.data;
        }
        public void setData(E data) {
                this.data=data;
        }
        public Node<E> getNext() {
                return this.next;
        }
        public void setNext(Node<E> next) {
                this.next=next;
        }
        public String toString() {
                return this.data.toString();
        }

```

#
### Ejercicio 3: Fusión De Graficos

Ejemplo de codigo

#
<div align="center">
    <span style="font-weight:bold;"><h2>II. SOLUCIÓN DEL CUESTIONARIO </h2></span>
</div>

#

- ¿Cómo se ejecutaría sus implementaciones desde terminal(consola)?

    En general una lista enlazada requiere de una estructura de datos compleja, al contrario de las pilas que pueden operar con elementos simples o complejos. la forma en la que se agregan elemntos no difieren mucho en su implementación, sin embargo para la eliminación es donde tienen más diferencias, y esto basicamente es por donde las pilas pueden ejecutarse para tareas muy especificas que de hacerse con las listas enlazadas requewririan de más costo de memoria. 

- ¿Cómo lo haría desde la terminal?

    Favorable uso de las Pilas

    Haciendo el estudio bibliografico correspondiente, se nos señala que las pilas son útiles a la hora de implementar por ejemplo el muy comun retroceso de acciones (ctrl + z) de varias aplicaciones.
    Tambien los IDEs y derivados usan esta herramienta para determinar cuando una llave esta cerrada o no, por ejemplo en las estructuras de seleccion y iterativas anidadas.
    De la misma manera podemos usarlo para poder leer un lenguaje con una gramática que contiene reglas recursivas, por ejemplo el uso de los paréntesis y funciones en las expresiones matemáticas de las calculadoras, algo relacionado se refiere a los autómatas de pila.

    Desfavorable uso de las Pilas

    Las pilas a primera instancia podriamos usarlas para guardar información que no requiera de un orden, pero para ello ya tenemos las listas o arreglos dinámicos.

    Favorable uso de las Colas

    Las colas se utilizan en las computadoras cuando se ejecutan diversos procesos que deben ser realizados en orden.

    Desfavorable uso de las Colas

    ...

#
<div align="center">
    <span style="font-weight:bold;"><h2>III. CONCLUSIONES </h2></span>
</div>

#
-   Los conceptos solo teoricos de pilas ayudaron con la posibilidad de resolver la igualación de pilas.

-   Las colas y pilas se van a utilizar como una solución precisa para diversos problemas de administración de la información así como la ordenada ejecución de procesos


#
<div align="center">
    <span style="font-weight:bold;"><h2>RETROALIMENTACIÓN </h2></span>
</div>

#

-   

#
<div align="center">
    <span style="font-weight:bold;"><h2>REFERENCIAS Y BIBLIOGRAFÍA </h2></span>
</div>

#

-   https://www.w3schools.com/java/
-   https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers
-   https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
-   https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html
   
    
