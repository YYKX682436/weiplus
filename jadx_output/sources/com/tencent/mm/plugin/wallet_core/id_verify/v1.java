package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class v1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI f179518d;

    public v1(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI wcPayRealnameVerifyCodeUI) {
        this.f179518d = wcPayRealnameVerifyCodeUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyCodeUI.U6(this.f179518d);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
