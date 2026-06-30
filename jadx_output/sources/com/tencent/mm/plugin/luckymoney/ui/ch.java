package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class ch implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI f146796a;

    public ch(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI) {
        this.f146796a = luckyMoneyNewYearSendUI;
    }

    @Override // qk.u9
    public void a(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearSendUI", "[onSelectedEmoji] emojiInfo:%s", iEmojiInfo);
        int i17 = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.F1;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = this.f146796a;
        if (iEmojiInfo == null) {
            luckyMoneyNewYearSendUI.Y6(0);
        } else {
            luckyMoneyNewYearSendUI.getClass();
            luckyMoneyNewYearSendUI.a7(iEmojiInfo.getMd5());
        }
        onHide();
    }

    @Override // qk.u9
    public void onHide() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI luckyMoneyNewYearSendUI = this.f146796a;
        fc3.j.a(luckyMoneyNewYearSendUI, luckyMoneyNewYearSendUI.P);
        luckyMoneyNewYearSendUI.Q.dismiss();
    }
}
