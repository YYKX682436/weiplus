package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class vc implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147540a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f147541b;

    public vc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f147540a = luckyMoneyNewPrepareUI;
        this.f147541b = iEmojiInfo;
    }

    @Override // dr.q
    public void a(boolean z17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.luckymoney.ui.uc(this.f147540a, this.f147541b));
    }
}
