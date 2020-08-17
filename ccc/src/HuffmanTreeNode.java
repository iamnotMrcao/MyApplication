
public class HuffmanTreeNode implements Comparable<HuffmanTreeNode>{

	 /**
     * ������
     */
    private Byte data;
 
    /**
     * ���Ȩֵ
     */
    private Integer weight;
 
    /**
     * ���ӽڵ�
     */
    private HuffmanTreeNode left;
 
    /**
     * ���ӽڵ�
     */
    private HuffmanTreeNode right;
 
    public Integer getWeight() {
        return weight;
    }
 
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
 
    public HuffmanTreeNode getLeft() {
        return left;
    }
 
    public void setLeft(HuffmanTreeNode left) {
        this.left = left;
    }
 
    public HuffmanTreeNode getRight() {
        return right;
    }
 
    public void setRight(HuffmanTreeNode right) {
        this.right = right;
    }
 
    public Byte getData() {
        return data;
    }
 
    public void setData(Byte data) {
        this.data = data;
    }
 
    public HuffmanTreeNode(Integer value) {
        weight = value;
    }
 
    public HuffmanTreeNode(Byte data, Integer value) {
        this.weight = value;
        this.data = data;
    }
 
    @Override
    public String toString() {
        return "Node[" +
                "data=" + (data == null ? null : (char) data.byteValue()) +
                ", weight=" + weight +
                ']';
    }
 
    /**
     * ��дComparable�ӿڣ��ȽϽ��ؼ��ֵĴ�С
     *
     * @param node
     * @descriptions:
     *   (1) ��д��compareTo��ϵ��Collections.sort()�������
     *   (2) ��Ϊ����ǰ�������� - ����������ԡ�����Ϊ����
     *   (3) ��Ϊ������������� - ��ǰ�������ԡ�����Ϊ����
     * @return
     */
    public int compareTo(HuffmanTreeNode node) {
        return this.weight - node.weight;
    }
 
 
    /**
     * �������
     */
    public void preOrder() {
        // ���ʵ�ǰ���
        System.out.println(this.toString());
        // ����������
        if (this.getLeft() != null) {
            this.getLeft().preOrder();
        }
        // ����������
        if (this.getRight() != null) {
            this.getRight().preOrder();
        }
    }

}
