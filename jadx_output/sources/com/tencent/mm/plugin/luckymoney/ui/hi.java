package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class hi implements qr.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f146998a;

    public hi(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f146998a = luckyMoneyNewYearSendUIV2;
    }

    @Override // qr.a
    public void a(long j17, boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f146998a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onResult() mTimeEnter:%s  timeEnter:%s  success:%s  md5:%s", java.lang.Long.valueOf(luckyMoneyNewYearSendUIV2.f146406h2), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(z17), str);
        if (com.tencent.mm.sdk.platformtools.t8.B0(luckyMoneyNewYearSendUIV2.f146406h2, j17)) {
            if (z17) {
                luckyMoneyNewYearSendUIV2.l7(str);
            } else {
                if (luckyMoneyNewYearSendUIV2.J2 == 0) {
                    if (((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).Di(luckyMoneyNewYearSendUIV2.f146406h2)) {
                        luckyMoneyNewYearSendUIV2.J2++;
                        luckyMoneyNewYearSendUIV2.d7(2);
                        return;
                    }
                }
                luckyMoneyNewYearSendUIV2.d7(4);
            }
            luckyMoneyNewYearSendUIV2.p7(true);
            qr.e.f366008a.b(luckyMoneyNewYearSendUIV2.f146406h2, luckyMoneyNewYearSendUIV2.K2);
        }
    }
}
