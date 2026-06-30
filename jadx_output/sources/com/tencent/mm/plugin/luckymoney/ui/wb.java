package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class wb implements com.tencent.mm.wallet_core.model.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147643a;

    public wb(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147643a = luckyMoneyNewPrepareUI;
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void a(int i17, java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "onSceneEnd() scene:NetScenePrepareLuckyMoney JumpRemind:onNext()");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean z18 = i17 == 2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147643a;
        if (z18 && com.tencent.mm.sdk.platformtools.t8.D0(path, "requestwxhb")) {
            luckyMoneyNewPrepareUI.e7(1);
            return;
        }
        if (i17 == 1) {
            ((is.h) ((js.s0) i95.n0.c(js.s0.class))).getClass();
            c71.b.c(luckyMoneyNewPrepareUI, path, 0, true);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.q
    public void onCancel() {
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "onSceneEnd() scene:NetScenePrepareLuckyMoney JumpRemind:onCancel()");
    }
}
