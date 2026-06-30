package pk1;

/* loaded from: classes12.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f355522a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f355523b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f355524c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f355525d;

    public u(java.lang.String srcUrl, java.lang.String downloadId, java.lang.String cachePath, boolean z17) {
        kotlin.jvm.internal.o.g(srcUrl, "srcUrl");
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        kotlin.jvm.internal.o.g(cachePath, "cachePath");
        this.f355522a = srcUrl;
        this.f355523b = downloadId;
        this.f355524c = cachePath;
        this.f355525d = z17;
    }

    public static pk1.u a(pk1.u uVar, java.lang.String srcUrl, java.lang.String downloadId, java.lang.String cachePath, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            srcUrl = uVar.f355522a;
        }
        if ((i17 & 2) != 0) {
            downloadId = uVar.f355523b;
        }
        if ((i17 & 4) != 0) {
            cachePath = uVar.f355524c;
        }
        if ((i17 & 8) != 0) {
            z17 = uVar.f355525d;
        }
        uVar.getClass();
        kotlin.jvm.internal.o.g(srcUrl, "srcUrl");
        kotlin.jvm.internal.o.g(downloadId, "downloadId");
        kotlin.jvm.internal.o.g(cachePath, "cachePath");
        return new pk1.u(srcUrl, downloadId, cachePath, z17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pk1.u)) {
            return false;
        }
        pk1.u uVar = (pk1.u) obj;
        return kotlin.jvm.internal.o.b(this.f355522a, uVar.f355522a) && kotlin.jvm.internal.o.b(this.f355523b, uVar.f355523b) && kotlin.jvm.internal.o.b(this.f355524c, uVar.f355524c) && this.f355525d == uVar.f355525d;
    }

    public int hashCode() {
        return (((((this.f355522a.hashCode() * 31) + this.f355523b.hashCode()) * 31) + this.f355524c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f355525d);
    }

    public java.lang.String toString() {
        return "CacheInfo(srcUrl=" + this.f355522a + ", downloadId=" + this.f355523b + ", cachePath=" + this.f355524c + ", isCacheFinished=" + this.f355525d + ')';
    }
}
