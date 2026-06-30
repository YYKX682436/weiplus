package vw3;

/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f441130a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f441131b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f441132c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f441133d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f441134e;

    /* renamed from: f, reason: collision with root package name */
    public final int f441135f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f441136g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f441137h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f441138i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f441139j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f441140k;

    public u1(java.lang.String nsCountryCode, java.lang.String nsPhoneNUmber, java.lang.String nsFormatdPhoneNumber, java.lang.String smsUpMobile, java.lang.String smsUpcode, int i17, java.lang.String headImgUrl, java.lang.String nickName, java.lang.String mobile_verify_count_down_sec, java.lang.String reg_style, java.lang.String switchToWxId) {
        kotlin.jvm.internal.o.g(nsCountryCode, "nsCountryCode");
        kotlin.jvm.internal.o.g(nsPhoneNUmber, "nsPhoneNUmber");
        kotlin.jvm.internal.o.g(nsFormatdPhoneNumber, "nsFormatdPhoneNumber");
        kotlin.jvm.internal.o.g(smsUpMobile, "smsUpMobile");
        kotlin.jvm.internal.o.g(smsUpcode, "smsUpcode");
        kotlin.jvm.internal.o.g(headImgUrl, "headImgUrl");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        kotlin.jvm.internal.o.g(mobile_verify_count_down_sec, "mobile_verify_count_down_sec");
        kotlin.jvm.internal.o.g(reg_style, "reg_style");
        kotlin.jvm.internal.o.g(switchToWxId, "switchToWxId");
        this.f441130a = nsCountryCode;
        this.f441131b = nsPhoneNUmber;
        this.f441132c = nsFormatdPhoneNumber;
        this.f441133d = smsUpMobile;
        this.f441134e = smsUpcode;
        this.f441135f = i17;
        this.f441136g = headImgUrl;
        this.f441137h = nickName;
        this.f441138i = mobile_verify_count_down_sec;
        this.f441139j = reg_style;
        this.f441140k = switchToWxId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw3.u1)) {
            return false;
        }
        vw3.u1 u1Var = (vw3.u1) obj;
        return kotlin.jvm.internal.o.b(this.f441130a, u1Var.f441130a) && kotlin.jvm.internal.o.b(this.f441131b, u1Var.f441131b) && kotlin.jvm.internal.o.b(this.f441132c, u1Var.f441132c) && kotlin.jvm.internal.o.b(this.f441133d, u1Var.f441133d) && kotlin.jvm.internal.o.b(this.f441134e, u1Var.f441134e) && this.f441135f == u1Var.f441135f && kotlin.jvm.internal.o.b(this.f441136g, u1Var.f441136g) && kotlin.jvm.internal.o.b(this.f441137h, u1Var.f441137h) && kotlin.jvm.internal.o.b(this.f441138i, u1Var.f441138i) && kotlin.jvm.internal.o.b(this.f441139j, u1Var.f441139j) && kotlin.jvm.internal.o.b(this.f441140k, u1Var.f441140k);
    }

    public int hashCode() {
        return (((((((((((((((((((this.f441130a.hashCode() * 31) + this.f441131b.hashCode()) * 31) + this.f441132c.hashCode()) * 31) + this.f441133d.hashCode()) * 31) + this.f441134e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f441135f)) * 31) + this.f441136g.hashCode()) * 31) + this.f441137h.hashCode()) * 31) + this.f441138i.hashCode()) * 31) + this.f441139j.hashCode()) * 31) + this.f441140k.hashCode();
    }

    public java.lang.String toString() {
        return "MyAccountData(nsCountryCode=" + this.f441130a + ", nsPhoneNUmber=" + this.f441131b + ", nsFormatdPhoneNumber=" + this.f441132c + ", smsUpMobile=" + this.f441133d + ", smsUpcode=" + this.f441134e + ", iRegisterControlFlag=" + this.f441135f + ", headImgUrl=" + this.f441136g + ", nickName=" + this.f441137h + ", mobile_verify_count_down_sec=" + this.f441138i + ", reg_style=" + this.f441139j + ", switchToWxId=" + this.f441140k + ')';
    }
}
