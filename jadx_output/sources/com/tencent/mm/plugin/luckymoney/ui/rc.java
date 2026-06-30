package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class rc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f147380e;

    public rc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f147379d = luckyMoneyNewPrepareUI;
        this.f147380e = iEmojiInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        this.f147379d.w7(this.f147380e);
    }
}
