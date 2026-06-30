package g4;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final g4.i0 f268410a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f268411b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.z f268412c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j f268413d;

    public l(kotlinx.coroutines.flow.j src, kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(src, "src");
        kotlin.jvm.internal.o.g(scope, "scope");
        g4.i0 i0Var = new g4.i0();
        this.f268410a = i0Var;
        this.f268411b = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f268412c = new h4.z(scope, 0, new kotlinx.coroutines.flow.m2(new g4.j(this, src, null)), false, new g4.k(i0Var), true, 8, null);
        this.f268413d = g4.l4.a(new g4.i(this, null));
    }
}
