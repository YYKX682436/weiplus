package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class i1 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f214190a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.n1 f214191b;

    public i1(java.lang.String[] strArr, com.tencent.mm.wallet_core.ui.n1 n1Var) {
        this.f214190a = strArr;
        this.f214191b = n1Var;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        com.tencent.mm.wallet_core.ui.n1 n1Var = this.f214191b;
        if (sVar == null || sVar.G() == null) {
            return;
        }
        java.lang.String[] strArr = this.f214190a;
        if (strArr == null || strArr.length == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBaseUtil ", "hy: keys is null");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (java.lang.String str : strArr) {
            try {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletBaseUtil ", "hy: key is null");
                } else {
                    byte[] v17 = sVar.G().v(str);
                    if (v17 != null) {
                        hashMap.put(str, new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(v17)).readObject());
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletBaseUtil ", "hy: deserialize failed: %s", e17.toString());
                if (n1Var != null) {
                    n1Var.a(null);
                    return;
                }
                return;
            }
        }
        if (n1Var != null) {
            n1Var.a(hashMap);
        }
    }
}
