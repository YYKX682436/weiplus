package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class q2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179480d;

    public q2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179480d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        boolean equals = "9999/12/31".equals(str);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179480d;
        if (equals) {
            wcPayRealnameVerifyIdInputUI.f179286m.setText(wcPayRealnameVerifyIdInputUI.getString(com.tencent.mm.R.string.l48));
        } else {
            wcPayRealnameVerifyIdInputUI.f179286m.setText(str);
        }
    }
}
