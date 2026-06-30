package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class mj implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        dk2.u7 u7Var = dk2.u7.f234181a;
        ce2.i e17 = u7Var.e((java.lang.String) obj);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(e17 != null ? e17.c1().getInteger(31) : 0);
        ce2.i e18 = u7Var.e((java.lang.String) obj2);
        return mz5.a.b(valueOf, java.lang.Integer.valueOf(e18 != null ? e18.c1().getInteger(31) : 0));
    }
}
