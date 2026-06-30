package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class uh implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147504d;

    public uh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147504d = luckyMoneyNewYearSendUIV2;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "showLuckyHbDlg() onMMMenuItemSelected menuItemId:%s", java.lang.Integer.valueOf(menuItem.getItemId()));
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147504d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
            luckyMoneyNewYearSendUIV2.m7();
            return;
        }
        luckyMoneyNewYearSendUIV2.J2 = 0;
        com.tencent.mm.feature.emoji.api.e7 e7Var = (com.tencent.mm.feature.emoji.api.e7) i95.n0.c(com.tencent.mm.feature.emoji.api.e7.class);
        androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewYearSendUIV2.getContext();
        java.lang.String str = luckyMoneyNewYearSendUIV2.D1;
        ((h30.k) e7Var).getClass();
        o22.i.b(context, 3, str);
        luckyMoneyNewYearSendUIV2.f146398b2 = 1;
        luckyMoneyNewYearSendUIV2.Y1 = new com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct();
        com.tencent.mm.autogen.mmdata.rpt.HBReportNewStruct hBReportNewStruct = luckyMoneyNewYearSendUIV2.Y1;
        hBReportNewStruct.f58415d = 9L;
        hBReportNewStruct.k();
    }
}
