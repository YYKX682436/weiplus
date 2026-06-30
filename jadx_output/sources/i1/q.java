package i1;

/* loaded from: classes14.dex */
public final class q extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f287003c;

    /* renamed from: d, reason: collision with root package name */
    public final float f287004d;

    /* renamed from: e, reason: collision with root package name */
    public final float f287005e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f287006f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f287007g;

    /* renamed from: h, reason: collision with root package name */
    public final float f287008h;

    /* renamed from: i, reason: collision with root package name */
    public final float f287009i;

    public q(float f17, float f18, float f19, boolean z17, boolean z18, float f27, float f28) {
        super(false, false, 3, null);
        this.f287003c = f17;
        this.f287004d = f18;
        this.f287005e = f19;
        this.f287006f = z17;
        this.f287007g = z18;
        this.f287008h = f27;
        this.f287009i = f28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.q)) {
            return false;
        }
        i1.q qVar = (i1.q) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287003c), java.lang.Float.valueOf(qVar.f287003c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287004d), java.lang.Float.valueOf(qVar.f287004d)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287005e), java.lang.Float.valueOf(qVar.f287005e)) && this.f287006f == qVar.f287006f && this.f287007g == qVar.f287007g && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287008h), java.lang.Float.valueOf(qVar.f287008h)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f287009i), java.lang.Float.valueOf(qVar.f287009i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((java.lang.Float.hashCode(this.f287003c) * 31) + java.lang.Float.hashCode(this.f287004d)) * 31) + java.lang.Float.hashCode(this.f287005e)) * 31;
        boolean z17 = this.f287006f;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        boolean z18 = this.f287007g;
        return ((((i18 + (z18 ? 1 : z18 ? 1 : 0)) * 31) + java.lang.Float.hashCode(this.f287008h)) * 31) + java.lang.Float.hashCode(this.f287009i);
    }

    public java.lang.String toString() {
        return "RelativeArcTo(horizontalEllipseRadius=" + this.f287003c + ", verticalEllipseRadius=" + this.f287004d + ", theta=" + this.f287005e + ", isMoreThanHalf=" + this.f287006f + ", isPositiveArc=" + this.f287007g + ", arcStartDx=" + this.f287008h + ", arcStartDy=" + this.f287009i + ')';
    }
}
