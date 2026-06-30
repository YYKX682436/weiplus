package oc5;

/* loaded from: classes3.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc5.g0 f344382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f344383e;

    public a0(oc5.g0 g0Var, long j17) {
        this.f344382d = g0Var;
        this.f344383e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oc5.g0 g0Var = this.f344382d;
        java.lang.Long l17 = g0Var.f344425i;
        if (l17 == null) {
            return;
        }
        long longValue = l17.longValue();
        long j17 = this.f344383e;
        if (longValue != j17) {
            return;
        }
        g0Var.f344426j = java.lang.System.currentTimeMillis();
        g0Var.f344427k = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageScanCodeManager", "onBottomSheetShowAnimationEnd id: " + j17 + ", isCodeItemVisible: " + g0Var.f344428l);
        if (g0Var.f344428l) {
            g0Var.f344429m = 0L;
            g0Var.g(j17, "bottomSheetShowEnd");
        }
    }
}
