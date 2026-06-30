package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class se extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f147419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f147420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI, java.lang.String str) {
        super(2);
        this.f147419d = luckyMoneyNewReceiveUI;
        this.f147420e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.wallet_core.utils.y action = (com.tencent.mm.plugin.wallet_core.utils.y) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(action, "action");
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI = this.f147419d;
        if (longValue != luckyMoneyNewReceiveUI.J1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewReceiveUI", "unexpected halfpage callback");
        } else {
            luckyMoneyNewReceiveUI.J1 = 0L;
            if (action == com.tencent.mm.plugin.wallet_core.utils.y.f181000f) {
                luckyMoneyNewReceiveUI.showLoading();
                luckyMoneyNewReceiveUI.W6(this.f147420e);
            } else {
                luckyMoneyNewReceiveUI.finish();
            }
        }
        return jz5.f0.f302826a;
    }
}
