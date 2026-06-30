package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes5.dex */
public class k0 implements android.text.TextWatcher {
    public k0(com.tencent.mm.plugin.remittance.ui.RemittanceBaseUI remittanceBaseUI) {
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        if (indexOf < 0 || length - indexOf <= 2) {
            return;
        }
        editable.delete(indexOf + 3, length);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
