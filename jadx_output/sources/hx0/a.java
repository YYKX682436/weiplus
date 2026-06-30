package hx0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final xt0.h f285601a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f285602b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.instamovie.MJExportSettings f285603c;

    public a(xt0.h hVar, boolean z17, com.tencent.maas.instamovie.MJExportSettings exportSettings) {
        kotlin.jvm.internal.o.g(exportSettings, "exportSettings");
        this.f285601a = hVar;
        this.f285602b = z17;
        this.f285603c = exportSettings;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx0.a)) {
            return false;
        }
        hx0.a aVar = (hx0.a) obj;
        return kotlin.jvm.internal.o.b(this.f285601a, aVar.f285601a) && this.f285602b == aVar.f285602b && kotlin.jvm.internal.o.b(this.f285603c, aVar.f285603c);
    }

    public int hashCode() {
        xt0.h hVar = this.f285601a;
        return ((((hVar == null ? 0 : hVar.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f285602b)) * 31) + this.f285603c.hashCode();
    }

    public java.lang.String toString() {
        return "ExportParams(postSource=" + this.f285601a + ", useFinderPostProcess=" + this.f285602b + ", exportSettings=" + this.f285603c + ')';
    }
}
