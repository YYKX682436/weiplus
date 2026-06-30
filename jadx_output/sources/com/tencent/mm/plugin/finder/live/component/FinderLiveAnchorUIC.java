package com.tencent.mm.plugin.finder.live.component;

/* loaded from: classes3.dex */
public class FinderLiveAnchorUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f111552d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f111553e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.k0 f111554f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.tools.f5 f111555g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.c8 f111556h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f111557i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f111558m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f111559n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC$liveStartOtherActivityEventListener$1 f111560o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Runnable f111561p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f111562q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC$liveStartOtherActivityEventListener$1] */
    public FinderLiveAnchorUIC(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f111552d = "MicroMsg.FinderLiveAnchorWithoutAffinityUI";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f111560o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderLiveStartOtherActivityEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC$liveStartOtherActivityEventListener$1
            {
                this.__eventId = -437996325;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderLiveStartOtherActivityEvent finderLiveStartOtherActivityEvent) {
                com.tencent.mm.autogen.events.FinderLiveStartOtherActivityEvent event = finderLiveStartOtherActivityEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC.this.f111559n = true;
                return true;
            }
        };
    }

    public com.tencent.mm.plugin.finder.live.view.k0 O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new com.tencent.mm.plugin.finder.live.view.v1((com.tencent.mm.ui.MMActivity) activity, getFragment(), null);
    }

    public void P6() {
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) activity).setSelfNavigationBarVisible(8);
        }
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().clearFlags(1024);
        getContext().getWindow().clearFlags(512);
        getContext().getWindow().clearFlags(67108864);
        if (getContext().getResources().getConfiguration().orientation == 2) {
            getContext().getWindow().getDecorView().setSystemUiVisibility(7942);
            getContext().getWindow().addFlags(1024);
        } else {
            getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        }
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0215 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6(gk2.e r19, dk2.x4 r20) {
        /*
            Method dump skipped, instructions count: 1715
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC.Q6(gk2.e, dk2.x4):void");
    }

    public final void R6() {
        com.tencent.mm.plugin.finder.live.view.c8.f116229v = toString();
        com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f111556h;
        if (c8Var != null) {
            c8Var.p0();
        }
        qp1.h0.a(true, false, true);
        com.tencent.mars.xlog.Log.i(this.f111552d, "tryHideFloatBallWhenEnterPage hideFloatBall");
    }

    public void S6() {
        if (com.tencent.mm.sdk.platformtools.t8.D0(com.tencent.mm.plugin.finder.live.view.c8.f116229v, toString())) {
            gk2.e eVar = dk2.ef.I;
            boolean z17 = false;
            if (eVar != null && ((mm2.c1) eVar.a(mm2.c1.class)).O1) {
                gk2.e eVar2 = dk2.ef.I;
                if (!(eVar2 != null && ((mm2.c1) eVar2.a(mm2.c1.class)).a8())) {
                    if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.L6).getValue()).r()).intValue() == 1 && !this.f111559n)) {
                        return;
                    }
                }
                gk2.e eVar3 = dk2.ef.I;
                if (eVar3 != null && !((mm2.c1) eVar3.a(mm2.c1.class)).U7()) {
                    z17 = true;
                }
                if (z17) {
                    com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f111556h;
                    if (c8Var != null) {
                        c8Var.z();
                    }
                    if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(getContext())) {
                        qp1.h0.b();
                    }
                    com.tencent.mars.xlog.Log.i(this.f111552d, "tryShowFloatBallWhenExitPage resumeFloatBall");
                }
            }
        }
    }

    public final void T6() {
        com.tencent.mars.xlog.Log.i(this.f111552d, "[LiveLifecycler]uninitBusiness " + this);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
        if (k0Var != null) {
            k0Var.unMount();
        }
        ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).getClass();
        xg4.m.f454446a.b();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.aym;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
        if (k0Var != null) {
            k0Var.onActivityResult(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mars.xlog.Log.i(this.f111552d, "[LiveLifecycler]onBackPressed " + this);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
        if (k0Var != null) {
            return k0Var.onBackPress();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        super.onBeforeFinish(intent);
        if (this.f111557i) {
            T6();
        } else {
            this.f111561p = new te2.w1(this);
        }
        this.f111558m = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        com.tencent.mars.xlog.Log.i(this.f111552d, "onConfigurationChanged newConfig:" + newConfig);
        zl2.r4 r4Var = zl2.r4.f473950a;
        if ((zl2.r4.f473956g && com.tencent.mm.ui.bk.A()) || com.tencent.mm.ui.fl.e()) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
            com.tencent.mm.plugin.finder.live.view.v1 v1Var = k0Var instanceof com.tencent.mm.plugin.finder.live.view.v1 ? (com.tencent.mm.plugin.finder.live.view.v1) k0Var : null;
            if (v1Var != null) {
                sm2.o4 liveStartUIC = v1Var.getLiveStartUIC();
                liveStartUIC.getClass();
                fm2.a aVar = liveStartUIC.f19595c;
                if (aVar != null) {
                    org.json.JSONObject fullSEIData = aVar.getFullSEIData();
                    org.json.JSONObject jSONObject = liveStartUIC.f409629o0;
                    in0.q qVar = liveStartUIC.f19597e;
                    r1 = java.lang.Boolean.valueOf(com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(aVar, fullSEIData, jSONObject, qVar != null ? qVar.W0() : null, true, null, 16, null));
                }
                if (com.tencent.mm.ui.fl.e()) {
                    pm0.v.X(new sm2.y2(liveStartUIC));
                } else if (kotlin.jvm.internal.o.b(r1, java.lang.Boolean.TRUE)) {
                    pm0.v.X(new sm2.z2(liveStartUIC));
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0916, code lost:
    
        if (((java.lang.Number) ae2.in.f3688a.T().r()).intValue() == 1) goto L365;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0931, code lost:
    
        if (r0 == null) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0773, code lost:
    
        if (r4 == null) goto L320;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0366  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instructions count: 2406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.component.FinderLiveAnchorUIC.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f111552d, "[LiveLifecycler]onDestroy " + this);
        dead();
        com.tencent.mm.plugin.finder.live.view.c8 c8Var = this.f111556h;
        if (c8Var != null) {
            c8Var.o0();
        }
        if (!this.f111558m && !this.f111562q) {
            T6();
            this.f111562q = true;
        }
        ((yg0.u3) ((zg0.c3) i95.n0.c(zg0.c3.class))).wi();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f111552d, "[LiveLifecycler]onNewIntent " + this);
        super.onNewIntent(intent);
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
        if (k0Var != null) {
            k0Var.onNewIntent(intent);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        com.tencent.mars.xlog.Log.i(this.f111552d, "[LiveLifecycler]onPause " + this);
        super.onPause();
        com.tencent.mm.ui.tools.f5 f5Var = this.f111555g;
        if (f5Var != null) {
            f5Var.d();
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
        if (k0Var != null) {
            k0Var.pause();
        }
        this.f111557i = true;
        java.lang.Runnable runnable = this.f111561p;
        if (runnable != null) {
            runnable.run();
        }
        this.f111561p = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        super.onRequestPermissionsResult(i17, permissions, grantResults);
        com.tencent.mars.xlog.Log.i(this.f111552d, "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 64 || grantResults[0] == 0 || z2.h.b(getActivity(), "android.permission.ACCESS_FINE_LOCATION")) {
            return;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
        if (u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (currentTimeMillis - j35.u.f("android.permission.ACCESS_FINE_LOCATION", 64) < 300) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity context = getContext();
            ((sb0.f) jVar).getClass();
            j35.u.g(context);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        java.lang.String str = this.f111552d;
        com.tencent.mars.xlog.Log.i(str, "[LiveLifecycler]onResume " + this);
        this.f111559n = false;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
        if (k0Var != null) {
            k0Var.resume();
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var2 = this.f111554f;
        if (k0Var2 != null) {
            k0Var2.post(new te2.z1(this));
        }
        com.tencent.mars.xlog.Log.i(str, "[LiveLifecycler]initBusiness " + this);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LiveLifecycle] onSaveInstanceState ");
        sb6.append(this);
        sb6.append(" curData:");
        dk2.ef efVar = dk2.ef.f233372a;
        sb6.append(dk2.ef.I);
        com.tencent.mars.xlog.Log.i(this.f111552d, sb6.toString());
        gk2.e eVar = gk2.e.f272471n;
        if (eVar != null) {
            mm2.e1 e1Var = (mm2.e1) eVar.a(mm2.e1.class);
            en0.g gVar = new en0.g();
            gVar.f255246a = 0;
            gVar.f255248c = e1Var.f328988r.getLong(0);
            gVar.f255262q = e1Var.f328992v;
            gVar.f255256k = e1Var.f328983m;
            gVar.f255251f = ((mm2.c1) e1Var.business(mm2.c1.class)).f328852o;
            gVar.f255257l = ((mm2.c1) e1Var.business(mm2.c1.class)).V1;
            com.tencent.mm.live.api.LiveConfig a17 = gVar.a();
            dk2.x4 x4Var = new dk2.x4();
            x4Var.f234318l.add(a17);
            dk2.x4.C.b(bundle, x4Var);
            if (bundle != null) {
                r45.h32 h32Var = x4Var.f234307a;
                bundle.putByteArray("KEY_PARAMS_NOTICE", h32Var != null ? h32Var.toByteArray() : null);
            }
            if (bundle != null) {
                r45.uy1 uy1Var = x4Var.f234308b;
                bundle.putByteArray("KEY_PARAMS_LIVE_TASK_INFO", uy1Var != null ? uy1Var.toByteArray() : null);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        com.tencent.mars.xlog.Log.i(this.f111552d, "[LiveLifecycler]onStart " + this + ", activateUIKey:" + com.tencent.mm.plugin.finder.live.view.c8.f116229v);
        super.onStart();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
        if (k0Var != null) {
            k0Var.start();
        }
        R6();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Hj();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        java.lang.String str = "[LiveLifecycler]onStop " + this + ", activateUIKey:" + com.tencent.mm.plugin.finder.live.view.c8.f116229v;
        java.lang.String str2 = this.f111552d;
        com.tencent.mars.xlog.Log.i(str2, str);
        super.onStop();
        if (com.tencent.mm.sdk.platformtools.t8.D0(com.tencent.mm.plugin.finder.live.view.c8.f116229v, toString())) {
            com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f111554f;
            if (k0Var != null) {
                k0Var.stop();
            }
            if (getActivity().isChangingConfigurations()) {
                dk2.ef efVar = dk2.ef.f233372a;
                gk2.e eVar = dk2.ef.I;
                mm2.c1 c1Var = eVar != null ? (mm2.c1) eVar.a(mm2.c1.class) : null;
                if (c1Var != null) {
                    c1Var.f328798e5 = true;
                }
                com.tencent.mars.xlog.Log.i(str2, "onStop: Activity is changing configurations, set releaseUIKeepData = true");
            }
            S6();
        }
    }
}
