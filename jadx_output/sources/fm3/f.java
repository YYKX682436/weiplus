package fm3;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f264046a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f264047b;

    public f(long j17, java.lang.String nonceId) {
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.f264046a = j17;
        this.f264047b = nonceId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.f)) {
            return false;
        }
        fm3.f fVar = (fm3.f) obj;
        return this.f264046a == fVar.f264046a && kotlin.jvm.internal.o.b(this.f264047b, fVar.f264047b);
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f264046a) * 31) + this.f264047b.hashCode();
    }

    public java.lang.String toString() {
        return "FinderFeedDetailCacheKey(feedId=" + this.f264046a + ", nonceId=" + this.f264047b + ')';
    }
}
