package km1;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km1.s f309025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f309026e;

    public r(km1.s sVar, int i17) {
        this.f309025d = sVar;
        this.f309026e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km1.s sVar = this.f309025d;
        java.util.concurrent.atomic.AtomicInteger atomicInteger = sVar.f309045y;
        int i17 = this.f309026e;
        if (atomicInteger.compareAndSet(i17, 0)) {
            com.tencent.mars.xlog.Log.i(sVar.f309029f, "stopCustomVideoCaptureIfNeed, release the existBuffer");
            com.tencent.mm.plugin.appbrand.jsruntime.h0 r17 = sVar.r();
            if (r17 != null) {
                ((com.tencent.mm.plugin.appbrand.jsruntime.n) r17).a0(i17);
            }
        }
    }
}
