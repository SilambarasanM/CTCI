#Input Format

The first line contains two space-separated integers describing the respective values of  (the number of vertices) and  (the number of directed edges) in the DAG. 
Each of the  subsequent lines contains a pair of space-separated integers,  and , describing a directed edge from vertex  (the first value) to vertex  (the second value). 
The last line contains a permutation of  distinct space-separated positive integers (where each integer is ) denoting topological ordering .

#Sample Input

5 5

1 3

2 3

3 4

2 5

5 4

1 2 5 3 4

#Sample Output

2 1 3 5 4
