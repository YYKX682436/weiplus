package pu5;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f358468d;

    public a(java.lang.Runnable runnable) {
        this.f358468d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f358468d.run();
        ku5.o.f312598b.b(java.lang.Thread.currentThread(), java.lang.Thread.currentThread().getName(), java.lang.Thread.currentThread().getId());
    }
}
