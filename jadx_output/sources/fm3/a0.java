package fm3;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.es4 f264024a;

    /* renamed from: b, reason: collision with root package name */
    public final long f264025b;

    public a0(r45.es4 response, long j17) {
        kotlin.jvm.internal.o.g(response, "response");
        this.f264024a = response;
        this.f264025b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.a0)) {
            return false;
        }
        fm3.a0 a0Var = (fm3.a0) obj;
        return kotlin.jvm.internal.o.b(this.f264024a, a0Var.f264024a) && this.f264025b == a0Var.f264025b;
    }

    public int hashCode() {
        return (this.f264024a.hashCode() * 31) + java.lang.Long.hashCode(this.f264025b);
    }

    public java.lang.String toString() {
        return "MusicMvRecommendListCache(response=" + this.f264024a + ", timestamp=" + this.f264025b + ')';
    }
}
