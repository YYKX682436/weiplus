package ry4;

/* loaded from: classes.dex */
public final class a1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401577d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f401578e;

    public a1(ry4.d1 d1Var, int i17) {
        this.f401577d = d1Var;
        this.f401578e = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            ry4.d1 d1Var = this.f401577d;
            int i18 = this.f401578e;
            if (i18 < 0) {
                d1Var.getClass();
            } else {
                if (i18 >= ((java.util.ArrayList) d1Var.f401610f).size()) {
                    return;
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) d1Var.getActivity(), 1, false);
                k0Var.f211872n = new ry4.m0(d1Var);
                k0Var.f211881s = new ry4.n0(d1Var, i18);
                k0Var.v();
            }
        }
    }
}
