package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ug implements com.tencent.mm.wallet_core.model.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI f147503a;

    public ug(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f147503a = luckyMoneyNewYearSendUI;
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onNext()");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean z18 = i17 == 2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = this.f147503a;
        if (z18 && com.tencent.mm.sdk.platformtools.t8.D0(str, "requestwxhb")) {
            int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.F1;
            luckyMoneyNewYearSendUI.W6(1);
        } else {
            if (i17 == 1) {
                ((is.h) ((js.s0) i95.n0.c(js.s0.class))).getClass();
                c71.b.c(luckyMoneyNewYearSendUI, str, 0, true);
            }
        }
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onCancel()");
    }
}
