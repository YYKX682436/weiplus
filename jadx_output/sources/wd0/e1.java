package wd0;

/* loaded from: classes8.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public int f444703a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f444704b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f444705c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f444706d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f444707e;

    /* renamed from: f, reason: collision with root package name */
    public r45.vt4 f444708f;

    /* renamed from: g, reason: collision with root package name */
    public int f444709g;

    /* renamed from: h, reason: collision with root package name */
    public wd0.m2 f444710h;

    public e1() {
        this(0, null, null, null, null, null, 0, null, 255, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd0.e1)) {
            return false;
        }
        wd0.e1 e1Var = (wd0.e1) obj;
        return this.f444703a == e1Var.f444703a && kotlin.jvm.internal.o.b(this.f444704b, e1Var.f444704b) && kotlin.jvm.internal.o.b(this.f444705c, e1Var.f444705c) && kotlin.jvm.internal.o.b(this.f444706d, e1Var.f444706d) && kotlin.jvm.internal.o.b(this.f444707e, e1Var.f444707e) && kotlin.jvm.internal.o.b(this.f444708f, e1Var.f444708f) && this.f444709g == e1Var.f444709g && kotlin.jvm.internal.o.b(this.f444710h, e1Var.f444710h);
    }

    public int hashCode() {
        return (((((((((((((java.lang.Integer.hashCode(this.f444703a) * 31) + this.f444704b.hashCode()) * 31) + this.f444705c.hashCode()) * 31) + this.f444706d.hashCode()) * 31) + this.f444707e.hashCode()) * 31) + this.f444708f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f444709g)) * 31) + this.f444710h.hashCode();
    }

    public java.lang.String toString() {
        return "FingerprintLoginResult(errCode=" + this.f444703a + ", errMsg=" + this.f444704b + ", account=" + this.f444705c + ", pwd=" + this.f444706d + ", resInfo=" + this.f444707e + ", network_sect_resp=" + this.f444708f + ", MmTlsControlBitFlag=" + this.f444709g + ", loginParam=" + this.f444710h + ')';
    }

    public e1(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, r45.vt4 vt4Var, int i18, wd0.m2 m2Var, int i19, kotlin.jvm.internal.i iVar) {
        int i27 = (i19 & 1) != 0 ? 0 : i17;
        java.lang.String errMsg = (i19 & 2) != 0 ? "" : str;
        java.lang.String account = (i19 & 4) != 0 ? "" : str2;
        java.lang.String pwd = (i19 & 8) != 0 ? "" : str3;
        java.lang.String resInfo = (i19 & 16) == 0 ? str4 : "";
        r45.vt4 network_sect_resp = (i19 & 32) != 0 ? new r45.vt4() : vt4Var;
        int i28 = (i19 & 64) == 0 ? i18 : 0;
        wd0.m2 loginParam = (i19 & 128) != 0 ? new wd0.m2(0, null, null, 7, null) : m2Var;
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        kotlin.jvm.internal.o.g(account, "account");
        kotlin.jvm.internal.o.g(pwd, "pwd");
        kotlin.jvm.internal.o.g(resInfo, "resInfo");
        kotlin.jvm.internal.o.g(network_sect_resp, "network_sect_resp");
        kotlin.jvm.internal.o.g(loginParam, "loginParam");
        this.f444703a = i27;
        this.f444704b = errMsg;
        this.f444705c = account;
        this.f444706d = pwd;
        this.f444707e = resInfo;
        this.f444708f = network_sect_resp;
        this.f444709g = i28;
        this.f444710h = loginParam;
    }
}
