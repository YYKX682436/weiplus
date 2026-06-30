package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class e6 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView f146864d;

    public e6(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView) {
        this.f146864d = luckyMoneyMoneyInputView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(editable.toString());
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView = this.f146864d;
        if (K0) {
            luckyMoneyMoneyInputView.f146144d.setFixedLabelText("");
        } else {
            luckyMoneyMoneyInputView.f146144d.setFixedLabelText(luckyMoneyMoneyInputView.f146149i);
        }
        com.tencent.mm.plugin.luckymoney.ui.ik ikVar = luckyMoneyMoneyInputView.f146147g;
        if (ikVar != null) {
            ikVar.D4(false, luckyMoneyMoneyInputView.getInputViewId());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(editable.toString())) {
            luckyMoneyMoneyInputView.f146145e.setContentDescription(((java.lang.Object) luckyMoneyMoneyInputView.f146145e.getText()) + "0" + luckyMoneyMoneyInputView.f146149i);
            return;
        }
        luckyMoneyMoneyInputView.f146145e.setContentDescription(((java.lang.Object) luckyMoneyMoneyInputView.f146145e.getText()) + editable.toString() + luckyMoneyMoneyInputView.f146149i);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
