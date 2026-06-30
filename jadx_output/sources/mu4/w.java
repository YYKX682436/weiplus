package mu4;

/* loaded from: classes7.dex */
public abstract class w extends com.tencent.mm.plugin.appbrand.jsruntime.o0 implements lu4.c {
    public static final java.lang.String A;
    public static final jt0.j B;

    /* renamed from: y, reason: collision with root package name */
    public static final mu4.n f331452y = new mu4.n(null);

    /* renamed from: z, reason: collision with root package name */
    public static final jz5.g f331453z = jz5.h.b(mu4.k.f331430d);

    /* renamed from: w, reason: collision with root package name */
    public boolean f331459w;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f331454r = new java.util.HashMap();

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f331455s = jz5.h.b(new mu4.q(this));

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f331456t = jz5.h.b(new mu4.v(this));

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f331457u = jz5.h.b(new mu4.u(this));

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f331458v = new java.util.HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f331460x = jz5.h.b(mu4.r.f331442d);

    static {
        java.lang.String str = lp0.b.D() + "jsengine/pkg";
        com.tencent.mars.xlog.Log.i("DEBUG_PATH", "WebCanvas debug path = " + str);
        A = str;
        B = new jt0.j(1);
    }

    public static /* synthetic */ void E0(mu4.w wVar, cl0.g gVar, com.tencent.mm.plugin.appbrand.jsruntime.r rVar, mu4.h0 h0Var, boolean z17, java.lang.String str, java.lang.String str2, yz5.l lVar, int i17, java.lang.Object obj) {
        java.lang.String str3;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setup");
        }
        boolean z18 = (i17 & 4) != 0 ? false : z17;
        if ((i17 & 8) != 0) {
            java.lang.String string = gVar.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            str3 = string;
        } else {
            str3 = str;
        }
        wVar.D0(gVar, rVar, h0Var, z18, str3, (i17 & 16) != 0 ? "wxfedb0854e2b1820d" : str2, (i17 & 32) != 0 ? null : lVar);
    }

    public static void z0(mu4.w wVar, com.tencent.mm.plugin.appbrand.jsruntime.r context, java.lang.String name, java.lang.String str, yz5.l lVar, mu4.i iVar, int i17, java.lang.Object obj) {
        mu4.i iVar2;
        mu4.h0 h0Var;
        mu4.i iVar3;
        java.lang.String str2;
        int i18;
        cl0.g A0;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configClient");
        }
        java.lang.String type = (i17 & 4) != 0 ? "unspecified" : str;
        mu4.i iVar4 = (i17 & 16) != 0 ? null : iVar;
        wVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(type, "type");
        if (wVar.f331459w) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebJsEngine", "configClient but engine destroyed");
            return;
        }
        if (iVar4 == null) {
            try {
                iVar2 = new mu4.i("wx97b7aebac2183fd2", ((nu4.b0) wVar).A0(type).getLong("idKey"));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebJsEngine", e17, "configClient getClientInfo err", new java.lang.Object[0]);
                java.lang.String message = e17.getMessage();
                jx3.f.INSTANCE.d(20821, "ClientInfo", name, message != null ? r26.i0.u(message, ',', '.', false, 4, null) : null);
                return;
            }
        } else {
            iVar2 = iVar4;
        }
        mu4.h0 h0Var2 = new mu4.h0(iVar2.f331424b, mu4.g0.f331413f);
        try {
            ((nu4.b0) wVar).F.a(new mu4.k0());
            A0 = wVar.A0(type);
            h0Var2.a(new mu4.d0());
            h0Var = h0Var2;
            iVar3 = iVar2;
            str2 = "MicroMsg.WebJsEngine";
            i18 = 20821;
        } catch (java.lang.Exception e18) {
            e = e18;
            h0Var = h0Var2;
            iVar3 = iVar2;
            str2 = "MicroMsg.WebJsEngine";
            i18 = 20821;
        }
        try {
            E0(wVar, A0, context, h0Var2, false, name, iVar2.f331423a, null, 36, null);
            h0Var.a(new mu4.e0());
            ((nu4.b0) wVar).F.a(new mu4.l0());
        } catch (java.lang.Exception e19) {
            e = e19;
            ((nu4.b0) wVar).F.a(new mu4.i0());
            h0Var.a(new mu4.y());
            java.lang.String str3 = "type=" + type + ", " + e.getMessage();
            jx3.f.INSTANCE.d(i18, iVar3.f331423a, name, str3 != null ? r26.i0.u(str3, ',', '.', false, 4, null) : null);
            com.tencent.mars.xlog.Log.printErrStackTrace(str2, e, "configClient engineContext err", new java.lang.Object[0]);
        }
    }

    public abstract cl0.g A0(java.lang.String str);

    public abstract com.tencent.mm.plugin.appbrand.appcache.u3 B0();

    public final void C0(java.lang.String target, java.lang.String func, java.util.List list, yz5.l callback) {
        kotlin.jvm.internal.o.g(target, "target");
        kotlin.jvm.internal.o.g(func, "func");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invokeMethod('");
        sb6.append(func);
        sb6.append("', { target: '");
        sb6.append(target);
        sb6.append("', data: { params: ");
        sb6.append(list != null ? kz5.n0.g0(list, ",", "[", "]", 0, null, mu4.m.f331433d, 24, null) : "[]");
        sb6.append("}})");
        evaluateJavascript(sb6.toString(), new mu4.s(callback));
    }

    public final void D0(cl0.g gVar, com.tencent.mm.plugin.appbrand.jsruntime.r context, mu4.h0 clientReporter, boolean z17, java.lang.String name, java.lang.String appId, yz5.l lVar) {
        int i17;
        int i18;
        java.lang.String str;
        mu4.h0 h0Var;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        cl0.e jSONArray;
        java.lang.Integer num;
        com.tencent.mm.plugin.appbrand.jsruntime.r x07;
        kotlin.jvm.internal.o.g(gVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(clientReporter, "clientReporter");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(appId, "appId");
        if (this.f331459w) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebJsEngine", "setup but engine destroyed");
            return;
        }
        java.lang.String str5 = name + " :" + context.o();
        try {
            try {
                context.setJsExceptionHandler(new mu4.t(str5, clientReporter, this, context, name, appId));
                new lu4.g(str5).a(context);
                try {
                    boolean has = gVar.has("dependencies");
                    java.util.HashMap hashMap = this.f331454r;
                    if (has && (jSONArray = gVar.getJSONArray("dependencies")) != null) {
                        int length = jSONArray.length();
                        for (int i19 = 0; i19 < length; i19++) {
                            java.lang.String string = jSONArray.getString(i19);
                            if (hashMap.containsKey(string)) {
                                num = (java.lang.Integer) hashMap.get(string);
                            } else {
                                java.util.HashMap hashMap2 = this.f331458v;
                                num = hashMap2.containsKey(string) ? (java.lang.Integer) hashMap2.get(string) : null;
                            }
                            if (num != null && (x07 = x0(num.intValue())) != null) {
                                ((com.tencent.mm.plugin.appbrand.jsruntime.n) x07).q0(context, string);
                            }
                        }
                    }
                    try {
                        java.lang.String string2 = gVar.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                        if (this.f331459w) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.WebJsEngine", "setup but engine destroyed");
                            return;
                        }
                        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                        java.net.URL url = new java.net.URL("https://ws/lib" + string2);
                        kotlin.jvm.internal.o.d(string2);
                        ((com.tencent.mm.plugin.appbrand.jsruntime.n) context).M(url, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_BASE + ':' + java.net.URLEncoder.encode(string2), java.lang.String.valueOf(((java.lang.Number) ((jz5.n) this.f331457u).getValue()).intValue()), 0, com.tencent.mm.plugin.appbrand.appcache.v3.a(B0(), string2), lVar != null ? new mu4.s(lVar) : null);
                        if (z17) {
                            java.lang.String string3 = gVar.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
                            kotlin.jvm.internal.o.f(string3, "getString(...)");
                            hashMap.put(string3, java.lang.Integer.valueOf(context.o()));
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.WebJsEngine", "client setup succ " + str5 + " from " + string2);
                    } catch (java.lang.Exception e17) {
                        clientReporter.a(new mu4.b0());
                        java.lang.String message = e17.getMessage();
                        jx3.f.INSTANCE.d(20821, appId, name, message != null ? r26.i0.u(message, ',', '.', false, 4, null) : null);
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebJsEngine", e17, "context setup inject script ".concat(str5), new java.lang.Object[0]);
                        throw e17;
                    }
                } catch (java.lang.Exception e18) {
                    clientReporter.a(new mu4.x());
                    java.lang.String message2 = e18.getMessage();
                    jx3.f.INSTANCE.d(20821, appId, name, message2 != null ? r26.i0.u(message2, ',', '.', false, 4, null) : null);
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebJsEngine", e18, "context setup dependencies ".concat(str5), new java.lang.Object[0]);
                    throw e18;
                }
            } catch (java.lang.Exception e19) {
                e = e19;
                h0Var = clientReporter;
                str2 = name;
                str4 = appId;
                str = "MicroMsg.WebJsEngine";
                str3 = str5;
                i18 = 20821;
                i17 = 0;
                h0Var.a(new mu4.z());
                com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "context setup jsapi " + str3, new java.lang.Object[i17]);
                java.lang.String message3 = e.getMessage();
                jx3.f.INSTANCE.d(i18, str4, str2, message3 != null ? r26.i0.u(message3, ',', '.', false, 4, null) : null);
                throw e;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            i17 = 0;
            i18 = 20821;
            str = "MicroMsg.WebJsEngine";
            h0Var = clientReporter;
            str2 = name;
            str3 = str5;
            str4 = appId;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.b, com.tencent.mm.plugin.appbrand.jsruntime.n, com.tencent.mm.plugin.appbrand.jsruntime.t
    public void destroy() {
        this.f331459w = true;
        super.destroy();
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(event, "event");
        if (kotlin.jvm.internal.o.b(eventType, "")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebJsEngine", "skip dispath");
            return;
        }
        evaluateJavascript("dispatchEvent('" + eventType + "', " + event + ')', valueCallback);
        if (r26.i0.y(eventType, "touch", false) || kotlin.jvm.internal.o.b(eventType, "scroll")) {
            return;
        }
        kotlin.jvm.internal.o.b(eventType, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.o0, com.tencent.mm.plugin.appbrand.jsruntime.b
    public cl.p u0(com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config) {
        ((et.o) ((mu4.e) i95.n0.c(mu4.e.class))).getClass();
        com.tencent.mm.plugin.appbrand.jsruntime.n0.b();
        if (iJSRuntime$Config == null) {
            iJSRuntime$Config = new com.tencent.mm.appbrand.v8.IJSRuntime$Config();
        }
        iJSRuntime$Config.f53953k = "WebPrefetcherJsEngine#";
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.e() + "webservice/codecache");
        if (!r6Var.m()) {
            r6Var.J();
        }
        iJSRuntime$Config.f53943a = r6Var.u();
        iJSRuntime$Config.f53946d = null;
        return super.u0(iJSRuntime$Config);
    }
}
