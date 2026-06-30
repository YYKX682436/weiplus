package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class kg implements com.tencent.mm.feature.emoji.api.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 f147106a;

    public kg(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearReceiveUIV2 luckyMoneyNewYearReceiveUIV2) {
        this.f147106a = luckyMoneyNewYearReceiveUIV2;
    }

    @Override // com.tencent.mm.feature.emoji.api.q5
    public void a(boolean z17, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.cg(this, iEmojiInfo, z17));
    }
}
