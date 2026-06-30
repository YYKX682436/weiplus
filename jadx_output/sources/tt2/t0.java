package tt2;

/* loaded from: classes3.dex */
public final class t0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f421996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f421997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f421998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f421999g;

    public t0(tt2.e1 e1Var, ut2.s3 s3Var, int i17, cm2.m0 m0Var) {
        this.f421996d = e1Var;
        this.f421997e = s3Var;
        this.f421998f = i17;
        this.f421999g = m0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        cm2.m0 m0Var = this.f421999g;
        tt2.e1 e1Var = this.f421996d;
        if (itemId == 1) {
            tt2.e1.X(this.f421996d, this.f421997e, this.f421998f, 1, 0, 2, null, 32, null);
            tt2.e1.I(e1Var, m0Var, 1);
        } else if (menuItem.getItemId() == 2) {
            tt2.e1.X(this.f421996d, this.f421997e, this.f421998f, 1, 1, 2, null, 32, null);
            tt2.e1.I(e1Var, m0Var, 2);
        }
    }
}
