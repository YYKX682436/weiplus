package vi1;

/* loaded from: classes7.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.x20 f437493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f437494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f437495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437496g;

    public x0(r45.x20 x20Var, vi1.b1 b1Var, boolean z17, java.lang.String str) {
        this.f437493d = x20Var;
        this.f437494e = b1Var;
        this.f437495f = z17;
        this.f437496g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Long valueOf;
        r45.x20 x20Var = this.f437493d;
        int i17 = x20Var.f389690d;
        vi1.b1 b1Var = this.f437494e;
        if (i17 == 0) {
            vi1.l2 l2Var = vi1.l2.f437401a;
            vi1.j2 a17 = l2Var.a(b1Var.f437274b);
            if (a17 != null) {
                vi1.j2 a18 = l2Var.a(b1Var.f437274b);
                valueOf = a18 != null ? java.lang.Long.valueOf(a18.f437367p) : null;
                kotlin.jvm.internal.o.d(valueOf);
                a17.f437367p = valueOf.longValue() + 1;
            }
            java.lang.String str = x20Var.f389691e;
            java.lang.String str2 = x20Var.f389692f;
            java.lang.String str3 = x20Var.f389693g;
            java.lang.String str4 = x20Var.f389694h;
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = x20Var.f389695i;
            java.lang.String str7 = str6 == null ? "" : str6;
            if (!this.f437495f) {
                vi1.o0 o0Var = vi1.o0.f437416a;
                java.lang.String str8 = this.f437496g;
                kotlin.jvm.internal.o.d(str3);
                kotlin.jvm.internal.o.d(str);
                kotlin.jvm.internal.o.d(str2);
                o0Var.a(new com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem(str8, str3, str, str2, str5, false, false, false, true, str7, 224, null));
                b1Var.f437275c.invoke();
                return;
            }
            java.lang.String appId = b1Var.f437274b;
            kotlin.jvm.internal.o.g(appId, "appId");
            java.lang.String mobile = this.f437496g;
            kotlin.jvm.internal.o.g(mobile, "mobile");
            vi1.w0 w0Var = new vi1.w0(this.f437496g, str3, str, str2, str5, str7, this.f437494e);
            r45.ys6 ys6Var = new r45.ys6();
            ys6Var.f391338d = appId;
            ys6Var.f391339e = mobile;
            ys6Var.f391340f = 0;
            ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/updateuserphone", appId, ys6Var, r45.zs6.class).n(new vi1.r(w0Var))).s(new vi1.s(w0Var));
            return;
        }
        if (i17 == 1) {
            vi1.l2 l2Var2 = vi1.l2.f437401a;
            vi1.j2 a19 = l2Var2.a(b1Var.f437274b);
            if (a19 != null) {
                vi1.j2 a27 = l2Var2.a(b1Var.f437274b);
                valueOf = a27 != null ? java.lang.Long.valueOf(a27.f437368q) : null;
                kotlin.jvm.internal.o.d(valueOf);
                a19.f437368q = valueOf.longValue() + 1;
            }
            java.lang.String string = b1Var.f437273a.getString(com.tencent.mm.R.string.f490147m8);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            b1Var.a(string);
            return;
        }
        if (i17 == 3) {
            vi1.l2 l2Var3 = vi1.l2.f437401a;
            vi1.j2 a28 = l2Var3.a(b1Var.f437274b);
            if (a28 != null) {
                vi1.j2 a29 = l2Var3.a(b1Var.f437274b);
                valueOf = a29 != null ? java.lang.Long.valueOf(a29.f437368q) : null;
                kotlin.jvm.internal.o.d(valueOf);
                a28.f437368q = valueOf.longValue() + 1;
            }
            java.lang.String string2 = b1Var.f437273a.getString(com.tencent.mm.R.string.m_);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            b1Var.a(string2);
            return;
        }
        vi1.l2 l2Var4 = vi1.l2.f437401a;
        vi1.j2 a37 = l2Var4.a(b1Var.f437274b);
        if (a37 != null) {
            vi1.j2 a38 = l2Var4.a(b1Var.f437274b);
            valueOf = a38 != null ? java.lang.Long.valueOf(a38.f437368q) : null;
            kotlin.jvm.internal.o.d(valueOf);
            a37.f437368q = valueOf.longValue() + 1;
        }
        java.lang.String string3 = b1Var.f437273a.getString(com.tencent.mm.R.string.f490151mc);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        b1Var.a(string3);
    }
}
