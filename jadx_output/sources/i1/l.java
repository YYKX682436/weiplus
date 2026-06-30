package i1;

/* loaded from: classes14.dex */
public final class l extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f286967c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286968d;

    public l(float f17, float f18) {
        super(false, false, 3, null);
        this.f286967c = f17;
        this.f286968d = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.l)) {
            return false;
        }
        i1.l lVar = (i1.l) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286967c), java.lang.Float.valueOf(lVar.f286967c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286968d), java.lang.Float.valueOf(lVar.f286968d));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f286967c) * 31) + java.lang.Float.hashCode(this.f286968d);
    }

    public java.lang.String toString() {
        return "LineTo(x=" + this.f286967c + ", y=" + this.f286968d + ')';
    }
}
