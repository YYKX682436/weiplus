package d1;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f225633a;

    /* renamed from: b, reason: collision with root package name */
    public final float f225634b;

    /* renamed from: c, reason: collision with root package name */
    public final float f225635c;

    /* renamed from: d, reason: collision with root package name */
    public final float f225636d;

    /* renamed from: e, reason: collision with root package name */
    public final long f225637e;

    /* renamed from: f, reason: collision with root package name */
    public final long f225638f;

    /* renamed from: g, reason: collision with root package name */
    public final long f225639g;

    /* renamed from: h, reason: collision with root package name */
    public final long f225640h;

    static {
        int i17 = d1.a.f225618b;
        d1.j.a(0.0f, 0.0f, 0.0f, 0.0f, d1.a.f225617a);
    }

    public i(float f17, float f18, float f19, float f27, long j17, long j18, long j19, long j27, kotlin.jvm.internal.i iVar) {
        this.f225633a = f17;
        this.f225634b = f18;
        this.f225635c = f19;
        this.f225636d = f27;
        this.f225637e = j17;
        this.f225638f = j18;
        this.f225639g = j19;
        this.f225640h = j27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1.i)) {
            return false;
        }
        d1.i iVar = (d1.i) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f225633a), java.lang.Float.valueOf(iVar.f225633a)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f225634b), java.lang.Float.valueOf(iVar.f225634b)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f225635c), java.lang.Float.valueOf(iVar.f225635c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f225636d), java.lang.Float.valueOf(iVar.f225636d)) && d1.a.a(this.f225637e, iVar.f225637e) && d1.a.a(this.f225638f, iVar.f225638f) && d1.a.a(this.f225639g, iVar.f225639g) && d1.a.a(this.f225640h, iVar.f225640h);
    }

    public int hashCode() {
        int hashCode = ((((((java.lang.Float.hashCode(this.f225633a) * 31) + java.lang.Float.hashCode(this.f225634b)) * 31) + java.lang.Float.hashCode(this.f225635c)) * 31) + java.lang.Float.hashCode(this.f225636d)) * 31;
        int i17 = d1.a.f225618b;
        return ((((((hashCode + java.lang.Long.hashCode(this.f225637e)) * 31) + java.lang.Long.hashCode(this.f225638f)) * 31) + java.lang.Long.hashCode(this.f225639g)) * 31) + java.lang.Long.hashCode(this.f225640h);
    }

    public java.lang.String toString() {
        java.lang.String str = d1.c.a(this.f225633a, 1) + ", " + d1.c.a(this.f225634b, 1) + ", " + d1.c.a(this.f225635c, 1) + ", " + d1.c.a(this.f225636d, 1);
        long j17 = this.f225637e;
        long j18 = this.f225638f;
        boolean a17 = d1.a.a(j17, j18);
        long j19 = this.f225639g;
        long j27 = this.f225640h;
        if (!a17 || !d1.a.a(j18, j19) || !d1.a.a(j19, j27)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((java.lang.Object) d1.a.d(j17)) + ", topRight=" + ((java.lang.Object) d1.a.d(j18)) + ", bottomRight=" + ((java.lang.Object) d1.a.d(j19)) + ", bottomLeft=" + ((java.lang.Object) d1.a.d(j27)) + ')';
        }
        if (d1.a.b(j17) == d1.a.c(j17)) {
            return "RoundRect(rect=" + str + ", radius=" + d1.c.a(d1.a.b(j17), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + d1.c.a(d1.a.b(j17), 1) + ", y=" + d1.c.a(d1.a.c(j17), 1) + ')';
    }
}
