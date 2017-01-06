# U.S. Capitals and Dijkstra's SPP

![us-capitals-graph](USCapitalsGraph.gif)

# Problem: Given a Positively-Weighted Directed Graph and a Source Node, determine all shortest paths to all other Nodes

References: The depiction of capitals as a graph was taken from here: http://www.cs.utsa.edu/~wagner/CS3343/newgraph/graphrep.html

Example:

call function:
america = Dijkstra.calculateShortestPathFromSource(america, texas);

Inspect any node in america:
Node [name=ME]
shortestPath= TX->AK->TN->KY->WV->PA->NY->MA->NH->ME
