package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zt implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f115377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f115378e;

    public zt(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, yz5.a aVar) {
        this.f115377d = ivVar;
        this.f115378e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f115377d;
        if (itemId != ivVar.f113019u) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = ivVar.f113014p1;
            if (k0Var != null) {
                k0Var.u();
                return;
            }
            return;
        }
        this.f115378e.invoke();
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = ivVar.f113014p1;
        if (k0Var2 != null) {
            k0Var2.u();
        }
        if (ivVar.f113015q.getLiveRole() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.T.f327674u++;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.b3[] b3VarArr = ml2.b3.f327214d;
            java.lang.String valueOf = java.lang.String.valueOf(5);
            r45.xn1 xn1Var = ivVar.f113026y0;
            if (xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            jSONObject.put(valueOf, str);
            ml2.z4 z4Var = ml2.z4.f328356i;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            if (y4Var.W) {
                z4Var = ml2.z4.f328364n;
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, z4Var, jSONObject.toString(), null, 4, null);
        }
    }
}
