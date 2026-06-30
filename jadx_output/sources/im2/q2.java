package im2;

/* loaded from: classes3.dex */
public final class q2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d32 f292504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292505e;

    public q2(int i17, r45.d32 d32Var, int i18, im2.z3 z3Var) {
        this.f292504d = d32Var;
        this.f292505e = z3Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        im2.z3 z3Var = this.f292505e;
        if (itemId == 0) {
            r45.d32 d32Var = this.f292504d;
            if (d32Var != null) {
                z3Var.n7(d32Var);
                return;
            }
            return;
        }
        if (itemId == 1) {
            z3Var.Z6().getDetailView().setText((java.lang.CharSequence) null);
            z3Var.f292672z1 = null;
        }
    }
}
