package yg;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f462018a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f462019b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public int f462020c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f462021d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f462022e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f462023f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f462024g = 0;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg.a)) {
            return false;
        }
        yg.a aVar = (yg.a) obj;
        return java.lang.Float.compare(this.f462018a, aVar.f462018a) == 0 && java.lang.Float.compare(this.f462019b, aVar.f462019b) == 0 && this.f462020c == aVar.f462020c && this.f462021d == aVar.f462021d && java.lang.Float.compare(this.f462022e, aVar.f462022e) == 0 && this.f462023f == aVar.f462023f && this.f462024g == aVar.f462024g;
    }

    public int hashCode() {
        return (((((((((((java.lang.Float.hashCode(this.f462018a) * 31) + java.lang.Float.hashCode(this.f462019b)) * 31) + java.lang.Integer.hashCode(this.f462020c)) * 31) + java.lang.Integer.hashCode(this.f462021d)) * 31) + java.lang.Float.hashCode(this.f462022e)) * 31) + java.lang.Integer.hashCode(this.f462023f)) * 31) + java.lang.Integer.hashCode(this.f462024g);
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "fps(%.2f, %.2f, %d, %d, %.2f%%)", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf(this.f462018a), java.lang.Float.valueOf(this.f462019b), java.lang.Integer.valueOf(this.f462020c), java.lang.Integer.valueOf(this.f462021d), java.lang.Float.valueOf(this.f462022e * 100)}, 5));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
