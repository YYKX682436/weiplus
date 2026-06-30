package hw;

/* loaded from: classes7.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f285385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285386e;

    public i0(hw.o0 o0Var, java.lang.String str) {
        this.f285385d = o0Var;
        this.f285386e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.String ij6;
        hw.o0 o0Var = this.f285385d;
        hw.c0 c0Var = o0Var.f285409e;
        if (c0Var != null) {
            com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent onBrandServiceEvent = new com.tencent.mm.feature.brandservice.flutter.magicbrush.jsapi.event.OnBrandServiceEvent();
            c0Var.G1(onBrandServiceEvent.f147881d, this.f285386e);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ij6 = o0Var.ij();
            com.tencent.mars.xlog.Log.w(ij6, "brandServiceBiz is null!");
        }
    }
}
