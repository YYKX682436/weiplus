package lc3;

/* loaded from: classes7.dex */
public final class k0 extends lc3.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f317905a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f317906b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String pkgPath, java.lang.String mainScriptName) {
        super(null);
        kotlin.jvm.internal.o.g(pkgPath, "pkgPath");
        kotlin.jvm.internal.o.g(mainScriptName, "mainScriptName");
        this.f317905a = pkgPath;
        this.f317906b = mainScriptName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc3.k0)) {
            return false;
        }
        lc3.k0 k0Var = (lc3.k0) obj;
        return kotlin.jvm.internal.o.b(this.f317905a, k0Var.f317905a) && kotlin.jvm.internal.o.b(this.f317906b, k0Var.f317906b);
    }

    public int hashCode() {
        return (this.f317905a.hashCode() * 31) + this.f317906b.hashCode();
    }

    public java.lang.String toString() {
        return "MBWxaPkgScriptDescriptor(pkgPath=" + this.f317905a + ", mainScriptName=" + this.f317906b + ')';
    }
}
