package yh3;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final long f462399a;

    /* renamed from: b, reason: collision with root package name */
    public final long f462400b;

    public c(long j17, long j18) {
        this.f462399a = j17;
        this.f462400b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yh3.c)) {
            return false;
        }
        yh3.c cVar = (yh3.c) obj;
        return this.f462399a == cVar.f462399a && this.f462400b == cVar.f462400b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f462399a) * 31) + java.lang.Long.hashCode(this.f462400b);
    }

    public java.lang.String toString() {
        return "RePlayOnMoovReady(offset=" + this.f462399a + ", length=" + this.f462400b + ')';
    }
}
