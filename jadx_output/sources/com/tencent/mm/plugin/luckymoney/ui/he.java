package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class he implements com.tencent.mm.feature.emoji.api.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146994a;

    public he(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI) {
        this.f146994a = luckyMoneyNewReceiveUI;
    }

    @Override // com.tencent.mm.feature.emoji.api.q5
    public final void a(boolean z17, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.ge(this.f146994a, iEmojiInfo, z17));
    }
}
