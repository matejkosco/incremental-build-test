# incremental-build-test
example project for testing incremental builds with maven and jenkins

test:
* modifications
* transitive dependencies
* failed test


initial commit 
* build all

modified single module with no other modules depending on it
* only the modified module was build

added top level module (modification to to level pom.xml)
* full build

modified module with dependent modules
* modified module was build
* directly dependent modules were build
* transitively dependent modules were build

make a test case fail, then modify unrelated module with no dependent modules
* after breaking the test case, the build is unstable (modified + dependent modules are build)
* after modifying an unrelated module, broken modules and their dependent modules are rebuild again
