package mt1;

/* loaded from: classes12.dex */
public final class v implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f331269d = new java.util.concurrent.atomic.AtomicInteger();

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r17) {
        kotlin.jvm.internal.o.g(r17, "r");
        java.lang.Thread thread = new java.lang.Thread(r17);
        thread.setName("CalcWx-" + this.f331269d.getAndIncrement());
        return thread;
    }
}
