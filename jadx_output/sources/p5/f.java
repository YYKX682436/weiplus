package p5;

/* loaded from: classes13.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final p5.f f351971c = new p5.f();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f351972a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.Executor f351973b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.concurrent.ExecutorService] */
    public f() {
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor;
        java.lang.String property = java.lang.System.getProperty("java.runtime.name");
        if (property == null ? false : property.toLowerCase(java.util.Locale.US).contains(com.eclipsesource.mmv8.Platform.ANDROID)) {
            p5.c cVar = p5.c.f351966b;
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor2 = new java.util.concurrent.ThreadPoolExecutor(p5.c.f351967c, p5.c.f351968d, 1L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.LinkedBlockingQueue());
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            threadPoolExecutor = threadPoolExecutor2;
        } else {
            threadPoolExecutor = java.util.concurrent.Executors.newCachedThreadPool();
        }
        this.f351972a = threadPoolExecutor;
        java.util.concurrent.Executors.newSingleThreadScheduledExecutor();
        this.f351973b = new p5.e(null);
    }
}
