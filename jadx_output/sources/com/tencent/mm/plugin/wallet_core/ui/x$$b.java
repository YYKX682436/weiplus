package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public final /* synthetic */ class x$$b implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.x f180784d;

    public /* synthetic */ x$$b(com.tencent.mm.plugin.wallet_core.ui.x xVar) {
        this.f180784d = xVar;
    }

    @Override // yz5.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.wallet_core.ui.x xVar = this.f180784d;
        android.widget.TextView textView = xVar.f180781i;
        android.content.Context context = xVar.f180776d;
        if (textView != null) {
            if (bool.booleanValue()) {
                xVar.f180781i.setText(context.getString(com.tencent.mm.R.string.f492687oc3));
            } else {
                xVar.f180781i.setText(context.getString(com.tencent.mm.R.string.f492688oc4));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "[onBottomTipsClick] payBottomTips:" + xVar.f180781i.hashCode() + ",this:" + xVar.hashCode());
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
