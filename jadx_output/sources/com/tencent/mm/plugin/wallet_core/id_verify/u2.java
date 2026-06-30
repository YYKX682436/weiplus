package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class u2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179502d;

    public u2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179502d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179502d;
        if (wcPayRealnameVerifyIdInputUI.f179299z) {
            return;
        }
        wcPayRealnameVerifyIdInputUI.f179284h.setText(str);
    }
}
