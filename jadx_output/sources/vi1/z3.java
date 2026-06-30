package vi1;

/* loaded from: classes7.dex */
public final class z3 implements fl1.b2, si1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f437517d;

    /* renamed from: e, reason: collision with root package name */
    public final xi1.g f437518e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f437519f;

    /* renamed from: g, reason: collision with root package name */
    public final vi1.j2 f437520g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem f437521h;

    /* renamed from: i, reason: collision with root package name */
    public final vi1.f0 f437522i;

    /* renamed from: m, reason: collision with root package name */
    public fl1.g2 f437523m;

    /* renamed from: n, reason: collision with root package name */
    public final int f437524n;

    /* renamed from: o, reason: collision with root package name */
    public int f437525o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f437526p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.FrameLayout f437527q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew f437528r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f437529s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f437530t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f437531u;

    /* renamed from: v, reason: collision with root package name */
    public vi1.p3 f437532v;

    public z3(android.content.Context context, int i17, xi1.g windowAndroid, java.lang.String appId, vi1.j2 j2Var, com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem, vi1.f0 f0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(windowAndroid, "windowAndroid");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(phoneItem, "phoneItem");
        this.f437517d = context;
        this.f437518e = windowAndroid;
        this.f437519f = appId;
        this.f437520g = j2Var;
        this.f437521h = phoneItem;
        this.f437522i = f0Var;
        int a17 = com.tencent.mm.ui.zk.a(context, com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1);
        a17 = a17 < i17 ? i17 : a17;
        this.f437524n = a17;
        this.f437525o = s();
        com.tencent.mars.xlog.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "candidateMinHeight:%d", java.lang.Integer.valueOf(i17));
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.f488064fv, null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f437526p = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.a0q);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f437527q = frameLayout;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.a0u);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew editVerifyCodeViewNew = (com.tencent.mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew) findViewById2;
        this.f437528r = editVerifyCodeViewNew;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.a0r);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f437529s = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.a0s);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f437530t = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.a0t);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f437531u = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.a0p);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        ((android.widget.ImageView) findViewById6).setOnClickListener(new vi1.l3(this));
        frameLayout.setMinimumHeight(a17);
        frameLayout.addOnLayoutChangeListener(new vi1.n3(this));
        editVerifyCodeViewNew.setCodeEditCompleteListener(new vi1.o3(this));
    }

    public static final void c(vi1.z3 z3Var, int i17) {
        z3Var.getClass();
        com.tencent.mars.xlog.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "processSendSmsResp:%d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "startSmsListener");
            vi1.p3 p3Var = z3Var.f437532v;
            if (p3Var != null) {
                p3Var.cancel();
            } else {
                z3Var.f437532v = new vi1.p3(z3Var, 60000L, 1000L);
            }
            vi1.p3 p3Var2 = z3Var.f437532v;
            if (p3Var2 != null) {
                p3Var2.start();
                return;
            }
            return;
        }
        android.content.Context context = z3Var.f437517d;
        if (i17 == 1) {
            z3Var.x();
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490146m7);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            z3Var.u(string);
            return;
        }
        if (i17 == 2) {
            z3Var.x();
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f490147m8);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            z3Var.u(string2);
            return;
        }
        z3Var.x();
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.f490146m7);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        z3Var.u(string3);
    }

    public static final void e(vi1.z3 z3Var, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        z3Var.getClass();
        com.tencent.mars.xlog.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "processVerifyCodeResp:%d", java.lang.Integer.valueOf(i17));
        vi1.j2 j2Var = z3Var.f437520g;
        boolean z17 = true;
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
            vi1.f0 f0Var = z3Var.f437522i;
            if (f0Var != null) {
                ((cb1.g0) f0Var).a(true, hashMap);
            }
            z3Var.dismiss();
            return;
        }
        android.content.Context context = z3Var.f437517d;
        if (i17 == 1) {
            z3Var.x();
            java.lang.String string = context.getString(com.tencent.mm.R.string.f490146m7);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            z3Var.u(string);
            if (j2Var == null) {
                return;
            }
            java.lang.Long valueOf2 = java.lang.Long.valueOf(j2Var.f437377z);
            kotlin.jvm.internal.o.d(valueOf2);
            j2Var.f437377z = valueOf2.longValue() + 1;
            return;
        }
        if (i17 != 3 && i17 != 4) {
            z17 = false;
        }
        if (z17) {
            z3Var.x();
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.m_);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            z3Var.u(string2);
            if (j2Var == null) {
                return;
            }
            java.lang.Long valueOf3 = java.lang.Long.valueOf(j2Var.f437377z);
            kotlin.jvm.internal.o.d(valueOf3);
            j2Var.f437377z = valueOf3.longValue() + 1;
            return;
        }
        z3Var.x();
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.f490151mc);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        z3Var.u(string3);
        if (j2Var == null) {
            return;
        }
        java.lang.Long valueOf4 = java.lang.Long.valueOf(j2Var.f437377z);
        kotlin.jvm.internal.o.d(valueOf4);
        j2Var.f437377z = valueOf4.longValue() + 1;
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f437523m;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f437526p;
    }

    @Override // fl1.b2
    public int getPosition() {
        return 2;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    public final void k() {
        java.lang.Object systemService = this.f437517d.getSystemService("window");
        android.view.WindowManager windowManager = systemService instanceof android.view.WindowManager ? (android.view.WindowManager) systemService : null;
        if (windowManager != null) {
            fl1.i2 i2Var = fl1.i2.f263792a;
            android.content.Context context = this.f437526p.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            i2Var.a(context, this.f437526p, null, windowManager.getDefaultDisplay().getRotation(), this.f437518e, false);
        }
    }

    @Override // fl1.b2
    public void m() {
        zk1.a.a(this.f437526p);
    }

    @Override // fl1.b2
    public void onCancel() {
    }

    @Override // si1.i0
    public void r(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        i(component).c(this);
        w();
    }

    public final int s() {
        int i17 = (int) (r0.getResources().getDisplayMetrics().heightPixels * (2 == this.f437517d.getResources().getConfiguration().orientation ? 1.0f : 0.75f));
        com.tencent.mars.xlog.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "calculateMaxHeight, maxHeight: " + i17);
        return i17;
    }

    public final void t() {
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        android.content.Context context = this.f437517d;
        spannableStringBuilder.append((java.lang.CharSequence) context.getString(com.tencent.mm.R.string.f490145m6));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.setSpan(new vi1.q3(this), 0, length, 17);
        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f478524a5)), 0, length, 17);
        android.widget.TextView textView = this.f437529s;
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void u(java.lang.String str) {
        this.f437528r.setText("");
        android.widget.TextView textView = this.f437531u;
        textView.setText(str);
        textView.setTextColor(this.f437517d.getResources().getColor(com.tencent.mm.R.color.Red_90));
        t();
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f437523m = g2Var;
        k();
    }

    public final void w() {
        this.f437528r.setText("");
        android.content.Context context = this.f437517d;
        java.lang.CharSequence text = context.getResources().getText(com.tencent.mm.R.string.f490335s4);
        android.widget.TextView textView = this.f437531u;
        textView.setText(text);
        textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem = this.f437521h;
        this.f437530t.setText(context.getString(com.tencent.mm.R.string.f490152md, phoneItem.f87400e));
        com.tencent.mm.ui.widget.dialog.g4 c17 = com.tencent.mm.ui.widget.dialog.g4.c(context, context.getString(com.tencent.mm.R.string.a3u), true, null);
        boolean z17 = phoneItem.f87406n;
        java.lang.String appId = this.f437519f;
        if (z17) {
            java.lang.String mobile = phoneItem.f87399d;
            kotlin.jvm.internal.o.g(appId, "appId");
            kotlin.jvm.internal.o.g(mobile, "mobile");
            vi1.s3 s3Var = new vi1.s3(this, c17);
            r45.xz5 xz5Var = new r45.xz5();
            xz5Var.f390631d = appId;
            xz5Var.f390632e = mobile;
            ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/sendverifycode", appId, xz5Var, r45.yz5.class).n(new vi1.p(s3Var))).s(new vi1.q(s3Var));
            return;
        }
        java.lang.String mobile2 = phoneItem.f87399d;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(mobile2, "mobile");
        vi1.u3 u3Var = new vi1.u3(this, c17);
        r45.xz5 xz5Var2 = new r45.xz5();
        xz5Var2.f390631d = appId;
        xz5Var2.f390632e = mobile2;
        ((km5.q) ((com.tencent.mm.plugin.appbrand.networking.c0) nd.f.a(com.tencent.mm.plugin.appbrand.networking.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/sendverifycode", appId, xz5Var2, r45.yz5.class).n(new vi1.n(u3Var))).s(new vi1.o(u3Var));
    }

    public final void x() {
        com.tencent.mars.xlog.Log.i("Luggage.FULL.PhoneNumberVerifyCodeDialogNew", "stopSmsListener");
        vi1.p3 p3Var = this.f437532v;
        if (p3Var != null) {
            p3Var.cancel();
        }
    }

    @Override // fl1.b2
    public void y(int i17) {
        k();
        this.f437525o = s();
    }
}
