package d1;

/* loaded from: classes14.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final d1.g f225628e = new d1.g(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f225629a;

    /* renamed from: b, reason: collision with root package name */
    public final float f225630b;

    /* renamed from: c, reason: collision with root package name */
    public final float f225631c;

    /* renamed from: d, reason: collision with root package name */
    public final float f225632d;

    public g(float f17, float f18, float f19, float f27) {
        this.f225629a = f17;
        this.f225630b = f18;
        this.f225631c = f19;
        this.f225632d = f27;
    }

    public final long a() {
        float f17 = this.f225631c;
        float f18 = this.f225629a;
        float f19 = f18 + ((f17 - f18) / 2.0f);
        float f27 = this.f225632d;
        float f28 = this.f225630b;
        return d1.f.a(f19, f28 + ((f27 - f28) / 2.0f));
    }

    public final boolean b(d1.g other) {
        kotlin.jvm.internal.o.g(other, "other");
        return this.f225631c > other.f225629a && other.f225631c > this.f225629a && this.f225632d > other.f225630b && other.f225632d > this.f225630b;
    }

    public final d1.g c(float f17, float f18) {
        return new d1.g(this.f225629a + f17, this.f225630b + f18, this.f225631c + f17, this.f225632d + f18);
    }

    public final d1.g d(long j17) {
        return new d1.g(this.f225629a + d1.e.c(j17), this.f225630b + d1.e.d(j17), this.f225631c + d1.e.c(j17), this.f225632d + d1.e.d(j17));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1.g)) {
            return false;
        }
        d1.g gVar = (d1.g) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f225629a), java.lang.Float.valueOf(gVar.f225629a)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f225630b), java.lang.Float.valueOf(gVar.f225630b)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f225631c), java.lang.Float.valueOf(gVar.f225631c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f225632d), java.lang.Float.valueOf(gVar.f225632d));
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f225629a) * 31) + java.lang.Float.hashCode(this.f225630b)) * 31) + java.lang.Float.hashCode(this.f225631c)) * 31) + java.lang.Float.hashCode(this.f225632d);
    }

    public java.lang.String toString() {
        return "Rect.fromLTRB(" + d1.c.a(this.f225629a, 1) + ", " + d1.c.a(this.f225630b, 1) + ", " + d1.c.a(this.f225631c, 1) + ", " + d1.c.a(this.f225632d, 1) + ')';
    }
}
