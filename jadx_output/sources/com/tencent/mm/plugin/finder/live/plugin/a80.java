package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class a80 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f111829p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f111830q;

    /* renamed from: r, reason: collision with root package name */
    public final int f111831r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.Button f111832s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f111833t;

    /* renamed from: u, reason: collision with root package name */
    public final az2.f f111834u;

    /* renamed from: v, reason: collision with root package name */
    public int f111835v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f111836w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a80(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        az2.f fVar = null;
        this.f111829p = statusMonitor;
        this.f111830q = "Finder.FinderLiveReadyPlugin";
        this.f111831r = 3;
        android.widget.Button button = (android.widget.Button) root.findViewById(com.tencent.mm.R.id.fjs);
        this.f111832s = button;
        this.f111833t = (android.widget.TextView) root.findViewById(com.tencent.mm.R.id.fjt);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) root.findViewById(com.tencent.mm.R.id.f7v);
        if (progressBar != null) {
            fVar = new az2.f();
            fVar.f16128c = 1000L;
            az2.r rVar = new az2.r();
            rVar.f16151b = progressBar;
            fVar.f16127b = rVar;
        }
        this.f111834u = fVar;
        this.f111835v = 3;
        this.f111836w = new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.plugin.finder.live.plugin.z70(this), true);
        button.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.w70(this));
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f365323d.getVisibility() != 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f111830q, "cancel live by click back.");
        t1();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        super.K0(i17);
        if (i17 == 4 || i17 == 8) {
            w1();
            this.f111836w.d();
            v1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal != 5) {
            if (ordinal == 6) {
                com.tencent.mm.sdk.platformtools.Log.c(this.f111830q, "ILiveStatusLiveStatusREADY", new java.lang.Object[0]);
                K0(0);
                android.widget.Button button = this.f111832s;
                button.setVisibility(0);
                zl2.r4 r4Var = zl2.r4.f473950a;
                android.content.Context context = button.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (!r4Var.Y1(context)) {
                    android.view.ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    if (marginLayoutParams != null) {
                        int i17 = marginLayoutParams.bottomMargin;
                        int c17 = com.tencent.mm.ui.bl.c(button.getContext());
                        if (i17 < c17) {
                            i17 = c17;
                        }
                        marginLayoutParams.bottomMargin = i17;
                    }
                    button.setLayoutParams(marginLayoutParams);
                }
                this.f111836w.c(0L, 1000L);
                az2.f fVar = this.f111834u;
                if (fVar != null) {
                    fVar.b();
                    return;
                }
                return;
            }
            if (ordinal != 7 && ordinal != 27) {
                if (ordinal != 58) {
                    return;
                }
                dk2.xf W0 = W0();
                if (W0 != null) {
                    dk2.xf.f(W0, 0, new com.tencent.mm.plugin.finder.live.plugin.y70(this), 1, null);
                }
                ((mm2.c1) S0().a(mm2.c1.class)).D5 = false;
                return;
            }
        }
        K0(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        w1();
        this.f111836w.d();
        v1();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1() {
        r45.f50 f50Var;
        java.lang.String str = this.f111830q;
        com.tencent.mars.xlog.Log.i(str, "[cancelLive]");
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            mm2.n0 n0Var = (mm2.n0) eVar.a(mm2.n0.class);
            if (n0Var.O6() && (f50Var = (r45.f50) ((kotlinx.coroutines.flow.l2) n0Var.f329265g).getValue()) != null) {
                android.content.Context context = this.f365323d.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                if (n0Var.P6(xy2.c.e(context))) {
                    long j17 = f50Var.f374013d;
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = f50Var.f374017h;
                    java.lang.String username = finderContact != null ? finderContact.getUsername() : null;
                    if (j17 == 0) {
                        com.tencent.mars.xlog.Log.w(str, "notifyCoLiveCancelLiveCreatingIfNeeded: invalid invitationId, skip");
                    } else {
                        com.tencent.mars.xlog.Log.i(str, "notifyCoLiveCancelLiveCreatingIfNeeded: invitationId=" + j17);
                        re2.e1.f394405a.a(j17, 5, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : username, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : new com.tencent.mm.plugin.finder.live.plugin.jp0(this, j17));
                    }
                }
            }
        }
        w1();
        this.f111836w.d();
        v1();
        boolean Y6 = ((mm2.e1) P0(mm2.e1.class)).Y6();
        qo0.c cVar = this.f111829p;
        if (Y6) {
            u1();
            dk2.xf W0 = W0();
            if (W0 != null) {
                dk2.xf.f(W0, 0, new com.tencent.mm.plugin.finder.live.plugin.x70(this), 1, null);
            }
            qo0.c.a(cVar, qo0.b.f365396p, null, 2, null);
            return;
        }
        qo0.c.a(cVar, qo0.b.f365363i, null, 2, null);
        qo0.c.a(cVar, qo0.b.F1, null, 2, null);
        com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        com.tencent.mm.plugin.finder.assist.r8 r8Var = com.tencent.mm.plugin.finder.assist.t8.f102555a;
        com.tencent.mm.plugin.finder.assist.p8.c(p8Var, com.tencent.mm.plugin.finder.assist.t8.C.f102540b, null, false, true, 6, null);
        ((mm2.e1) P0(mm2.e1.class)).m7(new r45.nw1());
        if (cVar.getLiveRole() == 1) {
            u1();
        }
    }

    public final void u1() {
        org.json.JSONObject jSONObject;
        int i17 = ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) P0(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117047h;
        long j17 = ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) P0(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117048i;
        if (i17 == 0 || j17 == 0) {
            jSONObject = null;
        } else {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("entrance_type", i17);
            jSONObject.put("entrance_id", j17);
            mm2.g1 g1Var = (mm2.g1) P0(mm2.g1.class);
            java.lang.Integer num = g1Var.f329082w;
            java.lang.Long l17 = g1Var.f329083x;
            java.lang.String str = g1Var.f329084y;
            if (num != null && l17 != null && str != null) {
                long longValue = l17.longValue();
                jSONObject.put("strategy_id", num.intValue());
                jSONObject.put("guide_live_id", longValue);
                jSONObject.put("guide_finderusername", str);
            }
        }
        if (jSONObject != null) {
            jSONObject.put("display_mode", ((r45.aa0) ((kotlinx.coroutines.flow.h3) ((mm2.e1) P0(mm2.e1.class)).E).getValue()).f369868d);
        }
        if (((mm2.e1) P0(mm2.e1.class)).Y6() && jSONObject != null) {
            jSONObject.put("pull_source", ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) P0(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117049m);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 11L, jSONObject != null ? jSONObject.toString() : null, null, 4, null);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Yj(ml2.w1.f328177g);
    }

    public void v1() {
        android.widget.TextView textView = this.f111833t;
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        this.f111835v = this.f111831r;
        az2.f fVar = this.f111834u;
        if (fVar != null) {
            fVar.b();
        }
    }

    public final void w1() {
        yg2.c securityDataScope;
        android.view.ViewGroup viewGroup = this.f365323d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        if (((com.tencent.mm.ui.MMActivity) context).isStopped()) {
            return;
        }
        android.content.Context context2 = viewGroup.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        if (((com.tencent.mm.ui.MMActivity) context2).isFinishing()) {
            return;
        }
        kotlinx.coroutines.r2 r2Var = ((mm2.c1) S0().a(mm2.c1.class)).F5;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.flow.j2 j2Var = ((mm2.c1) S0().a(mm2.c1.class)).G5;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        ((kotlinx.coroutines.flow.h3) j2Var).k(bool);
        com.tencent.mm.sdk.platformtools.Log.c(this.f111830q, "isReadyPluginCountDownOk resetData", new java.lang.Object[0]);
        ((kotlinx.coroutines.flow.h3) ((mm2.c1) S0().a(mm2.c1.class)).E5).k(new jz5.l(bool, null));
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var == null || (securityDataScope = k0Var.getSecurityDataScope()) == null) {
            return;
        }
        kotlinx.coroutines.z0.c(securityDataScope, null);
    }
}
