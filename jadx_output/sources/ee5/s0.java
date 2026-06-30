package ee5;

/* loaded from: classes9.dex */
public final class s0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f252040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.v0 f252041e;

    public s0(ae5.g gVar, ee5.v0 v0Var) {
        this.f252040d = gVar;
        this.f252041e = v0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        ae5.g gVar = this.f252040d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(gVar.f4405i, gVar.f4400d);
        int itemId = menuItem.getItemId();
        ee5.v0 v0Var = this.f252041e;
        v0Var.T6(itemId, n17, v0Var.f252056o);
    }
}
