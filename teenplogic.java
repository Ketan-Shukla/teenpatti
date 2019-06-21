import java.util.Arrays;

public class player extends gameObject
{
    public static  int currentID = 0;
    public int ID;
    public int precedence;
    public int sum;
    public int[] cards = new int[3];
    public player(int arr[])
    {
        ID = currentID++;
        cards = arr;
        precedence = 0;
    }

    public void pureSequence(int arr[])
    {
        Arrays.sort(arr);
        if(arr[0]+1==arr[1] && arr[0]+2==arr[2])
        {
            precedence = 2;
            sum = arr[0]+arr[1]+arr[2];
        }
        else if(arr[0]+1 == arr[1] || arr[1]+1 == arr[2] )
        {
            precedence = 4;
            sum = arr[0]+arr[1]+arr[2];

        }

    }


    public int gameLogic(int arr[])
    {
        int result=0;
        if(((arr[0]>=0 && arr[0] <=12) && (arr[1]>=0 && arr[1] <=12) &&(arr[2]>=0 && arr[2] <=12) )||
                ((arr[0]>=13 && arr[0] <=25) && (arr[1]>=13 && arr[1] <=25) &&(arr[2]>=13 && arr[2] <=25 )) ||
                ((arr[0]>=26 && arr[0] <=38) && (arr[1]>=26 && arr[1] <=38) &&(arr[2]>=26 && arr[2] <=38 )) ||
                ((arr[0]>=39 && arr[0] <=51) && (arr[1]>=39 && arr[1] <=52) &&(arr[2]>=39 && arr[2] <=51 )))
        {
            pureSequence(arr);
        }
        return result;
    }



}
