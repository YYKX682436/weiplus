package ux0;

/* loaded from: classes14.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f431817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ux0.o f431818e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xr0.j f431819f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f431820g;

    public k(java.util.concurrent.CountDownLatch countDownLatch, ux0.o oVar, xr0.j jVar, pp0.p0 p0Var) {
        this.f431817d = countDownLatch;
        this.f431818e = oVar;
        this.f431819f = jVar;
        this.f431820g = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object m521constructorimpl;
        ux0.o oVar = this.f431818e;
        pp0.p0 p0Var = this.f431820g;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            rs0.h hVar = oVar.f431828g;
            xr0.j jVar = this.f431819f;
            if (hVar != null && !kotlin.jvm.internal.o.b(jVar, oVar.f431836r)) {
                ux0.o.e(oVar);
            }
            oVar.f431836r = jVar;
            oVar.f431827f = p0Var;
            if (oVar.f431828g == null) {
                ux0.o.f(oVar, p0Var, jVar);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("TextureVideoFrameSender", "Failed to init: " + m524exceptionOrNullimpl);
            ux0.o.e(oVar);
        }
        this.f431817d.countDown();
    }
}
