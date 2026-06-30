package com.tencent.mm.plugin.finder.live.viewmodel.component;

/* loaded from: classes3.dex */
public class FinderLiveVisitorUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f116999d;

    /* renamed from: e, reason: collision with root package name */
    public int f117000e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f117001f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f117002g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f117003h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f117004i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f117005m;

    /* renamed from: n, reason: collision with root package name */
    public vd2.v2 f117006n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.FinderLiveViewCallback f117007o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.c8 f117008p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f117009q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f117010r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f117011s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC$sliderBarExtranceExposeListener$1 f117012t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.Runnable f117013u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f117014v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC$sliderBarExtranceExposeListener$1] */
    public FinderLiveVisitorUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f117011s = jz5.h.b(new im2.c7(this));
        final androidx.appcompat.app.AppCompatActivity activity = getActivity();
        this.f117012t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveSliderBarEntranceExposeEvent>(activity) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC$sliderBarExtranceExposeListener$1
            {
                this.__eventId = 1622392144;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveSliderBarEntranceExposeEvent finderLiveSliderBarEntranceExposeEvent) {
                com.tencent.mm.autogen.events.FinderLiveSliderBarEntranceExposeEvent event = finderLiveSliderBarEntranceExposeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dk2.ef.f233372a.i0(event.f54292g.f8275a);
                return true;
            }
        };
    }

    public final void O6(java.lang.String str) {
        km2.t c17;
        gk2.e a17;
        km2.n nVar = dk2.ef.H;
        java.util.LinkedList linkedList = (nVar == null || (c17 = nVar.c()) == null || (a17 = c17.a()) == null) ? null : ((mm2.c1) a17.a(mm2.c1.class)).f328907w6;
        if (linkedList != null) {
            r45.qa4 qa4Var = new r45.qa4();
            qa4Var.set(0, str);
            qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            linkedList.add(qa4Var);
        }
    }

    public final boolean P6() {
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", true);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "backAndDismissMiniWindow:  leaveByBack=" + this.f117004i + " swipeBack=" + this.f117010r + " backNeedMiniWindow=" + booleanExtra);
        return (this.f117004i || this.f117010r) && !booleanExtra;
    }

    public final ok2.a Q6() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f117007o;
        if (finderLiveViewCallback == null || (finderLiveVisitorPluginLayout = finderLiveViewCallback.f111495t.f436054e) == null) {
            return null;
        }
        return finderLiveVisitorPluginLayout.getIFinderLiveCommonAdapter();
    }

    public final android.view.Window R6() {
        return (android.view.Window) ((jz5.n) this.f117011s).getValue();
    }

    public final void S6(int i17, int i18) {
        java.util.Map l17 = kz5.c1.l(new jz5.l("live_share_type", java.lang.Integer.valueOf(i17)), new jz5.l("live_share_type_count", java.lang.Integer.valueOf(i18)));
        l17.putAll(um2.x5.f429020x1.a());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("finder_live_room_share_event", null, l17, 25561);
    }

    public final void T6() {
        dk2.ef efVar = dk2.ef.f233372a;
        boolean z17 = false;
        if (!dk2.ef.f233384g) {
            gk2.e eVar = gk2.e.f272471n;
            if (eVar != null && ((mm2.f6) eVar.a(mm2.f6.class)).B) {
                z17 = true;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "tryHideFloatBallWhenEnterPage current shoppingInMiniProgram");
            return;
        }
        com.tencent.mm.plugin.finder.live.view.c8.f116229v = toString();
        com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f117008p;
        if (c8Var != null) {
            c8Var.p0();
        }
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.k0();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "tryHideFloatBallWhenEnterPage hideFloatBall");
    }

    public final void U6() {
        gp1.v Bi;
        if (!com.tencent.mm.sdk.platformtools.t8.D0(toString(), com.tencent.mm.plugin.finder.live.view.c8.f116229v)) {
            ml2.m5.f327718a.e();
            return;
        }
        gk2.e eVar = gk2.e.f272471n;
        mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
        if (c1Var == null || c1Var.O1) {
            com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f117008p;
            if (c8Var != null) {
                c8Var.t0(false);
            }
        } else {
            com.tencent.mm.plugin.finder.live.view.c8 c8Var2 = this.f117008p;
            if (c8Var2 != null) {
                c8Var2.t0(true);
            }
            ml2.m5.f327718a.e();
        }
        dk2.ef efVar = dk2.ef.f233372a;
        if (dk2.ef.f233375b0 && (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) != null) {
            Bi.r0();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "tryShowFloatBallWhenExitPage resumeFloatBall, gainFocus: " + dk2.ef.f233375b0);
    }

    public final void V6() {
        r45.nw1 nw1Var;
        km2.m data;
        com.tencent.mm.live.api.LiveConfig liveConfig;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "uninitBusiness");
        this.f117003h = true;
        jz5.f0 f0Var = null;
        if (P6()) {
            gk2.e eVar = gk2.e.f272471n;
            mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
            if (c1Var != null) {
                c1Var.O1 = false;
            }
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.e4 e4Var = ml2.e4.f327378g;
            r0Var.Qk(e4Var);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.Ck((ml2.r0) c17, getContext(), e4Var, null, false, null, 28, null);
            fo0.c cVar = fo0.c.f264798a;
            ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d.f93050h = null;
        }
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f117007o;
        if (finderLiveViewCallback != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onUninit " + finderLiveViewCallback);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ViewManagerRelease:");
            vd2.z4 z4Var = finderLiveViewCallback.f111495t;
            sb6.append(z4Var.f436054e);
            sb6.append(" it.isManualClosed: ");
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = z4Var.f436054e;
            sb6.append(finderLiveVisitorPluginLayout != null ? java.lang.Boolean.valueOf(finderLiveVisitorPluginLayout.isManualClosed()) : null);
            sb6.append(" liveId: ");
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout2 = z4Var.f436054e;
            sb6.append((finderLiveVisitorPluginLayout2 == null || (data = finderLiveVisitorPluginLayout2.getData()) == null || (liveConfig = data.f309129d) == null) ? null : java.lang.Long.valueOf(liveConfig.f68537e));
            sb6.append(" activityFinish: ");
            android.app.Activity activity = z4Var.f436050a;
            sb6.append(activity.isFinishing());
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = z4Var.f436052c;
            com.tencent.mars.xlog.Log.i(str, sb7);
            z4Var.f436053d = true;
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout3 = z4Var.f436054e;
            if (finderLiveVisitorPluginLayout3 != null) {
                finderLiveVisitorPluginLayout3.checkMiniWindow();
                finderLiveVisitorPluginLayout3.unMount();
                if (finderLiveVisitorPluginLayout3.isManualClosed()) {
                    co0.b.f43709e2.a();
                } else {
                    gk2.e eVar2 = dk2.ef.I;
                    long j17 = (eVar2 == null || (nw1Var = ((mm2.e1) eVar2.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
                    com.tencent.mars.xlog.Log.i(str, "ViewManagerRelease curService bind liveId: " + j17);
                    co0.b.f43709e2.e(j17);
                }
                f0Var = jz5.f0.f302826a;
            }
            if (f0Var == null && activity.isFinishing()) {
                co0.b.f43709e2.a();
            }
        }
        ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
        xg4.m.f454446a.b();
    }

    public final void W6() {
        boolean z17;
        kn0.p pVar;
        kn0.p pVar2;
        r45.nw1 nw1Var;
        if (this.f117014v) {
            return;
        }
        V6();
        this.f117014v = true;
        gk2.e eVar = gk2.e.f272471n;
        long j17 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
        gk2.e eVar2 = gk2.e.f272471n;
        boolean z18 = eVar2 != null ? ((mm2.c1) eVar2.a(mm2.c1.class)).f328911x2 : false;
        co0.b c17 = co0.b.f43709e2.c(j17);
        boolean f17 = (c17 == null || (pVar2 = c17.D) == null) ? false : pVar2.f();
        boolean k17 = (c17 == null || (pVar = c17.D) == null) ? false : pVar.k();
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(getContext()) && !f17 && !k17 && !z18) {
            java.util.Set<java.util.Map.Entry> entrySet = co0.b.f43710f2.entrySet();
            kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
            boolean z19 = false;
            for (java.util.Map.Entry entry : entrySet) {
                if (((co0.b) entry.getValue()).R1.h()) {
                    ((co0.b) entry.getValue()).T0(false);
                    ((co0.b) entry.getValue()).m0();
                    z19 = true;
                }
            }
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorPlayCore", "checkPlayerLeak " + z19);
            if (z19) {
                z17 = false;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onDestroy " + this + " playerLeakAssert:" + z17);
                pm0.z.b(xy2.b.f458155b, "liveCdnPlayerLeak", z17, null, null, false, false, new im2.u6(j17), 60, null);
            }
        }
        z17 = true;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onDestroy " + this + " playerLeakAssert:" + z17);
        pm0.z.b(xy2.b.f458155b, "liveCdnPlayerLeak", z17, null, null, false, false, new im2.u6(j17), 60, null);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.b1f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x013c, code lost:
    
        if ((r15 != null ? r15.getPlayer().isPlaying() : false) == true) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(int r13, int r14, android.content.Intent r15) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f117007o;
        if (finderLiveViewCallback != null) {
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = finderLiveViewCallback.f111495t.f436054e;
            r2 = finderLiveVisitorPluginLayout != null ? finderLiveVisitorPluginLayout.onBackPress() : false;
            if (!r2) {
                finderLiveViewCallback.f111498w = true;
            }
        }
        if (!r2) {
            this.f117004i = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onBackPressed " + this + ", ret:" + r2 + ", leaveByBack:" + this.f117004i);
        return r2;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        super.onBeforeFinish(intent);
        if (this.f117001f) {
            V6();
        } else {
            this.f117013u = new im2.w6(this);
        }
        this.f117002g = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onConfigurationChanged orientation:" + newConfig.orientation);
        super.onConfigurationChanged(newConfig);
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f117007o;
        if (finderLiveViewCallback == null || (finderLiveVisitorPluginLayout = finderLiveViewCallback.f111495t.f436054e) == null) {
            return;
        }
        finderLiveVisitorPluginLayout.onConfigurationChanged(newConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0756  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0745 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04d2  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r43) {
        /*
            Method dump skipped, instructions count: 1971
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorUIC.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        O6("onDestroy");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onDestroy " + this + ' ' + this.f117002g + ' ' + this.f117001f);
        if (!this.f117002g || !this.f117001f) {
            W6();
        }
        vd2.v2 v2Var = this.f117006n;
        if (v2Var != null) {
            v2Var.onDetach();
        }
        com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f117008p;
        if (c8Var != null) {
            c8Var.o0();
        }
        ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).wi();
        dk2.ef.f233372a.i0(false);
        dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        super.onNewIntent(intent);
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f117007o;
        if (finderLiveViewCallback == null || (finderLiveVisitorPluginLayout = finderLiveViewCallback.f111495t.f436054e) == null) {
            return;
        }
        finderLiveVisitorPluginLayout.onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onPause " + this + ", " + this.f117013u);
        super.onPause();
        O6("onPause");
        this.f117001f = true;
        com.tencent.mm.ui.tools.f5 f5Var = this.f117005m;
        if (f5Var != null) {
            f5Var.d();
        }
        com.tencent.mm.ui.tools.f5 f5Var2 = this.f117005m;
        if (f5Var2 != null) {
            f5Var2.f210400e = null;
        }
        this.f117005m = null;
        java.lang.Runnable runnable = this.f117013u;
        if (runnable != null) {
            runnable.run();
        }
        this.f117013u = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout;
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f117007o;
        if (finderLiveViewCallback == null || (finderLiveVisitorPluginLayout = finderLiveViewCallback.f111495t.f436054e) == null) {
            return;
        }
        finderLiveVisitorPluginLayout.onRequestPermissionsResult(i17, permissions, grantResults);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        dk2.x4 x4Var;
        r45.nw1 nw1Var;
        super.onRestoreInstanceState(bundle);
        dk2.w4 w4Var = dk2.x4.C;
        boolean z17 = false;
        if (bundle == null) {
            x4Var = null;
        } else {
            java.lang.String string = bundle.getString("KEY_PARAMS_CONFIG_KEY");
            if (string == null) {
                string = "";
            }
            com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderLiveBundle", "getFromBundle " + bundle.hashCode() + ", key:" + string, new java.lang.Object[0]);
            x4Var = (dk2.x4) dk2.x4.D.get(string);
        }
        dk2.x4 a17 = w4Var.a(getIntent());
        gk2.e eVar = gk2.e.f272471n;
        long j17 = (eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle] onRestoreInstanceState " + this + " configProvider:" + a17 + " restoreConfigProvider:" + x4Var + " curLiveId:" + j17);
        if (a17 == null && j17 == 0 && x4Var != null) {
            com.tencent.mm.live.api.LiveConfig d17 = x4Var.d();
            if (d17 != null && d17.f68537e == 0) {
                z17 = true;
            }
            if (z17) {
                return;
            }
            dk2.ef efVar = dk2.ef.f233372a;
            km2.n nVar = new km2.n();
            nVar.g(x4Var);
            efVar.g0(nVar);
            this.f117006n = new vd2.v2(getContext());
            android.view.View findViewById = getRootView().findViewById(com.tencent.mm.R.id.fkh);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) findViewById;
            android.view.View findViewById2 = getRootView().findViewById(com.tencent.mm.R.id.evz);
            kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = new com.tencent.mm.plugin.finder.live.FinderLiveViewCallback(refreshLoadMoreLayout, findViewById2, (com.tencent.mm.ui.MMActivity) activity, getFragment(), this.f117006n, false, false, 64, null);
            vd2.v2 v2Var = this.f117006n;
            if (v2Var != null) {
                v2Var.m(finderLiveViewCallback);
            }
            this.f117007o = finderLiveViewCallback;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        android.view.View decorView;
        km2.t c17;
        com.tencent.mm.live.api.LiveConfig b17;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onResume " + this + ',');
        ml2.b1 b1Var = ml2.b1.f327211a;
        java.lang.String valueOf = java.lang.String.valueOf(getContext().hashCode());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b18 = b52.b.b();
        if (b18 == null) {
            b18 = "";
        }
        java.lang.String str = b18;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        dk2.ef efVar = dk2.ef.f233372a;
        km2.n nVar = dk2.ef.H;
        jSONObject.put("liveid", pm0.v.u((nVar == null || (c17 = nVar.c()) == null || (b17 = c17.b()) == null) ? 0L : b17.f68537e));
        b1Var.b(new ml2.a1(valueOf, "65", "65", str, jSONObject));
        O6("onResume");
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.Window window = context.getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new im2.b7(this));
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "initBusiness");
        com.tencent.mm.plugin.finder.live.FinderLiveViewCallback finderLiveViewCallback = this.f117007o;
        if (finderLiveViewCallback != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveViewCallback", "[LiveLifecycle]onInit " + finderLiveViewCallback);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LiveLifecycle] onSaveInstanceState ");
        sb6.append(this);
        sb6.append(" curData:");
        gk2.e eVar = gk2.e.f272471n;
        sb6.append(eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", sb6.toString());
        gk2.e eVar2 = gk2.e.f272471n;
        if (eVar2 != null) {
            mm2.e1 e1Var = (mm2.e1) eVar2.a(mm2.e1.class);
            en0.g gVar = new en0.g();
            gVar.f255246a = 1;
            gVar.f255248c = e1Var.f328988r.getLong(0);
            gVar.f255262q = e1Var.f328992v;
            gVar.f255256k = e1Var.f328983m;
            gVar.f255251f = ((mm2.c1) e1Var.business(mm2.c1.class)).f328852o;
            gVar.f255257l = ((mm2.c1) e1Var.business(mm2.c1.class)).V1;
            com.tencent.mm.live.api.LiveConfig a17 = gVar.a();
            a17.f68546p0 = e1Var.f328980g;
            dk2.x4 x4Var = new dk2.x4();
            x4Var.f234318l.add(a17);
            dk2.ef efVar = dk2.ef.f233372a;
            km2.n nVar = dk2.ef.H;
            x4Var.B = nVar != null ? nVar.e() : null;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkstreamparams onSaveInstanceState ");
            r45.ta4 ta4Var = x4Var.B;
            sb7.append(ta4Var != null ? java.lang.Integer.valueOf(ta4Var.hashCode()) : null);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", sb7.toString());
            dk2.x4.C.b(bundle, x4Var);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onStart " + this + ", activateUIKey:" + com.tencent.mm.plugin.finder.live.view.c8.f116229v);
        super.onStart();
        O6("onStart");
        T6();
        fo0.c cVar = fo0.c.f264798a;
        ((com.tencent.mm.plugin.ball.service.d) fo0.c.f264799b.f264807a).f93132d.f93050h = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveVisitorUIC", "[LiveLifecycle]onStop " + this + ", activateUIKey:" + com.tencent.mm.plugin.finder.live.view.c8.f116229v);
        super.onStop();
        ml2.b1.a(ml2.b1.f327211a, java.lang.String.valueOf(getContext().hashCode()), null, 2, null);
        O6("onStop");
        U6();
    }
}
