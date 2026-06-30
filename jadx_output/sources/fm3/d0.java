package fm3;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264042a;

    public d0(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f264042a = key;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm3.d0) && kotlin.jvm.internal.o.b(this.f264042a, ((fm3.d0) obj).f264042a);
    }

    public int hashCode() {
        return this.f264042a.hashCode();
    }

    public java.lang.String toString() {
        return "MusicTingLyricCacheKey(key=" + this.f264042a + ')';
    }
}
