package com.tencent.mm.storage;

/* loaded from: classes11.dex */
public final class i0 implements xg3.h0 {
    @Override // xg3.h0
    public void c0(xg3.m0 m0Var, xg3.l0 l0Var) {
        if (z65.c.f470458d || l0Var == null) {
            return;
        }
        java.util.ArrayList arrayList = l0Var.f454412c;
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
            if (f9Var == null || f9Var.getMsgId() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.BizMainCellExposeHelper", "[update36986] IOnMsgChange callback. msgInfo is null, skip");
            } else {
                java.lang.String Q0 = f9Var.Q0();
                com.tencent.mars.xlog.Log.i("MicroMsg.BizMainCellExposeHelper", "[update36986] IOnMsgChange callback. onNotifyChange: username:" + Q0);
                if (com.tencent.mm.storage.z3.i4(Q0)) {
                    com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
                    com.tencent.mm.storage.a0 a0Var = com.tencent.mm.storage.a0.f193708g;
                    kotlin.jvm.internal.o.d(Q0);
                    a1Var.z(a0Var, Q0);
                } else if (!com.tencent.mm.storage.z3.k4(Q0)) {
                    com.tencent.mm.storage.a1 a1Var2 = com.tencent.mm.storage.a1.f193716a;
                    com.tencent.mm.storage.a0 a0Var2 = com.tencent.mm.storage.a0.f193709h;
                    kotlin.jvm.internal.o.d(Q0);
                    a1Var2.z(a0Var2, Q0);
                }
            }
        }
    }
}
