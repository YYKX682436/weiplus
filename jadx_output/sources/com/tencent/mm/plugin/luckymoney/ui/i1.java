package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class i1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        super(false);
        this.f147011d = luckyMoneyDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "mEmoji click");
        gm0.j1.i();
        if (gm0.j1.u().l()) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147011d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyDetailUI.f146049a2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUI", "mEmojiMd5 == null");
                return;
            }
            com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(luckyMoneyDetailUI.f146049a2);
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(luckyMoneyDetailUI.L1, luckyMoneyDetailUI.W1);
            if (Ni == null || ((com.tencent.mm.storage.emotion.EmojiInfo) Ni).k()) {
                return;
            }
            qk.u uVar = new qk.u(luckyMoneyDetailUI.f146049a2, Ni);
            java.lang.String Q0 = Li.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            uVar.f364010l = Q0;
            uVar.f364008j = com.tencent.mm.sdk.platformtools.t8.r1(java.lang.Long.valueOf(Li.I0()));
            java.lang.String j17 = Li.j();
            if (j17 == null) {
                j17 = "";
            }
            uVar.f364009k = j17;
            java.lang.String Q02 = Li.Q0();
            if (Q02 == null) {
                Q02 = "";
            }
            if (com.tencent.mm.storage.z3.R4(Q02)) {
                Q02 = c01.w9.s(Li.j());
                if (Q02 == null) {
                    Q02 = "";
                }
                java.lang.String str = luckyMoneyDetailUI.L1;
                uVar.f364011m = str != null ? str : "";
            }
            uVar.f364007i = Q02;
            uVar.f364156b = true;
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyDetailUI", "emoticon liteapp service not found");
            } else {
                ((com.tencent.mm.feature.emoji.f4) p6Var).wi(luckyMoneyDetailUI, uVar);
            }
        }
    }
}
