package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ih implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.nh f147030d;

    public ih(com.tencent.mm.plugin.luckymoney.ui.nh nhVar) {
        this.f147030d = nhVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.nh nhVar = this.f147030d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = nhVar.f147242a;
        luckyMoneyNewYearSendUIV2.f146444y2 = 2;
        luckyMoneyNewYearSendUIV2.f146424q2 = 1;
        luckyMoneyNewYearSendUIV2.q7();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV22 = nhVar.f147242a;
        luckyMoneyNewYearSendUIV22.f146446z1.k(luckyMoneyNewYearSendUIV22.getResources().getAssets(), "voice_recording.pag");
        luckyMoneyNewYearSendUIV22.f146446z1.n();
        luckyMoneyNewYearSendUIV22.f146446z1.d();
        luckyMoneyNewYearSendUIV22.f146446z1.g();
        luckyMoneyNewYearSendUIV22.f146446z1.setVisibility(0);
        nhVar.f147242a.h7(12);
    }
}
