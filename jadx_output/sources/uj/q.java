package uj;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f428176a;

    /* renamed from: b, reason: collision with root package name */
    public final int f428177b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f428178c;

    public q(java.lang.String appId, int i17, java.lang.String moduleName) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        this.f428176a = appId;
        this.f428177b = i17;
        this.f428178c = moduleName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj.q)) {
            return false;
        }
        uj.q qVar = (uj.q) obj;
        return kotlin.jvm.internal.o.b(this.f428176a, qVar.f428176a) && this.f428177b == qVar.f428177b && kotlin.jvm.internal.o.b(this.f428178c, qVar.f428178c);
    }

    public int hashCode() {
        return (((this.f428176a.hashCode() * 31) + java.lang.Integer.hashCode(this.f428177b)) * 31) + this.f428178c.hashCode();
    }

    public java.lang.String toString() {
        return "PlayablePkgInfo(appId=" + this.f428176a + ", versionType=" + this.f428177b + ", moduleName=" + this.f428178c + ')';
    }
}
