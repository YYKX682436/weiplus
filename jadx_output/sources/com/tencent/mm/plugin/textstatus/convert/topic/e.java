package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes.dex */
public final class e extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f173272d;

    public e(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f173272d = list;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        dVar.f463149c.addAll(this.f173272d);
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }
}
