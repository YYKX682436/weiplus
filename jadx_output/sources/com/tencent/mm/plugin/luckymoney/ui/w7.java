package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class w7 implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147638a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f147639b;

    public w7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f147638a = luckyMoneyNewDetailUI;
        this.f147639b = iEmojiInfo;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.v7(this.f147638a, this.f147639b));
    }
}
