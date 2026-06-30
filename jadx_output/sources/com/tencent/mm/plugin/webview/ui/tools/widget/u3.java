package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class u3 extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.MutableContextWrapper f187548a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f187549b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f187550c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.v0 f187551d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.permission.w f187552e;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Bundle f187555h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f187556i;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.t4 f187561n;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f187570w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.Map f187571x;

    /* renamed from: f, reason: collision with root package name */
    public nw4.v2 f187553f = null;

    /* renamed from: g, reason: collision with root package name */
    public nw4.n f187554g = null;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f187557j = "";

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Map f187558k = new java.util.HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.r3 f187559l = new com.tencent.mm.plugin.webview.ui.tools.widget.r3(this);

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.q3 f187560m = new com.tencent.mm.plugin.webview.ui.tools.widget.q3(null);

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f187562o = null;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f187563p = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f187564q = null;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f187565r = new java.util.ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f187566s = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Map f187567t = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: u, reason: collision with root package name */
    public boolean f187568u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f187569v = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f187572y = true;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f187573z = new com.tencent.mm.plugin.webview.ui.tools.widget.t2(this);
    public com.tencent.mm.plugin.webview.ui.tools.widget.s3 A = new com.tencent.mm.plugin.webview.ui.tools.widget.s3(this);
    public com.tencent.mm.plugin.webview.ui.tools.widget.x3 B = new com.tencent.mm.plugin.webview.ui.tools.widget.p3(this);

    public u3(com.tencent.mm.ui.widget.MMWebView mMWebView, boolean z17, android.os.Bundle bundle) {
        this.f187556i = false;
        android.app.Activity a17 = q75.a.a(mMWebView.getContext());
        if (mMWebView.getContext() instanceof android.content.MutableContextWrapper) {
            this.f187548a = (android.content.MutableContextWrapper) mMWebView.getContext();
        } else {
            android.content.MutableContextWrapper mutableContextWrapper = new android.content.MutableContextWrapper(mMWebView.getContext());
            this.f187548a = mutableContextWrapper;
            if (a17 != null) {
                mutableContextWrapper.setBaseContext(a17);
            }
        }
        this.f187549b = mMWebView;
        this.f187550c = new com.tencent.mm.sdk.platformtools.n3();
        com.tencent.mm.plugin.webview.permission.w wVar = new com.tencent.mm.plugin.webview.permission.w(new com.tencent.mm.plugin.webview.ui.tools.widget.r2(this));
        this.f187552e = wVar;
        wVar.h((com.tencent.mm.protocal.JsapiPermissionWrapper) (a17 == null ? null : a17.getIntent().getParcelableExtra("hardcode_jspermission")), (com.tencent.mm.protocal.GeneralControlWrapper) (a17 != null ? a17.getIntent().getParcelableExtra("hardcode_general_ctrl") : null));
        this.f187556i = z17;
        this.f187555h = bundle;
        com.tencent.mm.plugin.webview.model.t4 t4Var = new com.tencent.mm.plugin.webview.model.t4(this.f187548a);
        this.f187561n = t4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "MMWebViewClient init, webview: %d, resourceInterrupter: %d", java.lang.Integer.valueOf(mMWebView.hashCode()), java.lang.Integer.valueOf(t4Var.hashCode()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (r4 != 5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean C(com.tencent.mm.plugin.webview.ui.tools.widget.u3 r9, int r10, int r11, int r12, java.lang.String r13, android.os.Bundle r14) {
        /*
            com.tencent.mm.ui.widget.MMWebView r13 = r9.f187549b
            boolean r0 = r13.f211376y
            r1 = 1
            java.lang.String r2 = "MicroMsg.MMWebViewClient"
            if (r0 != 0) goto Led
            com.tencent.mm.plugin.webview.permission.w r0 = r9.f187552e
            if (r0 != 0) goto Lf
            goto Led
        Lf:
            java.lang.String r3 = "scene_end_listener_hash_code"
            int r3 = r14.getInt(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            int r5 = r13.hashCode()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5}
            java.lang.String r5 = "get hash code = %d, self hash code = %d"
            com.tencent.mars.xlog.Log.i(r2, r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "edw onSceneEnd, type = "
            r4.<init>(r5)
            r4.append(r10)
            java.lang.String r5 = ", errCode = "
            r4.append(r5)
            r4.append(r12)
            java.lang.String r5 = ", errType = "
            r4.append(r5)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r2, r4)
            int r4 = r13.hashCode()
            if (r3 == r4) goto L59
            java.lang.String r9 = "hash code not equal"
            com.tencent.mars.xlog.Log.e(r2, r9)
            goto Lf2
        L59:
            r3 = 233(0xe9, float:3.27E-43)
            if (r10 == r3) goto L5f
            goto Lf2
        L5f:
            com.tencent.mm.plugin.webview.ui.tools.widget.r3 r10 = r9.f187559l
            int r4 = r10.f187522a
            int r4 = r4 + (-1)
            r10.f187522a = r4
            if (r4 > 0) goto L6e
            com.tencent.mm.plugin.webview.ui.tools.widget.u3 r10 = r10.f187523b
            r10.W(r3)
        L6e:
            com.tencent.mm.protocal.JsapiPermissionWrapper r10 = new com.tencent.mm.protocal.JsapiPermissionWrapper
            java.lang.String r3 = "geta8key_result_jsapi_perm_control_bytes"
            byte[] r3 = r14.getByteArray(r3)
            r10.<init>(r3)
            com.tencent.mm.protocal.GeneralControlWrapper r3 = new com.tencent.mm.protocal.GeneralControlWrapper
            java.lang.String r4 = "geta8key_result_general_ctrl_b1"
            int r4 = r14.getInt(r4)
            r3.<init>(r4)
            java.lang.String r4 = "geta8key_result_reason"
            int r4 = r14.getInt(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "edw geta8key onSceneEnd, req reason = "
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r2, r5)
            java.lang.String r2 = "geta8key_result_full_url"
            r5 = -2005(0xfffffffffffff82b, float:NaN)
            r6 = 4
            java.lang.String r7 = "geta8key_result_req_url"
            if (r4 == 0) goto Ld6
            if (r4 == r1) goto Lad
            r8 = 2
            if (r4 == r8) goto Ld6
            r8 = 5
            if (r4 == r8) goto Lad
            goto Lf2
        Lad:
            if (r11 != 0) goto Lc0
            if (r12 != 0) goto Lc0
            java.lang.String r11 = r14.getString(r7)
            r0.g(r11, r10, r3)
            java.util.Map r9 = r9.f187558k
            java.util.HashMap r9 = (java.util.HashMap) r9
            r9.remove(r11)
            goto Lf2
        Lc0:
            if (r11 != r6) goto Lf2
            if (r12 != r5) goto Lf2
            r13.stopLoading()
            java.lang.String r11 = r14.getString(r2)
            java.lang.String r12 = r14.getString(r7)
            r9.a0(r12, r11, r10, r3)
            r9.V(r14)
            goto Lf2
        Ld6:
            if (r11 != 0) goto Lda
            if (r12 == 0) goto Lde
        Lda:
            if (r11 != r6) goto Lf2
            if (r12 != r5) goto Lf2
        Lde:
            java.lang.String r11 = r14.getString(r2)
            java.lang.String r12 = r14.getString(r7)
            r9.a0(r12, r11, r10, r3)
            r9.V(r14)
            goto Lf2
        Led:
            java.lang.String r9 = "onSceneEnd, isFinishing, do nothing"
            com.tencent.mars.xlog.Log.w(r2, r9)
        Lf2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.ui.tools.widget.u3.C(com.tencent.mm.plugin.webview.ui.tools.widget.u3, int, int, int, java.lang.String, android.os.Bundle):boolean");
    }

    @Override // com.tencent.xweb.h1
    public final boolean B(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "edw opt, shouldOverride url = " + str);
        if (this.f187551d == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "Service not ready yet, make sure url loading happens after service connected");
            return true;
        }
        if (!com.tencent.mm.plugin.webview.model.r3.a(str)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.MMWebViewClient", "shouldOverrideUrlLoading, URL load failed, url = " + str);
            T(str);
            return true;
        }
        if (str.equals(this.f187564q)) {
            this.f187564q = "";
            return true;
        }
        vz.g1 g1Var = (vz.g1) i95.n0.c(vz.g1.class);
        java.lang.String F = F();
        ((uz.c) g1Var).getClass();
        if (com.tencent.mm.plugin.downloader.model.o.a(str, F, webView)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "use the downloader to download");
            return true;
        }
        boolean I = I(str);
        if (!I && str.startsWith("weixin://")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "shouldOverrideUrlLoading, can not deal with this weixin scheme, stop directly, url = %s", str);
            return true;
        }
        if (I) {
            return true;
        }
        int a17 = this.f187560m.a(str, this.f187572y);
        if ((a17 != 0 && a17 != 2) || this.f187556i) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "edw shouldOverride, should not continue, reason = " + a17);
        boolean z17 = a17 == 2 || !(str.equals(this.f187557j) || this.f187552e.f(str));
        boolean K = K(str);
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187549b;
        if (K) {
            mMWebView.stopLoading();
            mMWebView.post(new com.tencent.mm.plugin.webview.ui.tools.widget.s2(this, str));
        } else if (z17) {
            mMWebView.stopLoading();
        }
        if (z17) {
            X(str, true);
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MMWebViewClient", "shouldOverride, not trigger getA8key, nowURL[%s] newURL[%s] lastGetA8KeyUrl[%s] reason[%d]", webView.getUrl(), str, this.f187557j, java.lang.Integer.valueOf(a17));
        return false;
    }

    public void D() {
        this.f187550c.removeCallbacks(this.f187573z);
        try {
            this.f187551d.A5(this.f187549b.hashCode());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMWebViewClient", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.s3 s3Var = this.A;
        if (s3Var != null) {
            try {
                this.f187548a.unbindService(s3Var);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", e18.getMessage());
            }
        }
        nw4.n nVar = this.f187554g;
        if (nVar != null) {
            nVar.n();
        }
        nw4.v2 v2Var = this.f187553f;
        if (v2Var != null) {
            v2Var.f340990a = null;
            v2Var.f340991b = null;
            v2Var.f340992c = null;
        }
        W(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR);
        this.B = null;
        N();
    }

    public final java.lang.String E() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f187563p)) {
            return this.f187563p;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f187550c;
        if (n3Var == null) {
            return null;
        }
        if (java.lang.Thread.currentThread().getId() != n3Var.getLooper().getThread().getId()) {
            return (java.lang.String) new com.tencent.mm.plugin.webview.ui.tools.widget.v2(this, 500L, "").a(n3Var);
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187549b;
        return mMWebView == null ? "" : mMWebView.getUrl();
    }

    public java.lang.String F() {
        return "";
    }

    public com.tencent.mm.plugin.webview.ui.tools.widget.x3 G() {
        return null;
    }

    public boolean H(java.lang.String str) {
        return false;
    }

    public boolean I(java.lang.String str) {
        java.util.Iterator it = ((java.util.ArrayList) this.f187565r).iterator();
        while (it.hasNext()) {
            rw4.a aVar = (rw4.a) it.next();
            if (aVar.b(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "url handled, ret = " + aVar.f(str) + ", url = " + str);
                return true;
            }
        }
        return H(str);
    }

    public void J() {
        com.tencent.mm.plugin.webview.permission.w wVar = this.f187552e;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187549b;
        nw4.n nVar = new nw4.n(mMWebView, wVar, mMWebView.hashCode());
        this.f187554g = nVar;
        nVar.f340899m = this.f187551d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "initJsApi， webview: %d, jsapi: %d", java.lang.Integer.valueOf(mMWebView.hashCode()), java.lang.Integer.valueOf(this.f187554g.hashCode()));
        nw4.n nVar2 = this.f187554g;
        nVar2.f340893g = null;
        mMWebView.addJavascriptInterface(nVar2, "__wx");
        if (this.f187554g.y() != null) {
            mMWebView.addJavascriptInterface(this.f187554g.y(), "__wxtag");
        }
        ((java.util.ArrayList) this.f187565r).add(this.f187554g);
        int i17 = 0;
        nw4.v2 v2Var = new nw4.v2(mMWebView, this.f187554g, new com.tencent.mm.plugin.webview.ui.tools.widget.u2(this), false);
        this.f187553f = v2Var;
        R(v2Var);
        try {
            i17 = com.tencent.mm.sdk.platformtools.t8.P(this.f187551d.Yb("WebviewDisableDigestVerify"), 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWebViewClient", "getting js digest verification config fails, ex = " + e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "js digest verification config = %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0 && this.f187548a.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("wvsha1", true)) {
            this.f187554g.x0(true);
        }
    }

    public boolean K(java.lang.String str) {
        return false;
    }

    public void L() {
        if (android.text.TextUtils.isEmpty(this.f187562o)) {
            return;
        }
        if (nf.z.d(this.f187562o, "weixin://")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWebViewClient", "loadInitialUrl can not deal with this weixin scheme, stop directly, url = %s", this.f187562o);
            return;
        }
        if (I(this.f187562o)) {
            return;
        }
        android.net.Uri parse = android.net.Uri.parse(this.f187562o);
        if (parse.getScheme() == null) {
            java.lang.String str = this.f187562o + "http://";
            this.f187562o = str;
            parse = android.net.Uri.parse(str);
        }
        boolean startsWith = parse.getScheme().startsWith("http");
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187549b;
        if (!startsWith) {
            if (com.tencent.mm.plugin.webview.model.r3.a(this.f187562o)) {
                mMWebView.loadUrl(this.f187562o);
                return;
            } else {
                T(this.f187562o);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "uri scheme not startwith http, scheme = " + parse.getScheme());
        java.lang.String str2 = this.f187562o;
        this.f187560m = new com.tencent.mm.plugin.webview.ui.tools.widget.q3(str2);
        if (this.f187556i || this.f187552e.e(str2)) {
            mMWebView.loadUrl(this.f187562o);
        } else {
            X(this.f187562o, false);
        }
    }

    public void M(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("Pragma", "no-cache");
        hashMap.put("Cache-Control", "no-cache");
        this.f187549b.loadUrl(str, hashMap);
    }

    public void N() {
    }

    public void O(com.tencent.xweb.WebView webView, java.lang.String str) {
    }

    public void P(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
    }

    public void Q(nw4.n nVar) {
    }

    public void R(nw4.v2 v2Var) {
    }

    public void S(com.tencent.mm.plugin.webview.stub.v0 v0Var, com.tencent.mm.plugin.webview.permission.w wVar) {
    }

    public void T(java.lang.String str) {
    }

    public final boolean U(java.lang.String str, java.lang.String str2) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            java.util.regex.Pattern pattern = cw4.a.f224192a;
            if (pattern.matcher(str).matches() && pattern.matcher(str2).matches()) {
                java.lang.String replaceFirst = str.replaceFirst("http://", "").replaceFirst("https://", "");
                int indexOf = replaceFirst.indexOf(35);
                if (indexOf > 0) {
                    replaceFirst = replaceFirst.substring(0, indexOf);
                }
                if (str2.replaceFirst("http://", "").replaceFirst("https://", "").startsWith(replaceFirst) && this.f187551d != null && K(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean V(android.os.Bundle bundle) {
        java.lang.System.currentTimeMillis();
        int i17 = bundle.getInt("geta8key_result_action_code");
        java.lang.String string = bundle.getString("geta8key_result_title");
        java.lang.String string2 = bundle.getString("geta8key_result_full_url");
        java.lang.String string3 = bundle.getString("geta8key_result_content");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "processGetA8Key, actionCode = " + i17 + ", title = " + string + ", fullUrl = " + string2 + ", content = " + string3);
        java.lang.String[] stringArray = bundle.getStringArray("geta8key_result_http_header_key_list");
        java.lang.String[] stringArray2 = bundle.getStringArray("geta8key_result_http_header_value_list");
        java.util.HashMap hashMap = new java.util.HashMap();
        boolean z17 = false;
        if (stringArray != null && stringArray2 != null && stringArray.length > 0 && stringArray2.length > 0 && stringArray.length == stringArray2.length) {
            for (int i18 = 0; i18 < stringArray.length; i18++) {
                hashMap.put(stringArray[i18], stringArray2[i18]);
            }
        }
        this.f187571x = hashMap;
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187549b;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "getA8key-text: " + string3);
            if (string3 == null || string3.length() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "getA8key-text fail, invalid content");
                return false;
            }
            mMWebView.getSettings().E(false);
            mMWebView.loadData(string3, "text/html", com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
            return true;
        }
        if (i17 != 2) {
            if (i17 == 6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "getA8key-special_webview: fullUrl = " + string2);
                if (string2 == null || string2.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "getA8key-special_webview fail, invalid fullUrl");
                    return false;
                }
                if (com.tencent.mm.plugin.webview.model.r3.a(string2)) {
                    mMWebView.loadUrl(string2);
                    return true;
                }
                com.tencent.mars.xlog.Log.f("MicroMsg.MMWebViewClient", "processGetA8Key special, canLoadUrl fail, url = ".concat(string2));
                T(string2);
                return true;
            }
            if (i17 != 7) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "qrcode-getA8key-not_catch: action code = " + i17);
                return false;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "getA8key-webview/no-notice: title = " + string + ", fullUrl = " + string2);
        if (string2 == null || string2.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "getA8key-webview fail, invalid fullUrl");
            return false;
        }
        if (!com.tencent.mm.plugin.webview.model.r3.a(string2)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.MMWebViewClient", "processGetA8Key qrcode, canLoadUrl fail, url = ".concat(string2));
            T(string2);
            return true;
        }
        java.lang.String E = E();
        java.lang.String str = this.f187562o;
        if (E == null) {
            E = str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(E)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "after getA8Key, currentURL is null or nil");
            mMWebView.loadUrl(string2);
        } else if (this.f187554g == null) {
            if (hashMap.size() > 0) {
                mMWebView.loadUrl(string2, hashMap);
            } else {
                mMWebView.loadUrl(string2);
            }
        } else if (!string2.contains("#wechat_redirect")) {
            if (!U(E, string2)) {
                java.lang.String b17 = xw4.b.b(E);
                java.lang.String b18 = xw4.b.b(string2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b18) && !com.tencent.mm.sdk.platformtools.t8.K0(b17) && b18.equals(b17) && this.f187551d != null && K(E)) {
                    z17 = true;
                }
                if (!z17) {
                    if (hashMap.size() > 0) {
                        mMWebView.loadUrl(string2, hashMap);
                    } else {
                        mMWebView.loadUrl(string2);
                    }
                }
            }
            ((java.util.HashMap) this.f187566s).put(E, string2);
            ((java.util.concurrent.ConcurrentHashMap) this.f187567t).put(E, hashMap);
            this.f187554g.K(string2, hashMap);
        } else if (hashMap.size() > 0) {
            mMWebView.loadUrl(string2, hashMap);
        } else {
            mMWebView.loadUrl(string2);
        }
        return true;
    }

    public final void W(int i17) {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187549b;
        try {
            if (this.f187551d != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("scene_end_type", i17);
                bundle.putInt("scene_end_listener_hash_code", mMWebView.hashCode());
                this.f187551d.ng(6, bundle, mMWebView.hashCode());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "removeSceneEnd, ex = " + e17.getMessage());
        }
    }

    public void X(java.lang.String str, boolean z17) {
        Y(str, z17, 0);
    }

    public final void Y(java.lang.String str, boolean z17, int i17) {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187549b;
        if (mMWebView.f211376y) {
            return;
        }
        com.tencent.mm.plugin.webview.permission.w wVar = this.f187552e;
        if (wVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "startGetA8Key fail, after onDestroy");
            return;
        }
        if (this.f187556i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "edw startGetA8Key, nevergeta8key");
            wVar.g(str, null, null);
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f187560m.a(str, this.f187572y));
        com.tencent.mm.plugin.webview.stub.v0 v0Var = this.f187551d;
        java.util.Map map = this.f187558k;
        boolean z18 = false;
        boolean z19 = v0Var != null && valueOf.equals(((java.util.HashMap) map).get(str));
        if ((wVar.e(str) || z19) && !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "edw startGetA8Key no need, wvPerm already has value, url = " + str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "edw startGetA8Key, url = " + str + ", scene = " + i17 + ", username = , reason = " + valueOf + ", force = " + z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "edw startGetA8Key, begin, set a default permission");
        ((java.util.HashMap) map).put(str, valueOf);
        wVar.g(str, null, null);
        this.f187569v = true;
        com.tencent.mm.plugin.webview.ui.tools.widget.r3 r3Var = this.f187559l;
        if (r3Var.f187522a == 0) {
            com.tencent.mm.plugin.webview.ui.tools.widget.u3 u3Var = r3Var.f187523b;
            com.tencent.mm.ui.widget.MMWebView mMWebView2 = u3Var.f187549b;
            try {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("scene_end_type", com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR);
                bundle.putInt("scene_end_listener_hash_code", mMWebView2.hashCode());
                u3Var.f187551d.ng(5, bundle, mMWebView2.hashCode());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMWebViewClient", "addSceneEnd, ex = " + e17.getMessage());
            }
        }
        r3Var.f187522a++;
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("geta8key_data_req_url", str);
        bundle2.putString("geta8key_data_username", "");
        bundle2.putInt("geta8key_data_scene", i17);
        bundle2.putInt("geta8key_data_reason", valueOf.intValue());
        bundle2.putInt("geta8key_data_flag", 0);
        bundle2.putString("geta8key_data_net_type", com.tencent.mm.pluginsdk.ui.tools.e9.j());
        bundle2.putInt("geta8key_session_id", o45.cg.a());
        bundle2.putInt("webview_binder_id", mMWebView.hashCode());
        bundle2.putString("geta8key_outer_url", "");
        this.f187557j = str;
        this.f187572y = false;
        try {
            z18 = this.f187551d.F4(com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_API_RESPONSE_ERROR, bundle2);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWebViewClient", "startGetA8Key, ex = " + e18.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "startGetA8Key, doScene ret = " + z18);
    }

    public boolean Z(java.lang.String str) {
        if (this.f187551d != null) {
            return false;
        }
        this.f187562o = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "tryBindService");
        android.content.MutableContextWrapper mutableContextWrapper = this.f187548a;
        mutableContextWrapper.bindService(new android.content.Intent(mutableContextWrapper, (java.lang.Class<?>) com.tencent.mm.plugin.webview.stub.WebViewStubService.class), this.A, 1);
        return true;
    }

    public final void a0(java.lang.String str, java.lang.String str2, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper, com.tencent.mm.protocal.GeneralControlWrapper generalControlWrapper) {
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        java.util.Map map = this.f187558k;
        com.tencent.mm.plugin.webview.permission.w wVar = this.f187552e;
        if (!K0) {
            wVar.g(str2, jsapiPermissionWrapper, generalControlWrapper);
            ((java.util.HashMap) map).remove(str2);
            this.f187569v = false;
            this.f187570w = str2;
        }
        if (U(str, str2)) {
            wVar.g(str, jsapiPermissionWrapper, generalControlWrapper);
            ((java.util.HashMap) map).remove(str);
        } else {
            if (this.f187551d == null || com.tencent.mm.sdk.platformtools.t8.K0(str) || !K(str2)) {
                return;
            }
            wVar.g(str, jsapiPermissionWrapper, generalControlWrapper);
            ((java.util.HashMap) map).remove(str);
        }
    }

    @Override // com.tencent.xweb.h1
    public final void k(com.tencent.xweb.WebView webView, java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "doUpdateVisitedHistory, url = %s, isReload = %b", str, java.lang.Boolean.valueOf(z17));
        java.lang.String url = webView.getUrl();
        if (this.f187556i) {
            X(url, false);
        }
        com.tencent.mm.plugin.webview.permission.w wVar = this.f187552e;
        if (wVar == null || wVar.e(url)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "doUpdateVisitedHistory start geta8key, url = %s", url);
        X(url, false);
    }

    @Override // com.tencent.xweb.h1
    public void l(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "edw onLoadResource opt, url = " + str);
    }

    @Override // com.tencent.xweb.h1
    public final void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        android.app.Activity a17;
        if (this.f187551d != null) {
            boolean z17 = true;
            if (webView != null && ((a17 = q75.a.a(webView.getContext())) == null || !a17.isFinishing())) {
                z17 = false;
            }
            if (z17) {
                return;
            }
            if (!com.tencent.mm.plugin.webview.model.r3.a(str)) {
                com.tencent.mars.xlog.Log.f("MicroMsg.MMWebViewClient", "onPageFinished, canLoadUrl fail, url = " + str);
                T(str);
                return;
            }
            this.f187564q = "";
            if (str.equals("file:///android_asset/jsapi/wxjs.js")) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "onPageFinished, js is finished loaded");
                O(webView, str);
            } else {
                this.f187550c.postDelayed(this.f187573z, 1000L);
                O(webView, str);
            }
        }
    }

    @Override // com.tencent.xweb.h1
    public final void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        if (this.f187551d == null || this.f187568u) {
            this.f187568u = false;
            return;
        }
        if (!com.tencent.mm.plugin.webview.model.r3.a(str)) {
            com.tencent.mars.xlog.Log.f("MicroMsg.MMWebViewClient", "onPageStarted, canLoadUrl fail, url = " + str);
            T(str);
            return;
        }
        if (I(str)) {
            this.f187564q = str;
            return;
        }
        this.f187563p = str;
        nw4.n nVar = this.f187553f.f340991b;
        if (nVar != null) {
            nVar.A0(false);
        }
        if (K(str)) {
            this.f187549b.evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", null);
            nw4.n nVar2 = this.f187554g;
            if (nVar2 != null) {
                nVar2.K((java.lang.String) ((java.util.HashMap) this.f187566s).get(str), (java.util.Map) ((java.util.concurrent.ConcurrentHashMap) this.f187567t).get(str));
            }
        }
        X(str, false);
        P(webView, str, bitmap);
    }

    @Override // com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.xweb.h1
    public void r(com.tencent.xweb.WebView webView, com.tencent.xweb.u uVar, java.lang.String str, java.lang.String str2) {
        uVar.cancel();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(155L, 35L, 1L);
    }

    @Override // com.tencent.xweb.h1
    public void t(com.tencent.xweb.WebView webView, com.tencent.xweb.l0 l0Var, android.net.http.SslError sslError) {
        l0Var.cancel();
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 x(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var) {
        if (x0Var == null || x0Var.getUrl() == null || com.tencent.mm.sdk.platformtools.t8.K0(x0Var.getUrl().toString())) {
            return super.x(webView, x0Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", x0Var.getUrl(), x0Var.getMethod(), java.lang.Boolean.valueOf(x0Var.isForMainFrame()));
        return this.f187561n.a(null, x0Var, false, this.f187551d);
    }

    @Override // com.tencent.xweb.h1
    public com.tencent.xweb.y0 y(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, android.os.Bundle bundle) {
        if (x0Var == null || x0Var.getUrl() == null || com.tencent.mm.sdk.platformtools.t8.K0(x0Var.getUrl().toString())) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", x0Var.getUrl(), x0Var.getMethod(), java.lang.Boolean.valueOf(x0Var.isForMainFrame()));
        try {
            int i17 = bundle.getInt("resourceType");
            if (i17 == 1 || i17 == 7) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMWebViewClient", "get resoutce type is iframe : %d, start geta8key", java.lang.Integer.valueOf(i17));
                Y(x0Var.getUrl().toString(), false, 5);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWebViewClient", "get resource type failed Exception ; %s", e17.getMessage());
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMWebViewClient", "get resource type failed Throwable ; %s", th6.getMessage());
        }
        return this.f187561n.a(null, x0Var, true, this.f187551d);
    }
}
