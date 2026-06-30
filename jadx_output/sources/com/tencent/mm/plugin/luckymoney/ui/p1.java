package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class p1 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147299a;

    public p1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147299a = luckyMoneyDetailUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147299a;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "[onSelectedNormalEmoji] emojiInfo:%s", str);
            luckyMoneyDetailUI.f146089p2 = 1;
            luckyMoneyDetailUI.a7(2, str);
            luckyMoneyDetailUI.i7(str);
            luckyMoneyDetailUI.b7();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LuckyMoneyDetailUI", e17, "", new java.lang.Object[0]);
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
