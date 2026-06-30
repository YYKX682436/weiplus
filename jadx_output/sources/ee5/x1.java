package ee5;

/* loaded from: classes9.dex */
public final class x1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f252086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.a2 f252087e;

    public x1(ae5.g gVar, ee5.a2 a2Var) {
        this.f252086d = gVar;
        this.f252087e = a2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        ae5.g gVar = this.f252086d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(gVar.f4405i, gVar.f4400d);
        int itemId = menuItem.getItemId();
        ee5.a2 a2Var = this.f252087e;
        a2Var.T6(itemId, n17, a2Var.f252056o);
    }
}
