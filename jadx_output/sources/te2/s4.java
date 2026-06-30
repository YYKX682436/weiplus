package te2;

/* loaded from: classes3.dex */
public final class s4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f418400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418401e;

    public s4(com.tencent.mm.ui.widget.dialog.k0 k0Var, te2.p8 p8Var) {
        this.f418400d = k0Var;
        this.f418401e = p8Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 3) {
            te2.p8 p8Var = this.f418401e;
            if (p8Var.A1.f418390a) {
                ml2.c3[] c3VarArr = ml2.c3.f327331d;
                p8Var.o7(5);
            } else {
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.y2 y2Var = ml2.y2.f328257m;
                cl0.g gVar = new cl0.g();
                gVar.o("style_id", p8Var.f418329x0);
                java.lang.String str2 = p8Var.f418333y1;
                gVar.o("is_pic", ((str2 == null || str2.length() == 0) ? 1 : 0) ^ 1);
                java.lang.String gVar2 = gVar.toString();
                r45.h32 h32Var = p8Var.A1.f418391b;
                if (h32Var == null || (str = h32Var.getString(3)) == null) {
                    str = "";
                }
                zy2.zb.qg(zbVar, y2Var, gVar2, str, null, 8, null);
            }
            pf5.e.launchUI$default(p8Var, null, null, new te2.o4(p8Var, null), 3, null);
        }
        this.f418400d.u();
    }
}
