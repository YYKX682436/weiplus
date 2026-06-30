package ym3;

/* loaded from: classes.dex */
public abstract class b extends ym3.a {
    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public final kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        return d(scope, (xm3.v0) request);
    }

    public abstract kotlinx.coroutines.flow.j d(v65.i iVar, xm3.v0 v0Var);

    public abstract void e();
}
