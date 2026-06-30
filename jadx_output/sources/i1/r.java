package i1;

/* loaded from: classes14.dex */
public final class r extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287012c;

    /* renamed from: d, reason: collision with root package name */
    public final float f287013d;

    /* renamed from: e, reason: collision with root package name */
    public final float f287014e;

    /* renamed from: f, reason: collision with root package name */
    public final float f287015f;

    /* renamed from: g, reason: collision with root package name */
    public final float f287016g;

    /* renamed from: h, reason: collision with root package name */
    public final float f287017h;

    public r(float f17, float f18, float f19, float f27, float f28, float f29) {
        super(true, false, 2, null);
        this.f287012c = f17;
        this.f287013d = f18;
        this.f287014e = f19;
        this.f287015f = f27;
        this.f287016g = f28;
        this.f287017h = f29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.r)) {
            return false;
        }
        i1.r rVar = (i1.r) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287012c), java.lang.Float.valueOf(rVar.f287012c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287013d), java.lang.Float.valueOf(rVar.f287013d)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287014e), java.lang.Float.valueOf(rVar.f287014e)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287015f), java.lang.Float.valueOf(rVar.f287015f)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287016g), java.lang.Float.valueOf(rVar.f287016g)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287017h), java.lang.Float.valueOf(rVar.f287017h));
    }

    public int hashCode() {
        return (((((((((java.lang.Float.hashCode(this.f287012c) * 31) + java.lang.Float.hashCode(this.f287013d)) * 31) + java.lang.Float.hashCode(this.f287014e)) * 31) + java.lang.Float.hashCode(this.f287015f)) * 31) + java.lang.Float.hashCode(this.f287016g)) * 31) + java.lang.Float.hashCode(this.f287017h);
    }

    public java.lang.String toString() {
        return "RelativeCurveTo(dx1=" + this.f287012c + ", dy1=" + this.f287013d + ", dx2=" + this.f287014e + ", dy2=" + this.f287015f + ", dx3=" + this.f287016g + ", dy3=" + this.f287017h + ')';
    }
}
