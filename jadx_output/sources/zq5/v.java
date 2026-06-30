package zq5;

/* loaded from: classes15.dex */
public final class v {

    /* renamed from: f, reason: collision with root package name */
    public static final zq5.v f475094f;

    /* renamed from: a, reason: collision with root package name */
    public final long f475095a;

    /* renamed from: b, reason: collision with root package name */
    public final long f475096b;

    /* renamed from: c, reason: collision with root package name */
    public final float f475097c;

    /* renamed from: d, reason: collision with root package name */
    public final long f475098d;

    /* renamed from: e, reason: collision with root package name */
    public final long f475099e;

    static {
        long a17 = zq5.s.a(1.0f, 1.0f);
        long j17 = zq5.l.f475077b;
        zq5.x xVar = zq5.y.f475100b;
        f475094f = new zq5.v(a17, j17, 0.0f, zq5.a0.b(xVar), zq5.a0.b(xVar), null);
    }

    public v(long j17, long j18, float f17, long j19, long j27, kotlin.jvm.internal.i iVar) {
        this.f475095a = j17;
        this.f475096b = j18;
        this.f475097c = f17;
        this.f475098d = j19;
        this.f475099e = j27;
        if (j17 != zq5.q.f475087c) {
            if (!(j18 != zq5.l.f475078c)) {
                throw new java.lang.IllegalArgumentException("offset must be specified".toString());
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("scale must be specified".toString());
    }

    public final zq5.v a(long j17, long j18, float f17, long j19, long j27) {
        return new zq5.v(j17, j18, f17, j19, j27, null);
    }

    public final float c() {
        return zq5.q.b(this.f475095a);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq5.v)) {
            return false;
        }
        zq5.v vVar = (zq5.v) obj;
        if (zq5.q.a(this.f475095a, vVar.f475095a)) {
            return ((this.f475096b > vVar.f475096b ? 1 : (this.f475096b == vVar.f475096b ? 0 : -1)) == 0) && java.lang.Float.compare(this.f475097c, vVar.f475097c) == 0 && zq5.y.a(this.f475098d, vVar.f475098d) && zq5.y.a(this.f475099e, vVar.f475099e);
        }
        return false;
    }

    public int hashCode() {
        zq5.p pVar = zq5.q.f475086b;
        int hashCode = java.lang.Long.hashCode(this.f475095a) * 31;
        int i17 = zq5.l.f475079d;
        int hashCode2 = (((hashCode + java.lang.Long.hashCode(this.f475096b)) * 31) + java.lang.Float.hashCode(this.f475097c)) * 31;
        zq5.x xVar = zq5.y.f475100b;
        return ((hashCode2 + java.lang.Long.hashCode(this.f475098d)) * 31) + java.lang.Long.hashCode(this.f475099e);
    }

    public java.lang.String toString() {
        return "TransformCompat(scale=" + zq5.s.d(this.f475095a) + ", offset=" + zq5.m.e(this.f475096b) + ", rotation=" + this.f475097c + ", scaleOrigin=" + zq5.a0.c(this.f475098d) + ", rotationOrigin=" + zq5.a0.c(this.f475099e) + ')';
    }

    public /* synthetic */ v(long j17, long j18, float f17, long j19, long j27, int i17, kotlin.jvm.internal.i iVar) {
        this(j17, j18, (i17 & 4) != 0 ? 0.0f : f17, (i17 & 8) != 0 ? zq5.a0.b(zq5.y.f475100b) : j19, (i17 & 16) != 0 ? zq5.a0.b(zq5.y.f475100b) : j27, null);
    }
}
