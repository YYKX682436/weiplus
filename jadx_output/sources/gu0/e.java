package gu0;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f275652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f275653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f275654f;

    public e(hu0.a0 a0Var, int i17, int i18) {
        this.f275652d = a0Var;
        this.f275653e = i17;
        this.f275654f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hu0.a0 a0Var = this.f275652d;
        a0Var.getClass();
        int i17 = this.f275654f;
        if (i17 <= 0) {
            return;
        }
        int i18 = this.f275653e;
        float e17 = e06.p.e(i18 / i17, 0.0f, 1.0f);
        a0Var.f285015n = i17;
        com.tencent.mars.xlog.Log.i("MJCC.RenderUIC", "onEditPanelHeightChanged: currentHeightPx=" + i18 + ", baseHeightPx=" + i17 + ", progress=" + e17 + ", state=" + a0Var.f285014m);
        hu0.p pVar = a0Var.f285014m;
        if (pVar == hu0.p.f285046e) {
            return;
        }
        if (pVar == hu0.p.f285048g) {
            a0Var.Q6();
        }
        a0Var.O6(i17, e17);
    }
}
