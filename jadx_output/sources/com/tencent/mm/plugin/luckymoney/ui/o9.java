package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class o9 implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI f147266a;

    public o9(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI) {
        this.f147266a = luckyMoneyNewDetailUI;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        kotlin.jvm.internal.o.g(iEmojiInfo, "iEmojiInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewDetailUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI luckyMoneyNewDetailUI = this.f147266a;
        luckyMoneyNewDetailUI.f146213p2 = 2;
        luckyMoneyNewDetailUI.a7(2, iEmojiInfo.getMd5());
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.m7(luckyMoneyNewDetailUI, null, 1, null);
        onHide();
    }

    @Override // qk.u9
    public void onHide() {
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewDetailUI.f146171r3;
        this.f147266a.d7();
    }
}
