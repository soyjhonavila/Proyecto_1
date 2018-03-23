# Proyecto_1
* Fundamentos de Estructuras de Datos (Recusiones) ID:605135  NRC:5818
* Clase: Archivo de secuencias geneticas con el patron que mas se repite Motivo en BioInformatica

* En general este proyecto consiste en la busqueda del patron (motif) en un grupo de secuencias geneticas, fue realizado y/o conformado por subcadenas,metodos y funciones que hacen sea mucho mas operable y efectivo, ademas que sea un codigo mucho mas corto.

* ENTRADA:

* PROCESO:

* Metodos y funciones (Recurciones)

* Primera parte:

* Bases nucleotidas

* GetNeucleotide

* A, si c=0

* C, si c=1

* G, si c=2

* T, si c=3

* de forma aleatoria que busque la informacion generada

* Recursividad del tamaño

* Sequence

* ( int length )

* GetNeucleotide, si length = 1

* GetNeucleotide + sequence (length - 1), sino

* Cada par de (23) xy "chr" = un numero entero aleatorio de rango [1,23] y "chr" que es el prefijo de chromosome para representa el genoma humano.

*Tamaño de la secuencia:

* una posicion de inicio en 1000 es decir con rango [1,1000] base 1000000

* con un for que recorra uno a uno hasta llegar a la base , tambien es necesario realizar la siguiente ecuacion

* inicio + tamañosecuencia -1 .

* Segunda parte:

* En las segunda parte para encontrar el patron se contaron las ocurrencias que reporta y las ocurrencias que tiene
comparacion que determine numero de ocurrencias

* verify candidate (motif)

* this . winner_motif , si

* this . ocurrences

* sucadenas del tamaño del motif -Conbinations ( subsequence , size )

* subsequence + A,C,G,T , si size = 1

* combinations( sequence + "A" size -1 ) , sino

* SALIDA:

* Las secuencias geneticas con el patron que mas se repite
