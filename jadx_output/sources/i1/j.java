package i1;

/* loaded from: classes14.dex */
public final class j extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f286939c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286940d;

    /* renamed from: e, reason: collision with root package name */
    public final float f286941e;

    /* renamed from: f, reason: collision with root package name */
    public final float f286942f;

    /* renamed from: g, reason: collision with root package name */
    public final float f286943g;

    /* renamed from: h, reason: collision with root package name */
    public final float f286944h;

    public j(float f17, float f18, float f19, float f27, float f28, float f29) {
        super(true, false, 2, null);
        this.f286939c = f17;
        this.f286940d = f18;
        this.f286941e = f19;
        this.f286942f = f27;
        this.f286943g = f28;
        this.f286944h = f29;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.j)) {
            return false;
        }
        i1.j jVar = (i1.j) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286939c), java.lang.Float.valueOf(jVar.f286939c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286940d), java.lang.Float.valueOf(jVar.f286940d)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286941e), java.lang.Float.valueOf(jVar.f286941e)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286942f), java.lang.Float.valueOf(jVar.f286942f)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286943g), java.lang.Float.valueOf(jVar.f286943g)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286944h), java.lang.Float.valueOf(jVar.f286944h));
    }

    public int hashCode() {
        return (((((((((java.lang.Float.hashCode(this.f286939c) * 31) + java.lang.Float.hashCode(this.f286940d)) * 31) + java.lang.Float.hashCode(this.f286941e)) * 31) + java.lang.Float.hashCode(this.f286942f)) * 31) + java.lang.Float.hashCode(this.f286943g)) * 31) + java.lang.Float.hashCode(this.f286944h);
    }

    public java.lang.String toString() {
        return "CurveTo(x1=" + this.f286939c + ", y1=" + this.f286940d + ", x2=" + this.f286941e + ", y2=" + this.f286942f + ", x3=" + this.f286943g + ", y3=" + this.f286944h + ')';
    }
}
