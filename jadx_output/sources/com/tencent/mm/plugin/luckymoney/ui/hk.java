package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class hk implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView f147001d;

    public hk(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView) {
        this.f147001d = luckyMoneyNumInputView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView = this.f147001d;
        com.tencent.mm.plugin.luckymoney.ui.ik ikVar = luckyMoneyNumInputView.f146496g;
        if (ikVar != null) {
            ikVar.D4(false, luckyMoneyNumInputView.getInputViewId());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(editable.toString())) {
            luckyMoneyNumInputView.f146493d.setContentDescription(((java.lang.Object) luckyMoneyNumInputView.f146493d.getText()) + "0" + ((java.lang.Object) luckyMoneyNumInputView.f146495f.getText()));
            return;
        }
        luckyMoneyNumInputView.f146493d.setContentDescription(((java.lang.Object) luckyMoneyNumInputView.f146493d.getText()) + editable.toString() + ((java.lang.Object) luckyMoneyNumInputView.f146495f.getText()));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
