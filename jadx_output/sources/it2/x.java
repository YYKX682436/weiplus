package it2;

@j95.b
/* loaded from: classes7.dex */
public final class x extends i95.w implements rs5.f, jc3.u, jc3.g0 {

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f294528s = new java.util.concurrent.atomic.AtomicInteger(1);

    /* renamed from: t, reason: collision with root package name */
    public static final jz5.g f294529t = jz5.h.b(it2.l.f294512d);

    /* renamed from: d, reason: collision with root package name */
    public jc3.j0 f294530d;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f294533g;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f294535i;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f294531e = jz5.h.b(new it2.m(this));

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashSet f294532f = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f294534h = jz5.h.b(it2.w.f294527d);

    /* renamed from: m, reason: collision with root package name */
    public final android.os.Handler f294536m = new android.os.Handler(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f294537n = new it2.o(this);

    /* renamed from: o, reason: collision with root package name */
    public final android.util.SparseArray f294538o = new android.util.SparseArray();

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f294539p = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f294540q = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f294541r = "ilinkres_1b31184b";

    public final void Ai() {
        android.os.Handler handler = this.f294536m;
        java.lang.Runnable runnable = this.f294537n;
        handler.removeCallbacks(runnable);
        if (this.f294530d == null) {
            java.lang.String Bi = Bi();
            if (Bi == null) {
                com.tencent.mars.xlog.Log.e("MagicRewardFeatureService", "pkg not found, setup biz failed");
                return;
            }
            com.tencent.mars.xlog.Log.i("MagicRewardFeatureService", "setup biz with version: ".concat(Bi));
            com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
            it2.k bizContext = (it2.k) ((jz5.n) this.f294531e).getValue();
            kotlin.jvm.internal.o.g(bizContext, "bizContext");
            mBBuildConfig.f147834x = bizContext;
            mBBuildConfig.f147828r = this;
            mBBuildConfig.a(kz5.n0.t0(((com.tencent.mm.plugin.magicbrush.f6) ((com.tencent.mm.plugin.magicbrush.f4) i95.n0.c(com.tencent.mm.plugin.magicbrush.f4.class))).Ni("MagicReward"), kz5.c0.i(new jt2.a(), new jt2.c(), new jt2.b())));
            mBBuildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(0.001f);
            mBBuildConfig.f147821h = true;
            jc3.j0 wi6 = ((com.tencent.mm.plugin.magicbrush.b6) ((com.tencent.mm.plugin.magicbrush.p4) i95.n0.c(com.tencent.mm.plugin.magicbrush.p4.class))).wi("MagicReward");
            rc3.w0 w0Var = (rc3.w0) wi6;
            w0Var.w(this);
            w0Var.W(mBBuildConfig);
            java.lang.String str = (java.lang.String) ((jz5.n) f294529t).getValue();
            kotlin.jvm.internal.o.f(str, "access$getBASIC_LIB(...)");
            jc3.j0.d(wi6, str, null, 2, null);
            w0Var.start();
            Ni(wi6);
        }
        if (this.f294533g == null) {
            handler.postDelayed(runnable, 30000L);
        }
    }

    public java.lang.String Bi() {
        com.tencent.wechat.aff.udr.x Ui = ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Ui(this.f294541r, "MagicReward");
        if (Ui != null) {
            return java.lang.Long.valueOf(Ui.f217590e).toString();
        }
        return null;
    }

    public final void Di(yz5.l lVar) {
        java.util.HashSet Q0;
        synchronized (this.f294532f) {
            Q0 = kz5.n0.Q0(this.f294532f);
        }
        nf.e.f(new it2.p(Q0, lVar));
    }

    @Override // jc3.g0
    public void Me(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MagicRewardFeatureService", "canvas " + i17 + " created");
        this.f294535i = view;
        android.widget.FrameLayout frameLayout = this.f294533g;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
    }

    public final void Ni(jc3.j0 j0Var) {
        if (j0Var == null && this.f294530d != null) {
            this.f294539p = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
            this.f294540q = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM;
            android.util.SparseArray sparseArray = this.f294538o;
            android.util.SparseArray clone = sparseArray.clone();
            kotlin.jvm.internal.o.f(clone, "clone(...)");
            sparseArray.clear();
            int size = clone.size();
            for (int i17 = 0; i17 < size; i17++) {
                clone.keyAt(i17);
                ((yz5.l) clone.valueAt(i17)).invoke(rs5.h.f399362m);
            }
        }
        this.f294530d = j0Var;
    }

    @Override // jc3.g0
    public void P8(int i17, android.view.View view, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
    }

    @Override // jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        Di(new it2.t(msg));
    }

    @Override // jc3.g0
    public void Zf(int i17, android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MagicRewardFeatureService", "canvas " + i17 + " destroy");
        android.widget.FrameLayout frameLayout = this.f294533g;
        if (frameLayout != null) {
            frameLayout.removeView(view);
        }
        this.f294535i = null;
    }

    @Override // jc3.u
    public void b1() {
        nf.e.f(new it2.s(this));
    }

    @Override // jc3.u
    public void n() {
        Di(it2.u.f294520d);
    }

    public boolean wi(java.lang.String name, java.lang.String data) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(data, "data");
        jc3.j0 j0Var = this.f294530d;
        if (j0Var != null) {
            ((rc3.w0) j0Var).k(name, data);
            return true;
        }
        com.tencent.mars.xlog.Log.e("MagicRewardFeatureService", "try to dispatch " + name + " with data " + data + ", but biz not found");
        return false;
    }
}
