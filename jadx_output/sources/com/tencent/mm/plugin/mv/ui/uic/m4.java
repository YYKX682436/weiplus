package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class m4 extends ym3.a {
    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        u26.k0 k0Var = new u26.k0();
        ym3.d dVar = new ym3.d(request);
        java.util.ArrayList arrayList = dVar.f463149c;
        gm3.c cVar = new gm3.c("", 0, java.lang.System.currentTimeMillis() * 2, -1);
        cVar.f273550n = com.tencent.mm.R.drawable.ard;
        arrayList.add(cVar);
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }
}
