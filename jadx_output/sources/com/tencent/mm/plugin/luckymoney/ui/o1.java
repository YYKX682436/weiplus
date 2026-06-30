package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class o1 implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI f147251a;

    public o1(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI) {
        this.f147251a = luckyMoneyDetailUI;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyDetailUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI luckyMoneyDetailUI = this.f147251a;
        luckyMoneyDetailUI.f146089p2 = 2;
        luckyMoneyDetailUI.a7(2, iEmojiInfo.getMd5());
        luckyMoneyDetailUI.i7("");
        onHide();
    }

    @Override // qk.u9
    public void onHide() {
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.f146047p3;
        this.f147251a.b7();
    }
}
