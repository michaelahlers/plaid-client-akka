# Plaid Client for Scala [![CircleCI][CircleCI Badge]][CircleCI Branch] [![Codacy][Codacy Grade Badge]][Codacy Grade Branch] [![Gitter][Gitter Badge]][Gitter Room]

Scala language bindings—including clients and models—for Plaid's services.

## Libraries

### [Mockito][Mockito]

Used in this project where its [final class and method mocking features][Mockito mock-maker-inline] are needed (a capability [ScalaMock][ScalaMock] presently lacks).   

### [Plaid Java][Plaid Java]

The official Java client and model classes is augmented with Scala features. Used primarily as a reference, but may be useful to third-parties using this library.

### [ScalaMock][ScalaMock]

Preferred to [Mockito][Mockito] for its Scala-friendly API.  

[CircleCI Badge]: https://img.shields.io/circleci/project/github/michaelahlers/plaid-client-scala/v0.0.svg
[CircleCI Branch]: https://circleci.com/gh/michaelahlers/plaid-client-scala/tree/v0.0

[Codacy Grade Badge]: https://img.shields.io/codacy/grade/90c00ea1df124204be8f0d7dee5c41a0/v0.0.svg 
[Codacy Grade Branch]: https://www.codacy.com/app/michaelahlers/plaid-client-scala

[Gitter Badge]: https://img.shields.io/gitter/room/michaelahlers/plaid-client-scala.svg
[Gitter Room]: https://gitter.im/michaelahlers/plaid-client-scala

[Mockito]: http://mockito.org
[Mockito mock-maker-inline]: https://github.com/mockito/mockito/wiki/What%27s-new-in-Mockito-2#mock-the-unmockable-opt-in-mocking-of-final-classesmethods

[Plaid Java]: https://github.com/plaid/plaid-java

[ScalaMock]: http://scalamock.org/
