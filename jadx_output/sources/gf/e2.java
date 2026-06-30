package gf;

/* loaded from: classes5.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f271039a;

    /* renamed from: b, reason: collision with root package name */
    public final long f271040b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f271041c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f271042d;

    public e2(boolean z17, long j17, java.lang.String str, java.util.List pathWhiteList) {
        kotlin.jvm.internal.o.g(pathWhiteList, "pathWhiteList");
        this.f271039a = z17;
        this.f271040b = j17;
        this.f271041c = str;
        this.f271042d = pathWhiteList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf.e2)) {
            return false;
        }
        gf.e2 e2Var = (gf.e2) obj;
        return this.f271039a == e2Var.f271039a && this.f271040b == e2Var.f271040b && kotlin.jvm.internal.o.b(this.f271041c, e2Var.f271041c) && kotlin.jvm.internal.o.b(this.f271042d, e2Var.f271042d);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Boolean.hashCode(this.f271039a) * 31) + java.lang.Long.hashCode(this.f271040b)) * 31;
        java.lang.String str = this.f271041c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f271042d.hashCode();
    }

    public java.lang.String toString() {
        return "SkylineExptParam(isEnabled=" + this.f271039a + ", exptGroupId=" + this.f271040b + ", exptParam=" + this.f271041c + ", pathWhiteList=" + this.f271042d + ')';
    }

    public /* synthetic */ e2(boolean z17, long j17, java.lang.String str, java.util.List list, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? 0L : j17, (i17 & 4) != 0 ? null : str, (i17 & 8) != 0 ? kz5.p0.f313996d : list);
    }
}
