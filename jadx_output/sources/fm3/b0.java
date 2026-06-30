package fm3;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f264032a;

    public b0(java.lang.String songInfoBase64) {
        kotlin.jvm.internal.o.g(songInfoBase64, "songInfoBase64");
        this.f264032a = songInfoBase64;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm3.b0) && kotlin.jvm.internal.o.b(this.f264032a, ((fm3.b0) obj).f264032a);
    }

    public int hashCode() {
        return this.f264032a.hashCode();
    }

    public java.lang.String toString() {
        return "MusicMvRecommendListCacheKey(songInfoBase64=" + this.f264032a + ')';
    }
}
