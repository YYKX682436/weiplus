package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public final class oc implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI f147269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f147270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.keyboard.WcPayKeyboard f147271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f147272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f147273h;

    public oc(com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI, android.view.View.OnFocusChangeListener onFocusChangeListener, com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard, boolean z17, android.widget.EditText editText) {
        this.f147269d = luckyMoneyNewPrepareUI;
        this.f147270e = onFocusChangeListener;
        this.f147271f = wcPayKeyboard;
        this.f147272g = z17;
        this.f147273h = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View v17, boolean z17) {
        android.widget.EditText editText;
        android.widget.EditText editText2;
        android.widget.EditText editText3;
        android.widget.EditText editText4;
        kotlin.jvm.internal.o.g(v17, "v");
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI.f146241x2;
        if (z17) {
            boolean b17 = kotlin.jvm.internal.o.b("mAmountEt", v17.getTag());
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = this.f147269d;
            if (b17) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = 4;
                objArr[1] = java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.f146248d2);
                objArr[2] = java.lang.Float.valueOf(luckyMoneyNewPrepareUI.f146247c2);
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView = luckyMoneyNewPrepareUI.f146253h;
                objArr[3] = (luckyMoneyMoneyInputView == null || (editText4 = luckyMoneyMoneyInputView.getEditText()) == null) ? null : editText4.getText();
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView = luckyMoneyNewPrepareUI.f146251g;
                objArr[4] = (luckyMoneyNumInputView == null || (editText3 = luckyMoneyNumInputView.getEditText()) == null) ? null : editText3.getText();
                g0Var.d(25925, objArr);
            } else if (kotlin.jvm.internal.o.b("mNumEt", v17.getTag())) {
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr2 = new java.lang.Object[5];
                objArr2[0] = 5;
                objArr2[1] = java.lang.Integer.valueOf(luckyMoneyNewPrepareUI.f146248d2);
                objArr2[2] = java.lang.Float.valueOf(luckyMoneyNewPrepareUI.f146247c2);
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMoneyInputView luckyMoneyMoneyInputView2 = luckyMoneyNewPrepareUI.f146253h;
                objArr2[3] = (luckyMoneyMoneyInputView2 == null || (editText2 = luckyMoneyMoneyInputView2.getEditText()) == null) ? null : editText2.getText();
                com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNumInputView luckyMoneyNumInputView2 = luckyMoneyNewPrepareUI.f146251g;
                objArr2[4] = (luckyMoneyNumInputView2 == null || (editText = luckyMoneyNumInputView2.getEditText()) == null) ? null : editText.getText();
                g0Var2.d(25925, objArr2);
            }
            java.lang.Object systemService = luckyMoneyNewPrepareUI.getContext().getSystemService("input_method");
            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(v17.getWindowToken(), 0);
            }
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.luckymoney.ui.mc(this.f147271f, v17, this.f147272g, this.f147273h, this.f147269d), 300L);
        } else {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.luckymoney.ui.nc(this.f147271f), 200L);
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f147270e;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(v17, z17);
        }
    }
}
