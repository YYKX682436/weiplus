package rr3;

/* loaded from: classes4.dex */
public final class c extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f399178d;

    /* renamed from: e, reason: collision with root package name */
    public int f399179e;

    public c(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f399178d = username;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        kotlinx.coroutines.flow.i2 b17 = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);
        v65.i.b(scope, null, new rr3.b(request, this, b17, null), 1, null);
        return b17;
    }
}
