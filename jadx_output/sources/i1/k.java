package i1;

/* loaded from: classes14.dex */
public final class k extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f286964c;

    public k(float f17) {
        super(false, false, 3, null);
        this.f286964c = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1.k) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286964c), java.lang.Float.valueOf(((i1.k) obj).f286964c));
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f286964c);
    }

    public java.lang.String toString() {
        return "HorizontalTo(x=" + this.f286964c + ')';
    }
}
