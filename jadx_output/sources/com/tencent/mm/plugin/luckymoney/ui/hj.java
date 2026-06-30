package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class hj implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f146999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f147000e;

    public hj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI, java.lang.String str) {
        this.f147000e = luckyMoneyNotHookReceiveUI;
        this.f146999d = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.wallet_core.utils.y yVar = (com.tencent.mm.plugin.wallet_core.utils.y) obj;
        long longValue = ((java.lang.Long) obj2).longValue();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI = this.f147000e;
        long j17 = luckyMoneyNotHookReceiveUI.G1;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (longValue != j17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNotHookReceiveUI", "unexpected halfpage callback");
        } else {
            luckyMoneyNotHookReceiveUI.G1 = 0L;
            if (yVar == com.tencent.mm.plugin.wallet_core.utils.y.f181000f) {
                luckyMoneyNotHookReceiveUI.showLoading();
                luckyMoneyNotHookReceiveUI.V6(this.f146999d);
            } else {
                luckyMoneyNotHookReceiveUI.finish();
            }
        }
        return f0Var;
    }
}
