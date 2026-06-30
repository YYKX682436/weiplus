package i1;

/* loaded from: classes14.dex */
public final class u extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287046c;

    /* renamed from: d, reason: collision with root package name */
    public final float f287047d;

    public u(float f17, float f18) {
        super(false, false, 3, null);
        this.f287046c = f17;
        this.f287047d = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.u)) {
            return false;
        }
        i1.u uVar = (i1.u) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287046c), java.lang.Float.valueOf(uVar.f287046c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287047d), java.lang.Float.valueOf(uVar.f287047d));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f287046c) * 31) + java.lang.Float.hashCode(this.f287047d);
    }

    public java.lang.String toString() {
        return "RelativeMoveTo(dx=" + this.f287046c + ", dy=" + this.f287047d + ')';
    }
}
