package com.tencent.mm.pluginsdk.ui.otherway;

/* loaded from: classes8.dex */
public final class k implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.otherway.v f190970a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f190971b;

    public k(com.tencent.mm.pluginsdk.ui.otherway.v vVar, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f190970a = vVar;
        this.f190971b = k0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.pluginsdk.ui.otherway.w wVar = (com.tencent.mm.pluginsdk.ui.otherway.w) this.f190970a.f191012m.get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (wVar != null) {
            com.tencent.mm.pluginsdk.ui.otherway.v vVar = this.f190970a;
            java.lang.String b17 = wVar.b();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f190971b;
            androidx.recyclerview.widget.RecyclerView recyclerView = k0Var.G1;
            if (recyclerView != null) {
                vVar.k(recyclerView, i17, com.tencent.mm.R.id.f485288h62, b17, new com.tencent.mm.pluginsdk.ui.otherway.j(vVar, k0Var, recyclerView));
            }
        }
    }
}
