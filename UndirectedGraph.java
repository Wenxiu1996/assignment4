package shape1;

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
class UndirectedGraph{
	private Map<Node,List<Node>> graph=new HashMap<Node,List<Node>>();
	
	public void addNode(Node n) {
	if(!graph.containsKey(n)) {
		graph.put(n,new ArrayList<Node>());
	}
	else {
		System.out.println("exist");
	}
	}
	
	public void addNeighbor(Node parent,Node neighbor){
		if(graph.containsKey(parent)) {
			List<Node> n=graph.get(parent);
			n.add(neighbor);
			List<Node> m=graph.get(neighbor);
			m.add(parent);
		}
		
	}

	public void addNeighborlist(Node parent,List<Node> nList){
		if(graph.containsKey(parent)) {
			graph.put(parent,nList);
		}
	}
	
	public List<Node> getNeighborNode(Node n){
		return graph.get(n);
	}
	
	public void deleteNeighbor(Node parent,Node n) {
		List<Node> m=graph.get(parent);
		m.remove(n);
	}
}
