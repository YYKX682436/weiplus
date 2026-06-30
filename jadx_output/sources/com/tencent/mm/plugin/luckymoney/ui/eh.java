package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class eh implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI f146875d;

    public eh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f146875d = luckyMoneyNewYearSendUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = this.f146875d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.F1;
            luckyMoneyNewYearSendUI.b7();
            return;
        }
        luckyMoneyNewYearSendUI.C1 = 0;
        com.tencent.mm.feature.emoji.api.e7 e7Var = (com.tencent.mm.feature.emoji.api.e7) i95.n0.c(com.tencent.mm.feature.emoji.api.e7.class);
        java.lang.String str = luckyMoneyNewYearSendUI.C;
        ((h30.k) e7Var).getClass();
        o22.i.b(luckyMoneyNewYearSendUI, 3, str);
        luckyMoneyNewYearSendUI.Y = 1;
        luckyMoneyNewYearSendUI.V = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
        com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = luckyMoneyNewYearSendUI.V;
        hBReportNewStruct.f58415d = 9L;
        hBReportNewStruct.k();
    }
}
