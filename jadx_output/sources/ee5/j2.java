package ee5;

/* loaded from: classes9.dex */
public final class j2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.g f251937d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.m2 f251938e;

    public j2(ae5.g gVar, ee5.m2 m2Var) {
        this.f251937d = gVar;
        this.f251938e = m2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        pt0.e0 e0Var = pt0.f0.f358209b1;
        ae5.g gVar = this.f251937d;
        com.tencent.mm.storage.f9 n17 = e0Var.n(gVar.f4405i, gVar.f4400d);
        int itemId = menuItem.getItemId();
        ee5.m2 m2Var = this.f251938e;
        m2Var.T6(itemId, n17, m2Var.f252056o);
    }
}
