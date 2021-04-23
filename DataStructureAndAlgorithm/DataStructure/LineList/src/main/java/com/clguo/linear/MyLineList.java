package com.clguo.linear;

public interface MyLineList<T> {

    /**
     * 线性表的长度
     * @return
     */
    int length();

    /**
     * 获取i位置的元素
     * @param i
     * @return
     */
    T get(int i);

    boolean isEmpty();


}
