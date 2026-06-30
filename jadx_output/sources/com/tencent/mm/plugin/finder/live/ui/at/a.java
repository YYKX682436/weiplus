package com.tencent.mm.plugin.finder.live.ui.at;

/* loaded from: classes.dex */
public final class a extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f115401d;

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f115401d;
        if (arrayList != null) {
            int size = arrayList.size();
            int i17 = request.f463144b;
            if (i17 < size) {
                int size2 = arrayList.size();
                int i18 = request.f463145c;
                int size3 = size2 > i17 + i18 ? i18 + i17 : arrayList.size();
                while (i17 < size3) {
                    java.lang.Object obj = arrayList.get(i17);
                    kotlin.jvm.internal.o.f(obj, "get(...)");
                    if (kotlin.jvm.internal.o.b((java.lang.String) obj, "notify@all")) {
                        java.util.ArrayList arrayList2 = dVar.f463149c;
                        com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                        z3Var.X1("notify@all");
                        arrayList2.add(new com.tencent.mm.plugin.finder.ui.at.t(-1, z3Var, 1));
                    }
                    i17++;
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
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("notify@all");
        this.f115401d = arrayList;
    }
}
