package com.clguo.linear;

public interface LineList<T> {

    /**
     * 线性表的长度
     * @return
     */
    int size();

    /**
     * 获取i位置的元素
     * @param i
     * @return
     */
    T get(int i);

    /**
     * 判断是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 添加元素
     */
    boolean add(T t);

    /**
     * 像线性表中插入一个元素
     * @param i
     * @return
     */
    boolean insert(int i, T t);

    /**
     * 删除元素
     */
    boolean remove(int i);

    /**
     * 返回线性表中首次出现的索引
     * @param t
     * @return
     */
    int indexOf(T t);

    /**
     * 展示线性表中的数据
     */
    void display();
}
