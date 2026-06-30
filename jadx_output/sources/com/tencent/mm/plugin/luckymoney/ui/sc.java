package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class sc implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147417a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f147418b;

    public sc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f147417a = luckyMoneyNewPrepareUI;
        this.f147418b = iEmojiInfo;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.rc(this.f147417a, this.f147418b));
    }
}
