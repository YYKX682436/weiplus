package vi1;

/* loaded from: classes7.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f437384a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f437385b;

    /* renamed from: c, reason: collision with root package name */
    public final vi1.j2 f437386c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem f437387d;

    /* renamed from: e, reason: collision with root package name */
    public final vi1.f0 f437388e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f437389f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.EditText f437390g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f437391h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f437392i;

    /* renamed from: j, reason: collision with root package name */
    public vi1.m2 f437393j;

    /* renamed from: k, reason: collision with root package name */
    public final int f437394k;

    /* renamed from: l, reason: collision with root package name */
    public final int f437395l;

    public k3(android.content.Context context, java.lang.String appId, vi1.j2 j2Var, java.lang.String ext_desc, com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem, vi1.f0 f0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(ext_desc, "ext_desc");
        kotlin.jvm.internal.o.g(phoneItem, "phoneItem");
        this.f437384a = context;
        this.f437385b = appId;
        this.f437386c = j2Var;
        this.f437387d = phoneItem;
        this.f437388e = f0Var;
        this.f437394k = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        this.f437395l = 1000;
        java.lang.Object systemService = context.getSystemService("layout_inflater");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.tencent.mm.R.layout.f488110hf, (android.view.ViewGroup) null);
        this.f437389f = inflate;
        this.f437390g = inflate != null ? (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.a0u) : null;
        this.f437392i = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a0v) : null;
        this.f437391h = inflate != null ? (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.a08) : null;
    }

    public static final void a(vi1.k3 k3Var, java.lang.String str) {
        k3Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errMsg", str);
        vi1.f0 f0Var = k3Var.f437388e;
        if (f0Var != null) {
            ((cb1.g0) f0Var).a(false, hashMap);
        }
    }

    public static final void b(vi1.k3 k3Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        k3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "handleCheckVerifyCodeStatus:%d", java.lang.Integer.valueOf(i17));
        vi1.j2 j2Var = k3Var.f437386c;
        if (i17 == 0) {
            if (j2Var != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f437376y);
                kotlin.jvm.internal.o.d(valueOf);
                j2Var.f437376y = valueOf.longValue() + 1;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errMsg", "ok");
            if (str == null) {
                str = "";
            }
            hashMap.put("encryptedData", str);
            if (str2 == null) {
                str2 = "";
            }
            hashMap.put("iv", str2);
            if (str3 == null) {
                str3 = "";
            }
            hashMap.put("cloud_id", str3);
            if (str4 == null) {
                str4 = "";
            }
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str4);
            vi1.f0 f0Var = k3Var.f437388e;
            if (f0Var != null) {
                ((cb1.g0) f0Var).a(true, hashMap);
                return;
            }
            return;
        }
        android.content.Context context = k3Var.f437384a;
        if (i17 == 1) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490147m8);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            k3Var.f(string);
            if (j2Var == null) {
                return;
            }
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j2Var.f437377z);
            kotlin.jvm.internal.o.d(valueOf2);
            j2Var.f437377z = valueOf2.longValue() + 1;
            return;
        }
        if (i17 == 3 || i17 == 4) {
            com.tencent.mm.plugin.appbrand.utils.m1.b(context, context.getString(com.tencent.mm.R.string.m_), "", false, new vi1.a3(k3Var));
            if (j2Var == null) {
                return;
            }
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j2Var.f437377z);
            kotlin.jvm.internal.o.d(valueOf3);
            j2Var.f437377z = valueOf3.longValue() + 1;
            return;
        }
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.f490151mc);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        k3Var.f(string2);
        if (j2Var == null) {
            return;
        }
        java.lang.Long valueOf4 = java.lang.Long.valueOf(j2Var.f437377z);
        kotlin.jvm.internal.o.d(valueOf4);
        j2Var.f437377z = valueOf4.longValue() + 1;
    }

    public static final void c(vi1.k3 k3Var, int i17) {
        k3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "handleSendVerifyCodeStatus:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "startSmsListener");
            vi1.m2 m2Var = k3Var.f437393j;
            if (m2Var != null) {
                m2Var.cancel();
            } else {
                k3Var.f437393j = new vi1.m2(k3Var, k3Var.f437394k, k3Var.f437395l);
            }
            vi1.m2 m2Var2 = k3Var.f437393j;
            if (m2Var2 != null) {
                m2Var2.start();
                return;
            }
            return;
        }
        android.content.Context context = k3Var.f437384a;
        if (i17 == 1) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490146m7);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            k3Var.f(string);
        } else if (i17 == 2) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f490147m8);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            k3Var.f(string2);
        } else {
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.f490146m7);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            k3Var.f(string3);
        }
    }

    public static final void d(vi1.k3 k3Var) {
        android.widget.EditText editText = k3Var.f437390g;
        if (editText != null) {
            editText.setText("");
        }
        android.content.Context context = k3Var.f437384a;
        android.widget.TextView textView = k3Var.f437392i;
        if (textView != null) {
            textView.setText(context.getString(com.tencent.mm.R.string.f490152md, k3Var.f437387d.f87400e));
        }
        k3Var.h();
        android.view.View view = k3Var.f437389f;
        if (view != null && (view.getParent() instanceof android.view.ViewGroup)) {
            android.view.ViewParent parent = view.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent).removeView(view);
        }
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = context.getString(com.tencent.mm.R.string.f490155mg);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.D(view, -1);
        j0Var.setOnDismissListener(new vi1.e3(k3Var));
        j0Var.A(context.getString(com.tencent.mm.R.string.a4f), false, new vi1.h3(k3Var));
        j0Var.w(context.getString(com.tencent.mm.R.string.a4j), true, new vi1.i3(k3Var));
        j0Var.show();
        if (view != null) {
            view.post(new vi1.d3(k3Var));
        }
    }

    public final void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "doSendVerifyCode");
        android.content.Context context = this.f437384a;
        com.tencent.mm.ui.widget.dialog.g4 c17 = com.tencent.mm.ui.widget.dialog.g4.c(context, context.getString(com.tencent.mm.R.string.a3u), true, null);
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = this.f437387d;
        boolean z18 = phoneItem.f87406n;
        java.lang.String appId = this.f437385b;
        if (z18) {
            java.lang.String mobile = phoneItem.f87399d;
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(mobile, "mobile");
            vi1.p2 p2Var = new vi1.p2(c17, this, z17);
            r45.xz5 xz5Var = new r45.xz5();
            xz5Var.f390631d = appId;
            xz5Var.f390632e = mobile;
            ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/sendverifycode", appId, xz5Var, r45.yz5.class).n(new vi1.p(p2Var))).s(new vi1.q(p2Var));
            return;
        }
        java.lang.String mobile2 = phoneItem.f87399d;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mobile2, "mobile");
        vi1.t2 t2Var = new vi1.t2(this, c17, z17);
        r45.xz5 xz5Var2 = new r45.xz5();
        xz5Var2.f390631d = appId;
        xz5Var2.f390632e = mobile2;
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/sendverifycode", appId, xz5Var2, r45.yz5.class).n(new vi1.n(t2Var))).s(new vi1.o(t2Var));
    }

    public final void f(java.lang.String str) {
        g();
        com.tencent.mm.plugin.appbrand.utils.m1.b(this.f437384a, str, "", false, new vi1.c3(this));
    }

    public final void g() {
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberVerifyCodeDialog", "stopSmsListener");
        vi1.m2 m2Var = this.f437393j;
        if (m2Var != null) {
            m2Var.cancel();
        }
    }

    public final void h() {
        android.content.Context context = this.f437384a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f490142m3);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = context.getString(com.tencent.mm.R.string.f490145m6);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        spannableStringBuilder.append((java.lang.CharSequence) string);
        spannableStringBuilder.append((java.lang.CharSequence) string2);
        int length = string.length();
        int length2 = string2.length() + length;
        spannableStringBuilder.setSpan(new vi1.j3(this), length, length2, 17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f478524a5)), length, length2, 17);
        android.widget.TextView textView = this.f437391h;
        if (textView != null) {
            textView.setText(spannableStringBuilder);
        }
        if (textView == null) {
            return;
        }
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }
}
