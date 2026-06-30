package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class fc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f146903d;

    public fc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI) {
        this.f146903d = luckyMoneyNewPrepareUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f146903d;
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView = luckyMoneyNewPrepareUI.f146255i;
        if (luckyMoneyTextInputView != null) {
            luckyMoneyTextInputView.setHintText(luckyMoneyNewPrepareUI.f146290y1);
        }
    }
}
