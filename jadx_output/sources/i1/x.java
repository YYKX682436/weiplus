package i1;

/* loaded from: classes14.dex */
public final class x extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287069c;

    /* renamed from: d, reason: collision with root package name */
    public final float f287070d;

    public x(float f17, float f18) {
        super(false, true, 1, null);
        this.f287069c = f17;
        this.f287070d = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.x)) {
            return false;
        }
        i1.x xVar = (i1.x) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287069c), java.lang.Float.valueOf(xVar.f287069c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287070d), java.lang.Float.valueOf(xVar.f287070d));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f287069c) * 31) + java.lang.Float.hashCode(this.f287070d);
    }

    public java.lang.String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.f287069c + ", dy=" + this.f287070d + ')';
    }
}
