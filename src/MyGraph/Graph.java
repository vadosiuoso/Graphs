package MyGraph;

public class Graph {
    private int maxN = 10;
    private int[][] mas;
    Vertex[] list;
    private int curN;
    private MyStack stack = new MyStack();

    public Graph() {
        list = new Vertex[maxN];
        mas = new int[maxN][maxN];
        curN = 0;
    }

    public void addVertex(String name){
        list[curN++] = new Vertex(name);
    }

    public void addEdge(int start, int end){
        mas[start][end] = 1;
        mas[end][start] = 1;
    }
    
    public int check(int v){
        for (int i = 0; i < curN; i++) {
            if(mas[v][i] == 1 && list[i].isVisited == false)
            return i;
        }
        return -1;
    }

    public void passInDeep(int index){
        System.out.println(list[index].name);
        list[index].isVisited = true;
        stack.push(index);

        while (!stack.isEmpty()){
            int neigh = check(stack.peek());

            if(neigh == -1){
                neigh = stack.pop();
            }else {
                System.out.println(list[neigh].name);
                list[neigh].isVisited = true;
                stack.push(neigh);
            }
        }
    }

}
