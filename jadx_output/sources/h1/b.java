package h1;

/* loaded from: classes14.dex */
public final class b extends h1.c {

    /* renamed from: i, reason: collision with root package name */
    public final long f277948i;

    /* renamed from: n, reason: collision with root package name */
    public e1.z f277950n;

    /* renamed from: m, reason: collision with root package name */
    public float f277949m = 1.0f;

    /* renamed from: o, reason: collision with root package name */
    public final long f277951o = d1.k.f225642c;

    public b(long j17, kotlin.jvm.internal.i iVar) {
        this.f277948i = j17;
    }

    @Override // h1.c
    public boolean a(float f17) {
        this.f277949m = f17;
        return true;
    }

    @Override // h1.c
    public boolean e(e1.z zVar) {
        this.f277950n = zVar;
        return true;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h1.b) {
            return e1.y.c(this.f277948i, ((h1.b) obj).f277948i);
        }
        return false;
    }

    @Override // h1.c
    public long h() {
        return this.f277951o;
    }

    public int hashCode() {
        int i17 = e1.y.f246321l;
        return java.lang.Long.hashCode(this.f277948i);
    }

    @Override // h1.c
    public void i(g1.i iVar) {
        kotlin.jvm.internal.o.g(iVar, "<this>");
        g1.h.h(iVar, this.f277948i, 0L, 0L, this.f277949m, null, this.f277950n, 0, 86, null);
    }

    public java.lang.String toString() {
        return "ColorPainter(color=" + ((java.lang.Object) e1.y.i(this.f277948i)) + ')';
    }
}
