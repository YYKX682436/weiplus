package fm3;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264033a;

    /* renamed from: b, reason: collision with root package name */
    public final long f264034b;

    public c0(java.lang.String lyric, long j17) {
        kotlin.jvm.internal.o.g(lyric, "lyric");
        this.f264033a = lyric;
        this.f264034b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.c0)) {
            return false;
        }
        fm3.c0 c0Var = (fm3.c0) obj;
        return kotlin.jvm.internal.o.b(this.f264033a, c0Var.f264033a) && this.f264034b == c0Var.f264034b;
    }

    public int hashCode() {
        return (this.f264033a.hashCode() * 31) + java.lang.Long.hashCode(this.f264034b);
    }

    public java.lang.String toString() {
        return "MusicTingLyricCache(lyric=" + this.f264033a + ", timestamp=" + this.f264034b + ')';
    }
}
