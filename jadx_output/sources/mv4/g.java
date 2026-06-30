package mv4;

/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331672a;

    /* renamed from: b, reason: collision with root package name */
    public final jv4.m f331673b;

    public g(java.lang.String id6, jv4.m type) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(type, "type");
        this.f331672a = id6;
        this.f331673b = type;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv4.g)) {
            return false;
        }
        mv4.g gVar = (mv4.g) obj;
        return kotlin.jvm.internal.o.b(this.f331672a, gVar.f331672a) && this.f331673b == gVar.f331673b;
    }

    public int hashCode() {
        return (this.f331672a.hashCode() * 31) + this.f331673b.hashCode();
    }

    public java.lang.String toString() {
        return "FTSTeachRecyclerCacheItem(id=" + this.f331672a + ", type=" + this.f331673b + ')';
    }
}
