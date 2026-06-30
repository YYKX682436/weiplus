package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class f1 {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f187803k;

    /* renamed from: p, reason: collision with root package name */
    public static com.tencent.mm.plugin.webview.webcompt.i f187808p;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187811a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.webcompt.s1 f187812b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f187813c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f187814d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.webcompt.h0 f187797e = new com.tencent.mm.plugin.webview.webcompt.h0(null);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f187798f = jz5.h.b(com.tencent.mm.plugin.webview.webcompt.d0.f187778d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f187799g = jz5.h.b(com.tencent.mm.plugin.webview.webcompt.t.f187912d);

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f187800h = jz5.h.b(com.tencent.mm.plugin.webview.webcompt.c0.f187769d);

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f187801i = jz5.h.b(com.tencent.mm.plugin.webview.webcompt.g0.f187818d);

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f187802j = jz5.h.b(com.tencent.mm.plugin.webview.webcompt.e0.f187789d);

    /* renamed from: l, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f187804l = new com.tencent.mm.plugin.webview.webcompt.j(android.os.Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f187805m = jz5.h.b(com.tencent.mm.plugin.webview.webcompt.b0.f187764d);

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.String f187806n = "";

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.LinkedList f187807o = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public static final java.lang.String f187809q = lp0.b.D() + "webcompt_debug/";

    /* renamed from: r, reason: collision with root package name */
    public static final jz5.g f187810r = jz5.h.b(com.tencent.mm.plugin.webview.webcompt.n.f187863d);

    public f1(java.lang.ref.WeakReference weakJsapi) {
        kotlin.jvm.internal.o.g(weakJsapi, "weakJsapi");
        this.f187811a = weakJsapi;
        this.f187812b = new com.tencent.mm.plugin.webview.webcompt.s1();
        com.tencent.mm.plugin.webview.webcompt.e h17 = f187797e.h();
        h17.f187784a.clear();
        h17.f187785b.clear();
        this.f187814d = jz5.h.b(new com.tencent.mm.plugin.webview.webcompt.e1(this));
    }

    public static final void a(com.tencent.mm.plugin.webview.webcompt.f1 f1Var, o25.k2 k2Var, com.tencent.mm.plugin.webview.webcompt.j0 j0Var) {
        f1Var.getClass();
        k2Var.a(j0Var.f187833d + "_END", java.lang.System.currentTimeMillis());
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x017e, code lost:
    
        if (r7 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jz5.l b(com.tencent.mm.plugin.webview.webcompt.f1 r25, cl0.g r26, r45.d24 r27) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.webcompt.f1.b(com.tencent.mm.plugin.webview.webcompt.f1, cl0.g, r45.d24):jz5.l");
    }

    public static jz5.l j(java.lang.Object obj, com.tencent.mm.plugin.webview.webcompt.f1 f1Var, r45.d24 d24Var, java.lang.String str, int i17, com.tencent.mm.plugin.webview.webcompt.f fVar, com.tencent.mm.plugin.webview.webcompt.d dVar, int i18, java.lang.Object obj2) {
        jz5.l lVar;
        com.tencent.mm.plugin.webview.webcompt.f fVar2 = (i18 & 16) != 0 ? com.tencent.mm.plugin.webview.webcompt.f.f187791d : fVar;
        com.tencent.mm.plugin.webview.webcompt.d dVar2 = (i18 & 32) != 0 ? com.tencent.mm.plugin.webview.webcompt.d.f187772d : dVar;
        java.util.Objects.toString(obj);
        try {
            if (obj instanceof com.tencent.mm.vfs.r6) {
                lVar = new jz5.l(((com.tencent.mm.vfs.r6) obj).o(), com.tencent.mm.vfs.s6.b((com.tencent.mm.vfs.r6) obj, null, 1, null));
            } else if (obj instanceof java.net.URL) {
                java.lang.String obj3 = obj.toString();
                java.nio.charset.Charset charset = r26.c.f368865a;
                java.io.InputStream openStream = ((java.net.URL) obj).openStream();
                try {
                    kotlin.jvm.internal.o.d(openStream);
                    byte[] c17 = vz5.a.c(openStream);
                    vz5.b.a(openStream, null);
                    lVar = new jz5.l(obj3, new java.lang.String(c17, charset));
                    f1Var.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187748i);
                } finally {
                }
            } else {
                lVar = new jz5.l("", "");
            }
            f1Var.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.B);
            f187797e.h().f187785b.add(new com.tencent.mm.plugin.webview.webcompt.g(r26.i0.x((java.lang.String) lVar.f302833d, f187809q, "", false, 4, null), fVar2, dVar2));
            return lVar;
        } catch (java.lang.Exception e17) {
            if (obj instanceof java.net.URL) {
                f1Var.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187749m);
            }
            f1Var.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.C);
            f1Var.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187751o);
            java.lang.String name = d24Var.f372006d;
            kotlin.jvm.internal.o.f(name, "name");
            throw new com.tencent.mm.plugin.webview.webcompt.i0(i17, name, "load " + str + " fail:" + obj + ", " + e17);
        }
    }

    public final void c(com.tencent.mm.plugin.appbrand.jsruntime.r rVar, r45.d24 d24Var, long j17, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WeixinWebCompt.config({resume:");
        sb6.append(z17);
        sb6.append(", debug:");
        boolean z18 = false;
        if (com.tencent.mm.plugin.webview.webcompt.l1.a().f("debug")) {
            z18 = com.tencent.mm.plugin.webview.webcompt.l1.a().getBoolean("debug", false);
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        sb6.append(z18);
        sb6.append(", iframeUrlPattern:'");
        sb6.append((java.lang.String) ((jz5.n) f187799g).getValue());
        sb6.append("', configFinishTs:");
        sb6.append(j17);
        sb6.append(", bizReportId:");
        sb6.append(d24Var.f372011i);
        sb6.append(", options:");
        sb6.append(d24Var.f372012m);
        sb6.append("})");
        h(rVar, sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "WeixinWebCompt.config:" + d24Var.f372012m);
    }

    public final void d(java.lang.String appId, java.lang.String url, r45.d24 webCompt, o25.k2 performanceHelper, boolean z17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(webCompt, "webCompt");
        kotlin.jvm.internal.o.g(performanceHelper, "performanceHelper");
        l(performanceHelper, com.tencent.mm.plugin.webview.webcompt.j0.f187827e);
        this.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187756t);
        java.lang.String str = webCompt.f372006d;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "createJsContext " + str);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = com.tencent.mm.plugin.webview.webcompt.u0.f187935d;
        kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        int i17 = kotlinx.coroutines.r0.N0;
        kotlinx.coroutines.l.d(i2Var, p0Var.plus(new com.tencent.mm.plugin.webview.webcompt.n0(kotlinx.coroutines.q0.f310567d, this, h0Var)), null, new com.tencent.mm.plugin.webview.webcompt.t0(z17, this, performanceHelper, webCompt, str, appId, url, h0Var, null), 2, null);
    }

    public final void e(java.lang.String webCompt, java.lang.String event, java.lang.String str) {
        kotlin.jvm.internal.o.g(webCompt, "webCompt");
        kotlin.jvm.internal.o.g(event, "event");
        if (com.tencent.mm.sdk.platformtools.t8.K0(event)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebComponent", "dispatch event is null");
            return;
        }
        pm0.v.X(new com.tencent.mm.plugin.webview.webcompt.v0(this, webCompt, event, str));
        this.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.N);
    }

    public final com.tencent.mm.plugin.appbrand.jsruntime.r f(java.lang.String webCompt) {
        kotlin.jvm.internal.o.g(webCompt, "webCompt");
        com.tencent.mm.plugin.webview.webcompt.k0 k0Var = (com.tencent.mm.plugin.webview.webcompt.k0) k().get(webCompt);
        if (k0Var != null) {
            return k0Var.a();
        }
        return null;
    }

    public final void g(java.lang.String webCompt, java.lang.String errMsg, java.lang.String str, int i17, int i18) {
        java.lang.String str2;
        kotlin.jvm.internal.o.g(webCompt, "webCompt");
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mm.plugin.webview.webcompt.k0 k0Var = (com.tencent.mm.plugin.webview.webcompt.k0) k().get(webCompt);
        if (k0Var != null) {
            r45.i97 i97Var = new r45.i97();
            i97Var.f376854d = errMsg;
            i97Var.f376855e = str;
            i97Var.f376856f = i17;
            i97Var.f376857g = i18;
            nw4.n nVar = (nw4.n) this.f187811a.get();
            if (nVar == null || (str2 = nVar.f340888b) == null) {
                str2 = "";
            }
            i97Var.f376858h = str2;
            i97Var.f376859i = k0Var.f187845h;
            i97Var.f376860m = k0Var.f187844g;
            i97Var.f376861n = webCompt;
            i97Var.f376862o = ((java.lang.Number) ((jz5.n) f187797e.j().f187823b).getValue()).intValue();
            i97Var.f376863p = k0Var.f187847j;
            i97Var.f376864q = k0Var.f187848k;
            this.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.L);
            com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = i97Var;
            lVar.f70665b = new r45.j97();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/webcompt/reportjserr";
            lVar.f70667d = 2914;
            lVar.f70668e = 0;
            lVar.f70669f = 0;
            ((h80.i) xVar).wi(lVar.a(), new com.tencent.mm.plugin.webview.webcompt.w0(this));
        }
    }

    public final void h(com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str) {
        ((com.tencent.mm.plugin.appbrand.jsruntime.n) rVar).evaluateJavascript(str, null);
    }

    public final java.lang.Object i(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        oz5.n nVar = new oz5.n(pz5.f.b(continuation));
        this.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187760x);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebComponent", "start geta8key:" + str);
        com.tencent.mm.plugin.webview.permission.d dVar = new com.tencent.mm.plugin.webview.permission.d(null);
        nw4.n nVar2 = (nw4.n) this.f187811a.get();
        java.lang.String str3 = nVar2 != null ? (java.lang.String) nVar2.f340893g.get("srcUsername") : null;
        if (str3 == null) {
            str3 = "";
        }
        dVar.f183386f = str3;
        com.tencent.mm.plugin.webview.webcompt.a1 a1Var = new com.tencent.mm.plugin.webview.webcompt.a1(nVar, dVar, this, str2);
        synchronized (dVar) {
            synchronized (dVar) {
                dVar.t(str, false, -1, a1Var);
            }
            java.lang.Object a17 = nVar.a();
            pz5.a aVar = pz5.a.f359186d;
            return a17;
        }
        java.lang.Object a172 = nVar.a();
        pz5.a aVar2 = pz5.a.f359186d;
        return a172;
    }

    public final com.tencent.mm.plugin.webview.webcompt.l0 k() {
        return (com.tencent.mm.plugin.webview.webcompt.l0) ((jz5.n) this.f187814d).getValue();
    }

    public final void l(o25.k2 k2Var, com.tencent.mm.plugin.webview.webcompt.j0 j0Var) {
        k2Var.a(j0Var.f187833d + "_START", java.lang.System.currentTimeMillis());
    }

    public final java.lang.String m(com.tencent.mm.plugin.webview.webcompt.c cVar) {
        java.util.Map map = cVar.f187768c;
        nw4.n nVar = (nw4.n) this.f187811a.get();
        java.lang.String str = nVar != null ? nVar.f340888b : null;
        if (str == null) {
            str = "";
        }
        map.put("User-agent", str);
        java.lang.String gVar = new cl0.g(map).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{clientVersion:");
        java.lang.String CLIENT_VERSION = com.tencent.mm.sdk.platformtools.z.f193111g;
        kotlin.jvm.internal.o.f(CLIENT_VERSION, "CLIENT_VERSION");
        sb6.append(com.tencent.mm.plugin.webview.webcompt.a.c(CLIENT_VERSION));
        sb6.append(",headers:");
        sb6.append(gVar);
        sb6.append(",fullUrl:");
        sb6.append(com.tencent.mm.plugin.webview.webcompt.a.c(cVar.f187767b));
        sb6.append('}');
        return sb6.toString();
    }
}
