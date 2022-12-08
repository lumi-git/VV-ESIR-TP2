# Using PMD

Pick a Java project from Github (see the [instructions](../sujet.md) for suggestions). Run PMD on its source code using any ruleset. Describe below an issue found by PMD that you think should be solved (true positive) and include below the changes you would add to the source code. Describe below an issue found by PMD that is not worth solving (false positive). Explain why you would not solve this issue.

## Answer

Exemple of a false positive :
```
/home/yann/Bureau/ESIR2/VV/commons-math/commons-math-legacy/src/main/java/org/apache/commons/math4/legacy/distribution/fitting/MultivariateNormalMixtureExpectationMaximization.java:409:	ForLoopCanBeForeach:	This for loop can be replaced by a foreach loop

```
Here we have a for loop used. A foreach would have been more conveniant.
It is not a real problem for the code it's a false positive




Example of True positive
```
/home/yann/Bureau/ESIR2/VV/commons-math/commons-math-legacy/src/test/maxima/special/RealFunctionValidation/RealFunctionValidation.java:329:	CloseResource:	Ensure that resources like this DataOutputStream object are closed after use
```
Here, we have a true positive, because a file not closed can cause bugs in the programm or use memory for nothing .



