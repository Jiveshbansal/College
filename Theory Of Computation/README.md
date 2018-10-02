[![](https://forthebadge.com/images/badges/certified-snoop-lion.svg)](https://www.youtube.com/watch?v=LlU4FuIJT2k "( ͡° ͜ʖ ͡°)")

# Theory Of Computation <!-- omit in toc -->

## **Contents** <!-- omit in toc -->

- [**Introduction**](#introduction)
- [**Resources (Tutorials, etc)**](#resources)
  - [RegEx to NFA conversion](#regex-to-nfa)
  - [NFA to DFA conversion](#nfa-to-dfa)
  - [Combining DFAs (Union/Intersection of two DFAs)](#combining-dfas)
- Tools
  - [**RegEx to Automata Converters**](#regex-to-automata-converters)
  - [**Simulation**](#simulation)

## **Introduction**

Complete introduction to Theory of Computation: <a href="https://git.io/fxf3Y" target="_blank">PDF</a> | <a href="https://goo.gl/wBqUju" target="_blank">Video Playlist</a>

[Other useful notes](https://github.com/hsuay/College/tree/master/Theory%20Of%20Computation/Notes) | [Summary](https://github.com/hsuay/College/raw/master/Theory%20Of%20Computation/Notes/summary.pdf)

## Resources

- ### RegEx to NFA

  - <a href="https://en.wikipedia.org/wiki/Thompson%27s_construction#Rules" target="_blank">Thompson's Construction</a>
    <p align="center">
    <img src="https://cl.ly/5a2c56ce464b/Image%202018-10-02%20at%2010.10.54%20PM.png" href="http://www.cs.may.ie/staff/jpower/Courses/Previous/parsing/node5.html">
    </p>

  > **NOTE**: The Kleene Plus/Positive Closure operator (<sup>+</sup>) is equivalent to the concatenation of a single instance of the operand with it's Kleene Star(<sup>\*</sup>).

    <div align="center"  style="pointer-events:none; cursor:default">  
    <p>Visually,</p>
    <img src="https://latex.codecogs.com/gif.latex?a^&plus;&space;=&space;a&space;(a*)" title="a^+ = a (a*)" />
    </div>

#

- ### NFA to DFA

  - <a href="http://condor.depaul.edu/glancast/444class/docs/nfa2dfa.html" target="_blank">An example</a>
  - <a href="http://www.idt.mdh.se/kurser/cd5560/10_01/examination/examination/NFA-DFA.pdf" target="_blank">The subset construction</a>
  - <a href="https://www.youtube.com/watch?v=OZksTVJDwbY&list=PLbtzT1TYeoMjNOGEiaRmm_vMIwUAidnQz&t=0s&index=8" target="_blank">Video tutorial</a>

- ### Combining DFAs
  - <a href="https://stackoverflow.com/questions/14676833/combining-deterministic-finite-automata" target="_blank">Intersection of two DFAs (AND/Concatenation)</a>

## **RegEx to Automata Converters**

- [Regular Expressions to NFA, DFA](https://hokein.github.io/Automata.js/) (Recommended)
- Alternate Site
  - [RegEx to NFA](https://cyberzhg.github.io/toolbox/regex2nfa)
  - [RegEx to DFA](https://cyberzhg.github.io/toolbox/nfa2dfa)

## **Simulation**

> You can create, test, generate(from regex) and run FSMs, Turing Machines, grammars, Mealy and Moore machines, Pushdown Automata and also apply the pumping lemma using **JFLAP**.
>
> Download and run it like a regular program. If you don't already have JDK installed on your system, you need to have JRE installed to run .JAR files.

[Download](https://raw.githubusercontent.com/hsuay/College/master/Theory%20Of%20Computation/JFLAP7.1.jar) | [Official Website](http://www.jflap.org/) | [Docs](http://www.jflap.org/tutorial/)

Preview:

<p align = "center">

<img src = "https://cl.ly/7ebf3a81f8b2/Image%202018-10-01%20at%206.41.54%20PM.png" width = "192">

</p>

###### ~~ayush~~ <!-- omit in toc -->
