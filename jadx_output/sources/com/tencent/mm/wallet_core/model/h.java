package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class h implements com.tenpay.ndk.CertUtil.EventListener {
    public h(com.tencent.mm.wallet_core.model.j jVar) {
    }

    @Override // com.tenpay.ndk.CertUtil.EventListener
    public java.lang.String getUniqueID() {
        java.lang.String g17 = wo.w0.g(false);
        return com.tencent.mm.sdk.platformtools.t8.K0(g17) ? wo.w0.k() : g17;
    }

    @Override // com.tenpay.ndk.CertUtil.EventListener
    public void onEvent(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "code ret: %s %s", java.lang.Integer.valueOf(i17), str);
    }
}
