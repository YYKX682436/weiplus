package ix3;

/* loaded from: classes10.dex */
public final class u extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f295568d;

    public u(java.util.List itemList) {
        kotlin.jvm.internal.o.g(itemList, "itemList");
        this.f295568d = itemList;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        xm3.r0 r0Var = xm3.s0.f455378a;
        return r0Var.a(scope, r0Var.b(this.f295568d.size(), request, new ix3.t(this)));
    }

    @Override // ym3.f
    public void onCreate() {
    }
}
