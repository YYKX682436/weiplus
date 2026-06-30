package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public enum h0 {
    INSTANCE;


    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f180296d = new java.util.HashMap();

    h0() {
    }

    public com.tencent.mm.plugin.wallet_core.ui.g0 a(com.tencent.mm.plugin.wallet_core.model.Orders orders) {
        java.lang.String str;
        vr4.j0 j0Var;
        if (orders == null || orders.M == null) {
            str = null;
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            for (int i17 = 0; i17 < orders.M.size(); i17++) {
                sb6.append(((com.tencent.mm.plugin.wallet_core.model.Orders.Commodity) orders.M.get(i17)).f179714r);
            }
            sb6.append("@");
            sb6.append(orders.f179674d);
            str = sb6.toString();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavorLogicHelperPool", "get key null");
            return null;
        }
        java.util.Map map = this.f180296d;
        if (((java.util.HashMap) map).containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavorLogicHelperPool", "hit cache, key:" + str);
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.HashMap) map).get(str);
            if (weakReference != null) {
                com.tencent.mm.plugin.wallet_core.ui.g0 g0Var = (com.tencent.mm.plugin.wallet_core.ui.g0) weakReference.get();
                if (g0Var != null) {
                    return g0Var;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FavorLogicHelperPool", "helper null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavorLogicHelperPool", "weakHelper null");
            }
        }
        if (orders == null || (j0Var = orders.N) == null) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.ui.g0 g0Var2 = new com.tencent.mm.plugin.wallet_core.ui.g0(j0Var);
        ((java.util.HashMap) map).put(str, new java.lang.ref.WeakReference(g0Var2));
        return g0Var2;
    }
}
