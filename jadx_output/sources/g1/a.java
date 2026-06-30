package g1;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public p2.f f267500a;

    /* renamed from: b, reason: collision with root package name */
    public p2.s f267501b;

    /* renamed from: c, reason: collision with root package name */
    public e1.u f267502c;

    /* renamed from: d, reason: collision with root package name */
    public long f267503d;

    public a(p2.f fVar, p2.s sVar, e1.u uVar, long j17, int i17, kotlin.jvm.internal.i iVar) {
        fVar = (i17 & 1) != 0 ? g1.e.f267511a : fVar;
        sVar = (i17 & 2) != 0 ? p2.s.Ltr : sVar;
        uVar = (i17 & 4) != 0 ? new g1.l() : uVar;
        if ((i17 & 8) != 0) {
            int i18 = d1.k.f225643d;
            j17 = d1.k.f225641b;
        }
        this.f267500a = fVar;
        this.f267501b = sVar;
        this.f267502c = uVar;
        this.f267503d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1.a)) {
            return false;
        }
        g1.a aVar = (g1.a) obj;
        return kotlin.jvm.internal.o.b(this.f267500a, aVar.f267500a) && this.f267501b == aVar.f267501b && kotlin.jvm.internal.o.b(this.f267502c, aVar.f267502c) && d1.k.a(this.f267503d, aVar.f267503d);
    }

    public int hashCode() {
        int hashCode = ((((this.f267500a.hashCode() * 31) + this.f267501b.hashCode()) * 31) + this.f267502c.hashCode()) * 31;
        long j17 = this.f267503d;
        int i17 = d1.k.f225643d;
        return hashCode + java.lang.Long.hashCode(j17);
    }

    public java.lang.String toString() {
        return "DrawParams(density=" + this.f267500a + ", layoutDirection=" + this.f267501b + ", canvas=" + this.f267502c + ", size=" + ((java.lang.Object) d1.k.f(this.f267503d)) + ')';
    }
}
