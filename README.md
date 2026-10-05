# Strategy Design Pattern

Two Java console examples of selecting interchangeable behaviours through a shared strategy interface.

## How it works

The `strategy` package computes fares for different vehicle types. The `strategy1` package chooses a music message based on a console mood selection. In both examples, `Context` delegates execution to the selected strategy.

## Usage

Requires a Java Development Kit. Run from the repository root:

```sh
javac -d out src/strategy/StrategyPatternDemo.java src/strategy1/StrategyPatternDemo.java
java -cp out strategy.StrategyPatternDemo
```
Run `java -cp out strategy1.StrategyPatternDemo` for the interactive mood example; select `4` to exit.

## Notes

The music example prints messages rather than playing audio.
