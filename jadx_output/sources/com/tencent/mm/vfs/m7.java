package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class m7 implements com.tencent.mm.vfs.x2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.m7 f213077a = new com.tencent.mm.vfs.m7();

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.vfs.r f213078b;

    @Override // com.tencent.mm.vfs.x2
    public void a(android.os.CancellationSignal cancellationSignal) {
        java.util.List<android.util.Pair> b17 = com.tencent.mm.vfs.q7.b(false);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        for (android.util.Pair pair : b17) {
            arrayList.add(new jz5.l(pair.first, pair.second));
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        java.util.Map c17 = b3Var.c();
        lz5.m mVar = new lz5.m();
        for (java.lang.String str : b3Var.e().keySet()) {
            com.tencent.mm.vfs.e7 e7Var = com.tencent.mm.vfs.e7.f212911a;
            kotlin.jvm.internal.o.d(str);
            java.lang.String c18 = e7Var.c(str);
            if (c18 != null) {
                mVar.put(str, c18);
            }
        }
        java.util.Map b18 = kz5.b1.b(mVar);
        java.lang.String e17 = com.tencent.mm.vfs.e8.e(c17, "account");
        if (e17 == null) {
            e17 = "";
        }
        java.lang.String e18 = com.tencent.mm.vfs.e8.e(c17, "accountSalt");
        f213078b = new com.tencent.mm.vfs.r(arrayList, b18, e17, e18 != null ? e18 : "");
    }

    @Override // com.tencent.mm.vfs.x2
    public boolean b(java.lang.String name, com.tencent.mm.vfs.q2 fs6, android.os.CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(fs6, "fs");
        com.tencent.mm.vfs.r rVar = f213078b;
        kotlin.jvm.internal.o.d(rVar);
        boolean z17 = true;
        q26.n C = kz5.z.C(new com.tencent.mm.vfs.q2[]{fs6});
        com.tencent.mm.vfs.p2 p2Var = fs6 instanceof com.tencent.mm.vfs.p2 ? (com.tencent.mm.vfs.p2) fs6 : null;
        java.util.List E = p2Var != null ? p2Var.E() : null;
        if (E == null) {
            E = kz5.p0.f313996d;
        }
        q26.j jVar = new q26.j((q26.k) q26.h0.s(C, E));
        while (jVar.hasNext()) {
            com.tencent.mm.vfs.q2 q2Var = (com.tencent.mm.vfs.q2) jVar.next();
            for (jz5.l lVar : com.tencent.mm.vfs.p7.f213128b) {
                if (((java.lang.Class) lVar.f302833d).isInstance(q2Var)) {
                    yz5.p pVar = (yz5.p) lVar.f302834e;
                    kotlin.jvm.internal.o.d(q2Var);
                    z17 &= ((java.lang.Boolean) pVar.invoke(rVar, q2Var)).booleanValue();
                }
            }
        }
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        return z17;
    }

    @Override // com.tencent.mm.vfs.x2
    public void c(boolean z17, boolean z18, android.os.CancellationSignal cancellationSignal) {
    }
}
