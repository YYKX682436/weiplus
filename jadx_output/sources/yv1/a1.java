package yv1;

/* loaded from: classes12.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv1.b1 f465992d;

    public a1(yv1.b1 b1Var) {
        this.f465992d = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (mt1.b0.f331191a.A()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanService", "tryCreateThirdIndex done");
            yv1.b1 b1Var = this.f465992d;
            if (b1Var.Ui() && b1Var.Vi()) {
                yv1.m0 m0Var = yv1.b1.f465997e;
                ((com.tencent.mm.sdk.event.IListener) ((jz5.n) yv1.b1.f465999g).getValue()).dead();
            }
        }
    }
}
