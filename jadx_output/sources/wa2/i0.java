package wa2;

/* loaded from: classes3.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wa2.n0 f444128d;

    public i0(wa2.n0 n0Var) {
        this.f444128d = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa2.n0 n0Var = this.f444128d;
        com.tencent.mm.view.HeadFooterLayout a17 = n0Var.a(n0Var);
        com.tencent.mm.view.refreshLayout.WxRefreshLayout b17 = n0Var.b(n0Var);
        if (a17 == null && b17 == null) {
            return;
        }
        if ((a17 != null ? a17.getOverCallback() : null) == null) {
            if ((b17 != null ? b17.getOverScrollCallback() : null) != null) {
                return;
            }
            wa2.h0 h0Var = new wa2.h0(n0Var);
            if (b17 != null) {
                b17.setOverScrollCallback(new wa2.g0(h0Var));
            }
            if (a17 == null) {
                return;
            }
            a17.setOverCallback(h0Var);
        }
    }
}
