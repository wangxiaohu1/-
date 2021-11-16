package test;

/**
 * 泛型类：
 *   1.声明方式：声明类的同时声明泛型类型，使用 public class 类名<T>来定义，其中T就是泛型类型，相当于T是一个形参
 *
 *   2. 泛型T类型在整个Worker类中都可以使用
 *      1.方法的返回值可以是使用声明的泛型类型
 *      2.方法的参数也可以是声明类的泛型类型
 *      3.方法体内可以使用泛型类型
 *      4.静态方法不能使用泛型类上定义的泛型类型
 *
 * @author wangxiaohu
 * @version Id: Worker.java, v0.1 2021年11月13日 22:12:26 wangxiaohu Exp $
 */
public class Worker<T> {
    /**
     * 泛型用在成员变量上面
     */
    private T param;

    public T get(Long id){
        return null;
    }

    public void update(T vo){

    }

    public void build(){
        T value = null;
    }

    public static <W> void say(W w){
    }
}
