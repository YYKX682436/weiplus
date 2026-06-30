package te2;

/* loaded from: classes3.dex */
public final class r4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f418378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f418379e;

    public r4(te2.p8 p8Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f418378d = p8Var;
        this.f418379e = k0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        te2.p8 p8Var = this.f418378d;
        if (valueOf != null && valueOf.intValue() == 0) {
            te2.p8 p8Var2 = this.f418378d;
            pf5.e.launchUI$default(p8Var2, null, null, new te2.x4(p8Var2, null), 3, null);
            if (!p8Var.A1.f418390a) {
                i95.m c17 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.y2 y2Var = ml2.y2.f328259o;
                cl0.g gVar = new cl0.g();
                gVar.o("type", 2);
                gVar.o("style_id", p8Var.f418329x0);
                java.lang.String str = p8Var.f418333y1;
                gVar.o("is_pic", ((str == null || str.length() == 0) ? 1 : 0) ^ 1);
                java.lang.String gVar2 = gVar.toString();
                r45.h32 h32Var = p8Var.A1.f418391b;
                zy2.zb.qg(zbVar, y2Var, gVar2, (h32Var == null || (string2 = h32Var.getString(3)) == null) ? "" : string2, null, 8, null);
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            te2.p8 p8Var3 = this.f418378d;
            pf5.e.launchUI$default(p8Var3, null, null, new te2.y4(p8Var3, null), 3, null);
            if (!p8Var.A1.f418390a) {
                i95.m c18 = i95.n0.c(zy2.zb.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.y2 y2Var2 = ml2.y2.f328259o;
                cl0.g gVar3 = new cl0.g();
                gVar3.o("type", 1);
                gVar3.o("style_id", p8Var.f418329x0);
                java.lang.String str2 = p8Var.f418333y1;
                gVar3.o("is_pic", ((str2 == null || str2.length() == 0) ? 1 : 0) ^ 1);
                java.lang.String gVar4 = gVar3.toString();
                r45.h32 h32Var2 = p8Var.A1.f418391b;
                zy2.zb.qg(zbVar2, y2Var2, gVar4, (h32Var2 == null || (string = h32Var2.getString(3)) == null) ? "" : string, null, 8, null);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            te2.p8 p8Var4 = this.f418378d;
            pf5.e.launchUI$default(p8Var4, null, null, new te2.n4(p8Var4, null), 3, null);
        }
        this.f418379e.u();
    }
}
