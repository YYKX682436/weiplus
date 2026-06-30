package com.tencent.mm.plugin.wallet_core.id_verify;

/* loaded from: classes9.dex */
public class v2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI f179519d;

    public v2(com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI) {
        this.f179519d = wcPayRealnameVerifyIdInputUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "[detailAddressLD onChanged] s：%s", (java.lang.String) obj);
        com.tencent.mm.plugin.wallet_core.id_verify.WcPayRealnameVerifyIdInputUI wcPayRealnameVerifyIdInputUI = this.f179519d;
        if (wcPayRealnameVerifyIdInputUI.f179299z) {
            wcPayRealnameVerifyIdInputUI.f179284h.setText(((java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179467o.getValue()) + ((java.lang.String) wcPayRealnameVerifyIdInputUI.A.f179468p.getValue()));
            com.tencent.mars.xlog.Log.i("MicroMsg.WcPayRealnameVerifyIdInputUI", "[detailAddressLD onChanged] setText，vm.areaStrLD：%s， vm.detailAddressLD：%s", wcPayRealnameVerifyIdInputUI.A.f179467o.getValue(), wcPayRealnameVerifyIdInputUI.A.f179468p.getValue());
        }
    }
}
