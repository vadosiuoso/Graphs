public class Graph {
    private int maxN = 10;
    private int[][] mas;
    Vertex[] vertexList;
    private int curN;
    private MyStack stack = new MyStack();

    public Graph() {
        vertexList = new Vertex[maxN];
        mas = new int[maxN][maxN];
        curN = 0;
    }

    public void addVertex(char name){
        vertexList[curN++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int value){
        mas[start][end] = 1;
        mas[end][start] = value;
    }

    public int check(int v){
        for (int i = 0; i < curN; i++) {
            if(mas[v][i]  == 1 && !vertexList[i].isVisited){
                return i;
            }
        }
        return -1;
    }

    public void passInDeep(int index){
        System.out.println(vertexList[index].name);
        vertexList[index].isVisited  = true;
        stack.push(index);

        while (!stack.isEmpty()){
            int neigh = check(stack.peek());

            if(neigh == -1){
                neigh = stack.pop();
            }else {
                System.out.println(vertexList[neigh].name);
                vertexList[neigh].isVisited = true;
                stack.push(neigh);
            }

        }

        for (int i = 0; i < curN; i++) {
            vertexList[i].isVisited = false;
            
        }
    }
}
