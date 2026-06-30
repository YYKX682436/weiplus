package kw2;

/* loaded from: classes15.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f313013a;

    /* renamed from: b, reason: collision with root package name */
    public final so2.i3 f313014b;

    /* renamed from: c, reason: collision with root package name */
    public final so2.i3 f313015c;

    /* renamed from: d, reason: collision with root package name */
    public final dn.h f313016d;

    public g(boolean z17, so2.i3 i3Var, so2.i3 i3Var2, dn.h hVar) {
        this.f313013a = z17;
        this.f313014b = i3Var;
        this.f313015c = i3Var2;
        this.f313016d = hVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw2.g)) {
            return false;
        }
        kw2.g gVar = (kw2.g) obj;
        return this.f313013a == gVar.f313013a && kotlin.jvm.internal.o.b(this.f313014b, gVar.f313014b) && kotlin.jvm.internal.o.b(this.f313015c, gVar.f313015c) && kotlin.jvm.internal.o.b(this.f313016d, gVar.f313016d);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f313013a) * 31;
        so2.i3 i3Var = this.f313014b;
        int hashCode2 = (hashCode + (i3Var == null ? 0 : i3Var.hashCode())) * 31;
        so2.i3 i3Var2 = this.f313015c;
        int hashCode3 = (hashCode2 + (i3Var2 == null ? 0 : i3Var2.hashCode())) * 31;
        dn.h hVar = this.f313016d;
        return hashCode3 + (hVar != null ? hVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "DownloaderResult(isDownloaderOnStart=" + this.f313013a + ", mediaCacheOneStart=" + this.f313014b + ", mediaCacheOnStop=" + this.f313015c + ", downloaderResultOnStop=" + this.f313016d + ')';
    }
}
