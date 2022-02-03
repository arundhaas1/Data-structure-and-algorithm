          //Adjacenct Matrix

package com.dhas;

import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        //to add in Adjacency matrix

        int[][] graph={{1,0,1,0,0},
                       {0,0,0,1,1},
                       {0,1,1,0,1},
                       {0,0,1,0,0},
                       {1,0,0,1,0}
        };

        Graph graph1=new Graph(5);
        graph1.addEgde(1,2);
        graph1.print();
    }
}

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
  
            //Adjacenct List
  
  package com.dhas;
import java.util.ArrayList;
public class Graph {
    ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();

    //to add in Adjacency List

    Graph(int vertices){
        for (int i=0;i<vertices;i++){
            adjList.add(new ArrayList<Integer>());
        }
    }

    public void addEgde(int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void print(){
        for (int i=0;i<adjList.size();i++){
            System.out.println("Adjance list of vertix "+i+" is ");
            for (int j=0;j<adjList.get(i).size();j++){
                    System.out.println(adjList.get(i).get(j)+" ");
            }
        }
    }
}

  
