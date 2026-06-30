package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public final class z1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.wallet_core.model.z1 f214041a = new com.tencent.mm.wallet_core.model.z1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f214042b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f214043c = new java.util.HashSet();

    public final void a(kotlinx.coroutines.y0 y0Var) {
        if (y0Var != null) {
            kotlinx.coroutines.z0.c(y0Var, null);
        }
    }

    public final kotlinx.coroutines.y0 b() {
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        return kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a).plus(new kotlinx.coroutines.x0("WalletPagDownloadScope")));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r13, java.lang.String r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wallet_core.model.z1.c(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(java.lang.String str) {
        java.util.HashSet hashSet = f214042b;
        synchronized (hashSet) {
            hashSet.remove(str);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            for (yz5.a aVar : f214043c) {
                if (((java.lang.Boolean) aVar.invoke()).booleanValue()) {
                    hashSet2.add(aVar);
                }
            }
            f214043c.removeAll(hashSet2);
        }
    }
}
