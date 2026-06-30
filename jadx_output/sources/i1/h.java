package i1;

/* loaded from: classes14.dex */
public final class h extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f286917c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286918d;

    /* renamed from: e, reason: collision with root package name */
    public final float f286919e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f286920f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f286921g;

    /* renamed from: h, reason: collision with root package name */
    public final float f286922h;

    /* renamed from: i, reason: collision with root package name */
    public final float f286923i;

    public h(float f17, float f18, float f19, boolean z17, boolean z18, float f27, float f28) {
        super(false, false, 3, null);
        this.f286917c = f17;
        this.f286918d = f18;
        this.f286919e = f19;
        this.f286920f = z17;
        this.f286921g = z18;
        this.f286922h = f27;
        this.f286923i = f28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.h)) {
            return false;
        }
        i1.h hVar = (i1.h) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286917c), java.lang.Float.valueOf(hVar.f286917c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286918d), java.lang.Float.valueOf(hVar.f286918d)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286919e), java.lang.Float.valueOf(hVar.f286919e)) && this.f286920f == hVar.f286920f && this.f286921g == hVar.f286921g && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286922h), java.lang.Float.valueOf(hVar.f286922h)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286923i), java.lang.Float.valueOf(hVar.f286923i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((java.lang.Float.hashCode(this.f286917c) * 31) + java.lang.Float.hashCode(this.f286918d)) * 31) + java.lang.Float.hashCode(this.f286919e)) * 31;
        boolean z17 = this.f286920f;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        boolean z18 = this.f286921g;
        return ((((i18 + (z18 ? 1 : z18 ? 1 : 0)) * 31) + java.lang.Float.hashCode(this.f286922h)) * 31) + java.lang.Float.hashCode(this.f286923i);
    }

    public java.lang.String toString() {
        return "ArcTo(horizontalEllipseRadius=" + this.f286917c + ", verticalEllipseRadius=" + this.f286918d + ", theta=" + this.f286919e + ", isMoreThanHalf=" + this.f286920f + ", isPositiveArc=" + this.f286921g + ", arcStartX=" + this.f286922h + ", arcStartY=" + this.f286923i + ')';
    }
}
