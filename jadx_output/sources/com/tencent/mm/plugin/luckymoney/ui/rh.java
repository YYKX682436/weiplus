package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class rh implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147385d;

    public rh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147385d = luckyMoneyNewYearSendUIV2;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147385d;
        if (itemId == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "click startPlay");
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.V6(luckyMoneyNewYearSendUIV2, true);
            return;
        }
        if (menuItem.getItemId() != 2) {
            if (menuItem.getItemId() == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "click stopPlay");
                int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
                luckyMoneyNewYearSendUIV2.o7(true);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "delete voice");
        int i19 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
        luckyMoneyNewYearSendUIV2.o7(true);
        luckyMoneyNewYearSendUIV2.f146444y2 = 1;
        luckyMoneyNewYearSendUIV2.f146424q2 = 1;
        luckyMoneyNewYearSendUIV2.q7();
        luckyMoneyNewYearSendUIV2.h7(15);
    }
}
