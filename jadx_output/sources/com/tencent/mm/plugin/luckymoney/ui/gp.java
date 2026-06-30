package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class gp implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView f146973d;

    public gp(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView) {
        this.f146973d = luckyMoneyTextInputView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyTextInputView luckyMoneyTextInputView = this.f146973d;
        com.tencent.mm.plugin.luckymoney.ui.ik ikVar = luckyMoneyTextInputView.f146677i;
        if (ikVar != null) {
            ikVar.D4(true, luckyMoneyTextInputView.getInputViewId());
        }
    }
}
