package el2;

/* loaded from: classes3.dex */
public final class t implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z42 f253911e;

    public t(el2.i0 i0Var, r45.z42 z42Var) {
        this.f253910d = i0Var;
        this.f253911e = z42Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        el2.i0 i0Var = this.f253910d;
        if (itemId == i0Var.Z) {
            wt2.a aVar = i0Var.I;
            if (aVar != null) {
                wt2.a.x4(aVar, this.f253911e, null, 2, null);
            } else {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
        }
    }
}
