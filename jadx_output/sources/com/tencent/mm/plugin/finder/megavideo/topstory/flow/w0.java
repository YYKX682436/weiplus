package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes10.dex */
public final class w0 implements com.tencent.mm.plugin.finder.megavideo.topstory.flow.j {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f121023a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f121024b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f121025c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f121026d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f121027e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f121028f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f121029g;

    /* renamed from: h, reason: collision with root package name */
    public gp1.a0 f121030h;

    public w0(android.app.Activity activity, java.lang.String finderContextId) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(finderContextId, "finderContextId");
        this.f121023a = activity;
        this.f121024b = finderContextId;
        this.f121025c = jz5.h.b(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.t0(this));
        this.f121026d = jz5.h.b(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.s0(this));
        this.f121029g = jz5.h.b(com.tencent.mm.plugin.finder.megavideo.topstory.flow.v0.f121021d);
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void a(com.tencent.mm.plugin.finder.megavideo.topstory.flow.i targetPage) {
        kotlin.jvm.internal.o.g(targetPage, "targetPage");
        this.f121027e = true;
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void b(com.tencent.mm.plugin.finder.extension.reddot.a baseRedDotResult) {
        kotlin.jvm.internal.o.g(baseRedDotResult, "baseRedDotResult");
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void c() {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f17 = f();
        f17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "unSelect");
        f17.a(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.p0(f17));
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void d(int i17, int i18, java.lang.String reportFeedId, r45.vs2 vs2Var) {
        kotlin.jvm.internal.o.g(reportFeedId, "reportFeedId");
        if (!this.f121028f) {
            this.f121028f = true;
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f121026d).getValue();
            n40.o oVar = (n40.o) i95.n0.c(n40.o.class);
            kotlin.jvm.internal.o.d(viewGroup);
            androidx.lifecycle.b0 lifecycle = f().f120993f;
            com.tencent.mm.plugin.finder.megavideo.topstory.flow.u0 u0Var = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.u0(this);
            a03.h0 h0Var = (a03.h0) oVar;
            h0Var.getClass();
            android.app.Activity context = this.f121023a;
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(lifecycle, "lifecycle");
            java.lang.String contextId = this.f121024b;
            kotlin.jvm.internal.o.g(contextId, "contextId");
            kotlinx.coroutines.l.d(h0Var.f425m, null, kotlinx.coroutines.a1.UNDISPATCHED, new a03.e0(context, viewGroup, h0Var, lifecycle, contextId, u0Var, null), 1, null);
        }
        this.f121027e = false;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f17 = f();
        f17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "select");
        f17.a(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.o0(i18, f17));
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public boolean e(boolean z17) {
        gp1.v Bi;
        r45.yj4 yj4Var;
        kd2.o0 o0Var = kd2.p1.N;
        long F0 = o0Var.a().F0();
        kd2.q0 q0Var = o0Var.a().C;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResume fromCreate=");
        sb6.append(z17);
        sb6.append(" autoPlayMode=");
        vn2.u0 u0Var = vn2.u0.f438387a;
        sb6.append(vn2.u0.f438389c);
        sb6.append(", floatball feedId=");
        sb6.append(pm0.v.u(F0));
        com.tencent.mars.xlog.Log.i("Finder.MegaVideo.MegaVideoFlutterViewStrategy", sb6.toString());
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (q0Var == null || (yj4Var = q0Var.f306812m) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderObject) yj4Var.getCustom(11);
        if (u0Var.g() && finderObject != null) {
            if (F0 != 0) {
                gp1.a0 a0Var = this.f121030h;
                if (a0Var == null) {
                    a0Var = new com.tencent.mm.plugin.finder.megavideo.topstory.flow.r0();
                }
                this.f121030h = a0Var;
                gp1.v Bi2 = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
                if (Bi2 != null) {
                    Bi2.a0(32, this.f121030h);
                }
                bw5.gd0 gd0Var = new bw5.gd0();
                gd0Var.f27816d = "session-" + java.lang.System.currentTimeMillis();
                boolean[] zArr = gd0Var.f27820h;
                zArr[1] = true;
                r45.qt2 qt2Var = q0Var.f306803d;
                gd0Var.f27817e = qt2Var != null ? qt2Var.getInteger(5) : 0;
                zArr[2] = true;
                gd0Var.f27818f = this.f121024b;
                zArr[3] = true;
                bw5.zc0 zc0Var = new bw5.zc0();
                zc0Var.d(new bw5.yr().parseFrom(finderObject.toByteArray()));
                gd0Var.f27819g = zc0Var;
                zArr[4] = true;
                qg3.i0 a17 = qg3.k0.f362826d.a();
                if (a17 != null) {
                    byte[] byteArray = gd0Var.toByteArray();
                    long cppPointer = ((qg3.k0) a17).getCppPointer();
                    kotlin.jvm.internal.o.d(byteArray);
                    urgen.ur_54A4.UR_E667.UR_F643(cppPointer, byteArray);
                }
            } else {
                gp1.a0 a0Var2 = this.f121030h;
                if (a0Var2 != null && (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) != null) {
                    Bi.L(32, a0Var2);
                }
            }
        }
        boolean z18 = !this.f121027e;
        this.f121027e = false;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f17 = f();
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "onResume called isTabShow:" + f17.f120996i + ", engineCreateDone:" + f17.f120994g);
        if (!f17.f120996i || f17.f120991d) {
            f17.f120991d = false;
        } else {
            f17.a(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.l0(f17));
        }
        return z18;
    }

    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f() {
        return (com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0) ((jz5.n) this.f121029g).getValue();
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f17 = f();
        f17.f120991d = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "onCreate called isTabShow:" + f17.f120996i + ", engineCreateDone:" + f17.f120994g);
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void onDestroy() {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f17 = f();
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "onDestroy called isTabShow:" + f17.f120996i + ", engineCreateDone:" + f17.f120994g);
        f17.a(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.j0(f17));
        synchronized (f17) {
            ((java.util.ArrayList) f17.f120995h).clear();
        }
        ((qk.t6) ((jz5.n) ((a03.h0) ((n40.o) i95.n0.c(n40.o.class))).f430r).getValue()).c();
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public boolean onPause() {
        com.tencent.mars.xlog.Log.i("Finder.MegaVideo.MegaVideoFlutterViewStrategy", "onPause jumpToFinderFeedFromJsApi:" + this.f121027e);
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f17 = f();
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "onPause called isTabShow:" + f17.f120996i + ", engineCreateDone:" + f17.f120994g);
        if (f17.f120996i) {
            f17.a(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.k0(f17));
        }
        return !this.f121027e;
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void onStart() {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f17 = f();
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "onStart called  isTabShow:" + f17.f120996i + ", engineCreateDone:" + f17.f120994g);
        if (!f17.f120996i || f17.f120991d) {
            return;
        }
        f17.a(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.m0(f17));
    }

    @Override // com.tencent.mm.plugin.finder.megavideo.topstory.flow.j
    public void onStop() {
        gp1.v Bi;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f17 = f();
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "onStop called isTabShow:" + f17.f120996i + ", engineCreateDone:" + f17.f120994g);
        if (f17.f120996i) {
            f17.a(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.n0(f17));
        }
        gp1.a0 a0Var = this.f121030h;
        if (a0Var == null || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.L(32, a0Var);
    }
}
