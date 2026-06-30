package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class c6 extends com.tencent.mm.plugin.finder.live.plugin.l {

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f112116p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f112117q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.d6 f112118r;

    /* renamed from: s, reason: collision with root package name */
    public hq0.e0 f112119s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f112120t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f112116p = statusMonitor;
        this.f112117q = "FinderLiveAnchorGamePlugin";
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f112118r = new com.tencent.mm.plugin.finder.live.widget.d6(context, root, statusMonitor, this);
    }

    @Override // qo0.a
    public boolean B0() {
        if (this.f365323d.getVisibility() != 0) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f112118r;
        d6Var.getClass();
        qo0.c.a(d6Var.f118060b, qo0.b.A2, null, 2, null);
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // qo0.a
    public void I0() {
        hq0.e0 e0Var = this.f112119s;
        if (e0Var != null) {
            e0Var.f();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 27 || ordinal == 28) {
            u1();
            return;
        }
        switch (ordinal) {
            case 104:
                w1(r45.r84.ClickController, bundle);
                return;
            case 105:
                u1();
                return;
            case 106:
                w1(r45.r84.GoGiftSettingPage, bundle);
                return;
            default:
                return;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 2;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void k1(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i(this.f112117q, "checkAutoShow onNewIntent");
        if (((mm2.c1) P0(mm2.c1.class)).a8()) {
            t1(intent);
        }
    }

    public final void onResume() {
        android.view.ViewGroup viewGroup = this.f365323d;
        int visibility = viewGroup.getVisibility();
        java.lang.String str = this.f112117q;
        if (visibility == 0) {
            com.tencent.mars.xlog.Log.i(str, "onResume serverLost:" + this.f112120t);
            if (this.f112120t) {
                v1();
                this.f112120t = false;
            }
            com.tencent.mm.plugin.finder.live.widget.d6.h(this.f112118r, true, false, 2, null);
            hq0.e0 e0Var = this.f112119s;
            if (e0Var != null) {
                e0Var.j();
            }
        }
        com.tencent.mars.xlog.Log.i(str, "checkAutoShow resume");
        if (((mm2.c1) P0(mm2.c1.class)).a8()) {
            android.content.Context context = viewGroup.getContext();
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            t1(activity != null ? activity.getIntent() : null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(android.content.Intent intent) {
        android.app.Activity activity;
        android.content.Intent intent2;
        android.content.Intent intent3;
        java.lang.String stringExtra;
        int intExtra = intent != null ? intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0) : 0;
        android.view.ViewGroup viewGroup = this.f365323d;
        java.lang.String str = this.f112117q;
        if (intExtra == 11) {
            com.tencent.mars.xlog.Log.i(str, "checkAutoShow showHalf");
            w1(r45.r84.ClickController, null);
            android.content.Context context = viewGroup.getContext();
            activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            if (activity == null || (intent2 = activity.getIntent()) == null) {
                return;
            }
            intent2.putExtra("KEY_PARAMS_DO_ACTION", 0);
            return;
        }
        if (intExtra != 16) {
            return;
        }
        com.tencent.mars.xlog.Log.i(str, "checkAutoShow showHalf v2");
        r45.r84 r84Var = r45.r84.GoGiftSettingPage;
        android.os.Bundle bundle = new android.os.Bundle();
        if (intent != null && (stringExtra = intent.getStringExtra("KEY_PARAMS_DO_ACTION_PARAMS")) != null) {
            if (!(stringExtra.length() > 0)) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                bundle.putString("KEY_PARAMS_DO_ACTION_PARAMS", stringExtra);
            }
        }
        w1(r84Var, bundle);
        android.content.Context context2 = viewGroup.getContext();
        activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
        if (activity == null || (intent3 = activity.getIntent()) == null) {
            return;
        }
        intent3.putExtra("KEY_PARAMS_DO_ACTION", 0);
    }

    public final void u1() {
        if (this.f365323d.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i(this.f112117q, "hidePlayTogether");
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f112118r.f118074p;
            if (liveBottomSheetPanel == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            if (liveBottomSheetPanel.isShowing) {
                com.tencent.mm.ui.widget.LiveBottomSheetPanel.b(liveBottomSheetPanel, null, 1, null);
            }
        }
    }

    public final void v1() {
        java.lang.String str = this.f112117q;
        com.tencent.mars.xlog.Log.i(str, "setupDynamicCardEnv");
        boolean z17 = true;
        boolean z18 = ((mm2.c1) P0(mm2.c1.class)).A7() == null;
        int intValue = ((java.lang.Number) ae2.in.f3826n7.r()).intValue();
        com.tencent.mars.xlog.Log.i(str, "enableDynamicCard playTogetherJumpInfo is null:" + z18 + ", localSwitchValue:" + intValue + " ,localSwitchValue:  native(有mb): 2, liteapp: 0、1");
        if (!z18 && intValue != 2) {
            z17 = false;
        }
        if (z17) {
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Ai("wxe208ce76dfa39515");
            ((ne0.r) ((oe0.x) i95.n0.c(oe0.x.class))).Di(new com.tencent.mm.plugin.finder.live.plugin.b6(this));
            java.lang.String str2 = ((mm2.c1) P0(mm2.c1.class)).f328852o;
            long j17 = ((mm2.e1) P0(mm2.e1.class)).f328983m;
            zl2.r4 r4Var = zl2.r4.f473950a;
            android.view.ViewGroup viewGroup = this.f365323d;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String j07 = r4Var.j0(context);
            ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
            java.lang.String str3 = a52.a.f1584l;
            java.lang.String f17 = dk2.q4.f233938a.f(((ml2.r0) i95.n0.c(ml2.r0.class)).M, "enter_immerse_type");
            kotlin.jvm.internal.o.d(str3);
            oe0.u uVar = new oe0.u(str2, j17, j07, str3, f17, null, null, null, 224, null);
            oe0.x xVar = (oe0.x) i95.n0.c(oe0.x.class);
            java.lang.Object obj = new java.lang.Object();
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            hq0.e0 wi6 = ((ne0.r) xVar).wi(obj, context2, uVar);
            this.f112119s = wi6;
            if (wi6 != null) {
                com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f112118r;
                d6Var.getClass();
                d6Var.f118076r = wi6;
                java.util.Iterator it = d6Var.f118067i.iterator();
                while (it.hasNext()) {
                    ((cm2.p) it.next()).f43375f = wi6;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w1(r45.r84 r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r3.P0(r0)
            mm2.c1 r0 = (mm2.c1) r0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r0.A7()
            java.lang.String r1 = r3.f112117q
            if (r0 == 0) goto L4d
            ae2.in r0 = ae2.in.f3688a
            lb2.j r0 = ae2.in.f3826n7
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 2
            if (r0 == r2) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[showPlayTogether] scene = "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r2 = ", param = "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r1, r0)
            java.lang.Class<df2.oj> r0 = df2.oj.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r3.U0(r0)
            df2.oj r0 = (df2.oj) r0
            if (r0 == 0) goto L60
            r0.k7(r4, r5)
            goto L60
        L4d:
            java.lang.String r4 = "showPlayTogether"
            com.tencent.mars.xlog.Log.i(r1, r4)
            r4 = 0
            r3.K0(r4)
            r5 = 3
            r0 = 0
            com.tencent.mm.plugin.finder.live.widget.d6 r1 = r3.f112118r
            com.tencent.mm.plugin.finder.live.widget.d6.h(r1, r4, r4, r5, r0)
            r3.v1()
        L60:
            long r4 = com.tencent.mm.plugin.finder.assist.x2.f102673b
            r0 = 18
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L82
            com.tencent.mm.plugin.finder.assist.x2 r4 = com.tencent.mm.plugin.finder.assist.x2.f102672a
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r0 = "type"
            r1 = 4
            r5.put(r0, r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.o.f(r5, r0)
            r4.d(r5)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.c6.w1(r45.r84, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f112118r;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = d6Var.f118061c;
        ((mm2.c1) lVar.P0(mm2.c1.class)).f328833k6.observe(lVar, new com.tencent.mm.plugin.finder.live.widget.y5(d6Var));
    }
}
