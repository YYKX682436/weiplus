package ee5;

/* loaded from: classes9.dex */
public final class e2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f251866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee5.h2 f251867e;

    public e2(com.tencent.mm.storage.f9 f9Var, ee5.h2 h2Var) {
        this.f251866d = f9Var;
        this.f251867e = h2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.storage.f9 f9Var = this.f251866d;
        if (f9Var != null) {
            int itemId = menuItem.getItemId();
            ee5.h2 h2Var = this.f251867e;
            h2Var.T6(itemId, f9Var, h2Var.f252056o);
        }
    }
}
