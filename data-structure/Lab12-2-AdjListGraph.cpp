#include "Lab12-2-AdjListGraph.h"

void main() {
	AdjListGraph g;

	for (int i = 0; i < 4; i++) g.insertVertex('A' + i);
	g.insertEdge(0, 1);
	g.insertEdge(0, 3);
	g.insertEdge(1, 2);
	g.insertEdge(1, 3);
	g.insertEdge(2, 3);
	printf("인접리스트로 표현한 그래프\n");
	g.display();
}