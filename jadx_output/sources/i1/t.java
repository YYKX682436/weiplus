package i1;

/* loaded from: classes14.dex */
public final class t extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287025c;

    /* renamed from: d, reason: collision with root package name */
    public final float f287026d;

    public t(float f17, float f18) {
        super(false, false, 3, null);
        this.f287025c = f17;
        this.f287026d = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.t)) {
            return false;
        }
        i1.t tVar = (i1.t) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287025c), java.lang.Float.valueOf(tVar.f287025c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287026d), java.lang.Float.valueOf(tVar.f287026d));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f287025c) * 31) + java.lang.Float.hashCode(this.f287026d);
    }

    public java.lang.String toString() {
        return "RelativeLineTo(dx=" + this.f287025c + ", dy=" + this.f287026d + ')';
    }
}
