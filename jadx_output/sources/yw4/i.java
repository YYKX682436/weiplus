package yw4;

/* loaded from: classes7.dex */
public final class i extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public zq1.j0 f466957b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f466958c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f466959d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f466960e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f466961f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f466963h;

    /* renamed from: i, reason: collision with root package name */
    public yw4.q f466964i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f466965j;

    /* renamed from: l, reason: collision with root package name */
    public long f466967l;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Boolean f466969n;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f466962g = jz5.h.b(yw4.c.f466950d);

    /* renamed from: k, reason: collision with root package name */
    public final yw4.u f466966k = new yw4.u();

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f466968m = jz5.h.b(new yw4.h(this));

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.o1 f466970o = new yw4.f(this);

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.core.g3 f466971p = new yw4.g(this);

    @Override // com.tencent.mm.plugin.webview.core.i3
    public int a(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        if (!y(url)) {
            zq1.j0 j0Var = this.f466957b;
            if (!kotlin.jvm.internal.o.b(url, j0Var != null ? j0Var.f474995a : null)) {
                return -1;
            }
        }
        return 10;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.o1 b() {
        return this.f466970o;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.f3 d() {
        return this.f466971p;
    }

    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int, boolean] */
    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.xweb.y0 f(com.tencent.xweb.WebView webview, com.tencent.xweb.x0 request) {
        java.lang.String host;
        ?? r37;
        zq1.j0 j0Var;
        zq1.l0 l0Var;
        com.tencent.xweb.y0 y0Var;
        kotlin.jvm.internal.o.g(webview, "webview");
        kotlin.jvm.internal.o.g(request, "request");
        if (this.f466957b == null) {
            return null;
        }
        java.lang.String uri = request.getUrl().toString();
        kotlin.jvm.internal.o.f(uri, "toString(...)");
        boolean z17 = false;
        if (request.isForMainFrame()) {
            zq1.j0 j0Var2 = this.f466957b;
            if (!kotlin.jvm.internal.o.b(uri, j0Var2 != null ? j0Var2.f474995a : null)) {
                zq1.j0 j0Var3 = this.f466957b;
                if (j0Var3 != null && j0Var3.f475007m) {
                    z17 = true;
                }
                if (!z17) {
                    return null;
                }
            }
            zq1.j0 j0Var4 = this.f466957b;
            if (j0Var4 == null || (l0Var = j0Var4.f475001g) == null || (y0Var = l0Var.f475013a) == null) {
                return null;
            }
            com.tencent.mm.plugin.webview.core.r0 c17 = c();
            java.lang.String v17 = v();
            kotlin.jvm.internal.o.f(v17, "<get-prefetchId>(...)");
            hy4.k0 k0Var = c17.V;
            k0Var.getClass();
            k0Var.f286126h = v17;
            kotlin.jvm.internal.o.d(this.f466957b);
            com.tencent.mm.plugin.webview.core.q1 q1Var = com.tencent.mm.plugin.webview.core.s1.f181972a;
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return y0Var;
        }
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String Z = c().Z();
            if (Z != null && (host = android.net.Uri.parse(Z).getHost()) != null) {
                if (x() != null) {
                    zq1.j0 j0Var5 = this.f466957b;
                    r37 = 1;
                    j0Var = new ts1.o(uri, com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.o(com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.j(host), uri), nu4.b0.Q, com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94448d, com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.j(host), j0Var5 != null ? j0Var5.f475004j : null, null, null, false, j0Var5 != null ? j0Var5.f475006l : null, null, 1472, null).r();
                } else {
                    r37 = 1;
                    j0Var = null;
                }
                if (j0Var != null) {
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    yw4.u uVar = this.f466966k;
                    uVar.f466998e += currentTimeMillis2 - currentTimeMillis;
                    uVar.f466999f += r37;
                    zq1.l0 l0Var2 = j0Var.f475001g;
                    if (l0Var2 != null) {
                        com.tencent.xweb.y0 y0Var2 = l0Var2.f475013a;
                    }
                    java.lang.String str2 = j0Var.f475000f;
                    if (!this.f466965j) {
                        this.f466965j = r37;
                        com.tencent.mm.plugin.webview.core.q1 q1Var2 = com.tencent.mm.plugin.webview.core.s1.f181972a;
                        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                    }
                    java.lang.String str4 = "";
                    if (kotlin.jvm.internal.o.b(str2, "JS")) {
                        java.util.LinkedList linkedList = c().V.f286130l;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(request.getUrl().toString());
                        sb6.append(';');
                        zq1.l0 l0Var3 = j0Var.f475001g;
                        java.lang.String str5 = l0Var3 != null ? l0Var3.f475014b : null;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        sb6.append(str4);
                        linkedList.add(sb6.toString());
                        jz5.g gVar = cx4.s.f224654a;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1200L, 11L, 1L);
                        cx4.s.c(8L, 1L, ((yq1.x0) x()).c(w()));
                    } else if (kotlin.jvm.internal.o.b(str2, "CSS")) {
                        java.util.LinkedList linkedList2 = c().V.f286131m;
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append(request.getUrl().toString());
                        sb7.append(';');
                        zq1.l0 l0Var4 = j0Var.f475001g;
                        java.lang.String str6 = l0Var4 != null ? l0Var4.f475014b : null;
                        if (str6 != null) {
                            str4 = str6;
                        }
                        sb7.append(str4);
                        linkedList2.add(sb7.toString());
                        jz5.g gVar2 = cx4.s.f224654a;
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1200L, 12L, 1L);
                        cx4.s.c(9L, 1L, ((yq1.x0) x()).c(w()));
                    }
                    zq1.l0 l0Var5 = j0Var.f475001g;
                    if (l0Var5 != null) {
                        return l0Var5.f475013a;
                    }
                }
            }
            return null;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherInterceptor", e17, "interceptRequest getCurrentUrl host", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean k(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        return !y(url);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    @Override // com.tencent.mm.plugin.webview.core.i3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(int r11, java.lang.String r12, r45.s83 r13) {
        /*
            r10 = this;
            java.lang.String r0 = "MicroMsg.WebPrefetcherInterceptor"
            java.lang.String r1 = "overrideProcessResultL, prefetchVersion: "
            java.lang.String r2 = "reqUrl"
            kotlin.jvm.internal.o.g(r12, r2)
            java.lang.String r2 = "resp"
            kotlin.jvm.internal.o.g(r13, r2)
            int r2 = r13.f385547f
            r3 = 38
            r4 = 1
            r5 = 0
            if (r2 != r3) goto Lbf
            boolean r11 = r10.y(r12)
            if (r11 == 0) goto Lbe
            r45.cu5 r11 = r13.C
            r13 = 0
            if (r11 == 0) goto L28
            byte[] r11 = x51.j1.d(r11)
            goto L29
        L28:
            r11 = r13
        L29:
            r45.t83 r2 = new r45.t83     // Catch: java.io.IOException -> Lb6
            r2.<init>()     // Catch: java.io.IOException -> Lb6
            r2.parseFrom(r11)     // Catch: java.io.IOException -> Lb6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb6
            r11.<init>(r1)     // Catch: java.io.IOException -> Lb6
            zq1.j0 r1 = r10.f466957b     // Catch: java.io.IOException -> Lb6
            r6 = 0
            if (r1 == 0) goto L3f
            long r8 = r1.f474999e     // Catch: java.io.IOException -> Lb6
            goto L40
        L3f:
            r8 = r6
        L40:
            r11.append(r8)     // Catch: java.io.IOException -> Lb6
            java.lang.String r1 = ", verifyInfo.Version: "
            r11.append(r1)     // Catch: java.io.IOException -> Lb6
            long r8 = r2.f386205e     // Catch: java.io.IOException -> Lb6
            r11.append(r8)     // Catch: java.io.IOException -> Lb6
            java.lang.String r1 = ", redirectUrl: "
            r11.append(r1)     // Catch: java.io.IOException -> Lb6
            java.lang.String r1 = r2.f386204d     // Catch: java.io.IOException -> Lb6
            r11.append(r1)     // Catch: java.io.IOException -> Lb6
            java.lang.String r11 = r11.toString()     // Catch: java.io.IOException -> Lb6
            com.tencent.mars.xlog.Log.i(r0, r11)     // Catch: java.io.IOException -> Lb6
            zq1.j0 r11 = r10.f466957b     // Catch: java.io.IOException -> Lb6
            if (r11 == 0) goto L64
            long r6 = r11.f474999e     // Catch: java.io.IOException -> Lb6
        L64:
            long r8 = r2.f386205e     // Catch: java.io.IOException -> Lb6
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 >= 0) goto Lbe
            zq1.m0 r11 = r10.x()     // Catch: java.io.IOException -> Lb6
            if (r11 == 0) goto L8a
            zq1.j0 r1 = r10.f466957b     // Catch: java.io.IOException -> Lb6
            if (r1 == 0) goto L77
            java.lang.String r3 = r1.f474997c     // Catch: java.io.IOException -> Lb6
            goto L78
        L77:
            r3 = r13
        L78:
            java.lang.String r6 = ""
            if (r3 != 0) goto L7d
            r3 = r6
        L7d:
            if (r1 == 0) goto L81
            java.lang.String r13 = r1.f474996b     // Catch: java.io.IOException -> Lb6
        L81:
            if (r13 != 0) goto L84
            goto L85
        L84:
            r6 = r13
        L85:
            yq1.x0 r11 = (yq1.x0) r11     // Catch: java.io.IOException -> Lb6
            r11.a(r3, r6, r12)     // Catch: java.io.IOException -> Lb6
        L8a:
            java.lang.String r11 = r2.f386204d     // Catch: java.io.IOException -> Lb6
            r10.z()     // Catch: java.io.IOException -> Lb6
            com.tencent.mm.plugin.webview.core.r0 r13 = r10.c()     // Catch: java.io.IOException -> Lb6
            r13.f181921c0 = r4     // Catch: java.io.IOException -> Lb6
            com.tencent.mm.plugin.webview.core.r0 r13 = r10.c()     // Catch: java.io.IOException -> Lb6
            r13.M()     // Catch: java.io.IOException -> Lb6
            if (r11 == 0) goto La7
            int r13 = r11.length()     // Catch: java.io.IOException -> Lb6
            if (r13 != 0) goto La5
            goto La7
        La5:
            r13 = r5
            goto La8
        La7:
            r13 = r4
        La8:
            if (r13 == 0) goto Lab
            goto Lac
        Lab:
            r12 = r11
        Lac:
            com.tencent.mm.plugin.webview.core.r0 r11 = r10.c()     // Catch: java.io.IOException -> Lb6
            r13 = 8
            r11.V0(r12, r4, r13)     // Catch: java.io.IOException -> Lb6
            goto Lbe
        Lb6:
            r11 = move-exception
            java.lang.String r12 = "parse GetA8KeyRespVerifyPrefetchInfo"
            java.lang.Object[] r13 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r11, r12, r13)
        Lbe:
            return r4
        Lbf:
            boolean r12 = r10.f466958c
            if (r12 == 0) goto Lcd
            r12 = 9
            if (r11 != r12) goto Lcd
            com.tencent.mm.plugin.webview.core.r0 r11 = r10.c()
            r11.f181921c0 = r4
        Lcd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yw4.i.l(int, java.lang.String, r45.s83):boolean");
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean m(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        zq1.j0 j0Var = this.f466957b;
        if ((!kotlin.jvm.internal.o.b(url, j0Var != null ? j0Var.f474995a : null) && !this.f466958c) || !c().M()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "overrideReload url: %s", url);
        z();
        c().f181921c0 = true;
        c().V0(url, true, 8);
        c().f181928g.f476906l = true;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v90 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean o(java.lang.String url) {
        java.lang.String str;
        java.lang.String host;
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI;
        java.lang.String str2;
        java.lang.String Y;
        kotlin.jvm.internal.o.g(url, "url");
        boolean z17 = false;
        if (!y(url)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "not match " + url + ", rawUrl: " + c().i() + ", prefetchResp: " + this.f466957b);
            z();
            return false;
        }
        this.f466965j = false;
        zq1.j0 j0Var = this.f466957b;
        if ((j0Var != null ? j0Var.f475001g : null) != null) {
            zw4.n.f476934a.b(zw4.a.f476881f, c().f181928g);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "url has been cached, bizScene:" + j0Var.f474998d + ", subBizScene:" + j0Var.f475002h + ", prefetchId: " + v() + ", resp.url: %s", j0Var.f474995a);
            yw4.r rVar = yw4.r.f466990b;
            com.tencent.mm.protobuf.g gVar = j0Var.f475005k;
            yw4.q qVar = new yw4.q(rVar, new com.tencent.mm.protocal.JsapiPermissionWrapper(gVar != null ? gVar.f192156a : null), c().f181916a);
            this.f466964i = qVar;
            com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = qVar.f466979b;
            if ((jsapiPermissionWrapper != null ? jsapiPermissionWrapper.f(434) : false) != false) {
                this.f466961f = true;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initPrefetcherJsApiHandler canInjectPrefetcherJsBridge: ");
            sb6.append(this.f466961f);
            sb6.append(", controlBytes size: ");
            com.tencent.mm.protobuf.g gVar2 = j0Var.f475005k;
            sb6.append(gVar2 != null ? java.lang.Integer.valueOf(gVar2.f192156a.length) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", sb6.toString());
            if (this.f466961f) {
                yw4.q qVar2 = this.f466964i;
                if (qVar2 != null && qVar2.f466985h && !qVar2.f466987j) {
                    qVar2.f466987j = true;
                    com.tencent.mm.ui.widget.MMWebView mMWebView = qVar2.f466980c;
                    java.lang.String randomStr = mMWebView != null ? mMWebView.getRandomStr() : null;
                    if ((randomStr == null || randomStr.length() == 0) == true) {
                        Y = com.tencent.mm.sdk.platformtools.t8.Y(16);
                        kotlin.jvm.internal.o.f(Y, "getRandomString(...)");
                    } else {
                        kotlin.jvm.internal.o.d(mMWebView);
                        Y = mMWebView.getRandomStr();
                        if (Y == null) {
                            Y = "";
                        }
                    }
                    qVar2.f466988k = Y;
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsApiHandler", "setDigestVerify isDigestVerify: " + qVar2.f466987j + ", randomStr: " + qVar2.f466988k + ", hashCode: " + qVar2.hashCode());
                }
                yw4.q qVar3 = this.f466964i;
                if (qVar3 != null) {
                    qVar3.f466989l = true;
                }
                kotlin.jvm.internal.o.d(qVar3);
                com.tencent.mm.plugin.webview.core.r0 c17 = c();
                int i17 = yw4.s.f466992a;
                com.tencent.mm.ui.widget.MMWebView wv6 = c17.f181916a;
                kotlin.jvm.internal.o.g(wv6, "wv");
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsLoader", "injectWebPrefetcherJsBridge");
                    com.tencent.mm.ui.widget.MMWebView mMWebView2 = qVar3.f466980c;
                    if (mMWebView2 != null) {
                        mMWebView2.addJavascriptInterface(qVar3, "__wxPrefetcher");
                    }
                    wv6.evaluateJavascript("window.__wx_web_prefetcher_js_isLoaded = 'loaded';", null);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherJsLoader", e17, "injectWebPrefetcherJsBridge exception", new java.lang.Object[0]);
                }
                java.io.InputStream inputStream = j0Var.f475001g.f475013a.f220626f;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("<script>");
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherJsLoader", "getWebPrefetcherJs path: %s", "jsapi/WebPrefetcherWebView.js");
                try {
                    str2 = new java.lang.String(s46.d.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("jsapi/WebPrefetcherWebView.js")), r26.c.f368865a);
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebPrefetcherJsLoader", e18, "getWebPrefetcherJs exception", new java.lang.Object[0]);
                    str2 = "";
                }
                sb7.append(str2);
                sb7.append("</script>");
                byte[] bytes = sb7.toString().getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bytes);
                kotlin.jvm.internal.o.d(inputStream);
                com.tencent.mm.pluginsdk.ui.tools.j5 j5Var = new com.tencent.mm.pluginsdk.ui.tools.j5(byteArrayInputStream, inputStream);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "updatePrefetchResp origin: %s, prefetch: %s, merged: %s", java.lang.Integer.valueOf(inputStream.available()), java.lang.Integer.valueOf(byteArrayInputStream.available()), java.lang.Integer.valueOf(j5Var.available()));
                j0Var.f475001g.f475013a.f220626f = j5Var;
                this.f466957b = j0Var;
            } else {
                this.f466957b = j0Var;
            }
            zq1.j0 j0Var2 = this.f466957b;
            java.lang.String str3 = j0Var2 != null ? j0Var2.f475004j : null;
            if ((str3 == null || r26.n0.N(str3)) == false) {
                c().f181916a.addJavascriptInterface(new yw4.d(str3, this), "wxPrefetcherClient");
            }
            zw4.i.a(zw4.h.f476925h, url, j0Var.f474995a, j0Var.f475003i, j0Var.f474998d, j0Var.f475002h);
            com.tencent.mm.plugin.webview.core.r0 c18 = c();
            java.lang.String str4 = j0Var.f475008n;
            str = str4 != null ? str4 : "";
            yw4.q qVar4 = this.f466964i;
            com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper2 = qVar4 != null ? qVar4.f466979b : null;
            com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) c18;
            if ((str.length() > 0) != false && (ldVar = e3Var.W0) != null && (webViewUI = ldVar.f185654e) != null && ldVar.f185655f != null && webViewUI.f183870x2 != null && jsapiPermissionWrapper2 != null) {
                try {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject(str).optJSONArray("uiConfigs");
                    if (optJSONArray != null && optJSONArray.length() > 0) {
                        int length = optJSONArray.length();
                        for (int i18 = 0; i18 < length; i18++) {
                            org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i18);
                            if (optJSONObject != null) {
                                ldVar.b(optJSONObject.optString("func"), optJSONObject.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA), jsapiPermissionWrapper2);
                            }
                        }
                    }
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewUIStyleHelper", e19, "configWebPrefetchUIStyle exception", new java.lang.Object[0]);
                }
            }
            com.tencent.mm.plugin.webview.core.r0 c19 = c();
            java.lang.String url2 = j0Var.f474995a;
            kotlin.jvm.internal.o.f(url2, "url");
            java.util.Map map = j0Var.f475001g.f475013a.f220625e;
            com.tencent.mars.xlog.Log.i(c19.T(), "WebView-Trace loadCacheUrl#" + c19.U() + " baseUrl " + url2);
            c19.C = url2;
            c19.f181952s = true;
            c19.I(c19.f181937k0);
            c19.V.a("clientLoadUrl", java.lang.System.currentTimeMillis());
            c19.f181916a.loadUrl(url2, map);
            c19.P0(url2);
            c19.I(c19.f181935j0);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.core.d0(c19));
            com.tencent.mm.plugin.webview.core.r0 c27 = c();
            java.lang.String url3 = j0Var.f474995a;
            kotlin.jvm.internal.o.f(url3, "url");
            com.tencent.mm.plugin.webview.core.r0.W0(c27, url3, false, 10, 2, null);
            this.f466958c = true;
            c().V.f286125g = this.f466958c;
            c().V.f286132n.putAll(j0Var.f475001g.f475013a.f220625e);
            jz5.g gVar3 = cx4.s.f224654a;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1200L, 10L, 1L);
            zq1.m0 x17 = x();
            cx4.s.c(7L, 1L, x17 != null ? ((yq1.x0) x17).c(w()) : 0);
            yw4.u uVar = this.f466966k;
            uVar.f466994a = true;
            uVar.getClass();
            uVar.f466995b = url;
            uVar.f466996c = j0Var;
            this.f466966k.f466997d = this.f466967l;
        } else {
            c().V.f286125g = false;
            zw4.n.f476934a.b(zw4.a.f476881f, c().f181928g);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "async geta8key:".concat(url));
            ((yq1.x0) x()).getClass();
            r45.o97 a17 = ts1.p.a(url, null);
            java.lang.String str5 = a17 != null ? a17.f382059i : null;
            str = str5 != null ? str5 : "";
            if ((str.length() == 0) != false) {
                str = url;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "async geta8key respUrl:".concat(str));
            if (!nf.e.c(str, "http", true)) {
                str = "http://".concat(url);
            }
            zw4.i.a(zw4.h.f476926i, url, str, 0, 0, 0);
            c().f181916a.loadUrl(str);
            com.tencent.mm.plugin.webview.core.r0.W0(c(), str, false, 10, 2, null);
        }
        this.f466959d = true;
        if (x() != null && !r26.n0.N(url) && (host = android.net.Uri.parse(url).getHost()) != null) {
            z17 = yq1.z.f464498i.n(host, false);
        }
        this.f466960e = z17;
        c().V.f286123e = this.f466959d;
        c().V.f286124f = this.f466960e;
        c().V.f286130l.clear();
        c().V.f286131m.clear();
        return true;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean p(java.lang.String url, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(url, "url");
        if (r26.i0.y(url, "http", false)) {
            zw4.n nVar = zw4.n.f476934a;
            zw4.d controllerInfo = c().f181928g;
            kotlin.jvm.internal.o.g(controllerInfo, "controllerInfo");
            long j17 = controllerInfo.f476899e;
            boolean z17 = true;
            if (j17 - controllerInfo.f476898d > 50000) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewPrefetchTestReportUtil", "checkValid WebViewUI create cost invalid, create: %d, start: %d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(controllerInfo.f476898d));
                jz5.g gVar = cx4.s.f224654a;
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1281L, 14L, 1L);
                controllerInfo.f476906l = true;
                z17 = false;
            }
            if (z17) {
                if (y(url)) {
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    zq1.m0 x17 = x();
                    zq1.j0 b17 = x17 != null ? ((yq1.x0) x17).b(url, v()) : null;
                    this.f466967l = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    if ((b17 != null ? b17.f475001g : null) != null) {
                        this.f466957b = b17;
                        com.tencent.mm.plugin.webview.core.r0 c17 = c();
                        zw4.b bVar = zw4.b.f476891h;
                        zw4.d dVar = c17.f181928g;
                        dVar.getClass();
                        dVar.f476908n = bVar;
                    } else {
                        com.tencent.mm.plugin.webview.core.r0 c18 = c();
                        zw4.b bVar2 = zw4.b.f476890g;
                        zw4.d dVar2 = c18.f181928g;
                        dVar2.getClass();
                        dVar2.f476908n = bVar2;
                    }
                } else {
                    z();
                    com.tencent.mm.plugin.webview.core.r0 c19 = c();
                    zw4.b bVar3 = zw4.b.f476889f;
                    zw4.d dVar3 = c19.f181928g;
                    dVar3.getClass();
                    dVar3.f476908n = bVar3;
                }
                nVar.b(zw4.a.f476880e, c().f181928g);
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.h3 q(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 request) {
        kotlin.jvm.internal.o.g(webView, "webView");
        kotlin.jvm.internal.o.g(request, "request");
        com.tencent.mm.plugin.webview.core.r0 c17 = c();
        if (request.isForMainFrame() && request.getUrl() != null && c17.M()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "shouldOverride url exitTmpl %s", request.getUrl());
            z();
        }
        return super.q(webView, request);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public boolean s(int i17, boolean z17, java.lang.String reqUrl, java.lang.String fullUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(fullUrl, "fullUrl");
        return !z17 && i17 == 10;
    }

    public final java.lang.String v() {
        return (java.lang.String) ((jz5.n) this.f466968m).getValue();
    }

    public final java.lang.String w() {
        return c().i();
    }

    public final zq1.m0 x() {
        return (zq1.m0) ((jz5.n) this.f466962g).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw4.i.y(java.lang.String):boolean");
    }

    public final void z() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPrefetcherInterceptor", "resetPrefetchInfo");
        this.f466957b = null;
        this.f466958c = false;
        this.f466959d = false;
        this.f466960e = false;
        this.f466961f = false;
        this.f466969n = null;
        yw4.q qVar = this.f466964i;
        if (qVar != null) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = qVar.f466981d;
            if (n3Var != null) {
                android.os.Message obtain = android.os.Message.obtain();
                obtain.what = 3;
                obtain.obj = null;
                n3Var.sendMessage(obtain);
            }
            com.tencent.mm.ui.widget.MMWebView mMWebView = qVar.f466980c;
            if (mMWebView != null) {
                mMWebView.removeJavascriptInterface("__wxPrefetcher");
            }
        }
        this.f466964i = null;
        yw4.u uVar = this.f466966k;
        uVar.f466997d = 0L;
        uVar.f466998e = 0L;
        uVar.f466999f = 0;
    }
}
