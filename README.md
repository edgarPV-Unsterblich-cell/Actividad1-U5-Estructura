Implementación en Java del algoritmo de ordenamiento externo de Mezcla Directa (Straight Merge). El programa lee bloques previamente ordenados de tamaño $L$ desde dos archivos de texto auxiliares (f1.txt y f2.txt), compara sus elementos frente a frente en el método intercalarBloques y escribe el resultado fusionado y ordenado en un archivo de salida (f3.txt).📁 Estructura del Repositoriomezcla-directa/
├── src/
│   └── ordenamiento/
│       └── MezclaDirectaPractica.java   # Clase principal con el método intercalarBloques
├── f1.txt                               # Archivo auxiliar 1 (datos de entrada)
├── f2.txt                               # Archivo auxiliar 2 (datos de entrada)
└── README.md                            # Documentación y guía de ejecución
⚙️ Requisitos PreviosJava Development Kit (JDK): Versión 8 o superior instalado.IDE recomendado: IntelliJ IDEA, Apache NetBeans o Eclipse.Archivos de entrada: f1.txt y f2.txt ubicados en la carpeta raíz del proyecto (al mismo nivel que src/), cada uno con un número entero por renglón.🚀 Cómo Clonar, Configurar y Ejecutar en el IDE1. Clonar el repositorioAbre una terminal o consola de Git y ejecuta:git clone <URL_DE_TU_REPOSITORIO>
cd mezcla-directa
2. Abrir y configurar el proyecto en el IDE (IntelliJ IDEA)Abre IntelliJ IDEA y selecciona Open.Elige la carpeta mezcla-directa que acabas de clonar y haz clic en OK.Verifica que el proyecto tenga configurado un SDK de Java válido (File > Project Structure > Project > SDK).Confirma que la carpeta src esté marcada como Sources Root (si no lo está, haz clic derecho sobre src $\rightarrow$ Mark Directory as $\rightarrow$ Sources Root).3. Verificar los archivos auxiliares (f1.txt y f2.txt)Antes de ejecutar el programa, asegúrate de que f1.txt y f2.txt existan en la carpeta raíz del proyecto con un número por renglón (de lo contrario se lanzará una IOException al intentar abrirlos):f1.txt45
f2.txt12
4. Ejecutar el programaEn el explorador del proyecto, navega a src/ordenamiento/MezclaDirectaPractica.java y ábrelo.Haz clic en el botón verde Run ($\triangleright$) junto a public static void main(String[] args) y selecciona Run 'MezclaDirectaPractica.main()'.🖥️ Réplica Exacta de la Salida en ConsolaAl ejecutarse correctamente con los archivos de prueba (f1.txt con 45 y f2.txt con 12), la consola muestra exactamente:Bloque intercalado con exito!
Asimismo, en la carpeta raíz del proyecto se genera el archivo f3.txt con el primer elemento ordenado de la mezcla 
