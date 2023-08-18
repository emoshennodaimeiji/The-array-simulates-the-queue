package edu.zut.cn.queue;

public class ArrayQueue {
    int[] array;
    int maxArray;//定义队列长度
    int first;//头指针
    int rear;//尾指针

    public ArrayQueue(int maxArray) {
        this.maxArray = maxArray;
        array = new int[maxArray];
        first = -1;
        rear = -1;
    }

    public boolean isFull(){//若队列已满，返回true
        return rear == maxArray-1;
    }
    public boolean isEmpty(){//若队列为空，返回true
        return first == rear;
    }

    public void add(int n){//向队列加入数据
        if(isFull()){
            System.out.println("队列已满");
            return;
        }
        rear++;
        array[rear] = n;
    }
    public int get(){//从队列中取数据
        if(isEmpty()){
            System.out.println("队列为空");
            return 0;
        }
        int temp = array[0];//拿到队首数据
        int length = array.length;
        for(int i = 0;i<length-1;i++){//将队列中数据全部前移一位
            array[i] = array[i+1];
        }
        array[length-1] = 0;
        rear--;
        return temp;
    }

    public void printf(){//打印队列全部数据
        if(isEmpty()){
            System.out.println("队列为空");
            return;
        }
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}





















