package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class lj implements com.tencent.mm.feature.emoji.api.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI f147150a;

    public lj(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI luckyMoneyNotHookReceiveUI) {
        this.f147150a = luckyMoneyNotHookReceiveUI;
    }

    @Override // com.tencent.mm.feature.emoji.api.q5
    public void a(boolean z17, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.cj(this, iEmojiInfo, z17));
    }
}
