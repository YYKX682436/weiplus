package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q0 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f113940p;

    /* renamed from: q, reason: collision with root package name */
    public long f113941q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.FrameLayout f113942r;

    /* renamed from: s, reason: collision with root package name */
    public final ml2.u f113943s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f113944t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.p f113945u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.view.ViewGroup rootView, qo0.c statusMonitor) {
        super(rootView, statusMonitor, null);
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f113940p = rootView;
        this.f113941q = -1L;
        this.f113942r = (android.widget.FrameLayout) rootView.findViewById(com.tencent.mm.R.id.i4p);
        this.f113943s = new ml2.u();
        com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        K0(8);
        this.f113945u = new com.tencent.mm.plugin.finder.live.plugin.h0(this);
    }

    public static void w1(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var, java.lang.String str, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var;
        q0Var.getClass();
        mm2.f fVar = mm2.f.f329017h;
        q0Var.A1(fVar);
        com.tencent.mars.xlog.Log.w("FinderLiveAdVideoPlugin", "loadStartupVideo come complete.");
        q0Var.K0(8);
        mm2.w wVar = (mm2.w) q0Var.P0(mm2.w.class);
        mm2.f fVar2 = (mm2.f) wVar.f329503o.getValue();
        if (fVar2 == mm2.f.f329016g || fVar2 == fVar) {
            com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "stopLivingVideoPlayer state:" + fVar2);
            wVar.R6();
        } else {
            com.tencent.mars.xlog.Log.w("LiveAdVideoSlice", "stopLivingVideoPlayer return for invalid state:" + fVar2);
        }
        android.widget.FrameLayout frameLayout = q0Var.f113942r;
        frameLayout.removeAllViews();
        com.tencent.mm.plugin.finder.live.plugin.w0 w0Var = (com.tencent.mm.plugin.finder.live.plugin.w0) q0Var.X0(com.tencent.mm.plugin.finder.live.plugin.w0.class);
        if (w0Var != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveAdVideoTimerPlugin", "hideProgressTimerTv");
            w0Var.f114835q.setVisibility(8);
            if (w0Var.f114836r.getVisibility() == 8) {
                w0Var.K0(8);
            }
        }
        if (!dk2.ef.f233372a.z() && (ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) q0Var.X0(com.tencent.mm.plugin.finder.live.plugin.ob0.class)) != null) {
            ob0Var.E1(false);
        }
        frameLayout.setOnTouchListener(null);
    }

    public final void A1(mm2.f fVar) {
        com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "setAdVideoState value:" + fVar);
        ((mm2.w) P0(mm2.w.class)).f329503o.setValue(fVar);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            dk2.ef.f233392k.e(16, new r45.bd2(), new com.tencent.mm.plugin.finder.live.plugin.n0(this, r45.cd2.class), true);
            if (((mm2.w) P0(mm2.w.class)).P6()) {
                return;
            }
            com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.p0(this, null), 3, null);
            return;
        }
        ml2.u uVar = this.f113943s;
        if (ordinal == 82) {
            uVar.getClass();
            uVar.f328028b = c01.id.c();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("advertise_type", 3);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
            com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportStartupVideoEnter json: " + jSONObject);
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.D1, t17, 0L, null, null, null, null, null, 252, null);
            return;
        }
        if (ordinal == 123) {
            if (!(((mm2.w6) P0(mm2.w6.class)).f329518f.size() > 0) || ((mm2.w) P0(mm2.w.class)).P6()) {
                return;
            }
            com.tencent.mm.plugin.finder.live.util.y.m(this, null, null, new com.tencent.mm.plugin.finder.live.plugin.o0(this, null), 3, null);
            return;
        }
        switch (ordinal) {
            case 20:
                if (uVar.f328028b == 0) {
                    com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportBannerExit return for bannerEnter:" + uVar.f328028b);
                    return;
                }
                long c18 = c01.id.c() - uVar.f328028b;
                uVar.f328028b = 0L;
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("type", 2);
                jSONObject3.put("advertise_type", 3);
                jSONObject3.put("watch_duration", c18);
                java.lang.String jSONObject4 = jSONObject3.toString();
                kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
                java.lang.String t18 = r26.i0.t(jSONObject4, ",", ";", false);
                com.tencent.mars.xlog.Log.i("FinderAdVideoReporter", "reportStartupVideoExit json: " + jSONObject3);
                i95.m c19 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                ml2.r0.hj((ml2.r0) c19, ml2.b4.D1, t18, 0L, null, null, null, null, null, 252, null);
                return;
            case 21:
                ((mm2.w) P0(mm2.w.class)).f329500i = mm2.i.f329127e;
                if (((mm2.w) P0(mm2.w.class)).f329504p != null) {
                    this.f113942r.removeAllViews();
                    return;
                }
                return;
            case 22:
                ((mm2.w) P0(mm2.w.class)).f329500i = mm2.i.f329128f;
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        K0(8);
        if (((mm2.w) P0(mm2.w.class)).P6()) {
            com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "unMount handleStartupVideoStop");
            x1(((mm2.w) P0(mm2.w.class)).f329502n, false);
        }
        this.f113942r.removeAllViews();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final boolean t1() {
        if (u1() != mm2.f.f329016g) {
            com.tencent.mars.xlog.Log.w("FinderLiveAdVideoPlugin", "checkResumeVideoView return for state:" + u1());
            return false;
        }
        mm2.h hVar = ((mm2.w) P0(mm2.w.class)).f329504p;
        if (hVar == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "reUsePlayerView view" + hVar);
        android.view.ViewParent parent = hVar.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "reUsePlayerView remove view:" + hVar);
            viewGroup.removeAllViews();
        }
        yz5.p pVar = this.f113945u;
        hVar.setOnVideoSizeChange(pVar);
        hVar.setOnProgressChange(new com.tencent.mm.plugin.finder.live.plugin.i0(this));
        hVar.setOnFirstFrameRendered(new com.tencent.mm.plugin.finder.live.plugin.j0(this));
        hVar.setOnVideoError(new com.tencent.mm.plugin.finder.live.plugin.k0(this));
        hVar.setOnVideoComplete(new com.tencent.mm.plugin.finder.live.plugin.l0(this));
        K0(0);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.widget.FrameLayout frameLayout = this.f113942r;
        frameLayout.addView(hVar, layoutParams);
        frameLayout.requestLayout();
        ((com.tencent.mm.plugin.finder.live.plugin.h0) pVar).invoke(java.lang.Integer.valueOf(((mm2.w) P0(mm2.w.class)).f329505q), java.lang.Integer.valueOf(((mm2.w) P0(mm2.w.class)).f329506r));
        com.tencent.mm.plugin.finder.live.plugin.w0 w0Var = (com.tencent.mm.plugin.finder.live.plugin.w0) X0(com.tencent.mm.plugin.finder.live.plugin.w0.class);
        if (w0Var != null) {
            android.animation.ValueAnimator valueAnimator = w0Var.f114840v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            w0Var.t1();
        }
        com.tencent.mm.plugin.finder.live.plugin.w0 w0Var2 = (com.tencent.mm.plugin.finder.live.plugin.w0) X0(com.tencent.mm.plugin.finder.live.plugin.w0.class);
        if (w0Var2 != null) {
            android.animation.ValueAnimator valueAnimator2 = w0Var2.f114840v;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            w0Var2.t1();
        }
        return true;
    }

    public final mm2.f u1() {
        mm2.f fVar = (mm2.f) ((mm2.w) P0(mm2.w.class)).f329503o.getValue();
        return fVar == null ? mm2.f.f329013d : fVar;
    }

    public final mm2.h v1() {
        mm2.h hVar = ((mm2.w) P0(mm2.w.class)).f329504p;
        if (hVar instanceof mm2.h) {
            return hVar;
        }
        return null;
    }

    public final void x1(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) X0(com.tencent.mm.plugin.finder.live.plugin.ob0.class);
        if (ob0Var != null) {
            ob0Var.E1(false);
        }
        mm2.f fVar = mm2.f.f329015f;
        A1(fVar);
        yz5.a aVar = this.f113944t;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f113944t = null;
        K0(8);
        ig2.r f17 = ig2.m.f291393a.f(V0().f309129d.f68549s);
        if (f17 != null) {
            f17.h();
        }
        mm2.w wVar = (mm2.w) P0(mm2.w.class);
        mm2.f fVar2 = (mm2.f) wVar.f329503o.getValue();
        if (fVar2 == mm2.f.f329014e || fVar2 == mm2.f.f329018i || fVar2 == fVar) {
            com.tencent.mars.xlog.Log.i("LiveAdVideoSlice", "stopStartupVideoPlayer state:" + fVar2);
            wVar.R6();
        } else {
            com.tencent.mars.xlog.Log.w("LiveAdVideoSlice", "stopStartupVideoPlayer return for invalid state:" + fVar2);
        }
        android.widget.FrameLayout frameLayout = this.f113942r;
        frameLayout.removeAllViews();
        frameLayout.setOnTouchListener(null);
    }

    public final void y1(r45.ce2 ce2Var) {
        if (ce2Var == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveAdVideoPlugin", "loadLiveBg return for loadVideo:" + ce2Var);
            return;
        }
        java.lang.String string = ce2Var.getString(4);
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            com.tencent.mars.xlog.Log.w("FinderLiveAdVideoPlugin", "loadLiveBg return for url:".concat(string));
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.f113940p.findViewById(com.tencent.mm.R.id.i4q);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        mn2.q3 q3Var = new mn2.q3(string, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        kotlin.jvm.internal.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329953d));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        ((mm2.w) P0(mm2.w.class)).f329497f.observe(this, new com.tencent.mm.plugin.finder.live.plugin.m0(this));
        ((mm2.w) P0(mm2.w.class)).f329503o.observe(this, new com.tencent.mm.plugin.finder.live.plugin.f0(this));
        ((mm2.w) P0(mm2.w.class)).f329501m.observe(this, new com.tencent.mm.plugin.finder.live.plugin.g0(this));
    }

    public final boolean z1(r45.ce2 ce2Var, long j17, yz5.a aVar) {
        kn0.p pVar;
        if (ce2Var == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveAdVideoPlugin", "loadVideo return for loadVideo:" + ce2Var);
            return false;
        }
        tn0.w0 w0Var = dk2.ef.f233378d;
        if ((w0Var == null || (pVar = w0Var.D) == null || pVar.i()) ? false : true) {
            com.tencent.mars.xlog.Log.w("FinderLiveAdVideoPlugin", "loadVideo return for liveState nor normal mode");
            return false;
        }
        java.lang.String string = ce2Var.getString(3);
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            com.tencent.mars.xlog.Log.w("FinderLiveAdVideoPlugin", "loadVideo return for url:".concat(string));
            return false;
        }
        nk2.l.f338021a.b(nk2.a.f337953f);
        mm2.w wVar = (mm2.w) P0(mm2.w.class);
        java.lang.String string2 = ce2Var.getString(0);
        wVar.f329502n = string2 != null ? string2 : "";
        com.tencent.mars.xlog.Log.i("FinderLiveAdVideoPlugin", "loadVideo start play startPositionMs:" + j17 + " duration:" + ce2Var.getLong(2) + " url:" + string);
        K0(0);
        if (v1() == null) {
            mm2.w wVar2 = (mm2.w) P0(mm2.w.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            wVar2.f329504p = new mm2.h(context);
        }
        mm2.h v17 = v1();
        if (v17 != null) {
            v17.B = java.lang.System.currentTimeMillis();
            v17.getPlayer().b(false);
        }
        mm2.h v18 = v1();
        if (v18 != null) {
            return v18.u(ce2Var, j17, new com.tencent.mm.plugin.finder.live.plugin.c0(this, aVar));
        }
        return false;
    }
}
