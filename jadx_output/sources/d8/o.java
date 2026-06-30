package d8;

/* loaded from: classes7.dex */
public enum o {
    INSTANCE;


    /* renamed from: g, reason: collision with root package name */
    public static final int f226912g = java.lang.Runtime.getRuntime().availableProcessors() + 1;

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f226914d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f226915e;

    o() {
        this.f226914d = null;
        this.f226915e = null;
        int max = java.lang.Math.max(f226912g, 5);
        int max2 = java.lang.Math.max(max / 2, 4);
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.MILLISECONDS;
        this.f226914d = new java.util.concurrent.ThreadPoolExecutor(1, max2, 500L, timeUnit, new java.util.concurrent.LinkedBlockingQueue(), new d8.m(this));
        this.f226915e = new java.util.concurrent.ThreadPoolExecutor(max - 1, max, 500L, timeUnit, new java.util.concurrent.LinkedBlockingQueue(), new d8.n(this));
    }
}
