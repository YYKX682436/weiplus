package cq;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f221187a;

    /* renamed from: b, reason: collision with root package name */
    public final int f221188b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f221189c;

    public f(long j17, int i17) {
        this.f221187a = j17;
        this.f221188b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq.f)) {
            return false;
        }
        cq.f fVar = (cq.f) obj;
        return this.f221187a == fVar.f221187a && this.f221188b == fVar.f221188b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f221187a) * 31) + java.lang.Integer.hashCode(this.f221188b);
    }

    public java.lang.String toString() {
        return "LocalFinderObjectExtWithScene(objectId=" + this.f221187a + ", commentScene=" + this.f221188b + ')';
    }
}
