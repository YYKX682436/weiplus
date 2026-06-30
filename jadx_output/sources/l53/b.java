package l53;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final m33.k1 f316637a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f316638b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f316639c;

    public b(m33.k1 videoInfo, java.lang.String shareUrl, java.lang.String shareThumbUrl) {
        kotlin.jvm.internal.o.g(videoInfo, "videoInfo");
        kotlin.jvm.internal.o.g(shareUrl, "shareUrl");
        kotlin.jvm.internal.o.g(shareThumbUrl, "shareThumbUrl");
        this.f316637a = videoInfo;
        this.f316638b = shareUrl;
        this.f316639c = shareThumbUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l53.b)) {
            return false;
        }
        l53.b bVar = (l53.b) obj;
        return kotlin.jvm.internal.o.b(this.f316637a, bVar.f316637a) && kotlin.jvm.internal.o.b(this.f316638b, bVar.f316638b) && kotlin.jvm.internal.o.b(this.f316639c, bVar.f316639c);
    }

    public int hashCode() {
        return (((this.f316637a.hashCode() * 31) + this.f316638b.hashCode()) * 31) + this.f316639c.hashCode();
    }

    public java.lang.String toString() {
        return "VideoShareInfo(videoInfo=" + this.f316637a + ", shareUrl=" + this.f316638b + ", shareThumbUrl=" + this.f316639c + ')';
    }
}
