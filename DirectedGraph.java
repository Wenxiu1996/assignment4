package shape1;


	import java.util.ArrayList;
import java.util.HashMap;
    import java.util.List;
	import java.util.Map;

import javax.xml.soap.Node;


	class Edge{
		private Node end;
		private String label;
		public void edge(Node end,String label) {
			this.end=end;
			this.label=label;
		}
		public Node getEnd() {
			return end;
		}
		public String getlabel() {
			return label;
		}
		public void setEnd(Node end) {
			this.end=end;
		}
		public void setLabel(String label) {
			this.label=label;
		}
	}

	public class DirectedGraph {
		private Map<Node,ArrayList<Edge>> Graph=new HashMap<Node,ArrayList<Edge>>();


		public void addNode(Node n) {
			if(!Graph.containsKey(n)) {
				Graph.put(n,new ArrayList<Edge>());

			}
			else {
				System.out.println("exist");
			}
			}

	public void addEdge(Node parent,Edge neighbor){
		if(Graph.containsKey(parent)) {
			List<Edge> n=Graph.get(parent);
			n.add(neighbor);	
		}
	}


	public void addEdgelist(Node parent,ArrayList<Edge> nList){
		if(Graph.containsKey(parent)) {
			ArrayList<Edge> p=Graph.get(parent);
			for(int i=0;i<nList.size();i++) {
				p.add(nList.get(i));
			}
		}
	}

	public ArrayList<Edge> getEdgeNode(Node n){
		return Graph.get(n);
	}
	public void deleteNeighbor(Node parent,Edge n) {
		List<Edge> m=Graph.get(parent);
		m.remove(n);
	}

}
