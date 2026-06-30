package i1;

/* loaded from: classes14.dex */
public final class m extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f286971c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286972d;

    public m(float f17, float f18) {
        super(false, false, 3, null);
        this.f286971c = f17;
        this.f286972d = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.m)) {
            return false;
        }
        i1.m mVar = (i1.m) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286971c), java.lang.Float.valueOf(mVar.f286971c)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286972d), java.lang.Float.valueOf(mVar.f286972d));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f286971c) * 31) + java.lang.Float.hashCode(this.f286972d);
    }

    public java.lang.String toString() {
        return "MoveTo(x=" + this.f286971c + ", y=" + this.f286972d + ')';
    }
}
