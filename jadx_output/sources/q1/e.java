package q1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final q1.e f359488e;

    /* renamed from: a, reason: collision with root package name */
    public final long f359489a;

    /* renamed from: b, reason: collision with root package name */
    public final float f359490b;

    /* renamed from: c, reason: collision with root package name */
    public final long f359491c;

    /* renamed from: d, reason: collision with root package name */
    public final long f359492d;

    static {
        long j17 = d1.e.f225623b;
        f359488e = new q1.e(j17, 1.0f, 0L, j17, null);
    }

    public e(long j17, float f17, long j18, long j19, kotlin.jvm.internal.i iVar) {
        this.f359489a = j17;
        this.f359490b = f17;
        this.f359491c = j18;
        this.f359492d = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1.e)) {
            return false;
        }
        q1.e eVar = (q1.e) obj;
        return d1.e.a(this.f359489a, eVar.f359489a) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f359490b), java.lang.Float.valueOf(eVar.f359490b)) && this.f359491c == eVar.f359491c && d1.e.a(this.f359492d, eVar.f359492d);
    }

    public int hashCode() {
        int i17 = d1.e.f225626e;
        return (((((java.lang.Long.hashCode(this.f359489a) * 31) + java.lang.Float.hashCode(this.f359490b)) * 31) + java.lang.Long.hashCode(this.f359491c)) * 31) + java.lang.Long.hashCode(this.f359492d);
    }

    public java.lang.String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + ((java.lang.Object) d1.e.h(this.f359489a)) + ", confidence=" + this.f359490b + ", durationMillis=" + this.f359491c + ", offset=" + ((java.lang.Object) d1.e.h(this.f359492d)) + ')';
    }
}
