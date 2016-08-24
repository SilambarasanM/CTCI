#Kahn's Algorithm
import sys
n, m = map(int,raw_input().strip().split(' '))
edges = []
S = range(1,n+1)
incoming = {}
outgoing = {}
for i in range(n):
    outgoing[S[i]] = []
    incoming[S[i]] = []
    
for i in range(m):
    a,b = map(int,raw_input().strip().split(' '))
    if b in S:
        S.remove(b)
    outgoing[a].append(b)
    incoming[b].append(a)
    edges.append((a,b))
p = map(int,raw_input().strip().split(' '))
L = []
print 'Edges', edges
print 'S', S
print 'Incoming',incoming
print 'Outgoing', outgoing
while S:
    b = S.pop(-1)
    print 'Visiting', b
    L.append(b)
    print 'L',L
    sinks = [val for val in outgoing[b]]
    print 'Sinks',sinks
    while sinks:
        node = sinks.pop(0)
        print 'Current Outgoing', node
        print 'removing (', b,',',node,') from edges'
        edges.remove((b,node))
        print 'removing', node,'from outgoing[',b,']'
        outgoing[b].remove(node)
        print 'removing', b,'from incoming[',node,']'
        incoming[node].remove(b)
        if not incoming[node]:
            S.append(node)
        print 'Incoming',incoming
        print 'outgoing', outgoing

if edges:
    print -1
else:
    print L