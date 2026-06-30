package df2;

/* loaded from: classes3.dex */
public final class s2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.t2 f231283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f231284e;

    public s2(df2.t2 t2Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f231283d = t2Var;
        this.f231284e = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        df2.t2 t2Var = this.f231283d;
        t2Var.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveMicCenterController", "realHangup");
        android.os.Bundle bundle = new android.os.Bundle();
        km2.q c76 = t2Var.c7();
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", c76 != null ? c76.f309175f : null);
        t2Var.X6(qo0.b.M3, bundle);
        this.f231284e.u();
    }
}
