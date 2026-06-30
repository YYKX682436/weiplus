package nw4;

/* loaded from: classes8.dex */
public class n implements rw4.a, nw4.i, nw4.g, zg0.v2 {
    public static final java.util.Set Q = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("getBrandWCPayRequest")));
    public final ox4.b A;
    public java.lang.String B;
    public java.lang.String C;
    public final kk.l D;
    public pw4.a E;
    public nw4.b3 F;
    public final java.util.HashMap G;
    public com.tencent.mm.protocal.JsapiPermissionWrapper H;
    public android.os.Bundle I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f340886J;
    public java.lang.String K;
    public java.lang.String L;
    public volatile java.lang.String M;
    public volatile int N;
    public long O;
    public com.tencent.mm.plugin.webview.webcompt.y1 P;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f340887a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f340888b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.Context f340889c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f340890d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f340891e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f340892f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f340893g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f340894h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f340895i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f340896j;

    /* renamed from: k, reason: collision with root package name */
    public long f340897k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f340898l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.v0 f340899m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.stub.z0 f340900n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.core.r0 f340901o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.permission.w f340902p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f340903q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f340904r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f340905s;

    /* renamed from: t, reason: collision with root package name */
    public int f340906t;

    /* renamed from: u, reason: collision with root package name */
    public nw4.o2 f340907u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Set f340908v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f340909w;

    /* renamed from: x, reason: collision with root package name */
    public final nw4.j f340910x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f340911y;

    /* renamed from: z, reason: collision with root package name */
    public final nw4.a3 f340912z;

    public n() {
        this.f340888b = null;
        this.f340890d = new java.util.LinkedList();
        this.f340891e = new java.util.LinkedList();
        this.f340892f = null;
        this.f340894h = false;
        this.f340895i = false;
        this.f340896j = true;
        this.f340897k = 0L;
        this.f340898l = false;
        this.f340903q = false;
        this.f340904r = "";
        this.f340905s = false;
        this.f340908v = null;
        this.f340909w = false;
        this.f340910x = null;
        this.f340911y = new java.util.ArrayList();
        this.f340912z = new nw4.a3();
        com.tencent.mm.plugin.webview.core.x3 x3Var = com.tencent.mm.plugin.webview.core.x3.f182012a;
        this.D = new kk.l(((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.webview.core.x3.f182014c).getValue()).intValue());
        this.E = null;
        this.F = null;
        this.G = new java.util.HashMap();
        this.f340886J = false;
        new java.util.LinkedList();
        this.M = null;
        this.N = 0;
        this.O = 0L;
        this.A = new ox4.b(this);
    }

    public static void h(nw4.n nVar) {
        java.util.LinkedList linkedList = (java.util.LinkedList) nVar.f340890d;
        if (linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "dealMsgQueue fail, resultValueList is empty");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dealMsgQueue, pre msgList = ");
        java.util.LinkedList linkedList2 = nVar.f340891e;
        sb6.append(linkedList2.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", sb6.toString());
        java.util.List b17 = nw4.z2.b((java.lang.String) linkedList.remove(0), nVar.f340903q, nVar.f340904r);
        if (!com.tencent.mm.sdk.platformtools.t8.L0(b17)) {
            linkedList2.addAll(b17);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "now msg list size : %d", java.lang.Integer.valueOf(linkedList2.size()));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "dealMsgQueue, post msgList = " + linkedList2.size());
        nVar.l();
        com.tencent.mm.sdk.platformtools.n3 n3Var = nVar.f340892f;
        if (n3Var != null) {
            n3Var.post(new nw4.f2(nVar));
        }
    }

    public static java.lang.String i(nw4.n nVar, java.lang.String str) {
        java.lang.String url = nVar.f340887a.getUrl();
        try {
            java.lang.String str2 = lp0.b.o() + kk.r.b(url + str);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "generate upload file name, url=%s, tag=%s, fullName=%s", url, str, str2);
            return str2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "generating temp file name failed, url is " + url);
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandler", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public static java.lang.String t(java.lang.String str) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        return java.lang.String.format("javascript:WeixinJSBridge._handleMessageFromWeixin(%s)", objArr);
    }

    public void A(java.lang.String str, java.lang.String str2) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onActivityStateChanged fail, not ready %s", str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onActivityStateChanged, state %s, extData %s", str, str2);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("state", str);
        hashMap.put("extData", str2);
        java.lang.String c17 = nw4.x2.c("activity:state_change", hashMap, this.f340903q, this.f340904r);
        if (java.lang.Thread.currentThread() != android.os.Looper.getMainLooper().getThread()) {
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.w(this, c17));
            return;
        }
        try {
            this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + c17 + ")", null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onActivityStateChanged, ex = %s", e17.getMessage());
        }
    }

    public void A0(boolean z17) {
        this.f340895i = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "js ready %b", java.lang.Boolean.valueOf(z17));
    }

    public void B(boolean z17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(ya.b.SUCCESS, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.q0(this, nw4.x2.c("onAddShortcutStatus", hashMap, this.f340903q, this.f340904r)));
    }

    public final boolean B0() {
        if (!this.f340896j) {
            com.tencent.mm.plugin.webview.core.x3 x3Var = com.tencent.mm.plugin.webview.core.x3.f182012a;
            return ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.webview.core.x3.f182015d).getValue()).booleanValue() && java.lang.System.currentTimeMillis() - this.f340897k > ((long) ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.webview.core.x3.f182013b).getValue()).intValue()) && !(this.f340887a instanceof com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView);
        }
        return false;
    }

    public void C(java.lang.String str, long j17, int i17, float f17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onDownloadStateChange fail, not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appid", str);
        hashMap.put("download_id", java.lang.Long.valueOf(j17));
        hashMap.put("progress", java.lang.Integer.valueOf(i17));
        hashMap.put("progress_float", java.lang.Float.valueOf(f17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.q(this, nw4.x2.c("wxdownload:progress_change", hashMap, this.f340903q, this.f340904r)));
    }

    public void C0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "updateRandomStr");
        if (this.f340903q && com.tencent.mm.pluginsdk.ui.tools.e9.n()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("__event_id", "sys:updateRandomStr");
                jSONObject2.put("randomStr", this.f340904r);
                jSONObject.put("__json_message", jSONObject2);
                this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + jSONObject.toString() + ")", new nw4.l1(this));
            } catch (org.json.JSONException unused) {
            }
        }
    }

    public void D(android.os.Bundle bundle, java.lang.String str) {
        if (!this.f340895i || bundle == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onDownloadStateChange fail, not ready");
            return;
        }
        long j17 = bundle.getLong("download_manager_downloadid");
        java.lang.String string = bundle.getString("download_manager_appid", "");
        int i17 = bundle.getInt("download_manager_errcode");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onDownloadStateChange, downloadId = " + j17 + ", state = " + str + ", errCode = " + i17);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("appid", string);
        hashMap.put("download_id", java.lang.Long.valueOf(j17));
        hashMap.put("err_code", java.lang.Integer.valueOf(i17));
        hashMap.put("state", str);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.p(this, nw4.x2.c("wxdownload:state_change", hashMap, this.f340903q, this.f340904r)));
    }

    public void E(java.lang.String str, java.lang.String str2) {
        if (this.f340895i) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("videoVid", str);
            hashMap.put("result", str2);
            hashMap.put("action", "onEmbedMpVideoShare");
            this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onMPPageAction", hashMap, this.f340903q, this.f340904r) + ")", null);
        }
    }

    public void F(boolean z17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onEmojiStoreShowLoading fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onEmojiStoreShowLoading success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("needShow", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.a2(this, nw4.x2.c("showLoading", hashMap, this.f340903q, this.f340904r)));
    }

    public void G(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3, java.lang.String str4) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onEmoticonIsChosen fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onEmoticonIsChosen success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("md5", str);
        hashMap.put("thumbPath", str2);
        hashMap.put("tab", java.lang.Integer.valueOf(i17));
        hashMap.put("asyncDownload", java.lang.Integer.valueOf(i18));
        hashMap.put("emojiUrl", str3);
        hashMap.put("aesKey", str4);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.q1(this, nw4.x2.c("emoticonIsChosen", hashMap, this.f340903q, this.f340904r)));
    }

    public void H() {
        if (this.f340895i) {
            this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onEnterFullscreen", new java.util.HashMap(), this.f340903q, this.f340904r) + ")", null);
        }
    }

    public void I() {
        if (this.f340895i) {
            this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onExitFullscreen", new java.util.HashMap(), this.f340903q, this.f340904r) + ")", null);
        }
    }

    public void J(java.util.HashMap hashMap, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onFavorite %b", java.lang.Boolean.valueOf(this.f340895i));
        if (!this.f340895i) {
            try {
                this.f340899m.q7(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite", this.f340906t);
                v0(x(hashMap), "sendAppMessage");
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e17.getMessage());
                return;
            }
        }
        android.os.Bundle w17 = w(1);
        if (w17 != null && w17.getBoolean("WebViewShare_reslut", false)) {
            try {
                this.f340899m.q7(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite", this.f340906t);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e18.getMessage());
            }
            v0(w17, "sendAppMessage");
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite");
        hashMap2.put("favScene", java.lang.Integer.valueOf(i17));
        this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:share:appmessage", hashMap2, this.f340903q, this.f340904r) + ")", null);
        try {
            this.f340899m.q7(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "favorite", this.f340906t);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e19.getMessage());
        }
    }

    public void K(java.lang.String str, java.util.Map map) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.M = str;
        if (map == null || map.size() == 0) {
            this.N = 0;
        } else {
            this.N = 1;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.r0(this, map, str, v(str, this.N)));
    }

    public void L(int i17, int i18) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340887a;
        hashMap.put("height", java.lang.Integer.valueOf(java.lang.Math.round(i17 / mMWebView.getMMDensity())));
        if (i18 != 0) {
            hashMap.put("inputHeight", java.lang.Integer.valueOf(java.lang.Math.round(i18 / mMWebView.getMMDensity())));
        }
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.n0(this, nw4.x2.c("onGetKeyboardHeight", hashMap, this.f340903q, this.f340904r)));
    }

    public void M(java.lang.String str) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("smiley", str);
        N(hashMap);
    }

    public void N(java.util.Map map) {
        if (this.f340895i) {
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.p0(this, nw4.x2.c(hc1.d.NAME, map, this.f340903q, this.f340904r)));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
        }
    }

    public void O(java.lang.String str, java.lang.String str2, java.util.Map map, boolean z17) {
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            e(str, str2, map);
        }
        if (!z17 || (n3Var = this.f340892f) == null) {
            return;
        }
        n3Var.post(new nw4.s0(this));
    }

    public void P(java.lang.String str, int i17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onImageDownloadProgress fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onImageDownloadProgress, serverId id : %s, percent : %d", str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverId", str);
        hashMap.put("percent", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.d0(this, nw4.x2.c("onImageDownloadProgress", hashMap, this.f340903q, this.f340904r)));
    }

    public void Q(java.lang.String str, int i17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onImageUploadProgress fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onImageUploadProgress, local id : %s, percent : %d", str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_LOCALID, str);
        hashMap.put("percent", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.c0(this, nw4.x2.c("onImageUploadProgress", hashMap, this.f340903q, this.f340904r)));
    }

    public void R(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "%s fail, not ready", str4);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "%s success, ready", str4);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("retCode", java.lang.Integer.valueOf(i17));
        hashMap.put("errMsg", str);
        hashMap.put("json", str2);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            hashMap.put("requestId", str3);
        }
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.u1(this, nw4.x2.c(str4, hashMap, this.f340903q, this.f340904r), str4));
    }

    public void S(java.lang.String str, int i17, java.lang.String str2, int i18, int i19) {
        if (this.f340895i) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", str);
            hashMap.put("personal_comment_id", java.lang.Integer.valueOf(i17));
            if ("praiseComment".equals(str)) {
                hashMap.put("reply_id", java.lang.Integer.valueOf(i18));
                hashMap.put("is_like", java.lang.Integer.valueOf(i19));
            } else {
                hashMap.put("replyId", java.lang.Integer.valueOf(i18));
                hashMap.put(com.google.android.gms.common.Scopes.OPEN_ID, str2);
            }
            this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onMPPageAction", hashMap, this.f340903q, this.f340904r) + ")", null);
        }
    }

    public void T(java.lang.String str, int i17) {
        if (this.f340895i) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("action", str);
            hashMap.put("shareFuncFlag", java.lang.Integer.valueOf(i17));
            this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onMPPageAction", hashMap, this.f340903q, this.f340904r) + ")", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = r5.f340895i
            java.lang.String r1 = "MicroMsg.JsApiHandler"
            if (r0 != 0) goto Lc
            java.lang.String r6 = "not ready"
            com.tencent.mars.xlog.Log.e(r1, r6)
            return
        Lc:
            com.tencent.mm.ui.widget.MMWebView r0 = r5.f340887a
            if (r0 != 0) goto L13
            java.lang.String r2 = ""
            goto L17
        L13:
            java.lang.String r2 = r0.getUrl()
        L17:
            com.tencent.mm.sdk.platformtools.i6 r3 = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r3 == 0) goto L20
            goto L51
        L20:
            java.net.URL r3 = new java.net.URL     // Catch: java.lang.Exception -> L39
            r3.<init>(r2)     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = r3.getHost()     // Catch: java.lang.Exception -> L39
            r3 = 2131769611(0x7f10390b, float:1.9170502E38)
            java.lang.String r3 = com.tencent.mm.sdk.platformtools.t9.a(r3)     // Catch: java.lang.Exception -> L39
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Exception -> L39
            if (r2 != 0) goto L37
            goto L51
        L37:
            r2 = 1
            goto L52
        L39:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "create url fail : "
            r3.<init>(r4)
            java.lang.String r2 = r2.getLocalizedMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.WebViewUtil"
            com.tencent.mars.xlog.Log.e(r3, r2)
        L51:
            r2 = 0
        L52:
            if (r2 != 0) goto L55
            return
        L55:
            java.lang.String r2 = "onMenuClick"
            com.tencent.mars.xlog.Log.i(r1, r2)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r3 = "action"
            r1.put(r3, r6)
            boolean r6 = r5.f340903q
            java.lang.String r3 = r5.f340904r
            java.lang.String r6 = nw4.x2.c(r2, r1, r6, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "javascript:WeixinJSBridge._handleMessageFromWeixin("
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = ")"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            r0.evaluateJavascript(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nw4.n.U(java.lang.String):void");
    }

    public void V(java.lang.String str, int i17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onMusicStatusChanged fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onMusicStatusChanged success, ready snsid=%s, status=%d", str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("snsid", str);
        hashMap.put("status", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.w1(this, nw4.x2.c("onMusicStatusChanged", hashMap, this.f340903q, this.f340904r)));
    }

    public void W() {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onNavigationBarRightButtonClick fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onNavigationBarRightButtonClick success, ready");
        this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onNavigationBarRightButtonClick", new java.util.HashMap(), this.f340903q, this.f340904r) + ")", null);
    }

    public void X(java.lang.String str) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.tmassistantsdk.downloadservice.DownloadInfo.NETTYPE, str);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            hashMap.put("networkType", com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
        }
        if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onNetWorkChange 2g");
            hashMap.put("networkType", "2g");
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onNetWorkChange 3g");
            hashMap.put("networkType", "3g");
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onNetWorkChange 4g");
            hashMap.put("networkType", "4g");
        }
        if (com.tencent.mars.comm.NetStatusUtil.is5G(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onNetWorkChange 5g");
            hashMap.put("networkType", "5g");
        }
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onNetWorkChange wifi");
            hashMap.put("networkType", "wifi");
        }
        com.tencent.mm.plugin.webview.stub.v0 v0Var = this.f340899m;
        if (v0Var != null) {
            try {
                int i17 = 0;
                int i18 = v0Var.i(110, new android.os.Bundle()).getInt("sim_card_type", 0);
                if (i18 != 0) {
                    i17 = 1;
                    if (i18 != 1) {
                        i17 = 2;
                    }
                }
                hashMap.put("simType", java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "invokeAsResult ex %s", e17.getMessage());
            }
        }
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.c2(this, nw4.x2.c("onNetWorkChange", hashMap, this.f340903q, this.f340904r)));
    }

    public void Y(int i17, int i18) {
        if (this.f340895i) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("newOrientation", java.lang.Integer.valueOf(i17));
            hashMap.put("sysLock", java.lang.Integer.valueOf(i18));
            this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onOrientationsChange", hashMap, this.f340903q, this.f340904r) + ")", null);
        }
    }

    public void Z(boolean z17) {
        w0(z17);
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onPageStateChange fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onPageStateChange success, ready, active = %b", java.lang.Boolean.valueOf(z17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("active", java.lang.String.valueOf(z17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.y1(this, t(nw4.x2.c(pf1.r.NAME, hashMap, this.f340903q, this.f340904r))));
    }

    @Override // nw4.f
    @android.webkit.JavascriptInterface
    public void _getAllHosts(java.lang.String str) {
        if (str == null) {
            return;
        }
        this.f340892f.post(new nw4.k2(this, str));
    }

    @android.webkit.JavascriptInterface
    public java.lang.String _getDgtVerifyRandomStr() {
        return (!com.tencent.mm.pluginsdk.ui.tools.e9.n() || this.f340905s) ? this.f340904r : "";
    }

    @Override // nw4.f
    @android.webkit.JavascriptInterface
    public void _getHtmlContent(java.lang.String str) {
        if (str == null) {
            return;
        }
        this.f340892f.post(new nw4.l2(this, str));
    }

    @android.webkit.JavascriptInterface
    public boolean _isDgtVerifyEnabled() {
        return this.f340903q;
    }

    @Override // nw4.f
    @android.webkit.JavascriptInterface
    public void _ready(boolean z17) {
        this.f340895i = z17;
    }

    @Override // nw4.f
    @android.webkit.JavascriptInterface
    public void _sendMessage(java.lang.String str) {
        boolean z17;
        synchronized (this) {
            z17 = false;
            if (B0() && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                boolean booleanValue = ((java.lang.Boolean) ((jz5.n) com.tencent.mm.plugin.webview.core.x3.f182016e).getValue()).booleanValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "pendingJsApi: isPendingJSAPIExemptEnable = " + booleanValue);
                if (!booleanValue || !z(str)) {
                    this.D.put(java.lang.Integer.valueOf(str.hashCode()), str);
                    z17 = true;
                }
            }
        }
        if (z17) {
            return;
        }
        if (this.f340892f == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "msgQueueHandler err");
            return;
        }
        android.os.Message obtain = android.os.Message.obtain();
        obtain.what = 1;
        obtain.obj = str;
        this.f340892f.sendMessage(obtain);
    }

    public void a0(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        if (this.f340895i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onScreenShot hasPermission: %b", java.lang.Boolean.valueOf(z17));
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340887a;
            if (z17) {
                mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("onScreenShot", new java.util.HashMap(), this.f340903q, this.f340904r) + ")", null);
            }
            java.lang.String str2 = "";
            java.lang.String r17 = r(mMWebView == null ? "" : mMWebView.getUrl());
            if (bundle == null) {
                return;
            }
            if (mMWebView != null) {
                try {
                    str2 = mMWebView.getUrl();
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandler", e17, "reportAdOnScreenShot exception", new java.lang.Object[0]);
                    return;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            java.lang.String string = bundle.getString("ad_report_ux_info");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                return;
            }
            int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
            android.net.Uri parse = android.net.Uri.parse(str2);
            java.lang.String queryParameter = parse.getQueryParameter("mid");
            java.lang.String queryParameter2 = parse.getQueryParameter("idx");
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "reportAdOnScreenShot appId: %s, mid: %s, idx: %s, adUxInfo: %s, url: %s", r17, queryParameter, queryParameter2, string, str2);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19213, java.lang.Integer.valueOf(currentTimeMillis), 6, string, r17, queryParameter, queryParameter2, str2);
        }
    }

    @Override // rw4.a
    public boolean b(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        return nf.z.d(str, "weixin://dispatch_message/");
    }

    public void b0(java.lang.String str, boolean z17, java.lang.String str2) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchDataReady fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSearchDataReady success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("json", str);
        hashMap.put("newQuery", java.lang.Boolean.valueOf(z17));
        hashMap.put("requestId", str2);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.z0(this, nw4.x2.c("onSearchDataReady", hashMap, this.f340903q, this.f340904r)));
    }

    @Override // nw4.i
    public void c(nw4.y2 y2Var, nw4.e eVar) {
        m(y2Var, this.H, this.I, eVar);
    }

    public void c0(int i17, java.lang.String str) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchImageListReady fail, not ready");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", java.lang.Integer.valueOf(i17));
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.p1(this, nw4.x2.c("onSearchImageListReady", hashMap, this.f340903q, this.f340904r)));
    }

    @Override // nw4.g
    public int d() {
        return this.f340906t;
    }

    public void d0(java.lang.String str, java.lang.String str2, org.json.JSONArray jSONArray, int i17, java.util.Map map) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchInputConfirm fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSearchInputConfirm success, ready %s %s %s", str, str2, jSONArray.toString());
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (map != null) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    try {
                        jSONObject.put((java.lang.String) entry.getKey(), new org.json.JSONObject(entry.getValue().toString()));
                    } catch (org.json.JSONException e17) {
                        try {
                            try {
                                jSONObject.put((java.lang.String) entry.getKey(), new org.json.JSONArray(entry.getValue().toString()));
                            } catch (org.json.JSONException unused) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandler", e17, "", new java.lang.Object[0]);
                            }
                        } catch (org.json.JSONException unused2) {
                            jSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                        }
                    }
                }
            }
        }
        try {
            jSONObject.put("query", str);
            jSONObject.put("custom", str2);
            jSONObject.put("tagList", jSONArray);
            jSONObject.put("isBackButtonClick", i17);
            jSONObject.put("sugId", "");
            jSONObject.put("sugClickType", 0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                jSONObject.put("fromRecommendSearchQuery", 1);
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandler", e18, "", new java.lang.Object[0]);
        }
        e0(jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a0 A[ADDED_TO_REGION, SYNTHETIC] */
    @Override // nw4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.String r10, java.lang.String r11, java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nw4.n.e(java.lang.String, java.lang.String, java.util.Map):void");
    }

    public void e0(org.json.JSONObject jSONObject) {
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.n1(this, nw4.x2.d("onSearchInputConfirm", jSONObject, this.f340903q, this.f340904r)));
    }

    @Override // rw4.a
    public boolean f(java.lang.String str) {
        this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._fetchQueue()", new nw4.j0(this, str));
        return true;
    }

    public void f0(java.lang.String str) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSearchSuggestionDataReady success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("json", str);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.o1(this, nw4.x2.c("onSearchSuggestionDataReady", hashMap, this.f340903q, this.f340904r)));
    }

    @Override // nw4.g
    public nw4.j g() {
        return this.f340910x;
    }

    public void g0(java.lang.String str, java.lang.String str2) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSearchWAWidgetReloadDataFinish success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("widgetId", str);
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str2);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.k1(this, nw4.x2.c("onSearchWAWidgetReloadDataFinish", hashMap, this.f340903q, this.f340904r)));
    }

    public void h0(java.util.Map map) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSelectContact fail, not ready");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSelectContact success, ready");
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.v0(this, nw4.x2.c("onSelectContact", map, this.f340903q, this.f340904r)));
        }
    }

    public final void i0(java.lang.String str, java.util.Map map, org.json.JSONObject jSONObject) {
        if (!this.f340895i || str == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onSendEventToJSBridge fail, event=%s", objArr);
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = str;
        objArr2[1] = map == null ? "" : map.toString();
        objArr2[2] = jSONObject != null ? jSONObject.toString() : "";
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSendEventToJSBridge success, event=%s, params=%s, jsonParams=%s", objArr2);
        nw4.m1 m1Var = new nw4.m1(this, map != null ? nw4.x2.c(str, map, this.f340903q, this.f340904r) : nw4.x2.d(str, jSONObject, this.f340903q, this.f340904r), str);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            m1Var.run();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(m1Var);
        }
    }

    public void j(java.lang.String str, boolean z17) {
        try {
            this.f340899m.c9(str, z17, this.f340906t);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "addInvokedJsApiFromMenu, ex = " + e17);
        }
    }

    public void j0(java.util.HashMap hashMap, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onSendToFriend %b", java.lang.Boolean.valueOf(this.f340895i));
        try {
            if (i17 == 2 || i17 == 4) {
                this.f340899m.q7(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "recentFriend", this.f340906t);
                this.f340899m.q7("sourUserName", (java.lang.String) hashMap.get("sourUserName"), this.f340906t);
            } else {
                this.f340899m.q7(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "friend", this.f340906t);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "jsapiBundlePutString, ex = " + e17.getMessage());
        }
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onSendToFriend not ready");
            v0(x(hashMap), "sendAppMessage");
            return;
        }
        if (i17 == 3 || i17 == 4) {
            v0(x(hashMap), "sendAppMessage");
            return;
        }
        android.os.Bundle w17 = w(1);
        if (w17 != null && w17.getBoolean("WebViewShare_reslut", false)) {
            v0(w17, "sendAppMessage");
            return;
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "friend");
        hashMap2.put("shareScene", java.lang.Integer.valueOf(i17));
        this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:share:appmessage", hashMap2, this.f340903q, this.f340904r) + ")", null);
    }

    public void k() {
        if (this.f340895i) {
            com.tencent.mm.plugin.webview.webcompt.y1 y1Var = this.P;
            if (y1Var != null) {
                y1Var.a();
            }
            try {
                this.f340899m.cc(this.f340906t);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "clearSession ex %s", e17.getMessage());
            }
        }
    }

    public void k0() {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
        } else {
            final java.lang.String c17 = nw4.x2.c("onShareButtonClick", new java.util.HashMap(), this.f340903q, this.f340904r);
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: nw4.n$$c
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.String str = c17;
                    nw4.n nVar = nw4.n.this;
                    nVar.getClass();
                    try {
                        nVar.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + str + ")", null);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onFinderViewEvent fail, ex = %s", e17.getMessage());
                    }
                }
            });
        }
    }

    public final void l() {
        boolean z17;
        boolean z18;
        do {
            java.util.LinkedList linkedList = this.f340891e;
            z17 = false;
            if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "dealNextMsg stop, msgList is empty");
            } else {
                try {
                    z18 = this.f340899m.ja(this.f340906t);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "isBusy, ex = " + e17.getMessage());
                    z18 = false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "dealNextMsg isBusy = " + z18);
                if (z18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "dealNextMsg fail, msgHandler is busy now");
                } else if (linkedList.size() == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "msgList size is 0.");
                } else {
                    nw4.y2 y2Var = (nw4.y2) linkedList.remove(0);
                    z17 = true;
                    if (y2Var == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "dealNextMsg fail, msg is null");
                    } else {
                        java.lang.String function = y2Var.f341019i;
                        java.lang.String callbackId = y2Var.f341013c;
                        java.util.ArrayList arrayList = (java.util.ArrayList) this.f340911y;
                        if (!arrayList.isEmpty()) {
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ow4.a aVar = (ow4.a) it.next();
                                if (aVar != null) {
                                    kotlin.jvm.internal.o.g(function, "function");
                                    kotlin.jvm.internal.o.g(callbackId, "callbackId");
                                    ((m05.q) aVar).f322588c.put(callbackId, function);
                                }
                            }
                        }
                        boolean m17 = m(y2Var, y2Var.f341016f, y2Var.f341015e, y2Var.f341017g);
                        java.lang.String function2 = y2Var.f341019i;
                        java.lang.String callbackId2 = y2Var.f341013c;
                        java.util.Map map = y2Var.f341018h;
                        if (!arrayList.isEmpty()) {
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                ow4.a aVar2 = (ow4.a) it6.next();
                                if (aVar2 != null) {
                                    kotlin.jvm.internal.o.g(function2, "function");
                                    kotlin.jvm.internal.o.g(callbackId2, "callbackId");
                                    if (((m05.q) aVar2).f322586a.contains(function2)) {
                                        java.lang.Object obj = map != null ? ((java.util.HashMap) map).get("jsapiHandleResult") : null;
                                        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                                        int intValue = ((java.lang.Integer) obj).intValue();
                                        if (intValue != 1) {
                                            m05.i.f322570a.c("H5Jsapi-".concat(function2), "2", intValue != 2 ? intValue != 3 ? intValue != 4 ? intValue != 5 ? intValue != 6 ? "maybe not invoked" : "happen exception" : "limited jsapi" : "null pointer" : "is floating" : "check not available");
                                        }
                                    }
                                }
                            }
                        }
                        z17 = m17;
                    }
                }
            }
        } while (z17);
    }

    public void l0(int i17, java.util.HashMap hashMap, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onShareTimeline %b", java.lang.Boolean.valueOf(this.f340895i));
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "onShareTimeline not ready");
            v0(x(hashMap), com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME);
            return;
        }
        if (i18 == 2) {
            v0(x(hashMap), com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME);
            return;
        }
        android.os.Bundle w17 = w(2);
        if (w17 != null && w17.getBoolean("WebViewShare_reslut", false)) {
            v0(w17, com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME);
            return;
        }
        try {
            this.f340899m.q7("urlAttribute", i17 + "", this.f340906t);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandler", e17, "", new java.lang.Object[0]);
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("shareScene", java.lang.Integer.valueOf(i18));
        this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:share:timeline", hashMap2, this.f340903q, this.f340904r) + ")", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04d0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(nw4.y2 r28, com.tencent.mm.protocal.JsapiPermissionWrapper r29, android.os.Bundle r30, nw4.e r31) {
        /*
            Method dump skipped, instructions count: 1300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nw4.n.m(nw4.y2, com.tencent.mm.protocal.JsapiPermissionWrapper, android.os.Bundle, nw4.e):boolean");
    }

    public void m0(int i17, java.lang.String str, int i18) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onTeachSearchDataReady fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onTeachSearchDataReady success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("requestType", java.lang.Integer.valueOf(i17));
        hashMap.put("json", str);
        hashMap.put("isCacheData", java.lang.Integer.valueOf(i18));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.r1(this, nw4.x2.c("onTeachSearchDataReady", hashMap, this.f340903q, this.f340904r)));
    }

    public void n() {
        k();
        this.f340894h = true;
        this.f340895i = false;
        this.f340891e.clear();
        ((java.util.LinkedList) this.f340890d).clear();
        this.f340892f = null;
        ox4.b bVar = this.A;
        bVar.getClass();
        ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
        px4.a aVar = px4.a.f358955a;
        ox4.a listener = bVar.f349791b;
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.ArrayList arrayList = px4.a.f358956b;
        synchronized (arrayList) {
            arrayList.size();
            arrayList.remove(listener);
        }
    }

    public void n0(int i17, long j17, java.lang.String str) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onUxOplogDataReady fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onUxOplogDataReady success, ready");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ret", java.lang.Integer.valueOf(i17));
        hashMap.put("reqId", java.lang.Long.valueOf(j17));
        hashMap.put("json", str);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.t1(this, nw4.x2.c("onUxOplogDataReady", hashMap, this.f340903q, this.f340904r)));
    }

    public void o(java.lang.String str, java.util.Map map) {
        if (this.f340895i) {
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.g2(this, nw4.x2.c(str, map, this.f340903q, this.f340904r)));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready, event=%s", str);
        }
    }

    public void o0(java.lang.String str, int i17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVideoUploadoadProgress fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onVideoUploadoadProgress, local id : %s, percent : %d", str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_LOCALID, str);
        hashMap.put("percent", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.g0(this, nw4.x2.c("onVideoUploadProgress", hashMap, this.f340903q, this.f340904r)));
    }

    public void p(java.lang.String str, org.json.JSONObject jSONObject) {
        if (this.f340895i) {
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.h2(this, nw4.x2.d(str, jSONObject, this.f340903q, this.f340904r)));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "not ready");
        }
    }

    public void p0(java.lang.String str, int i17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVoiceDownloadProgress fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onVoiceDownloadProgress, serverId id : %s, percent : %d", str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("serverId", str);
        hashMap.put("percent", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.f0(this, nw4.x2.c("onVoiceDownloadProgress", hashMap, this.f340903q, this.f340904r)));
    }

    public void q() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340887a;
        if (mMWebView == null || !this.f340895i) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("javascript:WeixinJSBridge._handleMessageFromWeixin(");
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.protocal.JsapiPermissionWrapper c17 = this.f340902p.c();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (c17 != null) {
            if (c17.f(88)) {
                linkedList.add("menu:share:timeline");
            }
            if (c17.f(89)) {
                linkedList.add("menu:share:appmessage");
            }
            if (c17.f(94)) {
                linkedList.add("menu:share:qq");
            }
            if (c17.f(109)) {
                linkedList.add("menu:share:weiboApp");
            }
            if (c17.f(134)) {
                linkedList.add("menu:share:QZone");
            }
            if (c17.f(219)) {
                linkedList.add("sys:record");
            }
            if (c17.f(430)) {
                linkedList.add("onTingAudioStateChanged");
            }
            linkedList.add("onVisibleHeightChange");
            linkedList.add("onVoiceRecordEnd");
            linkedList.add("onVoicePlayBegin");
            linkedList.add("onVoicePlayEnd");
            linkedList.add("onLocalImageUploadProgress");
            linkedList.add("onImageDownloadProgress");
            linkedList.add("onVoiceUploadProgress");
            linkedList.add("onVoiceDownloadProgress");
            linkedList.add("onVideoUploadProgress");
            linkedList.add("onPlayerProcessStateChanged");
            linkedList.add("onMediaFileUploadProgress");
            linkedList.add("menu:setfont");
            linkedList.add("menu:haokan");
            linkedList.add("topbar:click");
            linkedList.add("reportOnLeaveForMP");
            linkedList.add("onMPPageAction");
            linkedList.add("onMPVideoStateChange");
            linkedList.add("onReceiveMPPageData");
            linkedList.add("onMPAdWebviewStateChange");
            linkedList.add("onScreenShot");
            linkedList.add("menu:share:email");
            linkedList.add("wxdownload:state_change");
            linkedList.add("wxdownload:progress_change");
            linkedList.add("hdOnDeviceStateChanged");
            linkedList.add("activity:state_change");
            linkedList.add("onWindowFocusChanged");
            linkedList.add("onVideoPlay");
            linkedList.add("onVideoPause");
            linkedList.add("onVideoEnded");
            linkedList.add("onVideoWaiting");
            linkedList.add("onVideoBufferUpdate");
            linkedList.add("onVideoTimeUpdate");
            linkedList.add("onVideoError");
            linkedList.add("onVideoLoadedMetaData");
            linkedList.add("onEnterFullscreen");
            linkedList.add("onExitFullscreen");
            linkedList.add("onOrientationsChange");
            linkedList.add("onXWebLivePlayerEvent");
            linkedList.add("onXWebLivePlayerNetStatus");
            linkedList.add("onWXDeviceBluetoothStateChange");
            linkedList.add("onWXDeviceLanStateChange");
            linkedList.add("onWXDeviceBindStateChange");
            linkedList.add("onReceiveDataFromWXDevice");
            linkedList.add("onScanWXDeviceResult");
            linkedList.add("onWXDeviceStateChange");
            linkedList.add("onNfcTouch");
            linkedList.add("menu:custom");
            linkedList.add("onMenuClick");
            linkedList.add("onNavShadowClick");
            linkedList.add("onSearchWAWidgetOpenApp");
            linkedList.add("onSearchDataReady");
            linkedList.add("onCurrentLocationReady");
            linkedList.add("onClientNavAction");
            linkedList.add("onNavBarShadowManuallyHidden");
            linkedList.add("onChatSearchDataReady");
            linkedList.add("onGetPoiInfoReturn");
            linkedList.add("onSearchHistoryReady");
            linkedList.add("onSearchWAWidgetOnTapCallback");
            linkedList.add("onSearchImageListReady");
            linkedList.add("onTeachSearchDataReady");
            linkedList.add("onSearchGuideDataReady");
            linkedList.add("onUxOplogDataReady");
            linkedList.add("onSearchInputChange");
            linkedList.add("onSearchInputConfirm");
            linkedList.add("onSearchSuggestionDataReady");
            linkedList.add("onMusicStatusChanged");
            linkedList.add("switchToTabSearch");
            linkedList.add("onVideoPlayerCallback");
            linkedList.add("onStreamVoiceInputStatus");
            linkedList.add("onSelectContact");
            linkedList.add("onSearchWAWidgetAttrChanged");
            linkedList.add("onSearchWAWidgetReloadData");
            linkedList.add("onSearchWAWidgetReloadDataFinish");
            linkedList.add("onSearchWAWidgetStateChange");
            linkedList.add("onSearchWAWidgetDataPush");
            linkedList.add("emoticonIsChosen");
            linkedList.add("onSimilarEmoticonReady");
            linkedList.add("onSearchWebQueryReady");
            linkedList.add("onDeviceMotionFired");
            linkedList.add("onGetVertSearchEntriesData");
            linkedList.add("onMPCustomMenuItemClick");
            linkedList.add(com.tencent.mm.plugin.appbrand.jsapi.pay.q0.NAME);
            linkedList.add("onPullDownRefresh");
            linkedList.add(pf1.r.NAME);
            linkedList.add("onGetKeyboardHeight");
            linkedList.add(hc1.d.NAME);
            linkedList.add("onAddShortcutStatus");
            linkedList.add("onFocusSearchInput");
            linkedList.add("onGetA8KeyUrl");
            linkedList.add("deleteAccountSuccess");
            linkedList.add("onGetMsgProofItems");
            linkedList.add("WNJSHandlerInsert");
            linkedList.add("WNJSHandlerMultiInsert");
            linkedList.add("WNJSHandlerExportData");
            linkedList.add("WNJSHandlerHeaderAndFooterChange");
            linkedList.add("WNJSHandlerEditableChange");
            linkedList.add("WNJSHandlerEditingChange");
            linkedList.add("WNJSHandlerSaveSelectionRange");
            linkedList.add("WNJSHandlerLoadSelectionRange");
            linkedList.add("onCustomGameMenuClicked");
            linkedList.add("showLoading");
            linkedList.add("getSearchEmotionDataCallBack");
            linkedList.add("onNavigationBarRightButtonClick");
            linkedList.add("onSearchActionSheetClick");
            linkedList.add("onGetMatchContactList");
            linkedList.add("onUiInit");
            linkedList.add("onNetWorkChange");
            linkedList.add("onMiniProgramData");
            linkedList.add("fakeImmersiveUIStyleTopInsetChanged");
            linkedList.add("onActionBarClickEventInImmersiveMode");
            linkedList.add("onBackgroundAudioStateChange");
            linkedList.add("onArticleReadingBtnClicked");
            if (!com.tencent.mm.sdk.platformtools.t8.L0(null)) {
                linkedList.addAll(null);
            }
            linkedList.add("onReceivePageData");
            linkedList.add("onPageAuthOK");
            linkedList.add("onScrollViewDidScroll");
            linkedList.add("onPublishHaowanEnd");
            linkedList.add("onPublishHaowanProgress");
            linkedList.add("onAccessibilityStateChange");
            linkedList.add("onClickBottomToast");
            linkedList.add("onCallWebTranslateApi");
            linkedList.add("onUserGoBack");
            linkedList.add("onShareCustomMenuItemClick");
            linkedList.add("onMultiPickerViewChange");
            linkedList.add("onFinderViewEvent");
            linkedList.add("onShareResult");
            linkedList.add("onShareButtonClick");
            linkedList.add("onFinderFeedInfoUpdated");
            linkedList.add("onExitFinderFullscreen");
            linkedList.add("onEnterFinderFullscreen");
            linkedList.add("onUserToggleFullScreen");
            linkedList.add("onHalfScreenHeightWillChange");
            linkedList.add("onHalfScreenHeightIsChanging");
            linkedList.add("onHalfScreenHeightDidChange");
            linkedList.add("onCircleToSearchEvent");
            linkedList.add("onScreenShotJump");
            linkedList.add("startCapture");
            linkedList.add("endCapture");
            linkedList.add("endCaptureEdit");
            linkedList.add("onShareEmbedExcerptEvent");
            linkedList.add("onImagePreviewChanged");
            linkedList.add("onPageStarStateChanged");
            linkedList.add("menu:publish");
            linkedList.add("onBizCustomSharePanelEvent");
            linkedList.add("onClickMenuSetFontScale");
            linkedList.add("wxpay:keyboard_event");
            linkedList.add("onTingEntryClick");
            linkedList.add("onPublishImageEntryClick");
            linkedList.add("onGetImageInfo");
            linkedList.add("onReceiveWXKBEvent");
            linkedList.add("onLiteAppMessage");
        }
        hashMap.put("__runOn3rd_apis", new org.json.JSONArray((java.util.Collection) linkedList));
        sb6.append(nw4.x2.c("sys:attach_runOn3rd_apis", hashMap, this.f340903q, this.f340904r));
        sb6.append(")");
        mMWebView.evaluateJavascript(sb6.toString(), new nw4.v1(this));
    }

    public void q0(java.util.Map map) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVoicePlayEnd fail, not ready");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onVoicePlayEnd");
            com.tencent.mm.sdk.platformtools.u3.h(new nw4.z(this, nw4.x2.c("onVoicePlayEnd", map, this.f340903q, this.f340904r)));
        }
    }

    public java.lang.String r(java.lang.String str) {
        java.lang.Object s17 = s();
        return s17 instanceof com.tencent.mm.plugin.webview.core.w0 ? ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) ((com.tencent.mm.plugin.webview.core.w0) s17)).u7(str) : "";
    }

    public void r0(java.util.Map map) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVoiceRecordEnd fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onVoiceRecordEnd");
        java.lang.String c17 = nw4.x2.c("onVoiceRecordEnd", map, this.f340903q, this.f340904r);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onVoiceRecordEnd event : %s", c17);
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.a0(this, c17));
    }

    public android.content.Context s() {
        if (this.f340886J) {
            android.content.Context context = this.f340889c;
            return context != null ? context : com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340887a;
        if (mMWebView == null) {
            return null;
        }
        return mMWebView.getActivityContextIfHas();
    }

    public void s0(java.lang.String str, int i17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onVoiceUploadProgress fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onVoiceUploadProgress, local id : %s, percent : %d", str, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(dm.i4.COL_LOCALID, str);
        hashMap.put("percent", java.lang.Integer.valueOf(i17));
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.e0(this, nw4.x2.c("onVoiceUploadProgress", hashMap, this.f340903q, this.f340904r)));
    }

    public void t0(java.lang.String str, int i17) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onExdeviceStateChange fail, not ready");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "onExdeviceStateChange: device id = %s, state = %s", str, java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "parameter error!!!");
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("deviceId", str);
        if (i17 == 2) {
            hashMap.put("state", "connected");
        } else if (i17 == 1) {
            hashMap.put("state", "connecting");
        } else {
            hashMap.put("state", "disconnected");
        }
        com.tencent.mm.sdk.platformtools.u3.h(new nw4.r(this, nw4.x2.c("onWXDeviceStateChange", hashMap, this.f340903q, this.f340904r)));
    }

    public void u(boolean z17) {
        com.tencent.mm.plugin.webview.stub.v0 v0Var;
        java.util.List list;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "getHtmlContent, ready(%s).", java.lang.Boolean.valueOf(this.f340895i));
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340887a;
        if (mMWebView == null || (v0Var = this.f340899m) == null || !this.f340895i) {
            return;
        }
        if (z17) {
            mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("sys:get_html_content", new java.util.HashMap(), this.f340903q, this.f340904r) + ")", null);
            return;
        }
        try {
            list = v0Var.bc();
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.JsApiHandler", e17, "", new java.lang.Object[0]);
            list = null;
        }
        android.net.Uri parse = android.net.Uri.parse(mMWebView.getUrl());
        if (parse != null) {
            parse.getHost();
        }
        if (list == null || parse == null || !list.contains(parse.getHost())) {
            return;
        }
        mMWebView.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("sys:get_html_content", new java.util.HashMap(), this.f340903q, this.f340904r) + ")", null);
    }

    public void u0(boolean z17, boolean z18) {
        if (!this.f340895i) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "onWindowFocusChanged fail, not ready %b", java.lang.Boolean.valueOf(z17));
            return;
        }
        if (this.f340887a == null) {
            return;
        }
        zq1.a0 a0Var = (zq1.a0) gm0.j1.s(zq1.a0.class);
        if (!z18 && a0Var != null) {
            if (!((yq1.z) a0Var).p(this.f340887a.getUrl())) {
                return;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("hasFocus", java.lang.Integer.valueOf(z17 ? 1 : 0));
        java.lang.String c17 = nw4.x2.c("onWindowFocusChanged", hashMap, this.f340903q, this.f340904r);
        ((ku5.t0) ku5.t0.f312615d).B(new nw4.x(this, c17));
    }

    public final java.lang.String v(java.lang.String str, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap(2);
        hashMap.put("url", str);
        hashMap.put("set_cookie", java.lang.Integer.valueOf(i17));
        return t(nw4.x2.c("onGetA8KeyUrl", hashMap, this.f340903q, this.f340904r));
    }

    public final void v0(android.os.Bundle bundle, java.lang.String str) {
        if (bundle == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "sendDataWithSetData data is null");
            return;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f340892f;
        if (n3Var != null) {
            n3Var.post(new nw4.o(this, bundle, str));
        }
    }

    public android.os.Bundle w(int i17) {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340887a;
        if (mMWebView == null) {
            return null;
        }
        try {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("WebViewShare_type", i17);
            bundle.putInt("WebViewShare_BinderID", this.f340906t);
            bundle.putString("WebViewShare_wv_url", mMWebView.getUrl());
            com.tencent.mm.plugin.webview.core.r0 r0Var = this.f340901o;
            if (r0Var != null) {
                bundle.putString("WebViewShare_commit_url", r0Var.E);
            }
            android.os.Bundle i18 = this.f340899m.i(105, bundle);
            i18.putBoolean("use_update_jsapi_data", true);
            return i18;
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandler", "getShareData err %s", e17.getMessage());
            return null;
        }
    }

    public void w0(boolean z17) {
        this.f340896j = z17;
        if (!z17) {
            this.f340897k = java.lang.System.currentTimeMillis();
            return;
        }
        synchronized (this) {
            if (this.D.size() > 0) {
                java.util.Iterator it = this.D.p().iterator();
                while (!B0() && it.hasNext()) {
                    java.lang.String str = (java.lang.String) ((java.util.Map.Entry) it.next()).getValue();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        _sendMessage(str);
                    }
                }
                this.D.clear();
            }
        }
    }

    public final android.os.Bundle x(java.util.Map map) {
        java.lang.String title;
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340887a;
        java.lang.String url = mMWebView.getUrl();
        if (map != null) {
            java.lang.String str = (java.lang.String) map.get("share_report_pre_msg_url");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = url;
            }
            title = (java.lang.String) map.get("share_report_pre_msg_title");
            if (com.tencent.mm.sdk.platformtools.t8.K0(title)) {
                title = mMWebView.getTitle();
            }
            java.lang.String str2 = (java.lang.String) map.get("share_report_pre_msg_desc");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                str2 = url;
            }
            bundle.putString("link", str);
            bundle.putString("desc", str2);
            java.lang.String str3 = (java.lang.String) map.get("share_report_pre_msg_icon_url");
            if (str3 == null) {
                str3 = "";
            }
            bundle.putString("img_url", str3);
            java.lang.String str4 = (java.lang.String) map.get("share_report_pre_msg_appid");
            bundle.putString("appid", str4 != null ? str4 : "");
        } else {
            title = mMWebView.getTitle();
            bundle.putString("link", url);
            bundle.putString("desc", url);
            bundle.putString("img_url", "");
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(title)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(url)) {
                title = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l6g);
            } else {
                android.net.Uri parse = android.net.Uri.parse(url);
                if (parse.getHost() != null) {
                    url = parse.getHost();
                }
                title = url;
            }
        }
        bundle.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, title);
        bundle.putBoolean("use_update_jsapi_data", false);
        return bundle;
    }

    public void x0(boolean z17) {
        if (this.f340903q != z17) {
            this.f340903q = z17;
            com.tencent.mm.ui.widget.MMWebView mMWebView = this.f340887a;
            java.lang.String Y = lj.f.f(mMWebView.getRandomStr()) ? com.tencent.mm.sdk.platformtools.t8.Y(16) : mMWebView.getRandomStr();
            this.f340904r = Y;
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "js digest verification randomStr = %s, hashCode: %d", Y, java.lang.Integer.valueOf(hashCode()));
        }
    }

    public com.tencent.mm.plugin.webview.webcompt.y1 y() {
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).Ai("appbrand");
        if (this.P == null) {
            this.P = new com.tencent.mm.plugin.webview.webcompt.y1(this);
        }
        return this.P;
    }

    public void y0(int i17, java.lang.String str, int i18) {
        if (this.f340895i) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("recommend", java.lang.Integer.valueOf(i17));
            hashMap.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT, str);
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(i18));
            this.f340887a.evaluateJavascript("javascript:WeixinJSBridge._handleMessageFromWeixin(" + nw4.x2.c("menu:haokan", hashMap, this.f340903q, this.f340904r) + ")", null);
        }
    }

    public final boolean z(java.lang.String str) {
        try {
            org.json.JSONArray jSONArray = this.f340903q ? new org.json.JSONObject(str).getJSONArray("__json_message") : new org.json.JSONArray(str);
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                java.lang.String optString = new org.json.JSONObject(jSONArray.getString(i17)).optString("func");
                if (Q.contains(optString)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "isExemptFromPending func " + optString + " is exempt from pending");
                    return true;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "isExemptFromPending func " + optString + " not exempt from pending");
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiHandler", "isExemptFromPending exception: " + e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "isExemptFromPending: all not exempt from pending");
        return false;
    }

    public void z0(boolean z17) {
        this.f340898l = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "setIsFloating %b", java.lang.Boolean.valueOf(z17));
    }

    public n(com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.plugin.webview.permission.w wVar, int i17) {
        this();
        this.f340887a = mMWebView;
        this.f340902p = wVar;
        this.f340906t = i17;
        this.f340892f = new nw4.y(this, android.os.Looper.getMainLooper());
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mMWebView == null ? 0 : mMWebView.hashCode());
        objArr[1] = java.lang.Integer.valueOf(hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "Abe-Debug JsApiHandler<init>, webview: %d, this: %d", objArr);
    }

    public n(com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.plugin.webview.permission.w wVar, int i17, nw4.j jVar) {
        this();
        this.f340887a = mMWebView;
        this.f340902p = wVar;
        this.f340906t = i17;
        this.f340910x = jVar;
        this.f340892f = new nw4.y(this, android.os.Looper.getMainLooper());
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(mMWebView == null ? 0 : mMWebView.hashCode());
        objArr[1] = java.lang.Integer.valueOf(hashCode());
        objArr[2] = jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "Abe-Debug JsApiHandler<init>, webview: %d, this: %d, jsApiPool: %s", objArr);
    }

    public n(com.tencent.mm.ui.widget.MMWebView mMWebView, com.tencent.mm.plugin.webview.permission.w wVar, int i17, java.util.Set set) {
        this();
        this.f340887a = mMWebView;
        this.f340902p = wVar;
        this.f340906t = i17;
        this.f340908v = set == null ? new java.util.HashSet() : set;
        this.f340909w = true;
        this.f340892f = new nw4.y(this, android.os.Looper.getMainLooper());
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(mMWebView == null ? 0 : mMWebView.hashCode());
        objArr[1] = java.lang.Integer.valueOf(hashCode());
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHandler", "Abe-Debug JsApiHandler<init>, webview: %d, this: %d, limitedJsApiListModeEnable = true", objArr);
    }
}
