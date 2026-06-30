package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ns implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f119199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vv1 f119200e;

    public ns(com.tencent.mm.plugin.finder.live.widget.et etVar, r45.vv1 vv1Var) {
        this.f119199d = etVar;
        this.f119200e = vv1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1000) {
            com.tencent.mm.plugin.finder.live.widget.et etVar = this.f119199d;
            com.tencent.mm.plugin.finder.live.widget.et.h0(etVar).a();
            r45.vv1 vv1Var = this.f119200e;
            if (vv1Var.getInteger(2) == 1 || vv1Var.getInteger(2) == 2) {
                android.content.Context context = etVar.f118183e;
                db5.t7.m(context, context.getResources().getString(com.tencent.mm.R.string.nwu));
                return;
            }
            com.tencent.mm.plugin.finder.live.widget.ms msVar = new com.tencent.mm.plugin.finder.live.widget.ms(etVar, vv1Var);
            if (etVar.S == null) {
                android.content.Context context2 = etVar.f118183e;
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context2, 1, true);
                k0Var.r(context2.getResources().getString(com.tencent.mm.R.string.nua), 17, context2.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479930ja), null);
                k0Var.f211872n = new com.tencent.mm.plugin.finder.live.widget.bt(etVar);
                k0Var.f211881s = new com.tencent.mm.plugin.finder.live.widget.ct(etVar, msVar);
                k0Var.f211854d = new com.tencent.mm.plugin.finder.live.widget.dt(etVar);
                etVar.S = k0Var;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = etVar.S;
            if (k0Var2 == null || k0Var2.i()) {
                return;
            }
            k0Var2.v();
        }
    }
}
