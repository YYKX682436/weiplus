package vp5;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f439102a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f439103b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f439104c;

    /* renamed from: d, reason: collision with root package name */
    public final long f439105d;

    public e(boolean z17, java.lang.String prefix, java.lang.String rootPath, long j17) {
        kotlin.jvm.internal.o.g(prefix, "prefix");
        kotlin.jvm.internal.o.g(rootPath, "rootPath");
        this.f439102a = z17;
        this.f439103b = prefix;
        this.f439104c = rootPath;
        this.f439105d = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.e)) {
            return false;
        }
        vp5.e eVar = (vp5.e) obj;
        return this.f439102a == eVar.f439102a && kotlin.jvm.internal.o.b(this.f439103b, eVar.f439103b) && kotlin.jvm.internal.o.b(this.f439104c, eVar.f439104c) && this.f439105d == eVar.f439105d;
    }

    public int hashCode() {
        return (((((java.lang.Boolean.hashCode(this.f439102a) * 31) + this.f439103b.hashCode()) * 31) + this.f439104c.hashCode()) * 31) + java.lang.Long.hashCode(this.f439105d);
    }

    public java.lang.String toString() {
        return "FsData(flattenFs=" + this.f439102a + ", prefix=" + this.f439103b + ", rootPath=" + this.f439104c + ", quotaSize=" + this.f439105d + ")";
    }
}
