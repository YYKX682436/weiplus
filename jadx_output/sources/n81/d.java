package n81;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f335606a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335607b;

    /* renamed from: c, reason: collision with root package name */
    public final long f335608c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f335609d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f335610e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f335611f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f335612g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f335613h;

    public d(java.lang.String appId, int i17, long j17, java.util.List paths, java.util.Map taggedPaths, yz5.a cacheSizeBlock, yz5.a taggedCacheSizeBlock, yz5.a cleanBlock) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(paths, "paths");
        kotlin.jvm.internal.o.g(taggedPaths, "taggedPaths");
        kotlin.jvm.internal.o.g(cacheSizeBlock, "cacheSizeBlock");
        kotlin.jvm.internal.o.g(taggedCacheSizeBlock, "taggedCacheSizeBlock");
        kotlin.jvm.internal.o.g(cleanBlock, "cleanBlock");
        this.f335606a = appId;
        this.f335607b = i17;
        this.f335608c = j17;
        this.f335609d = paths;
        this.f335610e = taggedPaths;
        this.f335611f = cacheSizeBlock;
        this.f335612g = taggedCacheSizeBlock;
        this.f335613h = cleanBlock;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n81.d)) {
            return false;
        }
        n81.d dVar = (n81.d) obj;
        return kotlin.jvm.internal.o.b(this.f335606a, dVar.f335606a) && this.f335607b == dVar.f335607b && this.f335608c == dVar.f335608c && kotlin.jvm.internal.o.b(this.f335609d, dVar.f335609d) && kotlin.jvm.internal.o.b(this.f335610e, dVar.f335610e) && kotlin.jvm.internal.o.b(this.f335611f, dVar.f335611f) && kotlin.jvm.internal.o.b(this.f335612g, dVar.f335612g) && kotlin.jvm.internal.o.b(this.f335613h, dVar.f335613h);
    }

    public int hashCode() {
        return (((((((((((((this.f335606a.hashCode() * 31) + java.lang.Integer.hashCode(this.f335607b)) * 31) + java.lang.Long.hashCode(this.f335608c)) * 31) + this.f335609d.hashCode()) * 31) + this.f335610e.hashCode()) * 31) + this.f335611f.hashCode()) * 31) + this.f335612g.hashCode()) * 31) + this.f335613h.hashCode();
    }

    public java.lang.String toString() {
        return "AppBrandSweeperInfo(appId=" + this.f335606a + ", appTypeFlag=" + this.f335607b + ", lastLaunchTime=" + this.f335608c + ", paths=" + this.f335609d + ", taggedPaths=" + this.f335610e + ", cacheSizeBlock=" + this.f335611f + ", taggedCacheSizeBlock=" + this.f335612g + ", cleanBlock=" + this.f335613h + ')';
    }
}
