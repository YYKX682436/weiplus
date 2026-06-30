package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class g implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190941d;

    public g(com.tencent.mm.pluginsdk.ui.otherway.v vVar) {
        this.f190941d = vVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.pluginsdk.ui.otherway.v vVar = this.f190941d;
        com.tencent.mars.xlog.Log.i(vVar.h(), "onMMMenuItemSelected, menuItem: " + menuItem + ", i: " + i17);
        db5.t4 t4Var = vVar.f191011l;
        if (t4Var != null) {
            t4Var.onMMMenuItemSelected(menuItem, i17);
        }
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) vVar.f191012m.get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (wVar != null) {
            lb0.q.f317688a.d(vVar.f191000a, vVar.f191001b.f189315h, new com.tencent.mm.pluginsdk.ui.otherway.f(vVar, wVar));
            kb0.b bVar = vVar.f191009j;
            if (bVar != null) {
                int itemId = menuItem.getItemId();
                wVar.a();
                bVar.a(wVar, itemId, "view_clk");
            }
        }
    }
}
