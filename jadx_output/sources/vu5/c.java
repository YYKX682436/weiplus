package vu5;

/* loaded from: classes12.dex */
public class c implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f440346d = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vu5.f f440347e;

    public c(vu5.f fVar) {
        this.f440347e = fVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ColdPool#");
        this.f440347e.getClass();
        sb6.append(this.f440346d.getAndIncrement());
        java.lang.String sb7 = sb6.toString();
        int i17 = pu5.h.f358472b;
        pu5.d dVar = new pu5.d(new pu5.c(runnable), "[GT]" + sb7);
        dVar.setPriority(5);
        return dVar;
    }
}
