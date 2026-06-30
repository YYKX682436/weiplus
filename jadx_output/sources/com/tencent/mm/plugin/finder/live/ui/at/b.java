package com.tencent.mm.plugin.finder.live.ui.at;

/* loaded from: classes.dex */
public final class b extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f115402d;

    public b(java.lang.String groupId) {
        kotlin.jvm.internal.o.g(groupId, "groupId");
        this.f115402d = groupId;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    @Override // ym3.f
    public int getPriority() {
        return 0;
    }

    @Override // ym3.f
    public void onCreate() {
        ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f115402d);
    }
}
