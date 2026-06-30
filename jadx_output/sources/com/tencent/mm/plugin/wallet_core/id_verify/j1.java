package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class j1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI f179398d;

    public j1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI wcPayRealnameInputAddressUI) {
        this.f179398d = wcPayRealnameInputAddressUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        int i17 = com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameInputAddressUI.f179245t;
        this.f179398d.U6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
