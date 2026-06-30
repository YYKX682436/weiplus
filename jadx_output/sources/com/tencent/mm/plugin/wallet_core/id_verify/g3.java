package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class g3 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179379d;

    public g3(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179379d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179379d;
        wcPayRealnameVerifyIdInputUI.C = obj;
        wcPayRealnameVerifyIdInputUI.D = wcPayRealnameVerifyIdInputUI.f179282f.getText();
        com.tencent.mm.plugin.wallet_core.id_verify.p3 p3Var = wcPayRealnameVerifyIdInputUI.A;
        p3Var.f179462g.setValue(wcPayRealnameVerifyIdInputUI.D);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
