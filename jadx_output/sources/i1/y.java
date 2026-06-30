package i1;

/* loaded from: classes14.dex */
public final class y extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287074c;

    public y(float f17) {
        super(false, false, 3, null);
        this.f287074c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1.y) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287074c), java.lang.Float.valueOf(((i1.y) obj).f287074c));
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f287074c);
    }

    public java.lang.String toString() {
        return "RelativeVerticalTo(dy=" + this.f287074c + ')';
    }
}
