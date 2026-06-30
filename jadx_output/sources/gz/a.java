package gz;

/* loaded from: classes13.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f277639a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.xf0 f277640b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f277641c;

    public a(boolean z17, bw5.xf0 xf0Var, java.lang.String str) {
        this.f277639a = z17;
        this.f277640b = xf0Var;
        this.f277641c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz.a)) {
            return false;
        }
        gz.a aVar = (gz.a) obj;
        return this.f277639a == aVar.f277639a && this.f277640b == aVar.f277640b && kotlin.jvm.internal.o.b(this.f277641c, aVar.f277641c);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f277639a) * 31;
        bw5.xf0 xf0Var = this.f277640b;
        int hashCode2 = (hashCode + (xf0Var == null ? 0 : xf0Var.hashCode())) * 31;
        java.lang.String str = this.f277641c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ConnectToGroupResult(success=" + this.f277639a + ", errorCode=" + this.f277640b + ", errorMsg=" + this.f277641c + ')';
    }

    public /* synthetic */ a(boolean z17, bw5.xf0 xf0Var, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        this(z17, (i17 & 2) != 0 ? null : xf0Var, (i17 & 4) != 0 ? null : str);
    }
}
