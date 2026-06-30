package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes9.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f157963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.ui.b0 f157964e;

    public u(com.tencent.mm.plugin.remittance.ui.b0 b0Var, android.widget.EditText editText) {
        this.f157964e = b0Var;
        this.f157963d = editText;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.EditText editText = this.f157963d;
        editText.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.f157964e.f157640a.getSystemService("input_method")).showSoftInput(editText, 0);
    }
}
