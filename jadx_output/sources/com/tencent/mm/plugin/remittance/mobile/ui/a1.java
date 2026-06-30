package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes9.dex */
public class a1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI f156640d;

    public a1(com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI) {
        this.f156640d = mobileRemittanceUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        double F = com.tencent.mm.sdk.platformtools.t8.F(editable.toString(), 0.0d);
        com.tencent.mm.plugin.remittance.mobile.ui.MobileRemittanceUI mobileRemittanceUI = this.f156640d;
        if (!mobileRemittanceUI.E.n() || F < 0.01d) {
            mobileRemittanceUI.f156631w.e(false);
        } else {
            mobileRemittanceUI.f156631w.e(true);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
