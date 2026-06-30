package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class dc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146838d;

    public dc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f146838d = luckyMoneyNewPrepareUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.G2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146838d;
        if (itemId == i18) {
            luckyMoneyNewPrepareUI.P1 = 1;
            com.tencent.mm.feature.emoji.api.e7 e7Var = (com.tencent.mm.feature.emoji.api.e7) i95.n0.c(com.tencent.mm.feature.emoji.api.e7.class);
            java.lang.String str = luckyMoneyNewPrepareUI.E1;
            ((h30.k) e7Var).getClass();
            o22.i.b(luckyMoneyNewPrepareUI, 4, str);
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
            luckyMoneyNewPrepareUI.L1 = redEnvSendWithEmoticonClickStruct;
            redEnvSendWithEmoticonClickStruct.f59936d = 4L;
            redEnvSendWithEmoticonClickStruct.k();
            return;
        }
        if (itemId == com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.H2) {
            luckyMoneyNewPrepareUI.P1 = 2;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.X6(luckyMoneyNewPrepareUI);
            return;
        }
        if (itemId == com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.I2) {
            luckyMoneyNewPrepareUI.O1 = 1;
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView = luckyMoneyNewPrepareUI.f146255i;
            if (luckyMoneyTextInputView != null) {
                luckyMoneyTextInputView.f146674f.setTag("");
                luckyMoneyTextInputView.f146675g.setVisibility(0);
                luckyMoneyTextInputView.f146676h.setVisibility(8);
            }
            luckyMoneyNewPrepareUI.K1 = null;
            com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct redEnvSendWithEmoticonClickStruct2 = new com.tencent.mm.autogen.mmdata.rpt.RedEnvSendWithEmoticonClickStruct();
            luckyMoneyNewPrepareUI.L1 = redEnvSendWithEmoticonClickStruct2;
            redEnvSendWithEmoticonClickStruct2.f59936d = 5L;
            redEnvSendWithEmoticonClickStruct2.k();
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.W6(luckyMoneyNewPrepareUI, 24);
        }
    }
}
