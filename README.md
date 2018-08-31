# Affinio Code Challenge

### Gift Exchange
- Example input: "Phil, Stephen, Ardi, Quan, Joel"

- Example Output: "Phil gives Joel a gift. Joel gives Quan a gift. Quan gives Stephen a gift. Stephen gives Ardi a gift. Ardi gives Phil a gift"

### Solution
- For a given list, the exchangeGift method returns a list of Tuples containing the combination of the giver and the receiver (Tuple2).
- Each tuple is a unique combination to meet the use cases that a giver could give just one gift and never to himself.

```sh
- Example input: List("Phil", "Stephen", "Ardi", "Quan", "Joel")

- Example Output: List((Stephen,Joe), (Joe,Ardi), (Ardi,Phil), (Phil,Quan), (Quan,Stephen))

```

### Installation
The application requires [Sbt](https://www.scala-sbt.org/download.html) to run unit tests:

```sh
$ sbt test
```



