package kn4;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f309739a;

    /* renamed from: b, reason: collision with root package name */
    public final long f309740b;

    /* renamed from: c, reason: collision with root package name */
    public long f309741c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f309742d;

    public p(java.lang.String mediaId, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f309739a = mediaId;
        this.f309740b = j17;
        this.f309741c = j18;
        this.f309742d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn4.p)) {
            return false;
        }
        kn4.p pVar = (kn4.p) obj;
        return kotlin.jvm.internal.o.b(this.f309739a, pVar.f309739a) && this.f309740b == pVar.f309740b && this.f309741c == pVar.f309741c && this.f309742d == pVar.f309742d;
    }

    public int hashCode() {
        return (((((this.f309739a.hashCode() * 31) + java.lang.Long.hashCode(this.f309740b)) * 31) + java.lang.Long.hashCode(this.f309741c)) * 31) + java.lang.Boolean.hashCode(this.f309742d);
    }

    public java.lang.String toString() {
        return "FileInfo(mediaId=" + this.f309739a + ", totalLen=" + this.f309740b + ", finishedLen=" + this.f309741c + ", isUpload=" + this.f309742d + ')';
    }
}
