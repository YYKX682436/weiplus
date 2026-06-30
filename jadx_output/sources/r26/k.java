package r26;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368900a;

    /* renamed from: b, reason: collision with root package name */
    public final e06.k f368901b;

    public k(java.lang.String value, e06.k range) {
        kotlin.jvm.internal.o.g(value, "value");
        kotlin.jvm.internal.o.g(range, "range");
        this.f368900a = value;
        this.f368901b = range;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r26.k)) {
            return false;
        }
        r26.k kVar = (r26.k) obj;
        return kotlin.jvm.internal.o.b(this.f368900a, kVar.f368900a) && kotlin.jvm.internal.o.b(this.f368901b, kVar.f368901b);
    }

    public int hashCode() {
        return (this.f368900a.hashCode() * 31) + this.f368901b.hashCode();
    }

    public java.lang.String toString() {
        return "MatchGroup(value=" + this.f368900a + ", range=" + this.f368901b + ')';
    }
}
