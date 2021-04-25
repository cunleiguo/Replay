package com.clguo.linear.impl;

import com.clguo.linear.LineList;

import java.util.Arrays;

/**
 * 使用数组实现线性表
 * @param <T>
 */
public class ArrayLineList<T> implements LineList<T> {


    /**
     * 空数组
     */
    private static Object[] EMPTY_ELEMENT_ARRAY = {};

    /**
     * 定义数组保存元素
     */
    private Object[] elementArray;

    /**
     * 定义默认的数组长度
     */
    private int DEFAULT_CAPACITY = 6;

    /**
     * 数组的长度
     */
    private int capacity;

    /**
     * 元素的个数
     */
    private int size = 0;

    public ArrayLineList () {
        elementArray = EMPTY_ELEMENT_ARRAY;
    }

    public ArrayLineList (boolean defaultEle) {
        if (defaultEle) {
            capacity = DEFAULT_CAPACITY;
            elementArray = new Object[capacity];
        } else {
            elementArray = EMPTY_ELEMENT_ARRAY;
        }

    }

    public ArrayLineList (int length) {
        if (length < 0) {
            elementArray = EMPTY_ELEMENT_ARRAY;
        } else if (length > 0) {
            capacity = length;
            elementArray = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    length);
        }
    }



    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        if(index<0 || index > size){
            throw new IndexOutOfBoundsException("数组越界异常");
        }
        return (T)elementArray[index];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 线性表的末尾添加元素
     * @param t
     * @return
     */
    @Override
    public boolean add(T t) {
        // 判断是否越界
        return false;
    }

    @Override
    public boolean insert(int index, T t) {
        // 确定是否越界了
        ensureCapacity((index + 1));


        return false;
    }

    @Override
    public boolean remove(int i) {
        return false;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public void display() {

    }

    /**
     * 判断是否需要扩容
     */
    public void ensureCapacity(int minCapacity) {
        if (minCapacity > size) {

            System.out.println("新加的数据下标为：" + minCapacity + ", 大于数组的总长度" + size + "， 需扩容");
            // 开始扩容
            size = minCapacity + 3;
            // 将旧数组里的元素添加进新数组
            elementArray = Arrays.copyOf(elementArray, size);
        }
    }
}
