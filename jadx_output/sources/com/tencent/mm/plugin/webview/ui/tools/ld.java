package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ld {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.Map f185649s = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f185653d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185654e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.m3 f185655f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.WebViewTransHelper f185656g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f185657h;

    /* renamed from: j, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f185659j;

    /* renamed from: a, reason: collision with root package name */
    public boolean f185650a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f185651b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f185652c = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f185658i = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public zq1.v f185660k = null;

    /* renamed from: l, reason: collision with root package name */
    public android.view.View f185661l = null;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f185662m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f185663n = true;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f185664o = null;

    /* renamed from: p, reason: collision with root package name */
    public boolean f185665p = false;

    /* renamed from: q, reason: collision with root package name */
    public long f185666q = android.os.SystemClock.elapsedRealtime();

    /* renamed from: r, reason: collision with root package name */
    public int f185667r = -1;

    public ld(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f185659j = null;
        this.f185654e = webViewUI;
        this.f185655f = new com.tencent.mm.plugin.webview.ui.tools.m3(webViewUI);
        if (this.f185659j == null && k()) {
            com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl webViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl = new com.tencent.mm.plugin.webview.ui.tools.WebViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl(this);
            this.f185659j = webViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl;
            webViewUIStyleHelper$BizFinderLineStatusChangedEventListenerImpl.alive();
        }
    }

    public static void a(com.tencent.mm.plugin.webview.ui.tools.ld ldVar, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, android.view.MotionEvent motionEvent, java.lang.String str) {
        com.tencent.mm.ui.widget.MMWebView mMWebView;
        ldVar.getClass();
        if (webViewUI == null || webViewUI.f183844p0 == null || (mMWebView = webViewUI.f183815f) == null) {
            return;
        }
        int[] iArr = new int[2];
        mMWebView.getLocationOnScreen(iArr);
        int rawX = ((int) motionEvent.getRawX()) - iArr[0];
        int rawY = ((int) motionEvent.getRawY()) - iArr[1];
        float mMDensity = mMWebView.getMMDensity();
        if (mMDensity != 0.0f) {
            nw4.n nVar = webViewUI.f183844p0;
            float f17 = rawX / mMDensity;
            float f18 = rawY / mMDensity;
            if (!nVar.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "sendFakeImmersiveUIStyleTopInsetChanged fail, not ready");
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("x", java.lang.String.valueOf(f17));
            hashMap.put("y", java.lang.String.valueOf(f18));
            hashMap.put("action", str);
            nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onActionBarClickEventInImmersiveMode", hashMap, nVar.f340903q, nVar.f340904r) + ")", null);
        }
    }

    public static void p(android.view.View view, com.tencent.mm.ui.ga gaVar) {
        android.view.View j17 = gaVar.G.j();
        if (j17 instanceof android.widget.LinearLayout) {
            ((android.widget.LinearLayout) j17).addView(view);
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -1;
            layoutParams.weight = 1.0f;
            view.setLayoutParams(layoutParams);
            return;
        }
        if (j17 instanceof android.widget.RelativeLayout) {
            ((android.widget.RelativeLayout) j17).addView(view);
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        r0.putBoolean("set_navigation_bar_color_titleAlphaAdjustment", com.tencent.mm.sdk.platformtools.t8.y(r10, false));
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0092 A[Catch: Exception -> 0x00bf, TryCatch #1 {Exception -> 0x00bf, blocks: (B:31:0x007e, B:33:0x0086, B:38:0x0092, B:43:0x00a1, B:45:0x00aa, B:50:0x00b4), top: B:30:0x007e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r9, org.json.JSONObject r10, com.tencent.mm.protocal.JsapiPermissionWrapper r11) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.ld.b(java.lang.String, org.json.JSONObject, com.tencent.mm.protocal.JsapiPermissionWrapper):void");
    }

    public com.tencent.mm.plugin.webview.ui.tools.jd c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        android.os.Bundle bundle = (android.os.Bundle) ((java.util.HashMap) f185649s).get(f(str));
        if (bundle == null) {
            return null;
        }
        java.lang.String string = bundle.getString("key_brand_name");
        java.lang.String string2 = bundle.getString("key_brand_user_name");
        java.lang.String string3 = bundle.getString("key_bag_icon");
        java.lang.String string4 = bundle.getString("key_title");
        java.lang.String string5 = bundle.getString("key_cover");
        boolean z17 = bundle.getBoolean("key_show_menu_onfo", false);
        int i17 = bundle.getInt("key_item_show_type", -1);
        boolean z18 = bundle.getBoolean("key_disable_menu_header", false);
        java.lang.String string6 = bundle.getString("key_mp_vid", "");
        boolean z19 = bundle.getBoolean("key_disable_can_read_articel", false);
        boolean z27 = bundle.getBoolean("key_send_article_reading_btn_clicked", false);
        java.lang.String string7 = bundle.getString("key_biz_id", "");
        long j17 = bundle.getLong("key_idx", -1L);
        long j18 = bundle.getLong("key_mid", -1L);
        com.tencent.mm.plugin.webview.ui.tools.jd jdVar = new com.tencent.mm.plugin.webview.ui.tools.jd();
        jdVar.f184873c = string3;
        jdVar.f184872b = string;
        jdVar.f184871a = string2;
        jdVar.f184876f = z17;
        jdVar.f184874d = string4;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string5)) {
            string3 = string5;
        }
        jdVar.f184875e = string3;
        jdVar.f184877g = i17;
        jdVar.f184878h = z18;
        jdVar.f184879i = string6;
        jdVar.f184881k = z19;
        jdVar.f184882l = z27;
        jdVar.f184880j = str;
        jdVar.f184883m = string7;
        jdVar.f184885o = j17;
        jdVar.f184884n = j18;
        return jdVar;
    }

    public int d() {
        if (this.f185654e == null) {
            return 0;
        }
        return j() ? this.f185654e.getResources().getColor(com.tencent.mm.R.color.aam) : this.f185654e.getResources().getColor(com.tencent.mm.R.color.aae);
    }

    public final java.lang.String e(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        try {
            android.net.Uri parse = android.net.Uri.parse(str);
            int P = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter("idx"), 0);
            long V = com.tencent.mm.sdk.platformtools.t8.V(parse.getQueryParameter("mid"), 0L);
            this.f185667r = com.tencent.mm.sdk.platformtools.t8.P(parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
            return V + "#" + P;
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public final java.lang.String f(java.lang.String str) {
        if (str == null || gm0.j1.s(zq1.a0.class) == null || !((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(str)) {
            return str;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        return com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.n(str);
    }

    public void g() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185654e;
        if (webViewUI == null) {
            return;
        }
        webViewUI.getController().D0(0);
        o();
        android.view.View view = this.f185661l;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "hideTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "hideTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        zq1.v vVar = this.f185660k;
        if (vVar != null) {
            ((com.tencent.mm.pluginsdk.model.h) vVar).b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r6 = this;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r6.f185654e
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.String r1 = "MicroMsg.WebViewUIStyleHelper"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto Le
        Lb:
            r0 = r3
            goto L77
        Le:
            boolean r0 = r0.f7()
            if (r0 == 0) goto L15
            goto Lb
        L15:
            boolean r0 = r6.f185651b
            if (r0 == 0) goto L1a
            goto Lb
        L1a:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r6.f185654e
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L76
            java.lang.String r4 = "disable_light_actionbar_style"
            boolean r4 = r0.getBooleanExtra(r4, r2)
            if (r4 == 0) goto L30
            java.lang.String r0 = "checkDisableLightActionbarStyle, KDisableLightActionbarStyle is true"
            com.tencent.mars.xlog.Log.i(r1, r0)
            goto Lb
        L30:
            java.lang.String r4 = "status_bar_style"
            java.lang.String r4 = r0.getStringExtra(r4)
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 != 0) goto L4b
            java.lang.String r5 = "black"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4b
            java.lang.String r0 = "checkDisableLightActionbarStyle, customized by KStatusBarStyle"
            com.tencent.mars.xlog.Log.i(r1, r0)
            goto Lb
        L4b:
            java.lang.String r4 = "customize_status_bar_color"
            int r4 = r0.getIntExtra(r4, r2)
            if (r4 == 0) goto L59
            java.lang.String r0 = "checkDisableLightActionbarStyle, customized by KCustomizeStatusBarColor"
            com.tencent.mars.xlog.Log.i(r1, r0)
            goto Lb
        L59:
            java.lang.String r4 = "open_custom_style_url"
            boolean r4 = r0.getBooleanExtra(r4, r2)
            if (r4 == 0) goto L67
            java.lang.String r0 = "checkDisableLightActionbarStyle, customized by KOpenCustomStyleUrl"
            com.tencent.mars.xlog.Log.i(r1, r0)
            goto Lb
        L67:
            java.lang.String r4 = "show_full_screen"
            boolean r0 = r0.getBooleanExtra(r4, r2)
            if (r0 == 0) goto L76
            java.lang.String r0 = "checkDisableLightActionbarStyle, webview is fullscreen"
            com.tencent.mars.xlog.Log.i(r1, r0)
            goto Lb
        L76:
            r0 = r2
        L77:
            if (r0 == 0) goto L7c
            r6.f185650a = r3
            goto L7e
        L7c:
            r6.f185650a = r2
        L7e:
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r6.f185654e
            boolean r2 = r6.f185650a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2}
            java.lang.String r2 = "initNewWebViewUIStyleParams, webViewUI#%s, disableLightActionbarStyle:%b"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.ld.h():void");
    }

    public final boolean i(android.os.Bundle bundle) {
        if (bundle == null || !bundle.getBoolean("key_show_live_top_bar", true)) {
            return false;
        }
        java.lang.String string = bundle.getString("key_url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(string) || gm0.j1.s(zq1.a0.class) == null || !((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).o(string) || !k()) {
            return false;
        }
        java.lang.String string2 = bundle.getString("key_brand_user_name");
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        return com.tencent.mm.pluginsdk.model.b0.f189197a.o(string2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
    
        if (r2.matcher(r0).find() != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j() {
        /*
            r8 = this;
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r8.f185654e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = r8.f185657h
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r2 == 0) goto L14
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r0 = r8.f185654e
            java.lang.String r0 = r0.F7()
        L14:
            java.lang.Boolean r2 = hy4.p0.f286188d
            if (r2 == 0) goto L28
            java.lang.String r2 = hy4.p0.f286187c
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.D0(r0, r2)
            if (r2 == 0) goto L28
            java.lang.Boolean r0 = hy4.p0.f286188d
            boolean r0 = r0.booleanValue()
            goto Lcb
        L28:
            hy4.p0.f286187c = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "^(http|https)://"
            r2.<init>(r3)
            r4 = 2131769611(0x7f10390b, float:1.9170502E38)
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.t9.a(r4)
            r2.append(r5)
            java.lang.String r5 = "/(s|mp/author|mp/appmsg/show)"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r5 = 2
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r5)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r2 = r2.find()
            r6 = 1
            if (r2 == 0) goto L55
            goto Lc0
        L55:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "^(http|https)://(sh.|hk.|sz.)?"
            r2.<init>(r7)
            r7 = 2131769613(0x7f10390d, float:1.9170506E38)
            java.lang.String r7 = com.tencent.mm.sdk.platformtools.t9.a(r7)
            r2.append(r7)
            java.lang.String r7 = "/connect/(confirm|oauth2/(authorize|explorer_authorize))"
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r5)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r2 = r2.find()
            if (r2 == 0) goto L7e
            goto Lc0
        L7e:
            java.util.regex.Pattern r2 = hy4.p0.f286186b
            if (r2 != 0) goto Lb2
            j62.e r2 = j62.e.g()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.t9.a(r4)
            r5.append(r3)
            java.lang.String r3 = "/mp/(readtemplate\\?t=scanlogin/index_tmpl|scanlogin\\?action=index|relatedarticle\\?action=page|aboutbiz|infringement|qa)"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r4 = "clicfg_webview_mp_host_list"
            java.lang.String r2 = r2.a(r4, r3, r6, r6)
            java.lang.Object[] r3 = new java.lang.Object[]{r2}
            java.lang.String r4 = "MicroMsg.WebViewUIUtil"
            java.lang.String r5 = "mpHosts=:%s"
            com.tencent.mars.xlog.Log.i(r4, r5, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            hy4.p0.f286186b = r2
        Lb2:
            java.util.regex.Pattern r2 = hy4.p0.f286186b
            if (r2 == 0) goto Lc1
            java.util.regex.Matcher r0 = r2.matcher(r0)
            boolean r0 = r0.find()
            if (r0 == 0) goto Lc1
        Lc0:
            r1 = r6
        Lc1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            hy4.p0.f286188d = r0
            boolean r0 = r0.booleanValue()
        Lcb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.ld.j():boolean");
    }

    public boolean k() {
        if (gm0.j1.s(zq1.a0.class) != null) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (((java.lang.Boolean) ((jz5.n) com.tencent.mm.pluginsdk.model.b0.f189208l).getValue()).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public void l() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185654e;
        if (webViewUI != null) {
            com.tencent.mm.plugin.webview.ui.tools.r3 r3Var = webViewUI.f183870x2;
            com.tencent.mm.plugin.webview.ui.tools.j3 j3Var = r3Var.f186806b;
            if (!(j3Var.f184852a || j3Var.f184854c) && !r3Var.f186807c) {
                this.f185654e.setActionbarColor(d());
            }
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = this.f185654e;
        if (webViewUI2 != null) {
            android.view.View findViewById = webViewUI2.findViewById(com.tencent.mm.R.id.pim);
            if (findViewById != null) {
                com.tencent.mm.plugin.webview.ui.tools.j3 j3Var2 = this.f185654e.f183870x2.f186806b;
                if (!(j3Var2.f184852a || j3Var2.f184854c) && !this.f185655f.f185679b) {
                    findViewById.setBackgroundColor(d());
                }
            }
            int color = this.f185654e.getResources().getColor(com.tencent.mm.R.color.aan);
            android.view.View findViewById2 = this.f185654e.findViewById(com.tencent.mm.R.id.pip);
            if (findViewById2 != null && (findViewById2 instanceof android.widget.TextView)) {
                ((android.widget.TextView) findViewById2).setTextColor(color);
            }
        }
        m();
    }

    public void m() {
        if (this.f185654e == null) {
            return;
        }
        com.tencent.mm.plugin.webview.WebViewTransHelper webViewTransHelper = this.f185656g;
        if ((webViewTransHelper.f181742e == null || webViewTransHelper.c().f224246o.getValue() == null || webViewTransHelper.c().f224246o.getValue() == cw4.q0.f224269d) ? false : true) {
            this.f185654e.hideActionbarLine();
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185654e;
        if (webViewUI.M2) {
            webViewUI.hideActionbarLine();
        } else {
            webViewUI.showActionbarLine();
        }
    }

    public void n() {
        android.os.Bundle bundle = (android.os.Bundle) ((java.util.HashMap) f185649s).get(f(this.f185657h));
        if (bundle == null || this.f185654e == null) {
            g();
        } else if (bundle.getBoolean("key_current_info_show") || i(bundle)) {
            q();
        } else {
            g();
        }
    }

    public final void o() {
        android.widget.TextView mMSubTitle = this.f185654e.getMMSubTitle();
        java.lang.String charSequence = (mMSubTitle == null || mMSubTitle.getText() == null) ? null : mMSubTitle.getText().toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
            return;
        }
        this.f185654e.getController().A0(charSequence);
    }

    public void q() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI;
        int i17;
        java.lang.String str;
        android.os.Bundle bundle = (android.os.Bundle) ((java.util.HashMap) f185649s).get(f(this.f185657h));
        if (bundle == null || (webViewUI = this.f185654e) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUIStyleHelper", "showTopBar not ready %s", this.f185657h);
            return;
        }
        if (webViewUI.f183809d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "fixedTitle not show topbar");
            return;
        }
        if (!this.f185663n) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "showTopBar canShowShowTopBarLayout false and not show");
            return;
        }
        if (this.f185665p) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "trans help button shown, do not show topbar");
            return;
        }
        android.view.View view = this.f185664o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f185654e.getController().D0(8);
        this.f185654e.getController().N.setVisibility(8);
        if (this.f185661l == null) {
            android.view.View inflate = this.f185654e.getLayoutInflater().inflate(com.tencent.mm.R.layout.d_4, (android.view.ViewGroup) null);
            this.f185661l = inflate;
            this.f185662m = inflate.findViewById(com.tencent.mm.R.id.m3c);
            p(this.f185661l, this.f185654e.getController());
        }
        android.widget.TextView textView = (android.widget.TextView) this.f185661l.findViewById(com.tencent.mm.R.id.kbq);
        android.view.View findViewById = this.f185661l.findViewById(com.tencent.mm.R.id.pix);
        android.view.View findViewById2 = this.f185661l.findViewById(com.tencent.mm.R.id.piw);
        android.view.View findViewById3 = this.f185661l.findViewById(com.tencent.mm.R.id.piy);
        android.view.View findViewById4 = this.f185661l.findViewById(com.tencent.mm.R.id.ifp);
        java.lang.String string = bundle.getString("key_brand_name");
        java.lang.String string2 = bundle.getString("key_brand_user_name");
        java.lang.String i18 = gm0.j1.s(zq1.a0.class) != null ? ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).i(string2) : "";
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(i18) && i(bundle);
        boolean z18 = bundle.getBoolean("key_current_info_show");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "showTopBar userName:%s, nickName:%s, isLiveNow:%b, show %b", string2, string, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        if (com.tencent.mm.sdk.platformtools.t8.K0(string) || com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewUIStyleHelper", "showTopBar invalid param, userName %s, nickName %s", string2, string);
            return;
        }
        this.f185654e.setMMTitle("");
        android.view.View view2 = this.f185661l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i19 = z17 ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        java.lang.String str2 = i18;
        yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = z17 ? 8 : 4;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById3, arrayList4.toArray(), "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/plugin/webview/ui/tools/WebViewUIStyleHelper", "showTopBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int b17 = i65.a.b(this.f185654e, 4);
        int intExtra = this.f185654e.getIntent().getIntExtra(com.tencent.mm.ui.w2.f211193f, 0);
        if (!z17 || z18) {
            i17 = 1;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI2 = this.f185654e;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(webViewUI2, string, textSize));
            findViewById2.setBackgroundResource(com.tencent.mm.R.color.a9e);
            textView.setTextSize(1, 17.0f);
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            int i28 = b17 * 2;
            findViewById2.setPadding(i28, 0, i28, 0);
            int b18 = i65.a.b(this.f185654e, 10);
            fq1.e eVar = fq1.e.f265507a;
            android.view.View view3 = this.f185662m;
            int i29 = b18 * 2;
            if (view3 != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                layoutParams.width = b18;
                layoutParams.height = i29;
                view3.setLayoutParams(layoutParams);
            }
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(findViewById);
        } else {
            textView.setText(this.f185654e.getString(com.tencent.mm.R.string.aku));
            findViewById2.setBackgroundResource(com.tencent.mm.R.drawable.baz);
            i17 = 1;
            textView.setTextSize(1, 13.0f);
            com.tencent.mm.ui.bk.t0(textView.getPaint());
            int i37 = b17 * 3;
            findViewById2.setPadding(i37, 0, i37, 0);
            int i38 = b17 * 2;
            fq1.e eVar2 = fq1.e.f265507a;
            android.view.View view4 = this.f185662m;
            int i39 = i38 * 2;
            if (view4 != null) {
                android.view.ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                layoutParams2.width = i38;
                layoutParams2.height = i39;
                view4.setLayoutParams(layoutParams2);
            }
        }
        java.lang.String string3 = bundle.getString("key_url");
        if (z17) {
            str = string2;
            int j17 = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).j(str);
            java.lang.String e17 = e(string3);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[8];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[i17] = str;
            objArr[2] = java.lang.Integer.valueOf(this.f185667r);
            objArr[3] = java.lang.Integer.valueOf(intExtra);
            objArr[4] = str2;
            objArr[5] = java.lang.Integer.valueOf(j17);
            objArr[6] = java.lang.Integer.valueOf(z18 ? 3 : 2);
            objArr[7] = e17;
            g0Var.d(23044, objArr);
        } else {
            str = string2;
        }
        if (z17 && !z18) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(findViewById, "living_label_webview_title");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(findViewById, 40, 26236);
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            arrayMap.put("live_id", "");
            arrayMap.put("finder_username", "");
            arrayMap.put("feed_id", "");
            arrayMap.put("comment_scene", "");
            arrayMap.put("wx_username", str);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(findViewById, arrayMap);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(findViewById, new com.tencent.mm.plugin.webview.ui.tools.gd(this, str2));
        }
        findViewById.setOnClickListener(new com.tencent.mm.plugin.webview.ui.tools.id(this, z17, str, intExtra, str2, z18, string3));
        com.tencent.mm.ui.tools.d8.a(findViewById);
    }

    public final void r(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUIStyleHelper", "startCheck fail bizUserName is null");
            return;
        }
        if (this.f185660k == null) {
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            this.f185660k = new com.tencent.mm.pluginsdk.model.h(9);
        }
        ((com.tencent.mm.pluginsdk.model.h) this.f185660k).a(str);
    }

    public final void s(float f17) {
        if (this.f185652c != f17) {
            this.f185652c = f17;
            nw4.n nVar = this.f185654e.f183844p0;
            if (!nVar.f340895i) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "sendFakeImmersiveUIStyleTopInsetChanged fail, not ready");
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("top", java.lang.String.valueOf(f17));
            nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("fakeImmersiveUIStyleTopInsetChanged", hashMap, nVar.f340903q, nVar.f340904r) + ")", null);
        }
    }
}
