package ee5;

/* loaded from: classes9.dex */
public final class f1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f251875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.i1 f251876e;

    public f1(ae5.g gVar, ee5.i1 i1Var) {
        this.f251875d = gVar;
        this.f251876e = i1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        ae5.g gVar = this.f251875d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(gVar.f4405i, gVar.f4400d);
        int itemId = menuItem.getItemId();
        ee5.i1 i1Var = this.f251876e;
        i1Var.T6(itemId, n17, i1Var.f252056o);
    }
}
