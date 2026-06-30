package ey2;

/* loaded from: classes2.dex */
public final class s2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f257499a;

    /* renamed from: b, reason: collision with root package name */
    public final float f257500b;

    public s2(long j17, float f17) {
        this.f257499a = j17;
        this.f257500b = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey2.s2)) {
            return false;
        }
        ey2.s2 s2Var = (ey2.s2) obj;
        return this.f257499a == s2Var.f257499a && java.lang.Float.compare(this.f257500b, s2Var.f257500b) == 0;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f257499a) * 31) + java.lang.Float.hashCode(this.f257500b);
    }

    public java.lang.String toString() {
        return "ImageFeedCache(feedId=" + this.f257499a + ", speedRatio=" + this.f257500b + ')';
    }
}
