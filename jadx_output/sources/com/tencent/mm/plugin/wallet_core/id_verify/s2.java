package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class s2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179491d;

    public s2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179491d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179491d;
        if (num == null) {
            wcPayRealnameVerifyIdInputUI.f179287n.setText("");
        } else {
            wcPayRealnameVerifyIdInputUI.f179287n.setText(wcPayRealnameVerifyIdInputUI.H[num.intValue()]);
        }
    }
}
