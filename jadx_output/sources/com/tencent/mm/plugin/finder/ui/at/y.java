package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class y extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.u3 f128916d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f128917e;

    public y(com.tencent.mm.storage.u3 storageKey) {
        kotlin.jvm.internal.o.g(storageKey, "storageKey");
        this.f128916d = storageKey;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f128917e;
        if (arrayList != null) {
            int size = arrayList.size();
            int i17 = request.f463144b;
            if (i17 < size) {
                int size2 = arrayList.size();
                int i18 = request.f463145c;
                int size3 = size2 > i17 + i18 ? i18 + i17 : arrayList.size();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList arrayList3 = this.f128917e;
                if (arrayList3 != null) {
                    while (i17 < size3) {
                        arrayList2.add(arrayList3.get(i17));
                        i17++;
                    }
                    for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.f(arrayList3)) {
                        if (((int) z3Var.E2) != 0) {
                            java.util.ArrayList arrayList4 = dVar.f463149c;
                            com.tencent.mm.plugin.finder.ui.at.t tVar = new com.tencent.mm.plugin.finder.ui.at.t(-1, z3Var, 0);
                            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.clm);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            tVar.f128908n = string;
                            arrayList4.add(tVar);
                        }
                    }
                }
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public int getPriority() {
        return 0;
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.ArrayList arrayList;
        this.f128917e = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.ui.at.a0 a0Var = com.tencent.mm.plugin.finder.ui.at.a0.f128875a;
        com.tencent.mm.storage.u3 key = this.f128916d;
        kotlin.jvm.internal.o.g(key, "key");
        java.lang.Object m17 = gm0.j1.u().c().m(key, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.util.List a17 = a0Var.a((java.lang.String) m17);
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.ui.at.z zVar = (com.tencent.mm.plugin.finder.ui.at.z) it.next();
            if (!kotlin.jvm.internal.o.b(zVar.f128918a, r17) && (arrayList = this.f128917e) != null) {
                arrayList.add(zVar.f128918a);
            }
        }
    }
}
