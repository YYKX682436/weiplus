package ee5;

/* loaded from: classes9.dex */
public final class a1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f251812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.d1 f251813e;

    public a1(ae5.g gVar, ee5.d1 d1Var) {
        this.f251812d = gVar;
        this.f251813e = d1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        ae5.g gVar = this.f251812d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(gVar.f4405i, gVar.f4400d);
        int itemId = menuItem.getItemId();
        ee5.d1 d1Var = this.f251813e;
        d1Var.T6(itemId, n17, d1Var.f252056o);
    }
}
