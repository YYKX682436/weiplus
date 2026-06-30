package xg4;

/* loaded from: classes7.dex */
public final class p extends hq0.i0 {
    public jc3.x A;
    public oe0.w B;
    public oe0.v C;
    public xg4.e D;
    public final jz5.g E;

    /* renamed from: x, reason: collision with root package name */
    public final xg4.p f454453x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Collection f454454y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f454455z;

    public p() {
        super(null, 1, null);
        this.f454453x = this;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.appbrand.service.f5 f5Var = (com.tencent.mm.plugin.appbrand.service.f5) c17;
        com.tencent.mm.plugin.magicbrush.d4 d4Var = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
        com.tencent.mm.plugin.appbrand.jsapi.k0 Vc = f5Var.Vc(764);
        kotlin.jvm.internal.o.e(Vc, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        this.f454454y = kz5.n0.t0(kz5.c0.i(new vg4.b(), new vg4.a(), new sg4.a(), new sg4.c(), new sg4.b(), new lq0.g(), ((com.tencent.mm.plugin.magicbrush.m5) d4Var).Ni((com.tencent.mm.plugin.appbrand.jsapi.f) Vc, "wxe208ce76dfa39515"), new wg4.a(), new ug4.a(), new ug4.b()), ((com.tencent.mm.plugin.magicbrush.f6) ((com.tencent.mm.plugin.magicbrush.f4) i95.n0.c(com.tencent.mm.plugin.magicbrush.f4.class))).Ni("MagicLiveCard"));
        java.lang.String name = mg4.d.class.getName();
        java.lang.String name2 = mg4.c.class.getName();
        java.lang.String name3 = vb1.v.class.getName();
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        new com.tencent.mm.plugin.appbrand.jsapi.eb();
        java.lang.String name4 = com.tencent.mm.plugin.appbrand.jsapi.eb.class.getName();
        ((op0.k) ((op0.i) i95.n0.c(op0.i.class))).getClass();
        new com.tencent.mm.plugin.appbrand.jsapi.o8();
        this.f454455z = kz5.p1.d(name, name2, name3, name4, com.tencent.mm.plugin.appbrand.jsapi.o8.class.getName(), f5Var.Vc(251).getClass().getName(), f5Var.Vc(969).getClass().getName(), f5Var.Vc(970).getClass().getName(), f5Var.Vc(984).getClass().getName(), f5Var.Vc(1065).getClass().getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.channels.r.CTRL_INDEX).getClass().getName(), com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.class.getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX).getClass().getName());
        this.E = jz5.h.b(new xg4.o(this));
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        java.util.Collection values;
        fq0.x xVar;
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer;
        java.util.Collection values2 = this.f283001p.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        hq0.e0 e0Var = (hq0.e0) kz5.n0.Y(values2);
        android.content.Context context = (e0Var == null || (concurrentHashMap = e0Var.f282985f) == null || (values = concurrentHashMap.values()) == null || (xVar = (fq0.x) kz5.n0.Y(values)) == null || (magicSclViewContainer = xVar.f265488l) == null) ? null : magicSclViewContainer.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            return activity;
        }
        ((com.tencent.mm.feature.performance.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
        java.lang.ref.WeakReference weakReference = com.tencent.mm.feature.performance.r2.f67652d;
        return weakReference != null ? (android.app.Activity) weakReference.get() : null;
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return new tp0.l();
    }

    public final jc3.x J1() {
        jc3.x xVar = this.A;
        if (xVar != null) {
            return xVar;
        }
        kotlin.jvm.internal.o.o("pkg");
        throw null;
    }

    public final void N1() {
        yg4.a aVar = yg4.a.f462328a;
        com.tencent.mars.xlog.Log.i("MagicLiveCardReporter", "resetReport");
        yg4.a.f462329b.clear();
        yg4.a.f462330c.clear();
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicLiveCard";
    }

    @Override // hq0.i0, jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.Q9(envId, msg);
        yg4.a aVar = yg4.a.f462328a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1740, yg4.a.f462331d);
        com.tencent.mm.autogen.mmdata.rpt.WACanvasJSExceptionReportStruct wACanvasJSExceptionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WACanvasJSExceptionReportStruct();
        wACanvasJSExceptionReportStruct.f61904e = wACanvasJSExceptionReportStruct.b("AppId", "wx2f3fb5db9f226462", true);
        wACanvasJSExceptionReportStruct.f61905f = 0L;
        wACanvasJSExceptionReportStruct.f61908i = wACanvasJSExceptionReportStruct.b("ErrorMessage", msg, true);
        wACanvasJSExceptionReportStruct.f61903d = 1L;
        com.tencent.mars.xlog.Log.i("MagicLiveCardReporter", "reportJsException report appId:" + wACanvasJSExceptionReportStruct.f61904e + " ErrMsg:" + wACanvasJSExceptionReportStruct.f61908i);
        wACanvasJSExceptionReportStruct.k();
    }

    @Override // hq0.i0
    public void X0() {
        super.X0();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        jc3.j0 j0Var = this.f282995g;
        kotlin.jvm.internal.o.d(j0Var);
        this.A = com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c17, ((rc3.w0) j0Var).f394087e, null, 2, null);
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        xg4.p bizContext = this.f454453x;
        kotlin.jvm.internal.o.g(bizContext, "bizContext");
        mBBuildConfig.f147834x = bizContext;
        mBBuildConfig.f147821h = z65.c.a();
        mBBuildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(0.01f);
        com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, this.f454455z);
        mBBuildConfig.a(this.f454454y);
        I1(mBBuildConfig);
        start();
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        super.b1();
        oe0.v vVar = this.C;
        if (vVar != null) {
            ((com.tencent.mm.plugin.finder.live.plugin.bj) vVar).a("dynamicCardServerLost", new org.json.JSONObject());
        }
        oe0.w wVar = this.B;
        if (wVar != null) {
            wVar.a("dynamicCardServerLost", new org.json.JSONObject());
        }
        if (this.D != null) {
            xg4.q[] qVarArr = xg4.q.f454456d;
            xg4.m mVar = xg4.m.f454446a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.MagicLiveCardMgr", "cleanUpService");
            xg4.p pVar = xg4.m.f454447b;
            if (pVar != null) {
                pVar.destroy();
            }
            xg4.m.f454447b = null;
        }
        yg4.a aVar = yg4.a.f462328a;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1740, yg4.a.f462332e);
        ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.E).getValue()).dead();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        r2 = yg4.a.f462328a;
        r0 = r0.f265478b;
        kotlin.jvm.internal.o.g(r0, "frameSetId");
        r7 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r7 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        r7 = r7.f265477a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (r7 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        r14 = yg4.a.f462329b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (r14.containsKey(r7) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r7.length() != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r8 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
    
        r16 = java.lang.System.currentTimeMillis();
        r8 = (java.lang.Long) r14.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        r8 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        r12 = r8.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r12 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        com.tencent.mars.xlog.Log.e("MagicLiveCardReporter", "markFirstFrameForScene startTime 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        r2.a(r7, 17, r12, r16 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (kotlin.jvm.internal.o.b(r7, "portrait_game_outfits") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a5, code lost:
    
        r4 = (java.lang.Long) r14.get("portrait_game_outfits_data_available");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (r4 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b0, code lost:
    
        r4 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        r12 = r4.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
    
        if (r12 == 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r2.a("portrait_game_outfits_data_available", 17, r12, r16 - r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        r4 = yg4.a.f462330c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        if (r4.containsKey(r0) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        if (r0.length() != 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d5, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        if (r7 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
    
        r7 = java.lang.System.currentTimeMillis();
        r4 = (java.lang.Long) r4.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ee, code lost:
    
        if (r4 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f0, code lost:
    
        r4 = 0L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f4, code lost:
    
        r12 = r4.longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
    
        if (r12 != 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fc, code lost:
    
        com.tencent.mars.xlog.Log.e("MagicLiveCardReporter", "markFrameSetFirstRender startTime 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0103, code lost:
    
        r14 = r7 - r12;
        r0 = ((fq0.z) ((gq0.r) i95.n0.c(gq0.r.class))).Ai(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0111, code lost:
    
        if (r0 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        r0 = r0.f265477a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:
    
        if (r0 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0118, code lost:
    
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        if (r9.length() <= 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0124, code lost:
    
        if (r4 == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0126, code lost:
    
        r2.a(r9, 3, r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0123, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011a, code lost:
    
        r9 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d7, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00da, code lost:
    
        com.tencent.mars.xlog.Log.i("MagicLiveCardReporter", "markFrameSetFirstRender no start or frameSetId null:".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0068, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
    
        com.tencent.mars.xlog.Log.e("MagicLiveCardReporter", "markFirstFrameForScene frameSetName:" + r7 + " has no start time");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0145, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return;
     */
    @Override // hq0.i0, jc3.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xg4.p.c(int, boolean):void");
    }

    @Override // hq0.i0
    public void destroy() {
        super.destroy();
        this.B = null;
        this.C = null;
        this.D = null;
        ((uz.e2) ((vz.p1) i95.n0.c(vz.p1.class))).getClass();
        vz.i1 i1Var = com.tencent.mm.plugin.downloader.model.k2.f97077a;
        if (i1Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) com.tencent.mm.plugin.downloader.event.c.f96909f).remove(i1Var);
        } else {
            com.tencent.mm.plugin.downloader.event.c cVar = com.tencent.mm.plugin.downloader.event.c.f96907d;
        }
        com.tencent.mm.plugin.downloader.model.k2.f97077a = null;
        N1();
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        ((ku5.t0) ku5.t0.f312615d).q(new xg4.n(this));
    }

    @Override // hq0.i0, jc3.u
    public void onCreated() {
        super.onCreated();
        ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.E).getValue()).alive();
    }

    @Override // hq0.i0, jc3.u
    public void onDestroy(int i17) {
        super.onDestroy(i17);
        ((com.tencent.mm.sdk.event.IListener) ((jz5.n) this.E).getValue()).dead();
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(info, "info");
        yg4.a.f462328a.b(frameSet.f265477a);
        if (frameSet.f265488l == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SurfaceApp.MagicLiveCardService", "sclView empty, addCustomView error");
        }
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = frameSet.f265488l;
        kotlin.jvm.internal.o.d(magicSclViewContainer);
        frameSet.f265492p = C0(magicSclViewContainer);
        super.s1(root, frameSet, info);
    }
}
