package com.tencent.mm.plugin.luckymoney.ui;

/* renamed from: com.tencent.mm.plugin.luckymoney.ui.if, reason: invalid class name */
/* loaded from: classes9.dex */
public class Cif implements com.tencent.mm.feature.emoji.api.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI f147027a;

    public Cif(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUI luckyMoneyNewYearReceiveUI) {
        this.f147027a = luckyMoneyNewYearReceiveUI;
    }

    @Override // com.tencent.mm.feature.emoji.api.q5
    public void a(boolean z17, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.gf(this, iEmojiInfo, z17));
    }
}
