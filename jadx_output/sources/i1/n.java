package i1;

/* loaded from: classes14.dex */
public final class n extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f286975c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286976d;

    /* renamed from: e, reason: collision with root package name */
    public final float f286977e;

    /* renamed from: f, reason: collision with root package name */
    public final float f286978f;

    public n(float f17, float f18, float f19, float f27) {
        super(false, true, 1, null);
        this.f286975c = f17;
        this.f286976d = f18;
        this.f286977e = f19;
        this.f286978f = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.n)) {
            return false;
        }
        i1.n nVar = (i1.n) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286975c), java.lang.Float.valueOf(nVar.f286975c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286976d), java.lang.Float.valueOf(nVar.f286976d)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286977e), java.lang.Float.valueOf(nVar.f286977e)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286978f), java.lang.Float.valueOf(nVar.f286978f));
    }

    public int hashCode() {
        return (((((java.lang.Float.hashCode(this.f286975c) * 31) + java.lang.Float.hashCode(this.f286976d)) * 31) + java.lang.Float.hashCode(this.f286977e)) * 31) + java.lang.Float.hashCode(this.f286978f);
    }

    public java.lang.String toString() {
        return "QuadTo(x1=" + this.f286975c + ", y1=" + this.f286976d + ", x2=" + this.f286977e + ", y2=" + this.f286978f + ')';
    }
}
