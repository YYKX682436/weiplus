package ng1;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.launching.cc f336944a;

    /* renamed from: b, reason: collision with root package name */
    public final int f336945b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f336946c;

    public n(com.tencent.mm.plugin.appbrand.launching.cc code, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(code, "code");
        this.f336944a = code;
        this.f336945b = i17;
        this.f336946c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng1.n)) {
            return false;
        }
        ng1.n nVar = (ng1.n) obj;
        return this.f336944a == nVar.f336944a && this.f336945b == nVar.f336945b && kotlin.jvm.internal.o.b(this.f336946c, nVar.f336946c);
    }

    public int hashCode() {
        int hashCode = ((this.f336944a.hashCode() * 31) + java.lang.Integer.hashCode(this.f336945b)) * 31;
        java.lang.String str = this.f336946c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WALaunchCheckDemoInfoResult(code=");
        sb6.append(this.f336944a);
        sb6.append(", responseErrCode=");
        sb6.append(this.f336945b);
        sb6.append(", responseApplyExprPageUrl=");
        java.lang.String str = this.f336946c;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(')');
        return sb6.toString();
    }

    public /* synthetic */ n(com.tencent.mm.plugin.appbrand.launching.cc ccVar, int i17, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        this(ccVar, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? null : str);
    }
}
