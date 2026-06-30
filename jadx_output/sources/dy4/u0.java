package dy4;

/* loaded from: classes15.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy4.f1 f244708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f244709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f244710f;

    public u0(dy4.f1 f1Var, int i17, int i18) {
        this.f244708d = f1Var;
        this.f244709e = i17;
        this.f244710f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dy4.f1 f1Var = this.f244708d;
        int i17 = this.f244709e;
        int i18 = this.f244710f;
        if (!f1Var.I) {
            com.tencent.mars.xlog.Log.i(f1Var.x(), "onMediaPlayerError, mp released");
            return;
        }
        com.tencent.mars.xlog.Log.i(f1Var.x(), "onError, what:%d, extra:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        dg.d dVar = f1Var.V;
        if (dVar != null) {
            ((dy4.m) dVar).a(i17, i18);
        }
    }
}
