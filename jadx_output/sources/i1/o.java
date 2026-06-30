package i1;

/* loaded from: classes14.dex */
public final class o extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f286982c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286983d;

    /* renamed from: e, reason: collision with root package name */
    public final float f286984e;

    /* renamed from: f, reason: collision with root package name */
    public final float f286985f;

    public o(float f17, float f18, float f19, float f27) {
        super(true, false, 2, null);
        this.f286982c = f17;
        this.f286983d = f18;
        this.f286984e = f19;
        this.f286985f = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.o)) {
            return false;
        }
        i1.o oVar = (i1.o) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286982c), java.lang.Float.valueOf(oVar.f286982c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286983d), java.lang.Float.valueOf(oVar.f286983d)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286984e), java.lang.Float.valueOf(oVar.f286984e)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286985f), java.lang.Float.valueOf(oVar.f286985f));
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f286982c) * 31) + java.lang.Float.hashCode(this.f286983d)) * 31) + java.lang.Float.hashCode(this.f286984e)) * 31) + java.lang.Float.hashCode(this.f286985f);
    }

    public java.lang.String toString() {
        return "ReflectiveCurveTo(x1=" + this.f286982c + ", y1=" + this.f286983d + ", x2=" + this.f286984e + ", y2=" + this.f286985f + ')';
    }
}
