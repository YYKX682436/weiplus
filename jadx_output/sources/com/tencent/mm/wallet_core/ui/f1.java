package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class f1 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.q1[] f214140a;

    public f1(com.tencent.mm.wallet_core.ui.q1[] q1VarArr) {
        this.f214140a = q1VarArr;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        if (sVar == null || sVar.G() == null) {
            return;
        }
        com.tencent.mm.wallet_core.ui.q1[] q1VarArr = this.f214140a;
        if (q1VarArr == null || q1VarArr.length == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WalletBaseUtil ", "hy: kvs is null or length is 0");
            return;
        }
        try {
            for (com.tencent.mm.wallet_core.ui.q1 q1Var : q1VarArr) {
                if (q1Var != null) {
                    java.lang.String str = q1Var.f214216a;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        com.tencent.mm.network.o G = sVar.G();
                        java.lang.Object obj = q1Var.f214217b;
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        new java.io.ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
                        G.l1(str, byteArrayOutputStream.toByteArray());
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletBaseUtil ", "hy: serialize failed: %s", e17.toString());
        }
    }
}
