package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class k00 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f113178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f113179e;

    public k00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var, yz5.a aVar) {
        this.f113178d = w00Var;
        this.f113179e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f113178d;
        if (itemId != w00Var.f114844r) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = w00Var.G;
            if (k0Var != null) {
                k0Var.u();
            }
            w00Var.u1();
            return;
        }
        this.f113179e.invoke();
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = w00Var.G;
        if (k0Var2 != null) {
            k0Var2.u();
        }
        if (w00Var.f114842p.getLiveRole() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.T.f327674u++;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.b3[] b3VarArr = ml2.b3.f327214d;
            java.lang.String valueOf = java.lang.String.valueOf(5);
            java.lang.String str = w00Var.H;
            if (str == null) {
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
