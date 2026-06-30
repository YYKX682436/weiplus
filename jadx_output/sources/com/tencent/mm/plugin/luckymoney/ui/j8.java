package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class j8 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        super(false);
        this.f147050d = luckyMoneyNewDetailUI;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "mEmoji click");
        if (gm0.j1.u().l()) {
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147050d;
            if (com.tencent.mm.sdk.platformtools.t8.K0(luckyMoneyNewDetailUI.f146173a2)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewDetailUI", "mEmojiMd5 == null");
                return;
            }
            com.tencent.mm.api.IEmojiInfo Ni = ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Ni(luckyMoneyNewDetailUI.f146173a2);
            com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(luckyMoneyNewDetailUI.L1, luckyMoneyNewDetailUI.W1);
            if (Ni == null || ((com.tencent.mm.storage.emotion.EmojiInfo) Ni).k()) {
                return;
            }
            java.lang.String str = luckyMoneyNewDetailUI.f146173a2;
            if (str == null) {
                str = "";
            }
            qk.u uVar = new qk.u(str, Ni);
            java.lang.String Q0 = n17.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            uVar.f364010l = Q0;
            uVar.f364008j = com.tencent.mm.sdk.platformtools.t8.r1(java.lang.Long.valueOf(n17.I0()));
            java.lang.String j17 = n17.j();
            if (j17 == null) {
                j17 = "";
            }
            uVar.f364009k = j17;
            java.lang.String Q02 = n17.Q0();
            if (Q02 == null) {
                Q02 = "";
            }
            if (com.tencent.mm.storage.z3.R4(Q02)) {
                Q02 = c01.w9.s(n17.j());
                if (Q02 == null) {
                    Q02 = "";
                }
                java.lang.String str2 = luckyMoneyNewDetailUI.L1;
                uVar.f364011m = str2 != null ? str2 : "";
            }
            uVar.f364007i = Q02;
            uVar.f364156b = true;
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (p6Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewDetailUI", "emoticon liteapp service not found");
            } else {
                ((com.tencent.mm.feature.emoji.f4) p6Var).wi(luckyMoneyNewDetailUI, uVar);
            }
        }
    }
}
