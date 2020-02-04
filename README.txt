FOR QUESTION 1 & QUESTION 2

I coded these questions in Java, but I was never taught how to write a proper JUnit test class. However, I did include a class Driver.java which creates 2 instances of a Graph and runs both methods (walkGraph() and paths()) against those instances. 


The classes were set up as follows:

GraphNode.java

- implements the GNode interface. Includes 2 instances variables: name (String) and children (array of GraphNode).
- contains getter methods for instance variables. Also includes as toString (for testing purposes)


Graph.java

- concrete implementation of a Graph. Includes of 2 instances variables: nodes (GraphNode[]) representing all nodes in the Graph and size (int) representing number of nodes in the graph
- single argument constructor (must pass array of GraphNode)
- public method walkGraph(node) returns all nodes in the graph (including node) starting from node to all accessible nodes from node
- public method paths(node) returns all paths from node to all accessible leaf nodes
- private method pathsRec() constructs all paths

Driver.java

- constructs 2 different graphs and tests both algorithms against those graphs.
- First graph (family tree of my family) and second graph (graph provided in questions description)
- when run from command line, will print results from both methods


FOR QUESTION 3

I coded this question in Python in the script countWords.py
To run the script, ensure the .txt file is in the same directory as the script, run the following command

python countWords.py file_name.txt

And the script will print all words found (defines a word as being separated by a space) and the number of times that word appears.



If further interpretation is needed, please feel free to contact me. I hope the description helped, and I hope these scripts fulfill the requirements!

- Kyle Rohde 
