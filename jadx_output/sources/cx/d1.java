package cx;

/* loaded from: classes7.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f224394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f224395e;

    public d1(cx.j1 j1Var, java.lang.String str) {
        this.f224394d = j1Var;
        this.f224395e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.String pj6;
        cx.j1 j1Var = this.f224394d;
        cx.w0 w0Var = j1Var.f224422e;
        if (w0Var != null) {
            com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent onBrandServiceEvent = new com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent();
            w0Var.G1(onBrandServiceEvent.f147881d, this.f224395e);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pj6 = j1Var.pj();
            com.tencent.mars.xlog.Log.w(pj6, "brandServiceBiz is null!");
        }
    }
}
