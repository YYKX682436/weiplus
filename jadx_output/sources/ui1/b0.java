package ui1;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f428030a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f428031b;

    /* renamed from: c, reason: collision with root package name */
    public final int f428032c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f428033d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f428034e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f428035f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f428036g;

    public b0(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        this.f428030a = str;
        this.f428031b = str2;
        this.f428032c = i17;
        this.f428033d = str3;
        this.f428034e = str4;
        this.f428035f = str5;
        this.f428036g = str6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui1.b0)) {
            return false;
        }
        ui1.b0 b0Var = (ui1.b0) obj;
        return kotlin.jvm.internal.o.b(this.f428030a, b0Var.f428030a) && kotlin.jvm.internal.o.b(this.f428031b, b0Var.f428031b) && this.f428032c == b0Var.f428032c && kotlin.jvm.internal.o.b(this.f428033d, b0Var.f428033d) && kotlin.jvm.internal.o.b(this.f428034e, b0Var.f428034e) && kotlin.jvm.internal.o.b(this.f428035f, b0Var.f428035f) && kotlin.jvm.internal.o.b(this.f428036g, b0Var.f428036g);
    }

    public int hashCode() {
        java.lang.String str = this.f428030a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f428031b;
        int hashCode2 = (((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f428032c)) * 31;
        java.lang.String str3 = this.f428033d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f428034e;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f428035f;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f428036g;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ScopeInfo(Scope=" + this.f428030a + ", Desc=" + this.f428031b + ", AuthState=" + this.f428032c + ", ext_desc=" + this.f428033d + ", auth_desc=" + this.f428034e + ", sub_desc=" + this.f428035f + ", auth_wording=" + this.f428036g + ')';
    }
}
