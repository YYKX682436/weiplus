package k91;

/* loaded from: classes5.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f305757a;

    public r0(java.util.Map loadInfo, int i17, kotlin.jvm.internal.i iVar) {
        loadInfo = (i17 & 1) != 0 ? new java.util.LinkedHashMap() : loadInfo;
        kotlin.jvm.internal.o.g(loadInfo, "loadInfo");
        this.f305757a = loadInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k91.r0) && kotlin.jvm.internal.o.b(this.f305757a, ((k91.r0) obj).f305757a);
    }

    public int hashCode() {
        return this.f305757a.hashCode();
    }

    public java.lang.String toString() {
        return "AppBrandPackageLoadInfo(loadInfo=" + this.f305757a + ')';
    }
}
