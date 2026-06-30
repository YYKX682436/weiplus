package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class yg implements qr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI f147741a;

    public yg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f147741a = luckyMoneyNewYearSendUI;
    }

    @Override // qr.a
    public void a(long j17, boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = this.f147741a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onResult() mTimeEnter:%s  timeEnter:%s  success:%s  md5:%s", java.lang.Long.valueOf(luckyMoneyNewYearSendUI.f146378p1), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), str);
        if (com.tencent.mm.sdk.platformtools.t8.B0(luckyMoneyNewYearSendUI.f146378p1, j17)) {
            if (z17) {
                luckyMoneyNewYearSendUI.a7(str);
            } else {
                if (luckyMoneyNewYearSendUI.C1 == 0) {
                    if (((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).Di(luckyMoneyNewYearSendUI.f146378p1)) {
                        luckyMoneyNewYearSendUI.C1++;
                        luckyMoneyNewYearSendUI.Y6(3);
                        return;
                    }
                }
                luckyMoneyNewYearSendUI.Y6(5);
            }
            luckyMoneyNewYearSendUI.c7(true);
            qr.e.f366008a.b(luckyMoneyNewYearSendUI.f146378p1, luckyMoneyNewYearSendUI.D1);
        }
    }
}
