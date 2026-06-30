package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class bb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146751d;

    public bb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f146751d = luckyMoneyNewPrepareUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146751d;
        int i18 = luckyMoneyNewPrepareUI.T;
        gb3.p pVar = gb3.p.f270042a;
        if (itemId == 1) {
            luckyMoneyNewPrepareUI.T = 1;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.k7()), 2);
            luckyMoneyNewPrepareUI.f146248d2 = 3;
            gb3.p.f270046e = 2;
            pVar.a(12);
        } else if (itemId == 2) {
            luckyMoneyNewPrepareUI.T = 0;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.k7()), 3);
            luckyMoneyNewPrepareUI.f146248d2 = 2;
            gb3.p.f270046e = 1;
            pVar.a(13);
        } else if (itemId == 3) {
            luckyMoneyNewPrepareUI.T = 3;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11701, 4, 0, 0, java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.k7()), 13);
            luckyMoneyNewPrepareUI.f146248d2 = 4;
            gb3.p.f270046e = 3;
            pVar.a(14);
        }
        if (luckyMoneyNewPrepareUI.W1 && i18 != luckyMoneyNewPrepareUI.T) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(22237, 2);
            luckyMoneyNewPrepareUI.X1 = true;
        }
        luckyMoneyNewPrepareUI.A7(i18);
    }
}
