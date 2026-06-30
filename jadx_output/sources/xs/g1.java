package xs;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f456251a;

    /* renamed from: b, reason: collision with root package name */
    public final long f456252b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f456253c;

    public g1(long j17, long j18, java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        this.f456251a = j17;
        this.f456252b = j18;
        this.f456253c = path;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs.g1)) {
            return false;
        }
        xs.g1 g1Var = (xs.g1) obj;
        return this.f456251a == g1Var.f456251a && this.f456252b == g1Var.f456252b && kotlin.jvm.internal.o.b(this.f456253c, g1Var.f456253c);
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f456251a) * 31) + java.lang.Long.hashCode(this.f456252b)) * 31) + this.f456253c.hashCode();
    }

    public java.lang.String toString() {
        return "ImageInfo(mediaId=" + this.f456251a + ", addTime=" + this.f456252b + ", path=" + this.f456253c + ')';
    }
}
