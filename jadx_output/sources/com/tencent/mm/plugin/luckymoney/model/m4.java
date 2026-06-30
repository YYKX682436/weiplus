package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public class m4 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f145451b = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f145450a = new java.util.HashSet();

    public m4() {
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_PAYMSGID_STRING_SYNC, "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        for (java.lang.String str2 : str.split(",")) {
            this.f145450a.add(str2);
        }
    }

    public boolean a(java.lang.String str) {
        synchronized (this.f145451b) {
            if (((java.util.HashSet) this.f145450a).contains(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyMsg", "has contains msg, %s", str);
                return false;
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_PAYMSGID_STRING_SYNC;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder((java.lang.String) c17.m(u3Var, ""));
            if (((java.util.HashSet) this.f145450a).size() <= 0) {
                sb6.append(str);
            } else {
                sb6.append(",");
                sb6.append(str);
            }
            gm0.j1.u().c().x(u3Var, sb6.toString());
            return ((java.util.HashSet) this.f145450a).add(str);
        }
    }

    public void b(java.lang.String str) {
        synchronized (this.f145451b) {
            ((java.util.HashSet) this.f145450a).remove(str);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = ((java.util.HashSet) this.f145450a).iterator();
            while (it.hasNext()) {
                sb6.append((java.lang.String) it.next());
                sb6.append(",");
            }
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_HONGBAO_PAYMSGID_STRING_SYNC, sb6.length() == 0 ? sb6.toString() : sb6.substring(0, sb6.length() - 1));
        }
    }
}
