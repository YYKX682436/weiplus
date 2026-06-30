package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class p5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.q5 f157873d;

    public p5(com.tencent.mm.plugin.remittance.ui.q5 q5Var) {
        this.f157873d = q5Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.remittance.ui.q5 q5Var = this.f157873d;
        if (itemId > q5Var.f157898d.size() - 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "menuItem.getItemId() > mTextInfoList.size() : %s , %s", java.lang.Integer.valueOf(menuItem.getItemId()), java.lang.Integer.valueOf(q5Var.f157898d.size()));
            return;
        }
        com.tencent.mm.plugin.remittance.model.e1 e1Var = (com.tencent.mm.plugin.remittance.model.e1) q5Var.f157898d.get(menuItem.getItemId());
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", " click option menu : %s ,type:%s", e1Var.f156811a, java.lang.Integer.valueOf(e1Var.f156812b.f157036a));
        com.tencent.mm.plugin.remittance.model.v0 v0Var = e1Var.f156812b;
        int i18 = v0Var.f157036a;
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.url ：%s", v0Var.f157037b);
            com.tencent.mm.wallet_core.ui.r1.V(q5Var.f157899e.getContext(), e1Var.f156812b.f157037b, false);
        } else if (i18 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceDetailUI", "textInfo.jumpInfo.username ：%s", v0Var.f157038c);
            com.tencent.mm.plugin.remittance.model.v0 v0Var2 = e1Var.f156812b;
            com.tencent.mm.wallet_core.ui.r1.b0(v0Var2.f157038c, v0Var2.f157039d, 0, 1000);
        } else if (i18 != 3) {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceDetailUI", "unknow text info type");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.RemittanceDetailUI", "text info type is OPTIONS_MENU_ITEM_JUMP_TYPE_NATIVE");
        }
    }
}
