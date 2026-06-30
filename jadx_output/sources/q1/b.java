package q1;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f359482a;

    /* renamed from: b, reason: collision with root package name */
    public final long f359483b;

    public b(long j17, long j18, kotlin.jvm.internal.i iVar) {
        this.f359482a = j17;
        this.f359483b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1.b)) {
            return false;
        }
        q1.b bVar = (q1.b) obj;
        return d1.e.a(this.f359482a, bVar.f359482a) && this.f359483b == bVar.f359483b;
    }

    public int hashCode() {
        int i17 = d1.e.f225626e;
        return (java.lang.Long.hashCode(this.f359482a) * 31) + java.lang.Long.hashCode(this.f359483b);
    }

    public java.lang.String toString() {
        return "PointAtTime(point=" + ((java.lang.Object) d1.e.h(this.f359482a)) + ", time=" + this.f359483b + ')';
    }
}
