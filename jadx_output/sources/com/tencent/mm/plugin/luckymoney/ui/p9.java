package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class p9 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147310a;

    public p9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147310a = luckyMoneyNewDetailUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String text) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147310a;
        kotlin.jvm.internal.o.g(text, "text");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[onSelectedNormalEmoji] emojiInfo:%s", text);
            luckyMoneyNewDetailUI.f146213p2 = 1;
            luckyMoneyNewDetailUI.a7(2, text);
            luckyMoneyNewDetailUI.l7(text);
            luckyMoneyNewDetailUI.d7();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyNewDetailUI", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
