package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class sh implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 f147423a;

    public sh(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2) {
        this.f147423a = luckyMoneyNewYearSendUIV2;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUIV2", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147423a;
        if (iEmojiInfo == null) {
            luckyMoneyNewYearSendUIV2.d7(5);
        } else {
            luckyMoneyNewYearSendUIV2.getClass();
            luckyMoneyNewYearSendUIV2.l7(iEmojiInfo.getMd5());
        }
        onHide();
    }

    @Override // qk.u9
    public void onHide() {
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2.M2;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUIV2 luckyMoneyNewYearSendUIV2 = this.f147423a;
        fc3.j.a(luckyMoneyNewYearSendUIV2.getContext(), luckyMoneyNewYearSendUIV2.S1);
        luckyMoneyNewYearSendUIV2.T1.dismiss();
    }
}
