package te2;

/* loaded from: classes.dex */
public final class ja implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f418146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418147e;

    public ja(com.tencent.mm.ui.widget.dialog.k0 k0Var, te2.hc hcVar) {
        this.f418146d = k0Var;
        this.f418147e = hcVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        java.lang.String string4;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f418146d;
        java.lang.String str = "";
        te2.hc hcVar = this.f418147e;
        if (valueOf != null && valueOf.intValue() == 0) {
            te2.hc hcVar2 = this.f418147e;
            pf5.e.launchUI$default(hcVar2, null, null, new te2.pa(hcVar2, null), 3, null);
            java.util.HashMap hashMap = new java.util.HashMap();
            r45.h32 h32Var = hcVar.f418068J;
            if (h32Var != null && (string4 = h32Var.getString(4)) != null) {
                str = string4;
            }
            hashMap.put("notice_id", str);
            hashMap.put("type", "1");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f328007y2, hashMap, null, "200", null, null, false, 116, null);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            te2.hc hcVar3 = this.f418147e;
            pf5.e.launchUI$default(hcVar3, null, null, new te2.qa(hcVar3, null), 3, null);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            r45.h32 h32Var2 = hcVar.f418068J;
            if (h32Var2 != null && (string3 = h32Var2.getString(4)) != null) {
                str = string3;
            }
            hashMap2.put("notice_id", str);
            hashMap2.put("type", "2");
            i95.m c18 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f328007y2, hashMap2, null, "200", null, null, false, 116, null);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            te2.hc hcVar4 = this.f418147e;
            pf5.e.launchUI$default(hcVar4, null, null, new te2.ha(hcVar4, null), 3, null);
            java.util.HashMap hashMap3 = new java.util.HashMap();
            r45.h32 h32Var3 = hcVar.f418068J;
            if (h32Var3 != null && (string2 = h32Var3.getString(4)) != null) {
                str = string2;
            }
            hashMap3.put("notice_id", str);
            hashMap3.put("type", "4");
            i95.m c19 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            zy2.zb.T8((zy2.zb) c19, ml2.t1.f328007y2, hashMap3, null, "200", null, null, false, 116, null);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            te2.hc hcVar5 = this.f418147e;
            pf5.e.launchUI$default(hcVar5, null, null, new te2.na(hcVar5, k0Var, null), 3, null);
            java.util.HashMap hashMap4 = new java.util.HashMap();
            r45.h32 h32Var4 = hcVar.f418068J;
            if (h32Var4 != null && (string = h32Var4.getString(4)) != null) {
                str = string;
            }
            hashMap4.put("notice_id", str);
            hashMap4.put("type", "3");
            i95.m c27 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            zy2.zb.T8((zy2.zb) c27, ml2.t1.f328007y2, hashMap4, null, "200", null, null, false, 116, null);
        }
        k0Var.u();
    }
}
