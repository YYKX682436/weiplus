package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f157927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f157928e;

    public s(com.tencent.mm.plugin.remittance.ui.b0 b0Var, android.widget.EditText editText) {
        this.f157928e = b0Var;
        this.f157927d = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText = this.f157927d;
        editText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.f157928e.f157640a.getSystemService("input_method")).showSoftInput(editText, 0);
    }
}
