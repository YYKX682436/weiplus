package zs1;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f475236a;

    public d(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        this.f475236a = url;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs1.d) && kotlin.jvm.internal.o.b(this.f475236a, ((zs1.d) obj).f475236a);
    }

    public int hashCode() {
        return this.f475236a.hashCode();
    }

    public java.lang.String toString() {
        return "PrefetchRes(url=" + this.f475236a + ')';
    }
}
