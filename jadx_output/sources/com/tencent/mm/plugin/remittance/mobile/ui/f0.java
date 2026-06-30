package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class f0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI f156666d;

    public f0(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI) {
        this.f156666d = mobileRemitNumberInputUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemitNumberInputUI mobileRemitNumberInputUI = this.f156666d;
        if (mobileRemitNumberInputUI.f156581m.getInputLength() > 0) {
            mobileRemitNumberInputUI.f156582n.setEnabled(true);
        } else {
            mobileRemitNumberInputUI.f156582n.setEnabled(false);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
