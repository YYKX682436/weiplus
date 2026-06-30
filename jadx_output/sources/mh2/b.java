package mh2;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f326298a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f326299b;

    public b(java.lang.String uniqueId, java.lang.String coverUrl) {
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        kotlin.jvm.internal.o.g(coverUrl, "coverUrl");
        this.f326298a = uniqueId;
        this.f326299b = coverUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh2.b)) {
            return false;
        }
        mh2.b bVar = (mh2.b) obj;
        return kotlin.jvm.internal.o.b(this.f326298a, bVar.f326298a) && kotlin.jvm.internal.o.b(this.f326299b, bVar.f326299b);
    }

    public int hashCode() {
        return (this.f326298a.hashCode() * 31) + this.f326299b.hashCode();
    }

    public java.lang.String toString() {
        return "CachedSongCover(uniqueId=" + this.f326298a + ", coverUrl=" + this.f326299b + ')';
    }
}
