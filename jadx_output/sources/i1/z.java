package i1;

/* loaded from: classes14.dex */
public final class z extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287080c;

    public z(float f17) {
        super(false, false, 3, null);
        this.f287080c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1.z) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287080c), java.lang.Float.valueOf(((i1.z) obj).f287080c));
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f287080c);
    }

    public java.lang.String toString() {
        return "VerticalTo(y=" + this.f287080c + ')';
    }
}
