package ni2;

/* loaded from: classes10.dex */
public final class g2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.k2 f337304d;

    public g2(ni2.k2 k2Var) {
        this.f337304d = k2Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        km2.q qVar;
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        ni2.k2 k2Var = this.f337304d;
        if (itemId != 1) {
            if (itemId != 4) {
                return;
            }
            k2Var.a();
            return;
        }
        fj2.s sVar = fj2.s.f263183a;
        ml2.w4 w4Var = ml2.w4.f328191i;
        xh2.a aVar = k2Var.f337362d;
        if (aVar == null || (qVar = aVar.f454520a) == null || (str = qVar.f309172c) == null) {
            str = "";
        }
        fj2.s.h(sVar, w4Var, str, 0, 0, 12, null);
        ((ni2.f1) ((jz5.n) k2Var.f337365g).getValue()).B(k2Var.f337362d, k2Var.f337363e);
    }
}
