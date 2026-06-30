package z;

/* loaded from: classes13.dex */
public final class p0 implements z.p {

    /* renamed from: a, reason: collision with root package name */
    public final z.g0 f468778a;

    /* renamed from: b, reason: collision with root package name */
    public final z.j1 f468779b;

    /* renamed from: c, reason: collision with root package name */
    public final long f468780c;

    public p0(z.g0 g0Var, z.j1 j1Var, long j17, kotlin.jvm.internal.i iVar) {
        this.f468778a = g0Var;
        this.f468779b = j1Var;
        this.f468780c = j17;
    }

    @Override // z.p
    public z.r3 a(z.w2 converter) {
        kotlin.jvm.internal.o.g(converter, "converter");
        return new z.b4(this.f468778a.a(converter), this.f468779b, this.f468780c, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof z.p0)) {
            return false;
        }
        z.p0 p0Var = (z.p0) obj;
        if (kotlin.jvm.internal.o.b(p0Var.f468778a, this.f468778a) && p0Var.f468779b == this.f468779b) {
            return (p0Var.f468780c > this.f468780c ? 1 : (p0Var.f468780c == this.f468780c ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f468778a.hashCode() * 31) + this.f468779b.hashCode()) * 31) + java.lang.Long.hashCode(this.f468780c);
    }
}
