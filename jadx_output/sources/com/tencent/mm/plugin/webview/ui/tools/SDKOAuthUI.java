package com.tencent.mm.plugin.webview.ui.tools;

@db5.a(3)
@ul5.d(0)
/* loaded from: classes15.dex */
public final class SDKOAuthUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: J, reason: collision with root package name */
    public static int f183717J;
    public java.lang.String A;
    public java.lang.String B;
    public int C;
    public int D;
    public java.lang.String E;
    public java.lang.String F;
    public com.tencent.mm.opensdk.modelmsg.SendAuth.Options G;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f183718d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.opensdk.modelmsg.SendAuth.Req f183719e;

    /* renamed from: f, reason: collision with root package name */
    public int f183720f;

    /* renamed from: g, reason: collision with root package name */
    public int f183721g;

    /* renamed from: h, reason: collision with root package name */
    public int f183722h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f183723i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.s2 f183724m;

    /* renamed from: n, reason: collision with root package name */
    public rl5.r f183725n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.OpenSdkFaceDetectInfoLayout f183726o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f183727p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f183728q;

    /* renamed from: s, reason: collision with root package name */
    public boolean f183730s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.j3 f183731t;

    /* renamed from: u, reason: collision with root package name */
    public long f183732u;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f183735x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f183736y;

    /* renamed from: r, reason: collision with root package name */
    public int f183729r = 0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f183733v = true;

    /* renamed from: w, reason: collision with root package name */
    public boolean f183734w = false;

    /* renamed from: z, reason: collision with root package name */
    public int f183737z = 2;
    public final java.util.LinkedList H = new java.util.LinkedList();
    public final db5.t4 I = new com.tencent.mm.plugin.webview.ui.tools.h2(this);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static void T6(com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI sDKOAuthUI, r45.px4 px4Var, r45.xv5 xv5Var, boolean z17) {
        boolean z18;
        ?? r37;
        ?? r07;
        java.lang.String str;
        java.lang.String str2;
        sDKOAuthUI.getClass();
        if (px4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "fillNewOauthPage: do not get scope request for user info");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "disagreeBtnCallback click");
        java.util.Iterator it = xv5Var.f390513d.iterator();
        while (true) {
            z18 = true;
            if (!it.hasNext()) {
                r37 = false;
                break;
            } else if (com.tencent.mm.plugin.webview.model.j3.p((r45.px4) it.next())) {
                r37 = true;
                break;
            }
        }
        if (r37 == true) {
            java.util.LinkedList linkedList = sDKOAuthUI.H;
            if (z17) {
                com.tencent.mm.plugin.webview.model.j3.a(xv5Var, linkedList);
                com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "add scopes to userHasSelectedScopes, userHasSelectedScopes = %s", com.tencent.mm.plugin.webview.model.j3.l(linkedList));
            }
            if (!z17 && px4Var.f383460f == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "user disagree + but must agree => cancel");
                sDKOAuthUI.U6(-4);
                sDKOAuthUI.finish();
                return;
            }
            java.util.Iterator it6 = xv5Var.f390513d.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    r07 = false;
                    break;
                }
                r45.px4 px4Var2 = (r45.px4) it6.next();
                if ((px4Var2 != null && ("snsapi_friend".equals(px4Var2.f383458d) || "snsapi_wxaapp_info".equals(px4Var2.f383458d))) != false) {
                    r07 = true;
                    break;
                }
            }
            if (r07 != true && !com.tencent.mm.plugin.webview.model.j3.m(xv5Var)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "only show page 1");
                if (com.tencent.mm.plugin.webview.model.j3.b(xv5Var, sDKOAuthUI.f183734w).booleanValue()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "go to SDKOAuthAppDataUI");
                    sDKOAuthUI.j7(xv5Var, com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI.class, sDKOAuthUI.f183724m.f186834h, 7, "snsapi_friend");
                    com.tencent.mm.plugin.webview.model.j3.g(sDKOAuthUI);
                    return;
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "only page 1 + no need to show appDataUI => cancel");
                    sDKOAuthUI.U6(-4);
                    sDKOAuthUI.finish();
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "check policy and try to send result");
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                com.tencent.mm.plugin.webview.model.j3.a(xv5Var, linkedList2);
                com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "try to send result, isFromQRCodeScan = %s, scopeSize = %s", java.lang.Boolean.valueOf(sDKOAuthUI.f183734w), java.lang.Integer.valueOf(linkedList.size()));
                sDKOAuthUI.W6();
                sDKOAuthUI.f183723i = db5.e1.Q(sDKOAuthUI, null, sDKOAuthUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.webview.ui.tools.g2(sDKOAuthUI));
                if (sDKOAuthUI.f183734w) {
                    sDKOAuthUI.f183731t.i(1, linkedList2, sDKOAuthUI.f183724m.f186834h, sDKOAuthUI.f183736y, null, false);
                    return;
                } else {
                    com.tencent.mm.opensdk.modelmsg.SendAuth.Req req = sDKOAuthUI.f183719e;
                    sDKOAuthUI.f183731t.j(1, linkedList2, sDKOAuthUI.f183724m.f186834h, sDKOAuthUI.A, sDKOAuthUI.C, null, java.lang.Boolean.FALSE, req != null ? req.isOption1 : false);
                    return;
                }
            }
            hy4.b.INSTANCE.a(sDKOAuthUI.f183718d, sDKOAuthUI.f183732u, z17 ? 1 : 0, sDKOAuthUI.f183737z, 2, 1, 0);
            java.util.Iterator it7 = xv5Var.f390513d.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    z18 = false;
                    break;
                } else {
                    r45.px4 px4Var3 = (r45.px4) it7.next();
                    if ((px4Var3 != null && ("snsapi_friend".equals(px4Var3.f383458d) || "snsapi_wxaapp_info".equals(px4Var3.f383458d))) != false) {
                        break;
                    }
                }
            }
            if (z18) {
                if (com.tencent.mm.plugin.webview.model.j3.n("snsapi_friend", xv5Var.f390513d) != null) {
                    str2 = "snsapi_friend";
                } else if (com.tencent.mm.plugin.webview.model.j3.n("snsapi_wxaapp_info", xv5Var.f390513d) != null) {
                    str2 = "snsapi_wxaapp_info";
                } else {
                    str = "";
                    com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "has friend info, scope = %s", str);
                    sDKOAuthUI.j7(xv5Var, com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI.class, sDKOAuthUI.f183724m.f186834h, 0, str);
                }
                str = str2;
                com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "has friend info, scope = %s", str);
                sDKOAuthUI.j7(xv5Var, com.tencent.mm.plugin.webview.ui.tools.SDKOAuthFriendUI.class, sDKOAuthUI.f183724m.f186834h, 0, str);
            } else if (com.tencent.mm.plugin.webview.model.j3.m(xv5Var)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "has other info");
                sDKOAuthUI.j7(xv5Var, com.tencent.mm.plugin.webview.ui.tools.SDKOAuthOtherUI.class, sDKOAuthUI.f183724m.f186834h, 0, "");
            }
            com.tencent.mm.plugin.webview.model.j3.g(sDKOAuthUI);
        }
    }

    public final void U6(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "dealWithCancel");
        if (this.f183734w) {
            gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.p1(2, this.f183736y, null, 0));
            return;
        }
        if (this.f183719e == null) {
            return;
        }
        java.lang.String Y6 = Y6(this.f183718d);
        java.lang.String str = this.f183718d;
        com.tencent.mm.opensdk.modelmsg.SendAuth.Req req = this.f183719e;
        gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.r1(2, str, req.state, Y6, null, 0, req.extData, this.f183731t.f182967i, this.A, this.C, req.isOption1));
        com.tencent.mm.opensdk.modelmsg.SendAuth.Resp resp = new com.tencent.mm.opensdk.modelmsg.SendAuth.Resp();
        com.tencent.mm.opensdk.modelmsg.SendAuth.Req req2 = this.f183719e;
        resp.transaction = req2.transaction;
        resp.errCode = i17;
        resp.lang = "zh_CN";
        resp.country = "";
        resp.state = req2.state;
        X6(Y6, resp);
    }

    public final void V6(int i17, java.lang.String str) {
        java.lang.String Y6 = Y6(this.f183718d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Y6)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "dealWithError pkg nil");
            return;
        }
        com.tencent.mm.opensdk.modelmsg.SendAuth.Resp resp = new com.tencent.mm.opensdk.modelmsg.SendAuth.Resp();
        com.tencent.mm.opensdk.modelmsg.SendAuth.Req req = this.f183719e;
        resp.transaction = req.transaction;
        resp.errCode = i17;
        resp.errStr = str;
        resp.lang = "zh_CN";
        resp.country = "";
        resp.state = req.state;
        X6(Y6, resp);
    }

    public final void W6() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183723i;
        if (u3Var != null && u3Var.isShowing()) {
            this.f183723i.dismiss();
        }
    }

    public final void X6(java.lang.String str, com.tencent.mm.opensdk.modelmsg.SendAuth.Resp resp) {
        if (this.f183728q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "doCallback has callback");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "doCallback pkg is empty");
            return;
        }
        this.f183728q = true;
        this.f183731t.f182964f = true;
        android.os.Bundle bundle = new android.os.Bundle();
        resp.toBundle(bundle);
        com.tencent.mm.pluginsdk.model.app.j1.g(bundle);
        com.tencent.mm.opensdk.channel.MMessageActV2.Args args = new com.tencent.mm.opensdk.channel.MMessageActV2.Args();
        args.targetPkgName = str;
        args.bundle = bundle;
        com.tencent.mm.opensdk.modelmsg.SendAuth.Options options = this.G;
        if (options != null && !com.tencent.mm.sdk.platformtools.t8.K0(options.callbackClassName)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "doCallback options.callbackClassName:" + this.G.callbackClassName + "  options.callbackFlags:" + this.G.callbackFlags);
            com.tencent.mm.opensdk.modelmsg.SendAuth.Options options2 = this.G;
            args.targetClassName = options2.callbackClassName;
            args.flags = options2.callbackFlags;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "doCallback pkg:" + str);
        com.tencent.mm.opensdk.channel.MMessageActV2.send(this, args);
    }

    public final java.lang.String Y6(java.lang.String str) {
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        if (j17 != null) {
            return j17.field_packageName;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SdkOAuthUI", "dealWithCancel getAppInfo null; appid: %s", str);
        return null;
    }

    public final int Z6() {
        return this.f183733v ? 2 : 1;
    }

    public final void a7() {
        if (this.f183730s) {
            return;
        }
        if (this.f183724m.getCount() >= f183717J) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483980cm4);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.otw);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.otx);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f483980cm4);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.otw);
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById5, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.otx);
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(findViewById6, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "handleAvatarBound", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b7() {
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        getController().X0(this, b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        getController().E0(b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "start, hasSetUin fail");
            dp.a.makeText(this, com.tencent.mm.R.string.c_, 1).show();
            return;
        }
        this.f183728q = false;
        android.content.Intent intent = getIntent();
        this.f183734w = intent.getBooleanExtra("auth_from_scan", false);
        this.f183732u = java.lang.System.currentTimeMillis();
        com.tencent.mm.opensdk.modelmsg.SendAuth.Options options = new com.tencent.mm.opensdk.modelmsg.SendAuth.Options();
        this.G = options;
        options.fromBundle(intent.getExtras());
        this.A = intent.getStringExtra("key_open_sdk_token");
        this.B = intent.getStringExtra("key_open_sdk_pkg_name");
        this.C = intent.getIntExtra("key_open_sdk_authentication_result", -1);
        this.D = intent.getIntExtra("key_open_sdk_version", 0);
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f183734w);
        com.tencent.mm.opensdk.modelmsg.SendAuth.Options options2 = this.G;
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "init isFromQRCodeScan %b  options.callbackClassName:%s, options.callbackFlags:%d, pkgName:%s, authenticationResult:%d, openSDKVersion:%d", valueOf, options2.callbackClassName, java.lang.Integer.valueOf(options2.callbackFlags), this.B, java.lang.Integer.valueOf(this.C), java.lang.Integer.valueOf(this.D));
        boolean z17 = this.f183734w;
        hy4.b bVar = hy4.b.INSTANCE;
        java.lang.String str = null;
        if (z17) {
            this.f183737z = 3;
            java.lang.String stringExtra = intent.getStringExtra("auth_raw_url");
            this.f183736y = stringExtra;
            com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "doQRCodeOauthAuthorize url: %s", stringExtra);
            if (!d7()) {
                i7();
            }
            r45.u15 u15Var = new r45.u15();
            int i17 = this.f183729r;
            u15Var.f386948e = i17;
            u15Var.f386947d = i17 > 0;
            gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.o1(stringExtra, u15Var));
            if (this.f183731t == null) {
                this.f183731t = new com.tencent.mm.plugin.webview.model.j3(this, true, null, this.f183736y);
            }
            bVar.d(3, "");
        } else {
            android.os.Bundle extras = getIntent().getExtras();
            java.lang.String string = extras.getString(com.tencent.mm.opensdk.constants.ConstantsAPI.CONTENT);
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "init content is nil");
                return;
            }
            java.lang.String queryParameter = android.net.Uri.parse(string).getQueryParameter("appid");
            this.f183718d = queryParameter;
            if (com.tencent.mm.sdk.platformtools.t8.K0(queryParameter)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "parseAppId try case not sensitive, content:%s", string);
                this.f183718d = android.net.Uri.parse(string.toLowerCase()).getQueryParameter("appid");
            }
            if (this.f183719e == null) {
                java.lang.String str2 = this.f183718d;
                ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
                com.tencent.mm.pluginsdk.model.app.m j17 = com.tencent.mm.pluginsdk.model.app.w.j(str2, false, false);
                if (j17 != null && com.tencent.mm.sdk.platformtools.t8.K0(j17.field_openId)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "checkGetAppSetting appId: %s ", str2);
                    com.tencent.mm.autogen.events.GetAppSettingEvent getAppSettingEvent = new com.tencent.mm.autogen.events.GetAppSettingEvent();
                    getAppSettingEvent.f54381g.f6950a = str2;
                    getAppSettingEvent.e();
                }
                this.f183719e = new com.tencent.mm.opensdk.modelmsg.SendAuth.Req(extras);
            }
            bVar.d(2, this.f183719e.extData);
            if (this.f183731t == null) {
                java.lang.String str3 = this.f183718d;
                com.tencent.mm.opensdk.modelmsg.SendAuth.Req req = this.f183719e;
                this.f183731t = new com.tencent.mm.plugin.webview.model.j3(this, str3, req.transaction, req.state, req.extData);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f183719e.scope) || !this.f183719e.scope.contains("snsapi_wxaapp_info") || this.f183719e.scope.equals("snsapi_wxaapp_info")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "init success, doSDKOauthAuthorize");
                java.lang.String str4 = this.f183718d;
                java.lang.String Y6 = Y6(str4);
                com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "doSDKOauthAuthorize appid: %s, extData：%s", str4, this.f183719e.extData);
                if (!d7()) {
                    i7();
                }
                com.tencent.mm.opensdk.modelmsg.SendAuth.Req req2 = this.f183719e;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(Y6)) {
                    android.content.pm.Signature[] a17 = com.tencent.mm.pluginsdk.model.app.c.a(this, Y6, false);
                    if (a17 == null || a17.length == 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "getSignature signatures failed");
                    } else {
                        str = kk.k.g(a17[0].toByteArray());
                    }
                }
                java.lang.String str5 = str;
                java.lang.String str6 = this.A;
                int i18 = this.C;
                r45.u15 u15Var2 = new r45.u15();
                int i19 = this.f183729r;
                u15Var2.f386948e = i19;
                u15Var2.f386947d = i19 > 0;
                gm0.j1.d().g(new com.tencent.mm.plugin.webview.model.q1(str4, req2, Y6, str5, str6, i18, u15Var2));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "init check SCOPE_GET_WXAAPP_INFO fail");
                V6(-1000, java.lang.String.format(getContext().getResources().getString(com.tencent.mm.R.string.l8d), "snsapi_wxaapp_info"));
                finish();
            }
        }
        f7();
    }

    public final boolean c7(int i17) {
        if (i17 == 1 || i17 == 2 || i17 == 7 || i17 == 8) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, errType = " + i17);
            return false;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            return true;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "isNetworkAvailable false, not connected");
        return false;
    }

    public final boolean d7() {
        int i17 = this.f183729r;
        return i17 == 3 || i17 == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0248 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e7(int r23, int r24, java.lang.String r25, r45.xv5 r26) {
        /*
            Method dump skipped, instructions count: 1365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.e7(int, int, java.lang.String, r45.xv5):void");
    }

    public final void f7() {
        int i17 = getResources().getConfiguration().orientation;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ioq);
        if (findViewById != null) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
            layoutParams.bottomMargin = i17 == 2 ? i65.a.b(this, 12) : i17 == 1 ? i65.a.b(this, 96) : 0;
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public final void g7() {
        android.view.View view = this.f183727p;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.l2 l2Var = new com.tencent.mm.plugin.webview.ui.tools.l2(this);
        int i17 = getResources().getConfiguration().orientation;
        if (i17 == 2) {
            l2Var.invoke(java.lang.Integer.valueOf(com.tencent.mm.R.id.vis), java.lang.Integer.valueOf(com.tencent.mm.R.dimen.apz));
            l2Var.invoke(java.lang.Integer.valueOf(com.tencent.mm.R.id.sml), java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f480597aq3));
            l2Var.invoke(java.lang.Integer.valueOf(com.tencent.mm.R.id.vit), java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f480595aq1));
        } else if (i17 == 1) {
            l2Var.invoke(java.lang.Integer.valueOf(com.tencent.mm.R.id.vis), java.lang.Integer.valueOf(com.tencent.mm.R.dimen.apy));
            l2Var.invoke(java.lang.Integer.valueOf(com.tencent.mm.R.id.sml), java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f480596aq2));
            l2Var.invoke(java.lang.Integer.valueOf(com.tencent.mm.R.id.vit), java.lang.Integer.valueOf(com.tencent.mm.R.dimen.f480594aq0));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cil;
    }

    public final void h7(java.lang.String str, boolean z17) {
        db5.e1.t(this, str, getString(com.tencent.mm.R.string.l8b), new com.tencent.mm.plugin.webview.ui.tools.e2(this, str, z17));
    }

    public final void i7() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183723i;
        if (u3Var == null || u3Var.isShowing()) {
            this.f183723i = db5.e1.Q(this, null, getString(com.tencent.mm.R.string.hdm), true, true, new com.tencent.mm.plugin.webview.ui.tools.f2(this));
        } else {
            this.f183723i.show();
        }
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(com.tencent.mm.plugin.webview.ui.tools.u2.class);
        return hashSet;
    }

    public final void j7(r45.xv5 xv5Var, java.lang.Class cls, int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "startScopeActivity  cls:" + cls + "  scope:" + str);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) cls);
        intent.putExtra("0", this.f183718d);
        com.tencent.mm.opensdk.modelmsg.SendAuth.Req req = this.f183719e;
        if (req != null) {
            intent.putExtra("1", req.transaction);
            intent.putExtra("4", this.f183719e.state);
            intent.putExtra("7", this.f183719e.extData);
            intent.putExtra("auth_isoption1", this.f183719e.isOption1);
        }
        intent.putExtra("3", i17);
        intent.putExtra("5", i18);
        intent.putExtra("auth_from_scan", this.f183734w);
        intent.putExtra("auth_raw_url", this.f183736y);
        intent.putExtra("has_selected_scope", this.H);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            intent.putExtra("key_open_sdk_token", this.A);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
            intent.putExtra("key_open_sdk_pkg_name", this.B);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.C);
        intent.putExtra("key_open_sdk_version", this.D);
        if (!android.text.TextUtils.isEmpty(str)) {
            intent.putExtra("auth_scope", str);
        }
        com.tencent.mm.opensdk.modelmsg.SendAuth.Options options = this.G;
        if (options != null && !com.tencent.mm.sdk.platformtools.t8.K0(options.callbackClassName)) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.G.toBundle(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", xv5Var.toByteArray());
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;IILjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void k7(r45.xv5 xv5Var, java.lang.Class cls, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "startScopeActivity %s", cls.getSimpleName());
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) cls);
        intent.putExtra("0", this.f183718d);
        intent.putExtra("has_selected_scope", this.H);
        com.tencent.mm.opensdk.modelmsg.SendAuth.Req req = this.f183719e;
        if (req != null) {
            intent.putExtra("1", req.transaction);
            intent.putExtra("4", this.f183719e.state);
            intent.putExtra("7", this.f183719e.extData);
            intent.putExtra("auth_isoption1", this.f183719e.isOption1);
        }
        intent.putExtra("auth_from_scan", this.f183734w);
        if (!android.text.TextUtils.isEmpty(str)) {
            intent.putExtra("auth_scope", str);
        }
        intent.putExtra("auth_raw_url", this.f183736y);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.A)) {
            intent.putExtra("key_open_sdk_token", this.A);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.B)) {
            intent.putExtra("key_open_sdk_pkg_name", this.B);
        }
        intent.putExtra("key_open_sdk_authentication_result", this.C);
        intent.putExtra("key_open_sdk_version", this.D);
        com.tencent.mm.opensdk.modelmsg.SendAuth.Options options = this.G;
        if (options != null && !com.tencent.mm.sdk.platformtools.t8.K0(options.callbackClassName)) {
            android.os.Bundle bundle = new android.os.Bundle();
            this.G.toBundle(bundle);
            intent.putExtra("send_auth_option", bundle);
        }
        try {
            intent.putExtra("2", xv5Var.toByteArray());
        } catch (java.io.IOException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "SdkOauthAuthorizeResp toByteArray failed");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/plugin/webview/ui/tools/SDKOAuthUI", "startScopeActivity", "(Lcom/tencent/mm/protocal/protobuf/SdkOauthAuthorizeResp;Ljava/lang/Class;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.util.LinkedList linkedList;
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "onAcvityResult requestCode:%d, resultCode:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i17 != 6) {
            if (i17 != 9) {
                return;
            }
            java.util.HashMap hashMap = (java.util.HashMap) nw4.a.a(intent != null ? intent.getExtras() : null);
            java.lang.String str = hashMap.get("err_msg") instanceof java.lang.String ? (java.lang.String) hashMap.get("err_msg") : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "face detect errCode %s, errMsg=%s", hashMap.get("err_code"), str);
            if (i18 == -1) {
                this.f183729r = 1;
                this.f183726o.setVisibility(8);
                b7();
                return;
            } else {
                if (i18 == 1) {
                    this.f183729r = 2;
                    if (!this.f183734w) {
                        V6(-1, str);
                    }
                    b7();
                    finish();
                    return;
                }
                if (i18 == 0) {
                    this.f183729r = 3;
                    U6(-2);
                    b7();
                    finish();
                    return;
                }
                return;
            }
        }
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "Create avatar cancel or failed");
            return;
        }
        r45.mx4 mx4Var = new r45.mx4();
        mx4Var.f380893d = intent.getIntExtra(dm.i4.COL_ID, -1);
        mx4Var.f380894e = intent.getStringExtra("nickname");
        mx4Var.f380895f = intent.getStringExtra("avatarurl");
        mx4Var.f380896g = null;
        com.tencent.mm.plugin.webview.ui.tools.s2 s2Var = this.f183724m;
        if (s2Var != null) {
            s2Var.getClass();
            if (mx4Var.f380893d == -1 || (linkedList = s2Var.f186830d) == null || linkedList.size() >= f183717J) {
                z17 = false;
            } else {
                linkedList.add(mx4Var);
                z17 = true;
            }
            if (z17) {
                this.f183724m.f186834h = mx4Var.f380893d;
                a7();
                this.f183724m.notifyDataSetChanged();
                return;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(this.f183724m == null);
        com.tencent.mars.xlog.Log.e("MicroMsg.SdkOAuthUI", "onActivityResult mAvatarAdapter == null:%b", objArr);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f7();
        g7();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "onCreate");
        super.onCreate(bundle);
        gm0.j1.d().a(1346, this);
        gm0.j1.d().a(1388, this);
        gm0.j1.d().a(2700, this);
        gm0.j1.d().a(2543, this);
        gm0.j1.d().a(1137, this);
        setMMTitle("");
        b7();
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.add(0, 1, 0, getString(com.tencent.mm.R.string.h88));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "onDestroy");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f183723i;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        gm0.j1.d().q(1388, this);
        gm0.j1.d().q(1346, this);
        gm0.j1.d().q(2700, this);
        gm0.j1.d().q(2543, this);
        gm0.j1.d().q(1137, this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i17, keyEvent);
        }
        hy4.b.INSTANCE.a(this.f183718d, this.f183732u, 0, this.f183737z, Z6(), 1, 0);
        U6(-2);
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "key back click");
        finish();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "onPause");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "onResume");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02fe  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r24, int r25, java.lang.String r26, com.tencent.mm.modelbase.m1 r27) {
        /*
            Method dump skipped, instructions count: 893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.SDKOAuthUI.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "onStart");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        com.tencent.mars.xlog.Log.i("MicroMsg.SdkOAuthUI", "onStop");
    }
}
