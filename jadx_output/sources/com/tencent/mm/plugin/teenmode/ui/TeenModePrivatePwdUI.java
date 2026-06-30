package com.tencent.mm.plugin.teenmode.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI;", "Lcom/tencent/mm/ui/MMWizardActivity;", "<init>", "()V", "plugin-teenmode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TeenModePrivatePwdUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f172900r = 0;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f172906m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f172907n;

    /* renamed from: p, reason: collision with root package name */
    public com.tenpay.android.wechat.MyKeyboardWindow f172909p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f172910q;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f172901e = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.y6(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f172902f = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.g7(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f172903g = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.a7(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f172904h = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.x6(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f172905i = jz5.h.b(com.tencent.mm.plugin.teenmode.ui.z6.f173206d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f172908o = jz5.h.b(new com.tencent.mm.plugin.teenmode.ui.h7(this));

    public static final void a7(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI) {
        teenModePrivatePwdUI.getClass();
        if (c01.e2.a0()) {
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).df() == null) {
                teenModePrivatePwdUI.b7(4);
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(teenModePrivatePwdUI.getContext());
            u1Var.g(teenModePrivatePwdUI.getString(com.tencent.mm.R.string.jtu));
            u1Var.j(teenModePrivatePwdUI.getString(com.tencent.mm.R.string.f490347sg));
            u1Var.m(com.tencent.mm.R.string.f490551ya);
            u1Var.l(new com.tencent.mm.plugin.teenmode.ui.o6(teenModePrivatePwdUI));
            u1Var.q(false);
            return;
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Jj("wxalitebff7a643e2eefdb070cb79979b6ddd7f");
        if (teenModePrivatePwdUI.f7()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalitebff7a643e2eefdb070cb79979b6ddd7f");
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "pages/entry/index");
            bundle.putDouble("heightPercent", 1.0d);
            bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, true);
            bundle.putBoolean("forbidRightGesture", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModePrivatePwdUI", "open liteapp:wxalitebff7a643e2eefdb070cb79979b6ddd7f,page:");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(teenModePrivatePwdUI.getContext(), bundle, true, false, null);
        }
        if (teenModePrivatePwdUI.f7()) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/newreadtemplate?t=parental/resetpassword");
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        intent.putExtra("neverGetA8Key", false);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.n(teenModePrivatePwdUI.getContext(), "webview", ".ui.tools.WebViewUI", intent, 101);
        ((vh4.t1) i95.n0.c(vh4.t1.class)).T(30);
    }

    public final byte[] Z6(byte[] bArr, byte[] bArr2) {
        try {
            javax.crypto.Mac mac = javax.crypto.Mac.getInstance("HmacSHA256");
            mac.init(new javax.crypto.spec.SecretKeySpec(bArr, "HmacSHA256"));
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModePrivatePwdUI", "HmacSHA256Encrypt: %s   %s   %s", com.tencent.mm.sdk.platformtools.t8.l(bArr), com.tencent.mm.sdk.platformtools.t8.l(bArr2), com.tencent.mm.sdk.platformtools.t8.l(mac.doFinal(bArr2)));
            byte[] doFinal = mac.doFinal(bArr2);
            kotlin.jvm.internal.o.f(doFinal, "doFinal(...)");
            return doFinal;
        } catch (java.lang.Throwable unused) {
            return new byte[0];
        }
    }

    public final void b7(int i17) {
        r45.v26 v26Var = new r45.v26();
        v26Var.f387830g = i17;
        v26Var.f387831h = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h;
        v26Var.f387832i = 2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4277;
        lVar.f70666c = "/cgi-bin/micromsg-bin/setteenagermodepwd";
        lVar.f70664a = v26Var;
        lVar.f70665b = new r45.w26();
        kotlinx.coroutines.flow.j a17 = o01.d.f341891a.a(lVar.a());
        androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(this).a(um3.b.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = ((um3.b) a18).O6();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.c(O6, kotlinx.coroutines.internal.b0.f310484a, kotlinx.coroutines.a1.DEFAULT, new com.tencent.mm.plugin.teenmode.ui.c6(a17, this, i17, null));
    }

    public final com.tencent.mm.protobuf.g c7(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModePrivatePwdUI", "getEncryptBuf, %s, %s", str, gm0.j1.b().j());
        java.nio.charset.Charset charset = r26.c.f368865a;
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        java.lang.String j17 = gm0.j1.b().j();
        kotlin.jvm.internal.o.f(j17, "getUinString(...)");
        byte[] bytes2 = j17.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
        byte[] Z6 = Z6(bytes, bytes2);
        java.lang.String j18 = gm0.j1.b().j();
        kotlin.jvm.internal.o.f(j18, "getUinString(...)");
        byte[] bytes3 = j18.getBytes(charset);
        kotlin.jvm.internal.o.f(bytes3, "getBytes(...)");
        byte[] Z62 = Z6(Z6, bytes3);
        return new com.tencent.mm.protobuf.g(Z62, 0, Z62.length);
    }

    public final com.tenpay.android.wechat.TempSecureEditText d7() {
        java.lang.Object value = ((jz5.n) this.f172904h).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tenpay.android.wechat.TempSecureEditText) value;
    }

    public final int e7() {
        return ((java.lang.Number) ((jz5.n) this.f172901e).getValue()).intValue();
    }

    public final boolean f7() {
        return ((java.lang.Boolean) ((jz5.n) this.f172905i).getValue()).booleanValue();
    }

    public final int g7() {
        return ((java.lang.Number) ((jz5.n) this.f172903g).getValue()).intValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cyb;
    }

    public final boolean h7() {
        return ((java.lang.Boolean) ((jz5.n) this.f172902f).getValue()).booleanValue();
    }

    public final void hideTenpayKB() {
        android.view.View view = this.f172910q;
        if (view == null) {
            kotlin.jvm.internal.o.o("mKBLayout");
            throw null;
        }
        if (view == null) {
            kotlin.jvm.internal.o.o("mKBLayout");
            throw null;
        }
        if (view.isShown()) {
            android.view.View view2 = this.f172910q;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("mKBLayout");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final boolean i7() {
        return ((java.lang.Boolean) ((jz5.n) this.f172908o).getValue()).booleanValue();
    }

    public final void j7() {
        int i17 = g7() == 1 ? com.tencent.mm.R.string.jtl : com.tencent.mm.R.string.jtb;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        if (h7()) {
            textView.setText(getString(i17));
            textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.a0b));
            textView.setVisibility((e7() == 1 || e7() == 5) ? 8 : 0);
        }
    }

    public final java.lang.String k7() {
        return d7().getText().toString();
    }

    public final void l7(java.lang.String str) {
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484050cu2);
        textView.setText(str);
        textView.setVisibility(0);
        textView.setTextColor(textView.getResources().getColor(com.tencent.mm.R.color.f478532ac));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 100 && i18 == 0 && intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("result_err");
            if (stringExtra == null) {
                stringExtra = "";
            }
            l7(stringExtra);
            return;
        }
        if (i17 != 100 || i18 != -1) {
            if (i17 != 101 || intent == null) {
                return;
            }
            android.os.Bundle bundleExtra = intent.getBundleExtra("result_data");
            java.util.Map map = (java.util.Map) (bundleExtra != null ? bundleExtra.getSerializable("next_params") : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModePrivatePwdUI", "onActivityResult: %s", map);
            if (map != null && r26.i0.p("goback", (java.lang.String) map.get("next_step"), true)) {
                if (g7() == 3) {
                    android.content.Intent intent2 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.class);
                    intent2.addFlags(67108864);
                    intent2.putExtra("intent_close_me", true);
                    intent2.putExtra("intent_from_sys_to_inner", this.f172907n);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent2);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    finish();
                }
            }
            ((com.tencent.mm.plugin.zero.x0) ((c25.f) i95.n0.c(c25.f.class))).Ai().h(7);
            gm0.j1.d().g(new com.tencent.mm.modelsimple.p0(c01.z1.r()));
            return;
        }
        if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).df() == null) {
            android.content.Intent intent3 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.BindGuardianUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent3);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.class);
            intent4.addFlags(67108864);
            intent4.putExtra("intent_from_sys_to_inner", this.f172907n);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(intent4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(this, arrayList3.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList3.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.teenmode.ui.p6 p6Var = new com.tencent.mm.plugin.teenmode.ui.p6(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(p6Var, 200L, false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int i17;
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        if (((uh4.c0) i95.n0.c(uh4.c0.class)).T2() && !((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            this.f172907n = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModePrivatePwdUI", "process:{" + e7() + "}, scene:{" + g7() + "}, stepOne:" + h7());
        if (e7() == 4) {
            if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).df() == null) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.BindGuardianUI.class);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.teenmode.ui.q6 q6Var = new com.tencent.mm.plugin.teenmode.ui.q6(this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(q6Var, 200L, false);
                return;
            }
            if (i7()) {
                setResult(-1);
                finish();
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.class);
            intent2.addFlags(67108864);
            intent2.putExtra("intent_from_sys_to_inner", this.f172907n);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            ku5.u0 u0Var2 = ku5.t0.f312615d;
            com.tencent.mm.plugin.teenmode.ui.r6 r6Var = new com.tencent.mm.plugin.teenmode.ui.r6(this);
            ku5.t0 t0Var2 = (ku5.t0) u0Var2;
            t0Var2.getClass();
            t0Var2.z(r6Var, 200L, false);
            return;
        }
        if (e7() == 3 && !h7()) {
            i17 = com.tencent.mm.R.string.jta;
        } else if (e7() == 1 || e7() == 5) {
            i17 = g7() == 3 ? com.tencent.mm.R.string.jtj : com.tencent.mm.R.string.jtm;
        } else if (e7() == 2) {
            i17 = h7() ? com.tencent.mm.R.string.jth : com.tencent.mm.R.string.jti;
            ((vh4.t1) i95.n0.c(vh4.t1.class)).T(15);
        } else {
            i17 = com.tencent.mm.R.string.jt_;
        }
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.obc)).setText(getString(i17));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.fk.b((android.widget.TextView) findViewById);
        j7();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nty);
        if (e7() == 3 && g7() != 1 && h7() && !c01.e2.a0()) {
            textView.setVisibility(0);
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.s6(this, textView));
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gcp);
        if (textView2 != null && f7()) {
            textView2.setVisibility(8);
        }
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.gcr);
        if (e7() == 1 && g7() != 3) {
            java.lang.Object parent = textView3.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            android.view.View view = (android.view.View) parent;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (f7()) {
            textView3.setText(textView3.getResources().getString(com.tencent.mm.R.string.jtk));
        }
        textView3.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.t6(this));
        d7().addTextChangedListener(new com.tencent.mm.plugin.teenmode.ui.v6(this));
        android.view.View findViewById2 = findViewById(com.tenpay.R.id.tenpay_push_down);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById3 = findViewById(com.tenpay.R.id.tenpay_keyboard_top_line);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById3, arrayList5.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "hideKeyboardPushDownBtn", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tenpay.android.wechat.TempSecureEditText d76 = d7();
        android.view.View findViewById4 = findViewById(com.tenpay.R.id.tenpay_num_keyboard);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type com.tenpay.android.wechat.MyKeyboardWindow");
        this.f172909p = (com.tenpay.android.wechat.MyKeyboardWindow) findViewById4;
        android.view.View findViewById5 = findViewById(com.tenpay.R.id.tenpay_keyboard_layout);
        kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.view.View");
        this.f172910q = findViewById5;
        android.view.View findViewById6 = findViewById(com.tenpay.R.id.tenpay_push_down);
        kotlin.jvm.internal.o.e(findViewById6, "null cannot be cast to non-null type android.view.View");
        if (this.f172909p == null) {
            kotlin.jvm.internal.o.o("mKeyboard");
            throw null;
        }
        if (this.f172910q == null) {
            kotlin.jvm.internal.o.o("mKBLayout");
            throw null;
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = d76.getOnFocusChangeListener();
        hideVKB();
        d76.setInputType(0);
        d76.setPwdLength(4);
        d76.setOnFocusChangeListener(new com.tencent.mm.plugin.teenmode.ui.d7(this, false, onFocusChangeListener, 0, d76));
        d76.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.e7(this, false, 0, d76));
        findViewById6.setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.f7(this));
        showTenpayKB();
        d7().setIsPasswordFormat(true, true);
        d7().requestFocus();
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.w6(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public final void showTenpayKB() {
        android.view.View view = this.f172910q;
        if (view == null) {
            kotlin.jvm.internal.o.o("mKBLayout");
            throw null;
        }
        if (view == null) {
            kotlin.jvm.internal.o.o("mKBLayout");
            throw null;
        }
        if (view.isShown()) {
            return;
        }
        android.view.View view2 = this.f172910q;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mKBLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI", "showTenpayKB", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
