package lc3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f317878a;

    /* renamed from: b, reason: collision with root package name */
    public final long f317879b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f317880c;

    /* renamed from: d, reason: collision with root package name */
    public final long f317881d;

    public a(java.lang.String pathInAssets, long j17, java.lang.String md52, long j18) {
        kotlin.jvm.internal.o.g(pathInAssets, "pathInAssets");
        kotlin.jvm.internal.o.g(md52, "md5");
        this.f317878a = pathInAssets;
        this.f317879b = j17;
        this.f317880c = md52;
        this.f317881d = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc3.a)) {
            return false;
        }
        lc3.a aVar = (lc3.a) obj;
        return kotlin.jvm.internal.o.b(this.f317878a, aVar.f317878a) && this.f317879b == aVar.f317879b && kotlin.jvm.internal.o.b(this.f317880c, aVar.f317880c) && this.f317881d == aVar.f317881d;
    }

    public int hashCode() {
        return (((((this.f317878a.hashCode() * 31) + java.lang.Long.hashCode(this.f317879b)) * 31) + this.f317880c.hashCode()) * 31) + java.lang.Long.hashCode(this.f317881d);
    }

    public java.lang.String toString() {
        return "BaseEmbedConfig(pathInAssets='" + this.f317878a + "', versionForBoots=" + this.f317879b + ", versionForUDR=" + this.f317881d + ", md5='" + this.f317880c + "')";
    }

    public /* synthetic */ a(java.lang.String str, long j17, java.lang.String str2, long j18, int i17, kotlin.jvm.internal.i iVar) {
        this(str, j17, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? 0L : j18);
    }
}
