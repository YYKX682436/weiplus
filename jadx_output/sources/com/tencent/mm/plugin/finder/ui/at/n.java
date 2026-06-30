package com.tencent.mm.plugin.finder.ui.at;

/* loaded from: classes.dex */
public final class n extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f128897d;

    public n() {
        jz5.h.b(com.tencent.mm.plugin.finder.ui.at.m.f128896d);
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        int size;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f128897d;
        if (arrayList != null) {
            int size2 = arrayList.size();
            int i17 = request.f463144b;
            if (i17 < size2) {
                int size3 = arrayList.size();
                int i18 = request.f463145c;
                if (size3 > i17 + i18) {
                    dVar.f463148b = true;
                    size = i18 + i17;
                } else {
                    size = arrayList.size();
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                while (i17 < size) {
                    arrayList2.add(arrayList.get(i17));
                    i17++;
                }
                for (com.tencent.mm.storage.z3 z3Var : g95.e.f269801a.f(arrayList2)) {
                    if (((int) z3Var.E2) != 0) {
                        dVar.f463149c.add(new com.tencent.mm.plugin.finder.ui.at.t(0, z3Var, 3));
                    }
                }
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public int getPriority() {
        return -1;
    }

    @Override // ym3.f
    public void onCreate() {
        this.f128897d = new java.util.ArrayList();
        android.database.Cursor K = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().K();
        if (K != null) {
            com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
            while (K.moveToNext()) {
                z3Var.convertFrom(K);
                java.util.ArrayList arrayList = this.f128897d;
                if (arrayList != null) {
                    arrayList.add(z3Var.d1());
                }
            }
            K.close();
        }
        java.util.ArrayList arrayList2 = this.f128897d;
        kotlin.jvm.internal.o.d(arrayList2);
        arrayList2.remove(c01.z1.r());
    }
}
