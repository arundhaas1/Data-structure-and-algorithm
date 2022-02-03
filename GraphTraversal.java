        //Breadth first search

 public void bfs(int vertix){
        int vertixSize=adjList.size();
        boolean [] visited=new boolean[vertixSize];
        visited [vertix]=true;

        Queue<Integer> queue=new LinkedList<>();
        queue.add(vertix);

        while (queue.size()!=0){
            //dequeue
            int vertex= queue.remove();
            System.out.print(vertex+" ");
            for (int i=0;i<adjList.get(vertex).size();i++){
                int av=adjList.get(vertex).get(i);

                if(!visited[av]){
                    queue.add(av);
                    visited[av]=true;
                }
            }
        }
    }

----------------------------------------------------------------------------------------------------------------------
  
          //Depth first search
  
  
    public void dfs(int vertix){
        int vertixSize=adjList.size();
        boolean [] visited=new boolean[vertixSize];

        dfs(vertix,visited);   //using method overloading
    }

    public void dfs(int vertix,boolean[] visited){
        visited[vertix]=true;
        System.out.print(vertix+" ");

        for (int i=0;i<adjList.get(vertix).size();i++){
            int av=adjList.get(vertix).get(i);
            if(!visited[av]){
                dfs(av,visited);
                visited[av]=true;
            }
        }

    }
