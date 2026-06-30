package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class wc implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147644a;

    public wc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f147644a = luckyMoneyNewPrepareUI;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        kotlin.jvm.internal.o.g(iEmojiInfo, "iEmojiInfo");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r1) ((com.tencent.mm.feature.emoji.api.g6) i95.n0.c(com.tencent.mm.feature.emoji.api.g6.class))).wi(iEmojiInfo.getMd5());
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147644a;
        luckyMoneyNewPrepareUI.K1 = wi6;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = luckyMoneyNewPrepareUI.K1;
        if (iEmojiInfo2 == null || iEmojiInfo2.E0()) {
            luckyMoneyNewPrepareUI.w7(luckyMoneyNewPrepareUI.K1);
        } else {
            ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).wi(iEmojiInfo2, new com.tencent.mm.plugin.luckymoney.ui.vc(luckyMoneyNewPrepareUI, iEmojiInfo2));
        }
        onHide();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.W6(luckyMoneyNewPrepareUI, 22);
    }

    @Override // qk.u9
    public void onHide() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147644a;
        fc3.j.a(luckyMoneyNewPrepareUI, luckyMoneyNewPrepareUI.G1);
        com.tencent.mm.plugin.luckymoney.ui.b bVar = luckyMoneyNewPrepareUI.H1;
        if (bVar != null) {
            bVar.dismiss();
        }
    }
}
