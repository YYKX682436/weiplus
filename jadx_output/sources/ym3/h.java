package ym3;

/* loaded from: classes4.dex */
public final class h extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f463153d;

    public h(java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f463153d = dataList;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        xm3.r0 r0Var = xm3.s0.f455378a;
        return r0Var.a(scope, r0Var.b(this.f463153d.size(), request, new ym3.g(this)));
    }
}
