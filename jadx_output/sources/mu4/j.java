package mu4;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f331425a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f331426b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f331427c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f331428d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f331429e;

    public j(boolean z17, boolean z18, java.lang.String str, java.lang.String assetsPath, java.lang.String appId) {
        kotlin.jvm.internal.o.g(assetsPath, "assetsPath");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f331425a = z17;
        this.f331426b = z18;
        this.f331427c = str;
        this.f331428d = assetsPath;
        this.f331429e = appId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu4.j)) {
            return false;
        }
        mu4.j jVar = (mu4.j) obj;
        return this.f331425a == jVar.f331425a && this.f331426b == jVar.f331426b && kotlin.jvm.internal.o.b(this.f331427c, jVar.f331427c) && kotlin.jvm.internal.o.b(this.f331428d, jVar.f331428d) && kotlin.jvm.internal.o.b(this.f331429e, jVar.f331429e);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f331425a) * 31) + java.lang.Boolean.hashCode(this.f331426b)) * 31;
        java.lang.String str = this.f331427c;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f331428d.hashCode()) * 31) + this.f331429e.hashCode();
    }

    public java.lang.String toString() {
        return "ReadPkgInfo(isDebugger=" + this.f331425a + ", isPreview=" + this.f331426b + ", resPath=" + this.f331427c + ", assetsPath=" + this.f331428d + ", appId=" + this.f331429e + ')';
    }
}
