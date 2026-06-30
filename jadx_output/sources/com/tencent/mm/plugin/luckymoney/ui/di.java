package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class di implements com.tencent.mm.wallet_core.model.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f146844a;

    public di(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f146844a = luckyMoneyNewYearSendUIV2;
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onNext()");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean z18 = i17 == 2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f146844a;
        if (z18 && com.tencent.mm.sdk.platformtools.t8.D0(str, "requestwxhb")) {
            int i18 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
            luckyMoneyNewYearSendUIV2.a7(1);
            return;
        }
        if (i17 == 1) {
            js.s0 s0Var = (js.s0) i95.n0.c(js.s0.class);
            androidx.appcompat.app.AppCompatActivity context = luckyMoneyNewYearSendUIV2.getContext();
            ((is.h) s0Var).getClass();
            c71.b.c(context, str, 0, true);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void onCancel() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "onSceneEnd() scene:NetScenePrepareNewYearLuckyMoney JumpRemind:onCancel()");
    }
}
