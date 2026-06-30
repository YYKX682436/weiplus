package s16;

/* loaded from: classes16.dex */
public final class c implements s16.b {

    /* renamed from: a, reason: collision with root package name */
    public final f26.l2 f402190a;

    /* renamed from: b, reason: collision with root package name */
    public g26.s f402191b;

    public c(f26.l2 projection) {
        kotlin.jvm.internal.o.g(projection, "projection");
        this.f402190a = projection;
        projection.c();
        f26.d3 d3Var = f26.d3.f259143f;
    }

    @Override // f26.c2
    public java.util.Collection a() {
        f26.l2 l2Var = this.f402190a;
        f26.o0 type = l2Var.c() == f26.d3.f259145h ? l2Var.getType() : h().p();
        kotlin.jvm.internal.o.d(type);
        return kz5.b0.c(type);
    }

    @Override // f26.c2
    public java.util.List getParameters() {
        return kz5.p0.f313996d;
    }

    @Override // s16.b
    public f26.l2 getProjection() {
        return this.f402190a;
    }

    @Override // f26.c2
    public l06.o h() {
        l06.o h17 = this.f402190a.getType().w0().h();
        kotlin.jvm.internal.o.f(h17, "getBuiltIns(...)");
        return h17;
    }

    @Override // f26.c2
    public /* bridge */ /* synthetic */ o06.j i() {
        return null;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    public java.lang.String toString() {
        return "CapturedTypeConstructor(" + this.f402190a + ')';
    }
}
