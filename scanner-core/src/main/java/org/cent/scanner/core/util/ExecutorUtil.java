package org.cent.scanner.core.util;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: cent
 * @email: chenzhao@viomi.com.cn
 * @date: 2019/1/11.
 * @description: 线程池工具类
 */
public enum ExecutorUtil {
    ;
    /**
     * 线程池
     */
    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(8,
            16,
            3,
            TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(10000));

    /**
     * 在线程池执行线程
     *
     * @param thread
     */
    public static void executeInPool(Thread thread) {
        executor.execute(thread);
    }
}
