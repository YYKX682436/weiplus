package pa1;

/* loaded from: classes7.dex */
public class t extends ce.o implements pa1.a, h63.q1 {

    /* renamed from: x, reason: collision with root package name */
    public pa1.e f352967x;

    public t(com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        super(n7Var);
        this.f352967x = null;
    }

    @Override // ce.o, ce.d
    public void C(android.view.View view) {
        if (F() == null || ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime() == null || !com.tencent.mm.plugin.appbrand.dc.a(((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime())) {
            return;
        }
        super.C(view);
    }

    @Override // ce.o
    public com.tencent.magicbrush.ui.MagicBrushView P(android.content.Context context) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = new com.tencent.magicbrush.ui.MagicBrushView(context, new qa1.p(context));
        com.tencent.mm.plugin.appbrand.keylogger.w.f(H(), com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepCreateMagicBrushView, "", elapsedRealtime, android.os.SystemClock.elapsedRealtime());
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f279285d = this;
        return magicBrushView;
    }

    @Override // ce.o
    public void W() {
        G(pa1.a.class, this);
    }

    @Override // ce.o, com.tencent.mm.plugin.appbrand.page.d7
    public boolean j(java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        if (F() != null && ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime() != null) {
            com.tencent.mm.plugin.appbrand.o6 runtime = ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime();
            if (com.tencent.mm.plugin.appbrand.kf.a(runtime)) {
                java.lang.String str2 = runtime.f74803n;
                com.tencent.mm.plugin.appbrand.x0.a(str2, new com.tencent.mm.plugin.appbrand.hf(str2, runtime));
                if (runtime.u0().k()) {
                    ((com.tencent.mm.plugin.appbrand.page.n7) F()).l4();
                    k01.j jVar = k01.j.f303039a;
                    if (jVar.b(null, runtime.f74803n) && runtime.u0().C1 != null) {
                        ((com.tencent.mm.plugin.appbrand.page.n7) F()).h4((java.lang.String) jVar.a(runtime.u0().C1.f77204e, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME));
                    }
                }
            } else {
                al1.b r17 = ((com.tencent.mm.plugin.appbrand.page.n7) F()).r1();
                if (r17 != null) {
                    al1.h0 h0Var = al1.h0.PageConfig;
                    r17.l(true, h0Var);
                    if (k01.j.f303039a.b(null, runtime.f74803n)) {
                        r17.l(false, h0Var);
                    }
                }
            }
            runtime.H2.v((com.tencent.mm.plugin.appbrand.page.n7) F(), wdVar);
        }
        return true;
    }

    @Override // ce.o, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void k() {
        pa1.e eVar;
        if (com.tencent.mm.plugin.appbrand.x0.d(((com.tencent.mm.plugin.appbrand.page.n7) F()).getAppId()) == com.tencent.mm.plugin.appbrand.w0.CLOSE && (eVar = this.f352967x) != null) {
            r45.vd7 vd7Var = eVar.f352956a;
            if (vd7Var != null && vd7Var.f388138d) {
                new na1.d().x(((com.tencent.mm.plugin.appbrand.page.n7) F()).U1(), na1.c.BeforeBack, 0);
            }
        }
        super.k();
        if (H() != null) {
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            android.content.Context context = I();
            java.lang.String appId = H();
            int i17 = ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime().f74805p.f77281g;
            h63.v0 v0Var = (h63.v0) r1Var;
            v0Var.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(appId, "appId");
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "zbql:onAppbrandEnterBackGround");
            if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId, i17).booleanValue()) {
                java.lang.String str = com.tencent.mm.sdk.platformtools.w9.f193053a;
                com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352172h, appId, 0, null, 12, null), p60.q.class, null);
                ((i63.b0) i95.n0.c(i63.b0.class)).Bi();
                if (!v0Var.f279289h) {
                    com.tencent.mm.ipcinvoker.extension.l.a(str, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352180s, appId, 0, null, 12, null), p60.q.class, null);
                }
                ((p60.u) i95.n0.c(p60.u.class)).Ri(p60.j.f352164i);
            }
        }
    }

    @Override // ce.o, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void m() {
        java.lang.String appId = ((com.tencent.mm.plugin.appbrand.page.n7) F()).getAppId();
        com.tencent.mars.xlog.Log.i("MicroMsg.OnStartReportCanvasDataEvent", "stopListeningOperationEvent, appId:%s", appId);
        com.tencent.mm.plugin.appbrand.ipc.l0 l0Var = na1.d.f335951i;
        if (l0Var != null) {
            com.tencent.mm.plugin.appbrand.ipc.MMToClientEvent.F(appId, l0Var);
            na1.d.f335951i = null;
        }
        ((h63.v0) ((h63.r1) i95.n0.c(h63.r1.class))).f279285d = null;
        if (H() != null) {
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            I();
            java.lang.String appId2 = H();
            int i17 = ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime().f74805p.f77281g;
            h63.v0 v0Var = (h63.v0) r1Var;
            v0Var.getClass();
            kotlin.jvm.internal.o.g(appId2, "appId");
            if (((p60.u) i95.n0.c(p60.u.class)).Bi(appId2, i17).booleanValue()) {
                ((p60.u) i95.n0.c(p60.u.class)).Ri(p60.j.f352165m);
                v0Var.Ui();
            }
        }
        super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [com.tencent.mm.ipcinvoker.r] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    @Override // ce.o, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void n() {
        java.lang.String str;
        java.lang.Class cls;
        p60.u uVar;
        com.tencent.mm.plugin.gamelive.event.GameLiveAppbrandEventService$LiveStartInfoPayload gameLiveAppbrandEventService$LiveStartInfoPayload;
        boolean z17;
        java.lang.String str2;
        ?? r102;
        int i17;
        java.lang.Object obj;
        super.n();
        if (H() != null) {
            h63.r1 r1Var = (h63.r1) i95.n0.c(h63.r1.class);
            ze.n runtime = J();
            android.content.Context context = I();
            java.lang.String appId = H();
            int i18 = ((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime().f74805p.f77281g;
            h63.v0 v0Var = (h63.v0) r1Var;
            v0Var.getClass();
            kotlin.jvm.internal.o.g(runtime, "runtime");
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(appId, "appId");
            com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "zbql:onAppbrandEnterForeground");
            p60.u uVar2 = (p60.u) i95.n0.c(p60.u.class);
            com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) runtime;
            if (!uVar2.Bi(appId, i18).booleanValue()) {
                com.tencent.mm.plugin.appbrand.page.n7 N2 = o6Var.N2();
                ce.g gVar = N2 != null ? (ce.g) N2.B1(ce.g.class) : null;
                if (gVar != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new ce.v((ce.o) gVar));
                }
                j63.p pVar = v0Var.f279286e;
                if (pVar != null) {
                    pVar.f297901a = null;
                }
                v0Var.f279286e = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "zbql:onAppbrandEnterForeground not gameLiving,return");
                return;
            }
            v0Var.f279286e = new j63.p(o6Var);
            int i19 = h63.w.f279295b[uVar2.Ai().ordinal()];
            if (i19 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "state %s", uVar2.Ai().h());
                java.lang.String str3 = ((km0.c) gm0.j1.p().a()).f308987a;
                kotlin.jvm.internal.o.f(str3, "getProcessName(...)");
                com.tencent.mars.xlog.Log.i("MicroMsg.PluginGameLive", "zbql:setAppBrandPackageName,".concat(str3));
                com.tencent.mm.sdk.platformtools.o4 o4Var = p60.u.f352199g;
                o4Var.putString("appbrandPackageName", str3);
                p60.r rVar = p60.s.f352192e;
                int i27 = o4Var.getInt("gameLivePrepareScene", 0);
                rVar.getClass();
                int i28 = h63.w.f279294a[(i27 != 1 ? i27 != 2 ? p60.s.f352193f : p60.s.f352195h : p60.s.f352194g).ordinal()];
                if (i28 != 1) {
                    if (i28 != 2) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAppbrandProcessService", "preparing, the scene is wrong");
                        str2 = appId;
                    } else {
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        str2 = appId;
                        h63.h0 h0Var = new h63.h0(o6Var, context, str2, i18);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(h0Var, 300L, false);
                    }
                    gameLiveAppbrandEventService$LiveStartInfoPayload = null;
                    str = str2;
                    cls = p60.q.class;
                    uVar = uVar2;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "from gamestart");
                    h63.v[] vVarArr = h63.v.f279284d;
                    str = appId;
                    cls = p60.q.class;
                    uVar = uVar2;
                    com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest gameLiveAppbrandProcessService$EnterFinderLiveRequest = new com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveRequest(appId, i18, 1, 0, null, null, 0, 0L, 248, null);
                    h63.e0 e0Var = h63.e0.f279225a;
                    java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
                    gameLiveAppbrandEventService$LiveStartInfoPayload = null;
                    com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, gameLiveAppbrandProcessService$EnterFinderLiveRequest, e0Var, null);
                }
                com.tencent.mm.plugin.appbrand.menu.u[] uVarArr = com.tencent.mm.plugin.appbrand.menu.u.f85992d;
                com.tencent.mm.plugin.appbrand.menu.t[] tVarArr = com.tencent.mm.plugin.appbrand.menu.t.f85989d;
                z17 = false;
                v0Var.Di(2, 0, gameLiveAppbrandEventService$LiveStartInfoPayload);
                uVar.Ri(p60.j.f352163h);
                r102 = gameLiveAppbrandEventService$LiveStartInfoPayload;
            } else if (i19 == 2 || i19 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "state %s", uVar2.Ai().h());
                com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352179r, appId, 0, null, 12, null), p60.q.class, null);
                ((i63.b0) i95.n0.c(i63.b0.class)).Di();
                com.tencent.mm.plugin.appbrand.page.n7 N22 = o6Var.N2();
                ce.g gVar2 = N22 != null ? (ce.g) N22.B1(ce.g.class) : null;
                if (gVar2 != null) {
                    ((ku5.t0) ku5.t0.f312615d).B(new ce.v((ce.o) gVar2));
                }
                ((p60.u) i95.n0.c(p60.u.class)).getClass();
                com.tencent.mm.sdk.platformtools.o4 o4Var2 = p60.u.f352199g;
                if (o4Var2.getBoolean("isPushing", false)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "startPush: isPushing return");
                    i17 = 2;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandProcessService", "startPush");
                    ((p60.u) i95.n0.c(p60.u.class)).getClass();
                    o4Var2.putBoolean("isPushing", true);
                    i63.b0 b0Var = (i63.b0) i95.n0.c(i63.b0.class);
                    b0Var.stop();
                    b0Var.f288988x = kk.k.g(java.lang.String.format(java.util.Locale.US, "%s%d", "MicroMsgGameLiveAudio", java.lang.Integer.valueOf(o6Var.u0().f47279x0)).getBytes());
                    i17 = 2;
                    b0Var.f288971d = ((ku5.t0) ku5.t0.f312615d).o(java.lang.String.format("gamelive_audio_mix_%s", b0Var.f288988x), 2, 2, new java.util.concurrent.LinkedBlockingQueue());
                    fa1.s sVar = (fa1.s) o6Var.C0().z1(fa1.s.class);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAppbrandAudioMgrService", "start appbrand audio %s %s", sVar, b0Var.f288988x);
                    b0Var.f288987w = new java.lang.ref.WeakReference(sVar);
                    b0Var.f288983s = false;
                    b0Var.f288971d.execute(new i63.v(b0Var));
                    b0Var.f288971d.execute(new i63.w(b0Var));
                    if (((java.lang.Boolean) ((jz5.n) ((p60.u) i95.n0.c(p60.u.class)).f352200d).getValue()).booleanValue()) {
                        try {
                            b0Var.f288979o = com.tencent.mm.vfs.w6.K("/sdcard/pcm/mix.pcm", false);
                        } catch (java.io.FileNotFoundException unused) {
                        }
                    }
                    b0Var.f288977m.b(44100, (short) 2);
                    b0Var.f288982r = b0Var.f288980p.getStreamVolume(3);
                    com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver().registerContentObserver(android.provider.Settings.System.CONTENT_URI, true, b0Var.f288985u);
                    if (!b0Var.Ai()) {
                        ((com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver) b0Var.f288989y).b(com.tencent.mm.sdk.platformtools.x2.f193071a, b0Var);
                    }
                    ((k63.s) i95.n0.c(k63.s.class)).getClass();
                    com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352170f, null, 0, null, 14, null), p60.q.class, new h63.r0(v0Var));
                }
                if (uVar2.Ai() == p60.j.f352165m) {
                    java.lang.String str4 = ((km0.c) gm0.j1.p().a()).f308987a;
                    kotlin.jvm.internal.o.f(str4, "getProcessName(...)");
                    com.tencent.mars.xlog.Log.i("MicroMsg.PluginGameLive", "zbql:setAppBrandPackageName,".concat(str4));
                    p60.u.f352199g.putString("appbrandPackageName", str4);
                    com.tencent.mm.plugin.appbrand.menu.u[] uVarArr2 = com.tencent.mm.plugin.appbrand.menu.u.f85992d;
                    com.tencent.mm.plugin.appbrand.menu.t[] tVarArr2 = com.tencent.mm.plugin.appbrand.menu.t.f85989d;
                    obj = null;
                    v0Var.Di(i17, 0, null);
                    v0Var.Di(1, 0, null);
                } else {
                    obj = null;
                }
                uVar2.Ri(p60.j.f352163h);
                r102 = obj;
                cls = p60.q.class;
                str = appId;
                z17 = false;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAppbrandProcessService", "gameLiving onAppbrandEnterForeground,but state is wrong,state:%s", uVar2.Ai().h());
                cls = p60.q.class;
                str = appId;
                z17 = false;
                r102 = 0;
            }
            v0Var.f279287f = z17;
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.gamelive.GameLiveCommonService$IPCLiveControlData(p60.l.f352173i, str, 0, null, 12, null), cls, r102);
            v0Var.f279289h = z17;
        }
    }

    @Override // ce.o, com.tencent.mm.plugin.appbrand.page.d7
    public void o(al1.b bVar) {
        if (!com.tencent.mm.plugin.appbrand.kf.a(((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime())) {
            super.o(bVar);
            return;
        }
        bVar.setFullscreenMode(false);
        bVar.setBackgroundAlpha(0.0d);
        bVar.setForegroundColor(-1);
        bVar.setMainTitle(J().u0().f77279e);
    }

    @Override // ce.o, re.a, com.tencent.mm.plugin.appbrand.page.d7
    public void v() {
        super.v();
        if (com.tencent.mm.plugin.appbrand.kf.a(((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime())) {
            ((ni1.j) r(ni1.j.class)).d();
        }
        if (F() == null || !n91.t.b(((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime())) {
            return;
        }
        G(ni1.j.class, new n91.m((com.tencent.mm.plugin.appbrand.page.v5) F()));
    }

    @Override // ce.o, com.tencent.mm.plugin.appbrand.page.d7
    public void z(android.view.View view) {
        super.z(view);
        if (com.tencent.mm.plugin.appbrand.kf.a(((com.tencent.mm.plugin.appbrand.page.n7) F()).getRuntime())) {
            android.view.View view2 = new android.view.View(I());
            view2.setBackgroundResource(com.tencent.mm.R.color.f478512u);
            com.tencent.luggage.game.page.WAGamePageViewContainerLayout wAGamePageViewContainerLayout = this.f40685f;
            wAGamePageViewContainerLayout.addView(view2, wAGamePageViewContainerLayout.indexOfChild(this.f40688i), new android.widget.FrameLayout.LayoutParams(-1, -1));
            android.view.View view3 = new android.view.View(I());
            view3.setBackgroundDrawable(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Integer.MIN_VALUE, 0}));
            int h17 = com.tencent.mm.ui.bl.h(I()) + i65.a.f(I(), com.tencent.mm.R.dimen.f480022lv);
            this.f40685f.addView(view3, new android.widget.FrameLayout.LayoutParams(-1, h17));
            ae.q qVar = (ae.q) ((com.tencent.mm.plugin.appbrand.page.n7) F()).U1().z1(ae.q.class);
            if (qVar != null) {
                yd.u F0 = ((ae.a) qVar).F0();
                if (F0.f460967c != null && F0.f460967c.f460939a != null) {
                    yd.d0 d0Var = F0.f460967c.f460939a;
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) d0Var.getLayoutParams();
                    layoutParams.topMargin = h17;
                    layoutParams.bottomMargin = 52;
                    d0Var.setLayoutParams(layoutParams);
                }
            }
            ((com.tencent.mm.plugin.appbrand.page.n7) F()).C1().d(new pa1.s(this));
        }
    }
}
