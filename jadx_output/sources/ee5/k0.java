package ee5;

/* loaded from: classes9.dex */
public final class k0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f251942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.n0 f251943e;

    public k0(ae5.g gVar, ee5.n0 n0Var) {
        this.f251942d = gVar;
        this.f251943e = n0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        ae5.g gVar = this.f251942d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(gVar.f4405i, gVar.f4400d);
        int itemId = menuItem.getItemId();
        ee5.n0 n0Var = this.f251943e;
        n0Var.T6(itemId, n17, n0Var.f252056o);
    }
}
