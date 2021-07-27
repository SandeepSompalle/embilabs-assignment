# Sample IntelliJ platorm plugin written in Scala

This is an example IJ plugin written in Scala and managed by SBT.

Apart from basic IJ plugin structure this project also provides some example code to play with and demonstrate some
of the IntelliJ platform API features.

Extended documentation on the build features such as packaging the artifact, uploading to plugin marketpalce, etc. is covered by
the [sbt-idea-plugin](https://github.com/JetBrains/sbt-idea-plugin) readme

## Quick Start

- Open the `build.sbt` file in IntelliJ IDEA as a project
- To run your plugin, run or debug the `myAwesomeFramework` run configuration

## Example build features

- `intellijBuild` key in build.sbt contains version of the dependency on IDEA, you can change it.

- `intellijPlugins` key in build.sbt contains a dependency on the "Properties" IJ plugin

- there's an external library dependency that will be packaged into your plugin distribution

- Don't forget to replace the plugin name in build.sbt. You also need to change name in resources/META-INF/plugin.xml.

## Example plugin components

- `PopupDialogAction` creates an action under the "Tools" menu
- `SimpleCompletionContributor` adds the "HELLO" completion item to the values of the properties files
- `FileOpenedListener` shows a popup when a file is opened in the editor
- `ApplicationHelloService` and `ProjectHelloService` show examples of IJ platform service components
- `MyToolWindowFactory` creates a new toolwindow at the bottom of the window


RatCheese
Rat and Cheese problem statement

Assignment
As discussed i am sending the assignment. You should upload the solution as a github repo as far as possible.

Your code should accept input from the user.
Your code should print the output appropriately.
The code should be commented
Error conditions should be considered.
Problem statement:

There are blocks of cheese of different weights placed in a line. A mouse would like to eat the cheese, but with some rules. The mouse can’t eat two consecutive cheese blocks. The mouse would like to eat maximum cheese from the line of cheese blocks. Weight of each cheese block in Kg is given as a[i] in an integer array.

Input:

The first line of input contains an integer T denoting the number of test cases. Each test case contains an integer n which denotes the number of elements in the array a[]. Next line contains space separated n elements in the array a[].

Output:

Print an integer which denotes the maximum amount of cheese that the mouse can have.

Constraints:

1<=T<=200

1<=n<=1000

1<=a[i]<=10000

Example:

Input:

2

6

8 5 10 100 10 5

3

1 2 3

Output:

113

4

outputs:
Given weights of cheese are 8 5 10 100 10 5 Rat eats 110 amount of cheese

Given weights of cheese are 1 2 3 Rat eats 4 amount of cheese
