package is;

/* loaded from: classes4.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ js.q0 f294302d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(js.q0 q0Var) {
        super(1);
        this.f294302d = q0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData getMobileRespData = (com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData) obj;
        r45.fn4 fn4Var = getMobileRespData != null ? getMobileRespData.f73186e : null;
        js.q0 q0Var = this.f294302d;
        if (fn4Var != null) {
            java.lang.String str = getMobileRespData.f73186e.f374463e;
            com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "reqSimMobile masked mobile: %s", str);
            if (str != null) {
                int i17 = 1;
                if (str.length() > 0) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder(c01.b9.f37069c.a("last_login_bind_mobile", ""));
                    com.tencent.mars.xlog.Log.i("MicroMsg.AccountInfoService", "last login bind mobile: %s", sb6);
                    if ((sb6.length() > 0) && sb6.length() >= str.length()) {
                        int length = str.length();
                        int length2 = sb6.length();
                        if (1 <= length) {
                            while (true) {
                                char charAt = str.charAt(length - i17);
                                if (charAt < '0' || charAt > '9') {
                                    sb6.setCharAt(length2 - i17, charAt);
                                }
                                if (i17 == length) {
                                    break;
                                }
                                i17++;
                            }
                        }
                        java.lang.String sb7 = sb6.toString();
                        kotlin.jvm.internal.o.f(sb7, "toString(...)");
                        if (r26.i0.n(sb7, str, false)) {
                            if (q0Var != null) {
                                r45.fn4 fn4Var2 = getMobileRespData.f73186e;
                                ((com.tencent.mm.plugin.account.ui.LoginPasswordUI$$d) q0Var).a(new com.tencent.mm.ui.mmfb.sdk.t(str, java.lang.Integer.valueOf(fn4Var2.f374464f), fn4Var2.f374465g, fn4Var2.f374466h));
                            }
                            return jz5.f0.f302826a;
                        }
                    }
                }
            }
        }
        if (q0Var != null) {
            ((com.tencent.mm.plugin.account.ui.LoginPasswordUI$$d) q0Var).a(null);
        }
        return jz5.f0.f302826a;
    }
}
