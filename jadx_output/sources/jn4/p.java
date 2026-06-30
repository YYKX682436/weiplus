package jn4;

/* loaded from: classes13.dex */
public final class p extends java.util.concurrent.ThreadPoolExecutor {
    public p() {
        super(10, 20, 3000L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.ArrayBlockingQueue(200), new java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy());
    }
}
