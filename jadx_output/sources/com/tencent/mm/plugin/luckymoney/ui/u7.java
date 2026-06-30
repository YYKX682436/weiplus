package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class u7 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147488d;

    public u7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147488d = luckyMoneyNewDetailUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.u0
    public final void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        int type = m1Var.getType();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if ((type == 697) && (m1Var instanceof z12.b)) {
            z12.b bVar = (z12.b) m1Var;
            if (i17 == 0 && i18 == 0) {
                r45.ye I = ((z12.h) bVar).I();
                if ((I != null ? I.f391008g : null) == null || I.f391008g.size() <= 0) {
                    return;
                }
                java.lang.String str2 = ((r45.ri0) I.f391008g.get(0)).f384886d;
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147488d;
                com.tencent.mm.api.IEmojiInfo iEmojiInfo = luckyMoneyNewDetailUI.Z1;
                if (com.tencent.mm.sdk.platformtools.t8.D0(str2, iEmojiInfo != null ? iEmojiInfo.getMd5() : null)) {
                    luckyMoneyNewDetailUI.p7(false);
                }
            }
        }
    }
}
