package g05;

@j95.b
/* loaded from: classes7.dex */
public final class r extends i95.w implements g05.i, gq0.v, jc3.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f267484d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f267485e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f267486f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f267487g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f267488h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f267489i;

    /* renamed from: m, reason: collision with root package name */
    public iq0.c f267490m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f267491n;

    public r() {
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.appbrand.service.f5 f5Var = (com.tencent.mm.plugin.appbrand.service.f5) c17;
        com.tencent.mm.plugin.magicbrush.d4 d4Var = (com.tencent.mm.plugin.magicbrush.d4) i95.n0.c(com.tencent.mm.plugin.magicbrush.d4.class);
        com.tencent.mm.plugin.appbrand.jsapi.k0 Vc = f5Var.Vc(764);
        kotlin.jvm.internal.o.e(Vc, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        this.f267484d = kz5.c0.k(((com.tencent.mm.plugin.magicbrush.m5) d4Var).Ni((com.tencent.mm.plugin.appbrand.jsapi.f) Vc, "MagicWxGameDynamicCard"));
        ((op0.k) ((op0.i) i95.n0.c(op0.i.class))).getClass();
        new com.tencent.mm.plugin.appbrand.jsapi.o8();
        java.lang.String name = com.tencent.mm.plugin.appbrand.jsapi.o8.class.getName();
        ((et.o) ((ft.b4) i95.n0.c(ft.b4.class))).getClass();
        new com.tencent.mm.plugin.appbrand.jsapi.eb();
        this.f267485e = kz5.p1.d(name, com.tencent.mm.plugin.appbrand.jsapi.eb.class.getName(), f5Var.Vc(251).getClass().getName(), f5Var.Vc(969).getClass().getName(), f5Var.Vc(970).getClass().getName(), f5Var.Vc(984).getClass().getName(), f5Var.Vc(1065).getClass().getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.channels.r.CTRL_INDEX).getClass().getName(), com.tencent.mm.plugin.appbrand.jsapi.appdownload.g0.class.getName(), f5Var.Vc(com.tencent.mm.plugin.appbrand.jsapi.appdownload.m0.CTRL_INDEX).getClass().getName());
        this.f267486f = jz5.h.b(g05.l.f267478d);
        this.f267487g = jz5.h.b(g05.q.f267483d);
        this.f267489i = true;
        this.f267491n = jz5.h.b(g05.m.f267479d);
    }

    public boolean Ai(java.lang.String bizName, java.lang.String str) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        if (str == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "checkPkgVersion, minPkgversion is null");
            return false;
        }
        i95.m c17 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f267490m = gq0.t.de((gq0.t) c17, new g05.n(this), null, 2, null);
        java.lang.String Ni = ((nq0.p) ((gq0.t) i95.n0.c(gq0.t.class))).Ni(Di());
        if (r26.n0.N(Ni)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "pkgConfig is null");
            return false;
        }
        try {
            java.lang.String optString = new org.json.JSONObject(Ni).optString("version", "");
            java.lang.String optString2 = new org.json.JSONObject(Ni).optString("requiredMinLibVersion", "");
            java.lang.String bj6 = ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj("MagicSclPublicService");
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "bizname: " + bizName + ", pkgVersion#" + optString + ", minPkgVersion#" + str + ", requiredMinLibVersion:" + optString2 + ", sclVersion:" + bj6);
            if (optString.compareTo(str) >= 0) {
                kotlin.jvm.internal.o.d(optString2);
                if (bj6.compareTo(optString2) >= 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "bizname: " + bizName + ", pkgversion success");
                    return true;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "bizname: " + bizName + ", pkgversion failed");
        } catch (java.lang.Throwable unused) {
        }
        return false;
    }

    public void Bi() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "createBiz and active");
        i95.m c17 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f267490m = gq0.t.de((gq0.t) c17, new g05.n(this), null, 2, null);
        iq0.c Di = Di();
        if (Di != null) {
            i95.m c18 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            gq0.t.bh((gq0.t) c18, Di, null, 2, null);
        }
    }

    public final iq0.c Di() {
        iq0.c cVar = this.f267490m;
        if (cVar != null) {
            return cVar;
        }
        i95.m c17 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return gq0.t.de((gq0.t) c17, new g05.n(this), null, 2, null);
    }

    public final void Ni(java.lang.String str, java.lang.String str2, android.graphics.Rect rect, hq0.m0 m0Var) {
        i95.m c17 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        this.f267490m = gq0.t.de((gq0.t) c17, new g05.n(this), null, 2, null);
        i95.m c18 = i95.n0.c(gq0.t.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        gq0.t.Qh((gq0.t) c18, Di(), null, str, str2, new android.graphics.Rect(0, 0, wi(), 0), hq0.m0.f283032d, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        if (((com.tencent.mm.ui.chatting.component.k) r0).f199324g == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Ri() {
        /*
            r3 = this;
            java.lang.String r0 = "onExitChattingRoom"
            java.lang.String r1 = "MicroMsg.MagicWxGameDynamicCardServiceFeatureService"
            com.tencent.mars.xlog.Log.i(r1, r0)
            iq0.c r0 = r3.Di()
            if (r0 == 0) goto L1a
            java.lang.Class<gq0.t> r2 = gq0.t.class
            i95.m r2 = i95.n0.c(r2)
            gq0.t r2 = (gq0.t) r2
            nq0.p r2 = (nq0.p) r2
            r2.Di(r0)
        L1a:
            r3.Zi()
            java.lang.ref.WeakReference r0 = r3.f267488h
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r0.get()
            g05.j r0 = (g05.j) r0
            if (r0 == 0) goto L2e
            com.tencent.mm.ui.chatting.component.k r0 = (com.tencent.mm.ui.chatting.component.k) r0
            r0.n0()
        L2e:
            java.lang.ref.WeakReference r0 = r3.f267488h
            if (r0 == 0) goto L42
            java.lang.Object r0 = r0.get()
            g05.j r0 = (g05.j) r0
            if (r0 == 0) goto L42
            com.tencent.mm.ui.chatting.component.k r0 = (com.tencent.mm.ui.chatting.component.k) r0
            boolean r0 = r0.f199324g
            r2 = 1
            if (r0 != r2) goto L42
            goto L43
        L42:
            r2 = 0
        L43:
            if (r2 == 0) goto L4a
            java.lang.String r0 = "destroyBiz, ignore, isInGameChattingRoom"
            com.tencent.mars.xlog.Log.w(r1, r0)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g05.r.Ri():void");
    }

    @Override // gq0.v
    public void S3(java.lang.String frameSetId) {
        g05.j jVar;
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "notifyFrameSetRemove,frameSetId:" + frameSetId + ", isBizConnect:" + this.f267489i);
        java.lang.String b17 = vq0.a.b(frameSetId);
        java.lang.ref.WeakReference weakReference = this.f267488h;
        if (weakReference == null || (jVar = (g05.j) weakReference.get()) == null) {
            return;
        }
        boolean z17 = this.f267489i;
        com.tencent.mm.ui.chatting.component.k kVar = (com.tencent.mm.ui.chatting.component.k) jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "markview update framesetname:".concat(b17));
        com.tencent.mm.ui.chatting.viewitems.g0 g0Var = (com.tencent.mm.ui.chatting.viewitems.g0) kVar.f199323f.get(b17);
        if (g0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "framesetname:" + b17 + " holder is null");
            return;
        }
        kVar.p0(g0Var, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgWxGameDynamicCardComponent", "markview update isForeGround:" + kVar.f199324g + ", refresh:true");
        if (kVar.f199324g && z17) {
            kVar.f198580d.h().a(hd5.n.ACTION_UPDATE, false, new android.os.Bundle());
        }
    }

    public void Ui() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "onMainSessionExposed, preloadCountWhenMainSessionExposed: " + ((java.lang.Number) ((jz5.n) this.f267487g).getValue()).intValue());
        ku5.u0 u0Var = ku5.t0.f312615d;
        g05.p pVar = new g05.p(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(pVar, 500L, false);
    }

    public void Vi(java.lang.String str, java.lang.String str2) {
        if (str == null || str2 == null) {
            return;
        }
        Ni(str, str2, new android.graphics.Rect(0, 0, wi(), 0), hq0.m0.f283032d);
    }

    public void Zi() {
        iq0.c Di = Di();
        if (Di != null) {
            i95.m c17 = i95.n0.c(gq0.t.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            gq0.t.gj((gq0.t) c17, Di, null, 2, null);
        }
    }

    @Override // jc3.l0
    public void b1() {
        this.f267489i = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "notifyConnException");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    @Override // qp0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ca(java.lang.String r13, java.util.HashMap r14, yz5.q r15) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g05.r.ca(java.lang.String, java.util.HashMap, yz5.q):void");
    }

    @Override // jc3.l0
    public void d0(boolean z17) {
        g05.j jVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "notifyRecreateBiz");
        this.f267489i = true;
        java.lang.ref.WeakReference weakReference = this.f267488h;
        if (weakReference == null || (jVar = (g05.j) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.ui.chatting.component.k) jVar).n0();
    }

    @Override // gq0.v
    public void og(org.json.JSONObject data, yz5.l callback) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        callback.invoke(null);
    }

    @Override // jc3.l0
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicWxGameDynamicCardServiceFeatureService", "notifyDestroyBiz");
        this.f267490m = null;
    }

    public final int wi() {
        float dimension = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479866hf);
        bf3.x0 x0Var = bf3.x0.f19674a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.graphics.Point a17 = x0Var.a(context);
        return a06.d.b(java.lang.Math.min(a17.x, a17.y) - (dimension * 2));
    }

    @Override // gq0.v
    public jc3.m xc(java.lang.String containerTag) {
        kotlin.jvm.internal.o.g(containerTag, "containerTag");
        return null;
    }
}
