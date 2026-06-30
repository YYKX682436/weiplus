package t16;

/* loaded from: classes15.dex */
public final class s implements f26.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f414622a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.v0 f414623b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f414624c;

    /* renamed from: d, reason: collision with root package name */
    public final f26.z0 f414625d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f414626e;

    public s(long j17, o06.v0 v0Var, java.util.Set set, kotlin.jvm.internal.i iVar) {
        f26.r1.f259214e.getClass();
        this.f414625d = f26.r0.b(f26.r1.f259215f, this, false);
        this.f414626e = jz5.h.b(new t16.q(this));
        this.f414622a = j17;
        this.f414623b = v0Var;
        this.f414624c = set;
    }

    @Override // f26.c2
    public java.util.Collection a() {
        return (java.util.List) this.f414626e.getValue();
    }

    @Override // f26.c2
    public java.util.List getParameters() {
        return kz5.p0.f313996d;
    }

    @Override // f26.c2
    public l06.o h() {
        return this.f414623b.h();
    }

    @Override // f26.c2
    public o06.j i() {
        return null;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IntegerLiteralType");
        sb6.append("[" + kz5.n0.g0(this.f414624c, ",", null, null, 0, null, t16.r.f414621d, 30, null) + ']');
        return sb6.toString();
    }
}
