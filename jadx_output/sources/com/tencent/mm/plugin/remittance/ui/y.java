package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f158041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f158042e;

    public y(com.tencent.mm.plugin.remittance.ui.b0 b0Var, android.widget.EditText editText) {
        this.f158042e = b0Var;
        this.f158041d = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText = this.f158041d;
        editText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.f158042e.f157640a.getSystemService("input_method")).showSoftInput(editText, 0);
    }
}
