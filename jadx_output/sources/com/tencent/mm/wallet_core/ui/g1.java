package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class g1 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f214183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.p1 f214184b;

    public g1(java.lang.String str, com.tencent.mm.wallet_core.ui.p1 p1Var) {
        this.f214183a = str;
        this.f214184b = p1Var;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        com.tencent.mm.wallet_core.ui.p1 p1Var = this.f214184b;
        if (sVar == null || sVar.G() == null) {
            return;
        }
        java.lang.String str = this.f214183a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBaseUtil ", "hy: key is null");
            return;
        }
        try {
            byte[] v17 = sVar.G().v(str);
            if (p1Var != null) {
                if (v17 != null) {
                    p1Var.a(new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(v17)).readObject());
                } else {
                    p1Var.a(null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", e17.toString());
            if (p1Var != null) {
                p1Var.a(null);
            }
        }
    }
}
