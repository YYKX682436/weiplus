package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v6 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public long A;
    public boolean B;
    public boolean C;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f114667p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ImageView f114668q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f114669r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f114670s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f114671t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f114672u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f114673v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f114674w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f114675x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.View f114676y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f114677z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114667p = "FinderLiveAnchorLikePlugin";
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.ejv);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f114668q = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.ejx);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f114669r = (android.widget.TextView) findViewById2;
        this.f114670s = (com.tencent.mm.view.MMPAGView) root.findViewById(com.tencent.mm.R.id.f6h);
        this.f114671t = root.findViewById(com.tencent.mm.R.id.eja);
        this.f114672u = root.findViewById(com.tencent.mm.R.id.ejc);
        this.f114673v = root.findViewById(com.tencent.mm.R.id.ejb);
        this.f114674w = root.findViewById(com.tencent.mm.R.id.en8);
        this.f114675x = root.findViewById(com.tencent.mm.R.id.en7);
        this.f114676y = root.findViewById(com.tencent.mm.R.id.f484559en5);
        this.f114677z = ((mm2.c1) P0(mm2.c1.class)).E3.f329470c;
        w1();
    }

    public static final void t1(com.tencent.mm.plugin.finder.live.plugin.v6 v6Var, mm2.i0 i0Var) {
        v6Var.getClass();
        com.tencent.mars.xlog.Log.i(v6Var.f114667p, "updateCheerInfos " + i0Var);
        if (i0Var != null) {
            ((mm2.c1) v6Var.P0(mm2.c1.class)).P9(i0Var.f329131a, i0Var.f329132b, i0Var.f329133c);
            com.tencent.mm.plugin.finder.live.plugin.ow owVar = (com.tencent.mm.plugin.finder.live.plugin.ow) v6Var.X0(com.tencent.mm.plugin.finder.live.plugin.ow.class);
            if (owVar != null) {
                owVar.I1(((mm2.c1) v6Var.P0(mm2.c1.class)).E3.f329469b);
            }
            v6Var.u1(((mm2.c1) v6Var.P0(mm2.c1.class)).E3.f329470c);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void K0(int i17) {
        if (!zl2.r4.f473950a.w1() && !((mm2.c1) P0(mm2.c1.class)).T) {
            if (!(((mm2.n0) P0(mm2.n0.class)).f329273r)) {
                super.K0(8);
                return;
            }
        }
        super.K0(i17);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        super.M0(status, bundle);
        int ordinal = status.ordinal();
        if (ordinal == 7) {
            ((mm2.l0) P0(mm2.l0.class)).f329214p.observe(this, new com.tencent.mm.plugin.finder.live.plugin.q6(this));
            return;
        }
        android.view.ViewGroup viewGroup = this.f365323d;
        if (ordinal == 123) {
            if (((mm2.c1) P0(mm2.c1.class)).F && !pm0.v.z((int) ((mm2.c1) P0(mm2.c1.class)).f328866q, 512)) {
            }
            if (!((mm2.c1) P0(mm2.c1.class)).F || pm0.v.z((int) ((mm2.c1) P0(mm2.c1.class)).f328866q, 512) || !((mm2.c1) P0(mm2.c1.class)).a8()) {
                K0(8);
                return;
            } else {
                if (viewGroup.getVisibility() != 0) {
                    K0(0);
                    return;
                }
                return;
            }
        }
        if (ordinal != 154) {
            if (ordinal != 206) {
                return;
            }
            if ((bundle == null || bundle.getBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", true)) ? false : true) {
                K0(8);
                return;
            } else {
                K0(0);
                return;
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.A;
        java.lang.String str = this.f114667p;
        if (currentTimeMillis <= com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT) {
            if (zl2.q4.f473933a.E()) {
                db5.t7.makeText(viewGroup.getContext(), "applaud time interval limit, return", 0).show();
            }
            com.tencent.mars.xlog.Log.i(str, "applaud time interval limit, return");
            return;
        }
        if (this.B || this.C) {
            com.tencent.mars.xlog.Log.i(str, "in applaud mode ,return");
            return;
        }
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3853q4).getValue()).r()).booleanValue() || !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_HAS_SHOWN_APPLAUD_TIPS_BOOLEAN_SYNC, false)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_HAS_SHOWN_APPLAUD_TIPS_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            android.view.View view = this.f114674w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "showApplaudTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "showApplaudTip", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.finder.live.plugin.n6 n6Var = new com.tencent.mm.plugin.finder.live.plugin.n6(this);
            android.view.View view2 = this.f114676y;
            view2.setOnClickListener(n6Var);
            view2.post(new com.tencent.mm.plugin.finder.live.plugin.o6(this));
            this.f114675x.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.p6(this));
        }
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        j0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("sub_action", 1);
        zy2.zb.y6(j0Var, ml2.z4.S, jSONObject.toString(), null, 4, null);
        this.C = true;
        android.view.View view3 = this.f114671t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f114668q.setVisibility(4);
        android.view.View view4 = this.f114672u;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin", "likeIconChangeToApplaud", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f114669r.setVisibility(8);
        android.view.View view5 = this.f114671t;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view5, "scaleX", 1.0f, 1.5f, 1.0f);
        kotlin.jvm.internal.o.f(ofFloat, "ofFloat(...)");
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view5, "scaleY", 1.0f, 1.5f, 1.0f);
        kotlin.jvm.internal.o.f(ofFloat2, "ofFloat(...)");
        ofFloat.setDuration(300L);
        ofFloat2.setDuration(300L);
        ofFloat.start();
        ofFloat2.start();
        this.f114672u.setOnClickListener(new com.tencent.mm.plugin.finder.live.plugin.m6(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.f114677z = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final void u1(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f114667p, "checkCheerIcon, new:" + str + " old:" + this.f114677z);
        if (((mm2.c1) P0(mm2.c1.class)).E3.f329471d == 0) {
            this.f114677z = null;
            w1();
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.D0(this.f114677z, str)) {
                return;
            }
            this.f114677z = str;
            w1();
        }
    }

    public final void v1() {
        if (!zl2.r4.f473950a.w1() && !((mm2.c1) P0(mm2.c1.class)).T) {
            if (!(((mm2.n0) P0(mm2.n0.class)).f329273r)) {
                K0(8);
                return;
            }
        }
        K0(0);
    }

    public final void w1() {
        java.lang.String str = "updateCheerIcon:" + this.f114677z;
        java.lang.String str2 = this.f114667p;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (this.B || this.C) {
            com.tencent.mars.xlog.Log.i(str2, "applaud mode ,return");
            return;
        }
        java.lang.String str3 = this.f114677z;
        if (str3 == null || str3.length() == 0) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.t6(this));
            return;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(this.f114677z, com.tencent.mm.plugin.finder.storage.y90.f128356f));
        com.tencent.mm.plugin.finder.live.plugin.s6 s6Var = new com.tencent.mm.plugin.finder.live.plugin.s6(this);
        a17.getClass();
        a17.f447873d = s6Var;
        a17.f();
    }
}
