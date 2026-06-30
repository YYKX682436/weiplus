package i1;

/* loaded from: classes14.dex */
public final class s extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287021c;

    public s(float f17) {
        super(false, false, 3, null);
        this.f287021c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1.s) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287021c), java.lang.Float.valueOf(((i1.s) obj).f287021c));
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f287021c);
    }

    public java.lang.String toString() {
        return "RelativeHorizontalTo(dx=" + this.f287021c + ')';
    }
}
