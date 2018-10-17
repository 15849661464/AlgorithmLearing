public class SelectionSortData {

    // 定义了选择排序数据的数组
    private int[] numbers;

    public int orderedIndex = -1; //[0.......orderedIndex] 是有顺序的，要用黄色绘制

    public int currentMinIndex = -1; //当前找到最小元素的索引

    public int currentCompareIndex = -1; //当前正在比较元素索引


    // 随机生成一维数组中N个数据
    public SelectionSortData(int N, int randomBound){

        numbers = new int[N];

        for( int i = 0 ; i < N ; i ++)
            numbers[i] = (int)(Math.random()*randomBound) + 1;
    }

    // 获取数组的长度
    public int N(){
        return numbers.length;
    }

    //获取指定下标的数据
    public int get(int index){
        if( index < 0 || index >= numbers.length)
            throw new IllegalArgumentException("Invalid index to access Sort Data.");

        return numbers[index];
    }

    //交换两个数字的值
    public void swap(int i, int j) {

        if( i < 0 || i >= numbers.length || j < 0 || j >= numbers.length)
            throw new IllegalArgumentException("Invalid index to access Sort Data.");

        int t = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = t;
    }
}
