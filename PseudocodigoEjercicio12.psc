Algoritmo Ejercicio12
	alturaM <- 0
	Cm <- 0
	alturaF <- 0
	Cf <- 0
	edadT <- 0
	sexo <- ''
	total <- 0
	Repetir
		Escribir 'Ingrese la altura'
		Leer altura
		Escribir 'ingrese la edad'
		Leer edad
		Escribir 'Ingrese el sexo'
		Leer sexo
		Si sexo='F' Entonces
			alturaF <- alturaF+altura
			Cf <- Cf+1
		SiNo
			Si sexo='M' Entonces
				alturaM <- alturaM+altura
				Cm <- Cm+1
			FinSi
		FinSi
		edadT <- edadT+edad
		total <- total+1
	Hasta Que altura<0
	Si Cf=0 Entonces
		Cf <- 1
	FinSi
	Si total=0 Entonces
		total <- 1
	FinSi
	Si Cm=0 Entonces
		Cm <- 1
	FinSi
	alturaF <- alturaF/Cf
	edadT <- edadT/total
	alturaM <- alturaM/Cm
	Escribir 'altura Mujeres: ',alturaF,' altura Hombres: ',alturaM,' edad: ',edadT
FinAlgoritmo
