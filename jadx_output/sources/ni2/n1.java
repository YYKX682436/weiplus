package ni2;

/* loaded from: classes10.dex */
public final class n1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.r1 f337389d;

    public n1(ni2.r1 r1Var) {
        this.f337389d = r1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        ni2.r1 r1Var = this.f337389d;
        if (itemId == 1) {
            ((ni2.f1) ((jz5.n) r1Var.f337457g).getValue()).B(r1Var.f337454d, r1Var.f337455e);
        } else {
            if (itemId != 2) {
                return;
            }
            ((nj2.b) ((jz5.n) r1Var.f337458h).getValue()).w();
        }
    }
}
