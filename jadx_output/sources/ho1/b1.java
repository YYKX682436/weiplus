package ho1;

/* loaded from: classes7.dex */
public final class b1 implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f282630d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f282631e;

    public b1(java.lang.String prefix) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        this.f282630d = prefix;
        this.f282631e = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        return new java.lang.Thread(r17, this.f282630d + '-' + this.f282631e.incrementAndGet());
    }
}
