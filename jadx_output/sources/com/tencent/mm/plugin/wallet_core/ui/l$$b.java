package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public final /* synthetic */ class l$$b implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.l f180393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f180394e;

    public /* synthetic */ l$$b(com.tencent.mm.plugin.wallet_core.ui.l lVar, android.view.View view) {
        this.f180393d = lVar;
        this.f180394e = view;
    }

    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.wallet_core.ui.l lVar = this.f180393d;
        lVar.getClass();
        android.view.View view = this.f180394e;
        boolean z17 = view instanceof android.widget.TextView;
        android.content.Context context = lVar.f180384d;
        if (z17) {
            if (bool.booleanValue()) {
                ((android.widget.TextView) view).setText(context.getString(com.tencent.mm.R.string.f492687oc3));
            } else {
                ((android.widget.TextView) view).setText(context.getString(com.tencent.mm.R.string.f492688oc4));
            }
        }
        if (bool.booleanValue()) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.ikb);
            e4Var.b(com.tencent.mm.R.raw.toast_ok);
            e4Var.c();
        } else {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = context.getString(com.tencent.mm.R.string.f492981ij5);
            e4Var2.b(com.tencent.mm.R.raw.toast_ok);
            e4Var2.c();
        }
        return jz5.f0.f302826a;
    }
}
