package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public abstract class t1 extends com.tencent.mm.plugin.finder.live.widget.e0 {
    public final java.lang.String H;
    public final az2.f I;

    /* renamed from: J, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f119858J;
    public boolean K;
    public r45.ze2 L;
    public final jz5.g M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(android.content.Context context) {
        super(context, false, null, 0.0f, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        this.H = "BaseLbsBottomPanelSheet";
        this.I = az2.c.a(az2.f.f16125d, context, null, 0L, null, 14, null);
        this.f119858J = kotlinx.coroutines.z0.b();
        this.K = true;
        this.M = jz5.h.b(new com.tencent.mm.plugin.finder.live.widget.s1(this));
    }

    public static final void e0(com.tencent.mm.plugin.finder.live.widget.t1 t1Var, float f17, float f18, boolean z17) {
        com.tencent.mars.xlog.Log.i(t1Var.i0(), "getPoiCityInfo: longitude:" + f17 + ", latitude:" + f18 + " isNeedLoadingToast: " + z17);
        r45.d64 d64Var = new r45.d64();
        d64Var.f372174d = f17;
        d64Var.f372175e = f18;
        d64Var.f372179i = 0;
        d64Var.f372176f = 1;
        ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, new com.tencent.mm.plugin.finder.live.widget.p1(t1Var, z17, f17, f18));
    }

    public static final void f0(com.tencent.mm.plugin.finder.live.widget.t1 t1Var, boolean z17) {
        com.tencent.mars.xlog.Log.i(t1Var.i0(), "getPoiInfoError isNeedLoadingToast: " + z17);
        if (z17) {
            android.content.Context context = t1Var.f118183e;
            db5.t7.g(context, context.getString(com.tencent.mm.R.string.dle));
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            r0Var.getClass();
            ml2.r0.hj(r0Var, ml2.b4.f327254o3, null, 0L, null, null, null, null, null, 252, null);
            t1Var.I.b();
        }
    }

    public static final void g0(com.tencent.mm.plugin.finder.live.widget.t1 t1Var) {
        com.tencent.mars.xlog.Log.i(t1Var.i0(), "handlePoiNoPermission");
        android.content.Context context = t1Var.f118183e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            if (!activity.shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION")) {
                db5.e1.C(activity, activity.getString(com.tencent.mm.R.string.hhm), activity.getString(com.tencent.mm.R.string.hht), activity.getString(com.tencent.mm.R.string.g6z), activity.getString(com.tencent.mm.R.string.f490347sg), false, new com.tencent.mm.plugin.finder.live.widget.q1(activity), new com.tencent.mm.plugin.finder.live.widget.r1(t1Var));
            } else {
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.a(activity, "android.permission.ACCESS_FINE_LOCATION", 79, null, null);
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void S() {
        androidx.lifecycle.o mo133getLifecycle;
        super.S();
        com.tencent.mars.xlog.Log.i(i0(), "onDismiss isNeedRemove: " + this.K);
        if (this.K) {
            android.content.Context context = this.f118183e;
            com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
            if (mMActivity == null || (mo133getLifecycle = mMActivity.mo133getLifecycle()) == null) {
                return;
            }
            mo133getLifecycle.c((com.tencent.mm.plugin.finder.live.widget.BaseLbsBottomPanelSheet$lifeObserver$2$1) ((jz5.n) this.M).getValue());
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.e0
    public void V(com.tencent.mm.plugin.finder.live.widget.e0 e0Var, boolean z17, int i17) {
        androidx.lifecycle.o mo133getLifecycle;
        androidx.lifecycle.o mo133getLifecycle2;
        super.V(e0Var, z17, i17);
        this.K = true;
        android.content.Context context = this.f118183e;
        boolean z18 = context instanceof com.tencent.mm.ui.MMActivity;
        com.tencent.mm.ui.MMActivity mMActivity = z18 ? (com.tencent.mm.ui.MMActivity) context : null;
        jz5.g gVar = this.M;
        if (mMActivity != null && (mo133getLifecycle2 = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle2.c((com.tencent.mm.plugin.finder.live.widget.BaseLbsBottomPanelSheet$lifeObserver$2$1) ((jz5.n) gVar).getValue());
        }
        com.tencent.mm.ui.MMActivity mMActivity2 = z18 ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity2 == null || (mo133getLifecycle = mMActivity2.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a((com.tencent.mm.plugin.finder.live.widget.BaseLbsBottomPanelSheet$lifeObserver$2$1) ((jz5.n) gVar).getValue());
    }

    public void h0(boolean z17) {
        r45.ze2 ze2Var = this.L;
        if (ze2Var != null) {
            m0(ze2Var);
        }
        if (((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Di(d85.g0.LOCAION, d85.f0.f227164o, new com.tencent.mm.plugin.finder.live.widget.i1(this))) {
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.j1 j1Var = new com.tencent.mm.plugin.finder.live.widget.j1(this);
        com.tencent.mm.plugin.finder.live.widget.n1 n1Var = new com.tencent.mm.plugin.finder.live.widget.n1(this, z17);
        com.tencent.mm.plugin.finder.live.widget.o1 o1Var = new com.tencent.mm.plugin.finder.live.widget.o1(this, z17);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            j1Var.invoke();
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            o1Var.invoke();
        } else {
            n1Var.invoke();
        }
    }

    public java.lang.String i0() {
        return this.H;
    }

    public final boolean j0() {
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        ((sb0.f) jVar).getClass();
        if (!j35.u.d(context, "android.permission.ACCESS_FINE_LOCATION", false)) {
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            ((sb0.f) jVar2).getClass();
            if (!j35.u.d(context2, "android.permission.ACCESS_COARSE_LOCATION", false)) {
                return false;
            }
        }
        return true;
    }

    public final boolean k0() {
        boolean Ri = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.LOCAION, d85.f0.f227164o);
        boolean j07 = j0();
        com.tencent.mars.xlog.Log.i(i0(), "hadTotalPermission businessPermission: " + Ri + " sysPermission: " + j07);
        return Ri && j07;
    }

    public abstract void l0(boolean z17);

    public abstract void m0(r45.ze2 ze2Var);

    public abstract void n0(boolean z17);
}
