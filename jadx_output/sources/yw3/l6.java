package yw3;

/* loaded from: classes10.dex */
public final class l6 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f466799d;

    public l6(java.util.List svgResList) {
        kotlin.jvm.internal.o.g(svgResList, "svgResList");
        this.f466799d = svgResList;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        xm3.r0 r0Var = xm3.s0.f455378a;
        return r0Var.a(scope, r0Var.b(this.f466799d.size(), request, new yw3.k6(this)));
    }
}
