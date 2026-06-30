package n85;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f335706a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f335707b;

    /* renamed from: c, reason: collision with root package name */
    public final long f335708c;

    /* renamed from: d, reason: collision with root package name */
    public final long f335709d;

    public h(java.util.List data, boolean z17, long j17, long j18) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f335706a = data;
        this.f335707b = z17;
        this.f335708c = j17;
        this.f335709d = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n85.h)) {
            return false;
        }
        n85.h hVar = (n85.h) obj;
        return kotlin.jvm.internal.o.b(this.f335706a, hVar.f335706a) && this.f335707b == hVar.f335707b && this.f335708c == hVar.f335708c && this.f335709d == hVar.f335709d;
    }

    public int hashCode() {
        return (((((this.f335706a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f335707b)) * 31) + java.lang.Long.hashCode(this.f335708c)) * 31) + java.lang.Long.hashCode(this.f335709d);
    }

    public java.lang.String toString() {
        return "PageDataWrapper(data=" + this.f335706a + ", hasMore=" + this.f335707b + ", minFeedId=" + this.f335708c + ", maxFeedId=" + this.f335709d + ')';
    }
}
