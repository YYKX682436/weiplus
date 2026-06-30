package s2;

/* loaded from: classes14.dex */
public final class k implements s1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2.b0 f402236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2.s f402237b;

    public k(s2.b0 b0Var, p2.s sVar) {
        this.f402236a = b0Var;
        this.f402237b = sVar;
    }

    @Override // s1.t0
    public int a(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.d(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int b(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.a(this, uVar, list, i17);
    }

    @Override // s1.t0
    public int c(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.c(this, uVar, list, i17);
    }

    @Override // s1.t0
    public final s1.u0 d(s1.x0 Layout, java.util.List list, long j17) {
        kotlin.jvm.internal.o.g(Layout, "$this$Layout");
        kotlin.jvm.internal.o.g(list, "<anonymous parameter 0>");
        this.f402236a.setParentLayoutDirection(this.f402237b);
        return s1.v0.b(Layout, 0, 0, null, s2.j.f402235d, 4, null);
    }

    @Override // s1.t0
    public int e(s1.u uVar, java.util.List list, int i17) {
        return s1.s0.b(this, uVar, list, i17);
    }
}
