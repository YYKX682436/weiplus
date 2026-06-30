package pu5;

/* loaded from: classes12.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f358469d;

    public c(java.lang.Runnable runnable) {
        this.f358469d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f358469d.run();
        ku5.o.f312598b.b(java.lang.Thread.currentThread(), java.lang.Thread.currentThread().getName(), java.lang.Thread.currentThread().getId());
    }
}
