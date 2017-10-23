package shape2;


	import java.util.ArrayList;
import java.util.HashMap;
    import java.util.List;
	import java.util.Map;


	class Node{
		private int id;
		private String name;
		public Node(int id,String name) {
			this.id=id;
			this.name=name;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return name;
		}
		public void setId(int id) {
			this.id=id;
		}
		public void setString(String name) {
			this.name=name;
		}
	}

	public class DirectedGraph {
		private Map<Node,List<Node>> ParentGraph=new HashMap<Node,List<Node>>();
		private Map<Node,List<Node>> ChildGraph=new HashMap<Node,List<Node>>();
		private Map<Node,List<String>> label=new HashMap<Node,List<String>>();
		public void addNode(Node n) {
			if(!ParentGraph.containsKey(n)&&!ChildGraph.containsKey(n)) {
				ParentGraph.put(n,new ArrayList<Node>());
				ChildGraph.put(n,new ArrayList<Node>());
				label.put(n, new  ArrayList<String>());
			}
			else {
				System.out.println("exist");
			}
			}

	public void addNeighbor(Node parent,Node neighbor){
		if(ParentGraph.containsKey(parent)) {
			List<Node> n=ParentGraph.get(parent);
			n.add(neighbor);	
		}
	}
	public void addNeighbor2(Node child,Node neighbor){
		if(ChildGraph.containsKey(child)) {
			List<Node> n=ChildGraph.get(child);
			n.add(neighbor);	
		}
	}

	public void addNeighborlist1(Node parent,List<Node> nList){
		if(ParentGraph.containsKey(parent)) {
			ParentGraph.put(parent,nList);
		}
	}
	public void addNeighborlist2(Node child,List<Node> nList){
		if(ChildGraph.containsKey(child)) {
			ChildGraph.put(child,nList);
		}
	}
	public List<Node> getNeighborNode(Node n){
		List<Node> L=new ArrayList<Node>();
		L.addAll(ParentGraph.get(n));
		L.addAll(ChildGraph.get(n));
		return L;
	}
	public void deleteNeighbor(Node parent,Node n) {
		List<Node> m=ParentGraph.get(parent);
		m.remove(n);
	}
	public void deleteNeighbor2(Node child,Node n) {
		List<Node> m=ChildGraph.get(child);
		m.remove(n);
	}
}
