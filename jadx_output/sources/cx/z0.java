package cx;

/* loaded from: classes7.dex */
public final class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cx.j1 f224491d;

    public z0(cx.j1 j1Var) {
        this.f224491d = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String pj6;
        yw.w1 w1Var = yw.w1.f466487a;
        boolean z17 = yw.w1.f466489c;
        cx.j1 j1Var = this.f224491d;
        pj6 = j1Var.pj();
        com.tencent.mars.xlog.Log.i(pj6, "onEnterBackground biz flutter isDestroyed:" + z17);
        if (z17) {
            j1Var.K6(2);
        }
    }
}
