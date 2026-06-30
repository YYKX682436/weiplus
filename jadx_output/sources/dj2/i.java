package dj2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.PointF f232902a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.PointF f232903b;

    public i(android.graphics.PointF startPointF, android.graphics.PointF endPointF) {
        kotlin.jvm.internal.o.g(startPointF, "startPointF");
        kotlin.jvm.internal.o.g(endPointF, "endPointF");
        this.f232902a = startPointF;
        this.f232903b = endPointF;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj2.i)) {
            return false;
        }
        dj2.i iVar = (dj2.i) obj;
        return kotlin.jvm.internal.o.b(this.f232902a, iVar.f232902a) && kotlin.jvm.internal.o.b(this.f232903b, iVar.f232903b);
    }

    public int hashCode() {
        return (this.f232902a.hashCode() * 31) + this.f232903b.hashCode();
    }

    public java.lang.String toString() {
        return "LinePoint(startPointF=" + this.f232902a + ", endPointF=" + this.f232903b + ')';
    }
}
