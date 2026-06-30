package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class s8 implements com.tencent.mm.feature.emoji.api.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147412a;

    public s8(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147412a = luckyMoneyNewDetailUI;
    }

    @Override // com.tencent.mm.feature.emoji.api.q5
    public final void a(boolean z17, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.r8(iEmojiInfo, this.f147412a, z17));
    }
}
