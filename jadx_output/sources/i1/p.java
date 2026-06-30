package i1;

/* loaded from: classes14.dex */
public final class p extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f286998c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286999d;

    public p(float f17, float f18) {
        super(false, true, 1, null);
        this.f286998c = f17;
        this.f286999d = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.p)) {
            return false;
        }
        i1.p pVar = (i1.p) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286998c), java.lang.Float.valueOf(pVar.f286998c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286999d), java.lang.Float.valueOf(pVar.f286999d));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f286998c) * 31) + java.lang.Float.hashCode(this.f286999d);
    }

    public java.lang.String toString() {
        return "ReflectiveQuadTo(x=" + this.f286998c + ", y=" + this.f286999d + ')';
    }
}
