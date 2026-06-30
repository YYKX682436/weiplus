package qx4;

/* loaded from: classes8.dex */
public final class d0 extends av4.q {

    /* renamed from: m, reason: collision with root package name */
    public static final qx4.g f367392m = new qx4.g(null);

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f367393n = jz5.h.b(qx4.f.f367405d);

    /* renamed from: c, reason: collision with root package name */
    public final nw4.n f367394c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f367395d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f367396e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f367397f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f367398g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f367399h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f367400i;

    /* renamed from: j, reason: collision with root package name */
    public qx4.c f367401j;

    /* renamed from: k, reason: collision with root package name */
    public qx4.d f367402k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.Double f367403l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(qx4.b uiComponent, nw4.n jsApiHandler) {
        super(uiComponent);
        kotlin.jvm.internal.o.g(uiComponent, "uiComponent");
        kotlin.jvm.internal.o.g(jsApiHandler, "jsApiHandler");
        this.f367394c = jsApiHandler;
        this.f367399h = jz5.h.b(qx4.n.f367432d);
        this.f367400i = "onDeviceMotionFired";
        ((java.util.HashMap) ((jz5.n) f367393n).getValue()).put(java.lang.Integer.valueOf(hashCode()), new java.lang.ref.WeakReference(this));
    }

    public static final void h(java.lang.String str, qx4.d0 d0Var) {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("func");
            java.lang.String optString2 = jSONObject.optString("callbackId");
            if (optString2 == null) {
                optString2 = "";
            }
            java.lang.String optString3 = jSONObject.optString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
            d0Var.f367394c.f340889c = d0Var.k();
            d0Var.f367394c.c(nw4.z2.c(optString, optString3, optString2), qx4.j.f367413a);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "commonJsApiProcess exception e:" + m524exceptionOrNullimpl);
        }
    }

    @Override // av4.q
    public boolean b(int i17, java.lang.String feature, int i18) {
        kotlin.jvm.internal.o.g(feature, "feature");
        return (kotlin.jvm.internal.o.b(feature, "clearSearchBarFocus") || kotlin.jvm.internal.o.b(feature, "WebSearchJSApiGetSearchData")) && i18 <= 0;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String callLiteAppConnectEvent(java.lang.String str) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "callLiteAppConnectEvent: " + str);
            if (str == null) {
                org.json.JSONObject f17 = f();
                f17.put("err_msg", "params is null");
                java.lang.String jSONObject = f17.toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            new java.lang.ref.WeakReference(this);
            av4.j jVar = this.f14326a;
            if (jVar != null && (webView = jVar.getWebView()) != null) {
                ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).wi(jSONObject2, new java.lang.ref.WeakReference(webView));
            }
            java.lang.String jSONObject3 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "callLiteAppConnectEvent exp:" + e17);
            java.lang.String jSONObject4 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String clearSearchBarFocus(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "clearSearchBarFocus: " + str);
        pm0.v.X(new qx4.h(this));
        java.lang.String jSONObject = g().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    public final void commonJsApiProcess(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "commonJsApiProcess: " + str);
        if (str == null || str.length() == 0) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            h(str, this);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new qx4.i(str, this));
        }
    }

    @Override // av4.q
    public boolean d() {
        return com.tencent.mm.app.w.INSTANCE.f53889n;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[Catch: Exception -> 0x009f, TryCatch #1 {Exception -> 0x009f, blocks: (B:5:0x001d, B:6:0x0027, B:8:0x003e, B:11:0x0044, B:19:0x0050, B:23:0x0051, B:24:0x0093, B:26:0x005c, B:28:0x0065, B:31:0x006b, B:39:0x0077, B:40:0x0078, B:42:0x0089, B:43:0x008e, B:49:0x0011, B:46:0x000a, B:33:0x006c, B:34:0x0073, B:13:0x0045, B:14:0x004c), top: B:45:0x000a, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001d A[Catch: Exception -> 0x009f, TryCatch #1 {Exception -> 0x009f, blocks: (B:5:0x001d, B:6:0x0027, B:8:0x003e, B:11:0x0044, B:19:0x0050, B:23:0x0051, B:24:0x0093, B:26:0x005c, B:28:0x0065, B:31:0x006b, B:39:0x0077, B:40:0x0078, B:42:0x0089, B:43:0x008e, B:49:0x0011, B:46:0x000a, B:33:0x006c, B:34:0x0073, B:13:0x0045, B:14:0x004c), top: B:45:0x000a, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003e A[Catch: Exception -> 0x009f, TryCatch #1 {Exception -> 0x009f, blocks: (B:5:0x001d, B:6:0x0027, B:8:0x003e, B:11:0x0044, B:19:0x0050, B:23:0x0051, B:24:0x0093, B:26:0x005c, B:28:0x0065, B:31:0x006b, B:39:0x0077, B:40:0x0078, B:42:0x0089, B:43:0x008e, B:49:0x0011, B:46:0x000a, B:33:0x006c, B:34:0x0073, B:13:0x0045, B:14:0x004c), top: B:45:0x000a, inners: #0, #2, #3 }] */
    @android.webkit.JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String deviceMotionMonitor(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "deviceMotionMonitor = "
            java.lang.String r1 = "toString(...)"
            java.lang.String r2 = "MicroMsg.WebSearch.WebSearchJSApi"
            r3 = 0
            if (r7 == 0) goto L1a
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L10
            goto L1b
        L10:
            r7 = move-exception
            java.lang.String r4 = "deviceMotionMonitor err"
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Exception -> L9f
            com.tencent.mars.xlog.Log.e(r2, r4, r7)     // Catch: java.lang.Exception -> L9f
        L1a:
            r4 = r3
        L1b:
            if (r4 == 0) goto L26
            java.lang.String r7 = "action"
            java.lang.String r5 = ""
            java.lang.String r7 = r4.optString(r7, r5)     // Catch: java.lang.Exception -> L9f
            goto L27
        L26:
            r7 = r3
        L27:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9f
            r4.<init>(r0)     // Catch: java.lang.Exception -> L9f
            r4.append(r7)     // Catch: java.lang.Exception -> L9f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L9f
            com.tencent.mars.xlog.Log.i(r2, r0)     // Catch: java.lang.Exception -> L9f
            java.lang.String r0 = "activate"
            boolean r0 = r0.equals(r7)     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L5c
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r7 = com.tencent.mm.plugin.webview.ui.tools.fts.n5.f184541e     // Catch: java.lang.Exception -> L9f
            if (r7 != 0) goto L51
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.fts.n5> r7 = com.tencent.mm.plugin.webview.ui.tools.fts.n5.class
            monitor-enter(r7)     // Catch: java.lang.Exception -> L9f
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r0 = new com.tencent.mm.plugin.webview.ui.tools.fts.n5     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            com.tencent.mm.plugin.webview.ui.tools.fts.n5.f184541e = r0     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4e
            goto L51
        L4e:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Exception -> L9f
        L51:
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r7 = com.tencent.mm.plugin.webview.ui.tools.fts.n5.f184541e     // Catch: java.lang.Exception -> L9f
            qx4.l r0 = new qx4.l     // Catch: java.lang.Exception -> L9f
            r0.<init>(r6)     // Catch: java.lang.Exception -> L9f
            r7.a(r0)     // Catch: java.lang.Exception -> L9f
            goto L93
        L5c:
            java.lang.String r0 = "terminate"
            boolean r7 = r0.equals(r7)     // Catch: java.lang.Exception -> L9f
            if (r7 == 0) goto L93
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r7 = com.tencent.mm.plugin.webview.ui.tools.fts.n5.f184541e     // Catch: java.lang.Exception -> L9f
            if (r7 != 0) goto L78
            java.lang.Class<com.tencent.mm.plugin.webview.ui.tools.fts.n5> r7 = com.tencent.mm.plugin.webview.ui.tools.fts.n5.class
            monitor-enter(r7)     // Catch: java.lang.Exception -> L9f
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r0 = new com.tencent.mm.plugin.webview.ui.tools.fts.n5     // Catch: java.lang.Throwable -> L75
            r0.<init>()     // Catch: java.lang.Throwable -> L75
            com.tencent.mm.plugin.webview.ui.tools.fts.n5.f184541e = r0     // Catch: java.lang.Throwable -> L75
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L75
            goto L78
        L75:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L75
            throw r0     // Catch: java.lang.Exception -> L9f
        L78:
            com.tencent.mm.plugin.webview.ui.tools.fts.n5 r7 = com.tencent.mm.plugin.webview.ui.tools.fts.n5.f184541e     // Catch: java.lang.Exception -> L9f
            r7.getClass()     // Catch: java.lang.Exception -> L9f
            java.lang.String r0 = "WebSearchShakeCheckingManager"
            java.lang.String r2 = "stopCheck"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Exception -> L9f
            q35.d r0 = r7.f184542a     // Catch: java.lang.Exception -> L9f
            if (r0 == 0) goto L8e
            r0.b()     // Catch: java.lang.Exception -> L9f
            r7.f184542a = r3     // Catch: java.lang.Exception -> L9f
        L8e:
            r0 = 0
            r7.f184545d = r0     // Catch: java.lang.Exception -> L9f
            r7.f184544c = r0     // Catch: java.lang.Exception -> L9f
        L93:
            org.json.JSONObject r7 = r6.g()     // Catch: java.lang.Exception -> L9f
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L9f
            kotlin.jvm.internal.o.f(r7, r1)     // Catch: java.lang.Exception -> L9f
            return r7
        L9f:
            org.json.JSONObject r7 = r6.f()
            java.lang.String r7 = r7.toString()
            kotlin.jvm.internal.o.f(r7, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.d0.deviceMotionMonitor(java.lang.String):java.lang.String");
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String dispatchLiteAppAction(java.lang.String str) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "dispatchLiteAppAction: " + str);
            ((sg0.a2) ((su4.z0) i95.n0.c(su4.z0.class))).Di(new org.json.JSONObject(str), new qx4.m(new java.lang.ref.WeakReference(this)));
            java.lang.String jSONObject = g().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "dispatchLiteAppAction exp:" + e17);
            java.lang.String jSONObject2 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String disposeUniformReddot(java.lang.String str) {
        org.json.JSONObject jSONObject;
        org.json.JSONArray optJSONArray;
        java.lang.String optString;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "disposeUniformReddot, reqData: " + str);
        if (str != null) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApi", e17, "disposeUniformReddot", new java.lang.Object[0]);
                java.lang.String jSONObject2 = f().toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
        } else {
            jSONObject = null;
        }
        zy2.fa nk6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk();
        if (jSONObject != null && (optString = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH)) != null) {
            nk6.N(optString);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "disposeUniformReddot, disposePath: ".concat(optString));
        }
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("paths")) != null) {
            org.json.JSONArray jSONArray = optJSONArray.length() > 0 ? optJSONArray : null;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.lang.String optString2 = jSONArray.optString(i17);
                    if (optString2 != null) {
                        nk6.N(optString2);
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "disposeUniformReddot, disposePath: " + optString2);
                    }
                }
            }
        }
        org.json.JSONObject g17 = g();
        g17.putOpt("retCode", "0");
        java.lang.String jSONObject3 = g17.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "disposeUniformReddot, result: " + jSONObject3);
        return jSONObject3;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String fetchUniformReddot(java.lang.String str) {
        java.lang.String optString;
        java.util.Iterator<java.lang.String> keys;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "fetchUniformReddot, reqData: " + str);
        if (str != null) {
            try {
                optString = new org.json.JSONObject(str).optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApi", e17, "fetchUniformReddot", new java.lang.Object[0]);
                java.lang.String jSONObject = f().toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
        } else {
            optString = null;
        }
        org.json.JSONObject json = optString != null ? i(optString).toJson() : null;
        org.json.JSONObject g17 = g();
        g17.putOpt("retCode", "0");
        if (json != null && (keys = json.keys()) != null) {
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                g17.putOpt(next, json.opt(next));
            }
        }
        java.lang.String jSONObject2 = g17.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "fetchUniformReddot, result: " + jSONObject2);
        return jSONObject2;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String fetchUniformReddotList(java.lang.String str) {
        org.json.JSONArray optJSONArray;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "fetchUniformReddotList, reqData: " + str);
        try {
            u83.b bVar = new u83.b();
            if (str != null && (optJSONArray = new org.json.JSONObject(str).optJSONArray("pathList")) != null) {
                if (!(optJSONArray.length() > 0)) {
                    optJSONArray = null;
                }
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString = optJSONArray.optString(i17);
                        if (optString != null) {
                            bVar.j().add(i(optString));
                        }
                    }
                }
            }
            org.json.JSONObject json = bVar.toJson();
            org.json.JSONObject g17 = g();
            g17.putOpt("retCode", "0");
            java.util.Iterator<java.lang.String> keys = json.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                g17.putOpt(next, json.opt(next));
            }
            java.lang.String jSONObject = g17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "fetchUniformReddotList, result: " + jSONObject);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApi", e17, "fetchUniformReddotList", new java.lang.Object[0]);
            java.lang.String jSONObject2 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getContactMatchUserList(java.lang.String str) {
        try {
            if (str == null) {
                org.json.JSONObject f17 = f();
                f17.put("err", "params is null");
                java.lang.String jSONObject = f17.toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject2.optString("query");
            kotlin.jvm.internal.o.d(optString);
            if (optString.length() == 0) {
                org.json.JSONObject f18 = f();
                f18.put("err", "query is empty");
                java.lang.String jSONObject3 = f18.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                return jSONObject3;
            }
            java.util.List a17 = ((sg0.h2) ((su4.d1) ((jz5.n) this.f367399h).getValue())).a(optString, jSONObject2.optLong("timeout", 2000L), jSONObject2.optInt("limit", Integer.MAX_VALUE));
            org.json.JSONObject g17 = g();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = a17.iterator();
            while (it.hasNext()) {
                jSONArray.put(((su4.r0) it.next()).a());
            }
            g17.put("matchUserList", jSONArray);
            java.lang.String jSONObject4 = g17.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "getContactMatchUserList err:" + e17);
            java.lang.String jSONObject5 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getNewLifeContact(java.lang.String str) {
        java.lang.String jSONObject = g().put(dm.i4.COL_USERNAME, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(com.tencent.mm.sdk.platformtools.x2.f193071a)).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getSearchData(java.lang.String str) {
        try {
            java.util.Map e17 = d75.b.e(new org.json.JSONObject(str), qx4.o.f367433d);
            ((java.util.HashMap) e17).put("webview_instance_id", java.lang.Integer.valueOf(hashCode()));
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).d(e17);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String getTeachSearchData(java.lang.String str) {
        try {
            java.util.Map e17 = d75.b.e(new org.json.JSONObject(str), qx4.p.f367435d);
            ((java.util.HashMap) e17).put("webview_instance_id", java.lang.Integer.valueOf(hashCode()));
            ((com.tencent.mm.plugin.websearch.a0) com.tencent.mm.plugin.webview.modeltools.z.Di()).getClass();
            ((com.tencent.mm.plugin.websearch.w1) i95.n0.c(com.tencent.mm.plugin.websearch.w1.class)).aj().f(e17);
            return g().toString();
        } catch (java.lang.Exception unused) {
            return f().toString();
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String handleCircleToSearchAction(java.lang.String str) {
        java.lang.String jSONObject;
        java.lang.String str2 = "";
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            qx4.b l17 = l();
            com.tencent.mm.ui.MMActivity B = l17 != null ? l17.B() : null;
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = B instanceof com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) B : null;
            boolean z17 = false;
            int i17 = baseSearchWebViewUI != null ? baseSearchWebViewUI.f184266x4 : 0;
            com.tencent.mm.autogen.events.CircleToSearchWeb2ClientEvent circleToSearchWeb2ClientEvent = new com.tencent.mm.autogen.events.CircleToSearchWeb2ClientEvent();
            am.y2 y2Var = circleToSearchWeb2ClientEvent.f54060h;
            am.x2 x2Var = circleToSearchWeb2ClientEvent.f54059g;
            x2Var.f8338a = i17;
            x2Var.f8339b = jSONObject2.optString("action", "");
            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            if (optJSONObject != null && (jSONObject = optJSONObject.toString()) != null) {
                str2 = jSONObject;
            }
            x2Var.f8340c = str2;
            circleToSearchWeb2ClientEvent.e();
            org.json.JSONObject g17 = g();
            java.lang.String str3 = y2Var.f8422a;
            if (str3 != null) {
                if (str3.length() > 0) {
                    z17 = true;
                }
            }
            if (z17) {
                org.json.JSONObject jSONObject3 = new org.json.JSONObject(y2Var.f8422a);
                java.util.Iterator<java.lang.String> keys = jSONObject3.keys();
                kotlin.jvm.internal.o.f(keys, "keys(...)");
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    g17.put(next, jSONObject3.get(next));
                }
            }
            java.lang.String jSONObject4 = g17.toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        } catch (java.lang.Exception unused) {
            java.lang.String jSONObject5 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    public final void handleVideoAction(java.lang.String str) {
        android.content.Context k17 = k();
        nw4.n nVar = this.f367394c;
        nVar.f340889c = k17;
        nVar.c(nw4.z2.c("handleVideoAction", str, ""), qx4.q.f367437a);
    }

    public final u83.c i(java.lang.String str) {
        r45.f03 I0;
        u83.c cVar = new u83.c();
        cVar.j(str);
        cVar.l(false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return cVar;
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str);
        u83.a j17 = (L0 == null || (I0 = L0.I0(str)) == null) ? null : j(str, L0, I0, L0.K.size());
        if (j17 == null) {
            return cVar;
        }
        cVar.l(true);
        cVar.k(j17);
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:3:0x0002, B:7:0x000e, B:10:0x0025, B:13:0x002d, B:15:0x003b, B:17:0x0042, B:20:0x004c, B:22:0x005d, B:28:0x006b, B:29:0x0073, B:31:0x0079, B:34:0x0087, B:37:0x0091), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u83.a j(java.lang.String r8, com.tencent.mm.plugin.finder.extension.reddot.jb r9, r45.f03 r10, int r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            u83.a r2 = new u83.a     // Catch: java.lang.Exception -> L9a
            r2.<init>()     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r10.f373892i     // Catch: java.lang.Exception -> L9a
            java.lang.String r4 = ""
            if (r3 != 0) goto Le
            r3 = r4
        Le:
            r2.p(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r9.field_tipsId     // Catch: java.lang.Exception -> L9a
            java.lang.String r5 = "field_tipsId"
            kotlin.jvm.internal.o.f(r3, r5)     // Catch: java.lang.Exception -> L9a
            r2.s(r3)     // Catch: java.lang.Exception -> L9a
            int r3 = r10.f373887d     // Catch: java.lang.Exception -> L9a
            r2.q(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r10.f373889f     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L25
            r3 = r4
        L25:
            r2.t(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r10.f373890g     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L2d
            r3 = r4
        L2d:
            r2.n(r3)     // Catch: java.lang.Exception -> L9a
            int r10 = r10.f373888e     // Catch: java.lang.Exception -> L9a
            r2.o(r10)     // Catch: java.lang.Exception -> L9a
            r45.ez2 r10 = r9.D0()     // Catch: java.lang.Exception -> L9a
            if (r10 == 0) goto L47
            r3 = 4
            com.tencent.mm.protobuf.g r10 = r10.getByteString(r3)     // Catch: java.lang.Exception -> L9a
            if (r10 == 0) goto L47
            java.lang.String r10 = r10.i()     // Catch: java.lang.Exception -> L9a
            goto L48
        L47:
            r10 = r0
        L48:
            if (r10 != 0) goto L4b
            goto L4c
        L4b:
            r4 = r10
        L4c:
            r2.l(r4)     // Catch: java.lang.Exception -> L9a
            r45.xs2 r10 = r9.N     // Catch: java.lang.Exception -> L9a
            r3 = 9
            int r10 = r10.getInteger(r3)     // Catch: java.lang.Exception -> L9a
            r2.r(r10)     // Catch: java.lang.Exception -> L9a
            r10 = 1
            if (r8 == 0) goto L66
            int r3 = r8.length()     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L64
            goto L66
        L64:
            r3 = r1
            goto L67
        L66:
            r3 = r10
        L67:
            if (r3 != 0) goto L99
            if (r11 <= 0) goto L99
            java.util.List r3 = r9.L0()     // Catch: java.lang.Exception -> L9a
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L9a
        L73:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L9a
            if (r4 == 0) goto L99
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L9a
            r45.f03 r4 = (r45.f03) r4     // Catch: java.lang.Exception -> L9a
            java.lang.String r5 = r4.f373893m     // Catch: java.lang.Exception -> L9a
            boolean r5 = r8.equals(r5)     // Catch: java.lang.Exception -> L9a
            if (r5 == 0) goto L73
            java.lang.String r5 = r4.f373892i     // Catch: java.lang.Exception -> L9a
            int r6 = r11 + (-1)
            u83.a r4 = r7.j(r5, r9, r4, r6)     // Catch: java.lang.Exception -> L9a
            if (r4 == 0) goto L73
            java.util.LinkedList r5 = r2.j()     // Catch: java.lang.Exception -> L9a
            r5.add(r4)     // Catch: java.lang.Exception -> L9a
            goto L73
        L99:
            return r2
        L9a:
            r8 = move-exception
            java.lang.String r9 = "createRedDotDetail"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "MicroMsg.WebSearch.WebSearchJSApi"
            com.tencent.mars.xlog.Log.printErrStackTrace(r11, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qx4.d0.j(java.lang.String, com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03, int):u83.a");
    }

    public final android.content.Context k() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        av4.j jVar = this.f14326a;
        if (jVar == null) {
            return com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context activityContextIfHas = (jVar == null || (webView = jVar.getWebView()) == null) ? null : webView.getActivityContextIfHas();
        return activityContextIfHas == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : activityContextIfHas;
    }

    public final qx4.b l() {
        av4.j jVar = this.f14326a;
        if (jVar instanceof qx4.b) {
            return (qx4.b) jVar;
        }
        return null;
    }

    public final void m(java.lang.String funcName, org.json.JSONObject params) {
        kotlin.jvm.internal.o.g(funcName, "funcName");
        kotlin.jvm.internal.o.g(params, "params");
        pm0.v.X(new qx4.r(this, funcName, params));
    }

    public final void n(java.util.Map initParamsObj) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        kotlin.jvm.internal.o.g(initParamsObj, "initParamsObj");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "onUIInitJsApi ");
        this.f367398g = initParamsObj;
        if (this.f367395d) {
            org.json.JSONObject g17 = g();
            for (java.util.Map.Entry entry : initParamsObj.entrySet()) {
                g17.put((java.lang.String) entry.getKey(), entry.getValue());
            }
            av4.j jVar = this.f14326a;
            if (jVar == null || (webView = jVar.getWebView()) == null) {
                return;
            }
            java.lang.String jSONObject = g17.toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApiNotifier", "start notifyJsEvent %s %s", "onUiInit", jSONObject);
                java.lang.String format = java.lang.String.format("javascript:window['%s'] && %s(%s)", java.util.Arrays.copyOf(new java.lang.Object[]{"onUiInit", "onUiInit", jSONObject}, 3));
                kotlin.jvm.internal.o.f(format, "format(...)");
                pm0.v.X(new av4.t0(webView, format));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApiNotifier", e17, "notifyJsEvent", new java.lang.Object[0]);
            }
        }
    }

    public final void o(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "onUniformReddotDataChanged, path: ".concat(path));
        try {
            java.lang.String jSONObject = i(path).toJson().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "onUniformReddotDataChanged, result: ".concat(jSONObject));
            pm0.v.X(new qx4.s(this, "onUniformReddotDataChanged", jSONObject));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApi", e17, "onUniformReddotDataChanged", new java.lang.Object[0]);
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String observeUniformReddot(java.lang.String str) {
        org.json.JSONObject jSONObject;
        org.json.JSONArray optJSONArray;
        androidx.lifecycle.j0 Di;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "observeUniformReddot, reqData: " + str);
        if (str != null) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApi", e17, "observeUniformReddot", new java.lang.Object[0]);
                java.lang.String jSONObject2 = f().toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("paths")) != null) {
            if (!(optJSONArray.length() > 0)) {
                optJSONArray = null;
            }
            if (optJSONArray != null) {
                zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
                qx4.b l17 = l();
                com.tencent.mm.ui.MMActivity B = l17 != null ? l17.B() : null;
                if (B != null) {
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString = optJSONArray.optString(i17);
                        if (optString != null && (Di = ((c61.t8) caVar).Di(optString)) != null) {
                            Di.observe(B, new qx4.t(this, optString));
                        }
                    }
                }
            }
        }
        org.json.JSONObject g17 = g();
        g17.putOpt("retCode", "0");
        java.lang.String jSONObject3 = g17.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "observeUniformReddot, result: " + jSONObject3);
        return jSONObject3;
    }

    @android.webkit.JavascriptInterface
    public final void onMoreClickInFlutter(java.lang.String str) {
        qx4.c cVar = this.f367401j;
        if (cVar != null) {
            ((ch0.i0) cVar).f41227a.e("onMoreClickInFlutter", str);
        }
    }

    @android.webkit.JavascriptInterface
    public final void onWebViewSizeChanged(java.lang.String str) {
        java.lang.Object m521constructorimpl;
        if (this.f367401j == null) {
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                org.json.JSONObject jSONObject = str != null ? new org.json.JSONObject(str) : null;
                this.f367403l = jSONObject != null ? java.lang.Double.valueOf(jSONObject.optDouble("height")) : null;
                m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            if (m524exceptionOrNullimpl != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "onWebViewSizeChanged exception e:" + m524exceptionOrNullimpl);
            }
        }
        qx4.c cVar = this.f367401j;
        if (cVar != null) {
            ((ch0.i0) cVar).f41227a.e("onWebViewSizeChanged", str);
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String openTransparentWeApp(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "openTransparentWeApp: " + str);
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = jSONObject.optString("userName");
        b1Var.f317022f = jSONObject.optString("relativeURL");
        b1Var.f317032k = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1000);
        b1Var.f317016c = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(jSONObject.optString("envVersion"), com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.RELEASE).f82194d;
        if (!((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ni()) {
            b1Var.H = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
        }
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(com.tencent.mm.sdk.platformtools.x2.f193071a, b1Var);
        java.lang.String jSONObject2 = g().toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final void p(qx4.d dVar) {
        if (dVar == null) {
            this.f367402k = null;
        } else {
            this.f367402k = new qx4.y(dVar, this);
        }
    }

    @android.webkit.JavascriptInterface
    public java.lang.String preloadFinderFeed(java.lang.String str) {
        org.json.JSONArray optJSONArray;
        int optInt;
        long j17;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            optJSONArray = jSONObject.optJSONArray("items");
            optInt = jSONObject.optInt("batchLoadScene", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebSearch.WebSearchJSApi", e17, "", new java.lang.Object[0]);
        }
        if (optJSONArray == null) {
            java.lang.String jSONObject2 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int length = optJSONArray.length();
        if (length > 20) {
            length = 20;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "preloadFinderFeed %s", str);
        for (int i17 = 0; i17 < length; i17++) {
            r45.rv0 rv0Var = new r45.rv0();
            java.lang.Object obj = optJSONArray.get(i17);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type org.json.JSONObject");
            org.json.JSONObject jSONObject3 = (org.json.JSONObject) obj;
            java.lang.String string = jSONObject3.getString("feedId");
            if (string != null) {
                if (!(string.length() == 0)) {
                    j17 = new java.math.BigInteger(string).longValue();
                    rv0Var.set(0, java.lang.Long.valueOf(j17));
                    rv0Var.set(1, jSONObject3.getString("encryptId"));
                    rv0Var.set(2, jSONObject3.getString("nonceId"));
                    linkedList.add(rv0Var);
                }
            }
            j17 = 0;
            rv0Var.set(0, java.lang.Long.valueOf(j17));
            rv0Var.set(1, jSONObject3.getString("encryptId"));
            rv0Var.set(2, jSONObject3.getString("nonceId"));
            linkedList.add(rv0Var);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Uk(linkedList, 39, optInt);
        java.lang.String jSONObject4 = g().toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        return jSONObject4;
    }

    @android.webkit.JavascriptInterface
    public final void preloadSearchWebView(java.lang.String str) {
        ((yg0.o3) ((tg0.l1) i95.n0.c(tg0.l1.class))).ij();
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String querySearchWeb(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "querySearchWeb: " + str);
        try {
            java.util.Map e17 = d75.b.e(new org.json.JSONObject(str), qx4.x.f367470d);
            ((java.util.HashMap) e17).put("webview_instance_id", java.lang.Integer.valueOf(hashCode()));
            ((com.tencent.mm.plugin.websearch.q0) com.tencent.mm.plugin.webview.modeltools.z.Ri()).a(e17);
            java.lang.String jSONObject = g().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "querySearchWeb exp:" + e18);
            java.lang.String jSONObject2 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String registerNativeEventMonitor(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "registerNativeEventMonitor " + str);
        qx4.b l17 = l();
        if (l17 != null) {
            l17.l1();
        }
        java.lang.String jSONObject = g().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    public final void reportSearchStatistics(java.lang.String str) {
        java.lang.Object m521constructorimpl;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "js call reportSearchStatistics failed, params is null");
            return;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((com.tencent.mm.plugin.websearch.q0) com.tencent.mm.plugin.webview.modeltools.z.Ri()).m(com.tencent.mm.plugin.webview.ui.tools.newjsapi.wechatpay.i.b(new org.json.JSONObject(str)));
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "reportSearchStatistics exception: " + m524exceptionOrNullimpl);
        }
    }

    @android.webkit.JavascriptInterface
    public final void setPreGetParams(java.lang.String str) {
        ((ku5.t0) ku5.t0.f312615d).h(new qx4.z(str), "MicroMsg.WebSearch.WebSearchJSApi");
    }

    @android.webkit.JavascriptInterface
    public final void setSearchInputWordInFlutter(java.lang.String str) {
        qx4.c cVar = this.f367401j;
        if (cVar != null) {
            ((ch0.i0) cVar).f41227a.e("onSetSearchInputWordInFlutter", str);
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String showWebViewKeyboard(java.lang.String str) {
        try {
            if (str == null) {
                org.json.JSONObject f17 = f();
                f17.put("errMsg", "params is null");
                java.lang.String jSONObject = f17.toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            java.lang.String optString = new org.json.JSONObject(str).optString("action");
            qx4.b l17 = l();
            com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView = l17 != null ? l17.getWebView() : null;
            qx4.b l18 = l();
            com.tencent.mm.ui.MMActivity B = l18 != null ? l18.B() : null;
            if (webView == null) {
                org.json.JSONObject f18 = f();
                f18.put("errMsg", "webview not founded");
                java.lang.String jSONObject2 = f18.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
            if (B == null) {
                org.json.JSONObject f19 = f();
                f19.put("errMsg", "activity not founded");
                java.lang.String jSONObject3 = f19.toString();
                kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                return jSONObject3;
            }
            if (optString != null) {
                switch (optString.hashCode()) {
                    case 3027047:
                        if (!optString.equals("blur")) {
                            break;
                        } else {
                            webView.clearFocus();
                            break;
                        }
                    case 3202370:
                        if (!optString.equals("hide")) {
                            break;
                        } else {
                            B.hideVKB();
                            break;
                        }
                    case 3529469:
                        if (!optString.equals("show")) {
                            break;
                        } else {
                            java.lang.Object systemService = B.getSystemService("input_method");
                            android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
                            if (inputMethodManager != null) {
                                inputMethodManager.toggleSoftInput(0, 2);
                                break;
                            }
                        }
                        break;
                    case 97604824:
                        if (!optString.equals("focus")) {
                            break;
                        } else {
                            webView.requestFocus();
                            break;
                        }
                }
            }
            java.lang.String jSONObject4 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "showWebViewKeyboard err:" + e17);
            java.lang.String jSONObject5 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject5, "toString(...)");
            return jSONObject5;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String startWebSearch(java.lang.String str) {
        try {
            if (str == null) {
                org.json.JSONObject f17 = f();
                f17.put("errMsg", "params is null");
                java.lang.String jSONObject = f17.toString();
                kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
                return jSONObject;
            }
            ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Zi(k(), new org.json.JSONObject(str));
            java.lang.String jSONObject2 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "startWebSearch err:" + e17);
            java.lang.String jSONObject3 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String takeScreenshot(java.lang.String str) {
        try {
            if (str == null) {
                str = "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
            qx4.b l17 = l();
            com.tencent.mm.ui.MMActivity B = l17 != null ? l17.B() : null;
            if (B != null && (B instanceof com.tencent.mm.plugin.webview.ui.tools.fts.MMFTSSOSHomeWebViewUI)) {
                pm0.v.X(new qx4.b0(B, jSONObject, weakReference));
                java.lang.String jSONObject2 = g().toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                return jSONObject2;
            }
            m(com.tencent.mm.plugin.appbrand.screenshot.c1.NAME, new org.json.JSONObject());
            java.lang.String jSONObject3 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception unused) {
            m(com.tencent.mm.plugin.appbrand.screenshot.c1.NAME, new org.json.JSONObject());
            java.lang.String jSONObject4 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String toggleFullScreen(java.lang.String str) {
        if (!com.tencent.xweb.a3.k(2023)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "toggleFullScreen fail:xwebsdk ver required");
            java.lang.String jSONObject = f().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        qx4.b l17 = l();
        com.tencent.mm.ui.MMActivity B = l17 != null ? l17.B() : null;
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = B instanceof com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) B : null;
        if (baseSearchWebViewUI == null) {
            java.lang.String jSONObject2 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            return jSONObject2;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "toggleFullScreen: " + str);
            baseSearchWebViewUI.fa(-1.0f, 1.0f, new org.json.JSONObject(str).optInt("duration"), false);
            java.lang.String jSONObject3 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "toggleFullScreen exp:" + e17);
            java.lang.String jSONObject4 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String updateHalfScreen(java.lang.String str) {
        qx4.b l17 = l();
        com.tencent.mm.ui.MMActivity B = l17 != null ? l17.B() : null;
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI baseSearchWebViewUI = B instanceof com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.fts.BaseSearchWebViewUI) B : null;
        if (baseSearchWebViewUI == null) {
            java.lang.String jSONObject = f().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "updateHalfScreen: " + str);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(str);
            float optDouble = (float) jSONObject2.optDouble("height", 0.0d);
            float optDouble2 = (float) jSONObject2.optDouble("heightRatio", 0.0d);
            int optInt = jSONObject2.optInt("duration");
            boolean optBoolean = jSONObject2.optBoolean("draggableUpward", false);
            if (optDouble2 <= 0.0f && optDouble > 0.0f) {
                optDouble2 = -1.0f;
            }
            if (optDouble2 > 0.0f || optDouble > 0.0f) {
                if (optDouble <= 0.0f) {
                    optDouble = -1.0f;
                }
                if (optDouble2 <= 0.0f) {
                    optDouble2 = -1.0f;
                } else if (optDouble2 > 1.0f) {
                    optDouble2 = 1.0f;
                }
                baseSearchWebViewUI.fa(optDouble, optDouble2, optInt, optBoolean);
            }
            if (jSONObject2.has("draggableUpward") && baseSearchWebViewUI.f184266x4 != 0) {
                com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent setMPHalfScreenHeightEvent = new com.tencent.mm.autogen.events.SetMPHalfScreenHeightEvent();
                int i17 = baseSearchWebViewUI.f184266x4;
                am.bu buVar = setMPHalfScreenHeightEvent.f54767g;
                buVar.f6285a = i17;
                buVar.f6288d = -1.0f;
                buVar.f6286b = -1.0f;
                buVar.f6287c = 0.0f;
                buVar.f6289e = optBoolean;
                setMPHalfScreenHeightEvent.e();
            }
            java.lang.String jSONObject3 = g().toString();
            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
            return jSONObject3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "updateHalfScreen exp:" + e17);
            java.lang.String jSONObject4 = f().toString();
            kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
            return jSONObject4;
        }
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String webViewUIReady(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", "webViewUIReady " + str);
        this.f367395d = true;
        qx4.b l17 = l();
        if (l17 != null) {
            l17.Y1();
        }
        java.util.Map map = this.f367398g;
        if (map != null) {
            n(map);
        }
        java.lang.String jSONObject = g().toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        return jSONObject;
    }

    @android.webkit.JavascriptInterface
    public final java.lang.String webViewUIReadyInFlutter(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchJSApi", "webViewUIReadyInFlutter has ready, isWebViewUIReadyInFlutter: " + this.f367396e);
        if (this.f367396e) {
            java.lang.String jSONObject = g().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        }
        ((ku5.t0) ku5.t0.f312615d).D(new qx4.c0(this));
        java.lang.String jSONObject2 = g().toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
