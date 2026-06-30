package ym3;

/* loaded from: classes.dex */
public abstract class a implements ym3.f {
    public ym3.f b(ym3.f dataSource) {
        kotlin.jvm.internal.o.g(dataSource, "dataSource");
        return new ym3.n(this, dataSource);
    }

    @Override // ym3.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }
}
