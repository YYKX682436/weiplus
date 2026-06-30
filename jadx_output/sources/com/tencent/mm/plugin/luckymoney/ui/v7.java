package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class v7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f147533e;

    public v7(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f147532d = luckyMoneyNewDetailUI;
        this.f147533e = iEmojiInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147532d;
        com.tencent.mm.emoji.view.BaseEmojiView baseEmojiView = luckyMoneyNewDetailUI.f146232x1;
        if (baseEmojiView != null) {
            baseEmojiView.setEmojiInfo(this.f147533e);
        }
        android.widget.LinearLayout linearLayout = luckyMoneyNewDetailUI.U;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout2 = luckyMoneyNewDetailUI.V;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
        android.widget.LinearLayout linearLayout3 = luckyMoneyNewDetailUI.W;
        if (linearLayout3 == null) {
            return;
        }
        linearLayout3.setVisibility(0);
    }
}
