package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class ge implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI f146942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f146943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f146944f;

    public ge(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewReceiveUI luckyMoneyNewReceiveUI, com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17) {
        this.f146942d = luckyMoneyNewReceiveUI;
        this.f146943e = iEmojiInfo;
        this.f146944f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.fe(this.f146942d, this.f146943e, this.f146944f));
    }
}
