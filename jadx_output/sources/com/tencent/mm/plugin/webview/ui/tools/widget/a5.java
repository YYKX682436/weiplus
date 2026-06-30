package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes3.dex */
public final class a5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187103d;

    public a5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187103d = z5Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187103d;
        android.widget.Button button = z5Var.A;
        android.text.Editable text = z5Var.B.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        button.setEnabled(text.length() > 0);
    }
}
