package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v5 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114660p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f114661q;

    /* renamed from: r, reason: collision with root package name */
    public final int f114662r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.widget.se f114663s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f114664t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114660p = statusMonitor;
        this.f114661q = "Finder.LiveAnchorExceptionPlugin";
        this.f114662r = 10000;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f114664t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.plugin.FinderLiveAnchorExceptionPlugin$realnameNotifyListener$1
            {
                this.__eventId = 323604482;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent walletRealNameResultNotifyEvent) {
                com.tencent.mm.autogen.events.WalletRealNameResultNotifyEvent event = walletRealNameResultNotifyEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dead();
                int i17 = event.f54973g.f6120a;
                com.tencent.mm.plugin.finder.live.plugin.v5 v5Var = com.tencent.mm.plugin.finder.live.plugin.v5.this;
                com.tencent.mm.plugin.finder.live.widget.se seVar = v5Var.f114663s;
                if (seVar != null) {
                    pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.ke(seVar));
                }
                qo0.c cVar = v5Var.f114660p;
                android.view.ViewGroup viewGroup = v5Var.f113324f;
                if (i17 != -1) {
                    ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
                    ml2.d3 d3Var = ml2.d3.f327358h;
                    android.content.Context context = viewGroup.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    j0Var.Jj(d3Var, xy2.c.e(context));
                    qo0.c.a(cVar, qo0.b.f365363i, null, 2, null);
                    return false;
                }
                qo0.b bVar = qo0.b.J1;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putBoolean("PARAM_FINDER_LIVE_POST_AFTER_FACE_VERIFY", true);
                cVar.statusChange(bVar, bundle);
                ml2.j0 j0Var2 = (ml2.j0) i95.n0.c(ml2.j0.class);
                ml2.d3 d3Var2 = ml2.d3.f327357g;
                android.content.Context context2 = viewGroup.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                j0Var2.Jj(d3Var2, xy2.c.e(context2));
                return false;
            }
        };
    }

    @Override // qo0.a
    public void A0(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        if (i17 == this.f114662r) {
            com.tencent.mm.plugin.finder.live.widget.se seVar = this.f114663s;
            if (seVar != null) {
                pm0.v.X(new com.tencent.mm.plugin.finder.live.widget.ke(seVar));
            }
            android.os.Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_data") : null;
            if (intent == null || (str = intent.getStringExtra("srcUsername")) == null) {
                str = "";
            }
            qo0.c cVar = this.f114660p;
            if (i18 == -1 && bundleExtra != null) {
                java.lang.String string = bundleExtra.getString("go_next", "");
                java.lang.String string2 = bundleExtra.getString("result_json");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    int i19 = new cl0.g(string2).getInt("code");
                    if (kotlin.jvm.internal.o.b(string, "roomlive_verify") && i19 == 0) {
                        qo0.b bVar = qo0.b.J1;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBoolean("PARAM_FINDER_LIVE_POST_AFTER_FACE_VERIFY", true);
                        cVar.statusChange(bVar, bundle);
                        ((ml2.j0) i95.n0.c(ml2.j0.class)).Jj(ml2.d3.f327357g, str);
                        return;
                    }
                }
            }
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Jj(ml2.d3.f327358h, str);
            qo0.c.a(cVar, qo0.b.f365363i, null, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(java.lang.String str) {
        if (this.f114663s == null) {
            com.tencent.mm.plugin.finder.live.widget.se seVar = new com.tencent.mm.plugin.finder.live.widget.se(this.f365323d, str, ((mm2.c1) S0().a(mm2.c1.class)).t7(), this);
            this.f114663s = seVar;
            seVar.f119758f = new com.tencent.mm.plugin.finder.live.plugin.r5(this);
        }
    }

    public final void u1(java.lang.String anchorUserName, r45.qp1 qp1Var, int i17) {
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        com.tencent.mars.xlog.Log.i(this.f114661q, "showAnchorForceQuit anchorUserName:".concat(anchorUserName));
        t1(anchorUserName);
        com.tencent.mm.plugin.finder.live.widget.se seVar = this.f114663s;
        if (seVar != null) {
            seVar.c(3, qp1Var, i17, new com.tencent.mm.plugin.finder.live.plugin.s5(this));
        }
    }

    public final void v1(java.lang.String anchorUserName, r45.qp1 qp1Var, int i17) {
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        com.tencent.mars.xlog.Log.i(this.f114661q, "showCreateLiveDynamicErrPage anchorUserName:".concat(anchorUserName));
        t1(anchorUserName);
        com.tencent.mm.plugin.finder.live.widget.se seVar = this.f114663s;
        if (seVar != null) {
            seVar.c(7, qp1Var, i17, new com.tencent.mm.plugin.finder.live.plugin.t5(this));
        }
    }

    public final void w1(java.lang.String str, java.lang.String str2, r45.qp1 qp1Var) {
        com.tencent.mars.xlog.Log.i(this.f114661q, "showFaceVerify:" + str);
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Jj(ml2.d3.f327355e, str2);
        t1("");
        com.tencent.mm.plugin.finder.live.widget.se seVar = this.f114663s;
        if (seVar != null) {
            com.tencent.mm.plugin.finder.live.widget.se.d(seVar, 2, qp1Var, 0, new com.tencent.mm.plugin.finder.live.plugin.u5(this, str2), 4, null);
        }
    }
}
