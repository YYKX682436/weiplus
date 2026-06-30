package i1;

/* loaded from: classes14.dex */
public final class v extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287051c;

    /* renamed from: d, reason: collision with root package name */
    public final float f287052d;

    /* renamed from: e, reason: collision with root package name */
    public final float f287053e;

    /* renamed from: f, reason: collision with root package name */
    public final float f287054f;

    public v(float f17, float f18, float f19, float f27) {
        super(false, true, 1, null);
        this.f287051c = f17;
        this.f287052d = f18;
        this.f287053e = f19;
        this.f287054f = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.v)) {
            return false;
        }
        i1.v vVar = (i1.v) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287051c), java.lang.Float.valueOf(vVar.f287051c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287052d), java.lang.Float.valueOf(vVar.f287052d)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287053e), java.lang.Float.valueOf(vVar.f287053e)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287054f), java.lang.Float.valueOf(vVar.f287054f));
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f287051c) * 31) + java.lang.Float.hashCode(this.f287052d)) * 31) + java.lang.Float.hashCode(this.f287053e)) * 31) + java.lang.Float.hashCode(this.f287054f);
    }

    public java.lang.String toString() {
        return "RelativeQuadTo(dx1=" + this.f287051c + ", dy1=" + this.f287052d + ", dx2=" + this.f287053e + ", dy2=" + this.f287054f + ')';
    }
}
