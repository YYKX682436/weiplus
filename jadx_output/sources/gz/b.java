package gz;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f277642a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.xf0 f277643b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f277644c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f277645d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f277646e;

    public b(boolean z17, bw5.xf0 xf0Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        xf0Var = (i17 & 2) != 0 ? null : xf0Var;
        str = (i17 & 4) != 0 ? null : str;
        str2 = (i17 & 8) != 0 ? null : str2;
        str3 = (i17 & 16) != 0 ? null : str3;
        this.f277642a = z17;
        this.f277643b = xf0Var;
        this.f277644c = str;
        this.f277645d = str2;
        this.f277646e = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz.b)) {
            return false;
        }
        gz.b bVar = (gz.b) obj;
        return this.f277642a == bVar.f277642a && this.f277643b == bVar.f277643b && kotlin.jvm.internal.o.b(this.f277644c, bVar.f277644c) && kotlin.jvm.internal.o.b(this.f277645d, bVar.f277645d) && kotlin.jvm.internal.o.b(this.f277646e, bVar.f277646e);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f277642a) * 31;
        bw5.xf0 xf0Var = this.f277643b;
        int hashCode2 = (hashCode + (xf0Var == null ? 0 : xf0Var.hashCode())) * 31;
        java.lang.String str = this.f277644c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f277645d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f277646e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CreateGroupResult(success=" + this.f277642a + ", errorCode=" + this.f277643b + ", errorMsg=" + this.f277644c + ", networkName=" + this.f277645d + ", passphrase=" + this.f277646e + ')';
    }
}
