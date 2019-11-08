package com.cornucopia.algorithms.sort;

/**
 * 二.插入排序
 * 1.插入排序的思路
 *   一个有序的数组，我们往里面插入新的数据后，如何保持有序？我们可以遍历数组，找到数据应该插入的位置插入即可。
 *   这是一个动态排序的过程，对于一组静态数据，也可以借鉴上面讲的插入方法。
 *
 * 2.如何实现插入排序
 *   将数据分为已排序区间和未排序区间。初始已排序的区间只有一个元素，就是数组的第一个元素。插入算法的核心
 *   是取未排序区间中的元素，在已排序区间中找到合适的插入位置将其插入，并保证已排序区间数据一直有序。重复这个过程，直到
 *   未排序区间中元素为空，算法结束。
 *
 * 3.插入排序是原地排序算法吗？
 *   插入的过程只涉及相邻数据的交换操作，只需要常量级的临时空间，所以它的空间复杂度为 O(1)，是一个原地排序算法。
 *
 * 4.插入排序排序是稳定的排序算法吗？
 *   在插入排序中，对于值相同的元素，我们可以选择将后面出现的元素，插入到前面出现元素的后面，这样就可以保持原有的前后顺
 *   序不变，所以插入排序是稳定的排序算法。
 *
 * 5.插入排序的时间复杂度是多少？
 *   如果要排序的数据已经是有序的，我们并不需要搬移任何数据。如果我们从尾到头在有序数据组里面查找插入位置，每次只需要比
 *   较一个数据就能确定插入的位置。所以这种情况下，最好是时间复杂度为 O(n)。注意，这里是从尾到头遍历已经有序的数据。
 *
 *
 *   如果数组是倒序的，每次插入都相当于在数组的第一个位置插入新的数据，所以需要移动大量的数据，所以最坏情况时间复杂度为
 *   O(n^2)。对于插入排序来说，每次插入操作都相当于在数组中插入一个数据，循环执行n次插入操作，平均时间复杂度尾O(n^2)。
 *
 *
 * @author cornucopia
 * @version 1.0
 * @since 2019-11-05
 */
public class InsertionSort implements ISort {

    @Override
    public void sort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value=a[i];
            int j=i-1;
            for(;j>=0;--j){
                if(a[j]>value){
                    a[j+1]=a[j];//数据移动
                }else{
                    break;
                }
            }
            a[j+1]=value;//插入数据
        }
    }
}
