package tk3;

/* loaded from: classes8.dex */
public final class t implements jk3.f {

    /* renamed from: o, reason: collision with root package name */
    public static final tk3.g f419947o = new tk3.g(null);

    /* renamed from: p, reason: collision with root package name */
    public static volatile tk3.t f419948p;

    /* renamed from: d, reason: collision with root package name */
    public tk3.d f419949d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f419950e;

    /* renamed from: f, reason: collision with root package name */
    public final al3.f f419951f;

    /* renamed from: g, reason: collision with root package name */
    public final al3.f f419952g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f419953h;

    /* renamed from: i, reason: collision with root package name */
    public int f419954i;

    /* renamed from: m, reason: collision with root package name */
    public tk3.h f419955m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f419956n;

    public t() {
        al3.f fVar = new al3.f();
        this.f419951f = fVar;
        al3.f fVar2 = new al3.f();
        this.f419952g = fVar2;
        this.f419953h = jz5.h.b(tk3.i.f419926d);
        tk3.h hVar = tk3.h.f419922d;
        this.f419955m = hVar;
        this.f419956n = kz5.c1.k(new jz5.l(hVar, java.lang.Float.valueOf(0.0f)), new jz5.l(tk3.h.f419923e, java.lang.Float.valueOf(0.4f)), new jz5.l(tk3.h.f419924f, java.lang.Float.valueOf(1.0f)));
        tk3.k kVar = new tk3.k(this);
        tk3.l lVar = new tk3.l(this);
        fVar.f5856c = kVar;
        fVar2.f5856c = lVar;
    }

    public static final void k(tk3.t tVar) {
        al3.f fVar = tVar.f419951f;
        fVar.f5854a.removeCallbacks(fVar.f5855b);
        fVar.a(fVar.f5857d);
        al3.f fVar2 = tVar.f419952g;
        fVar2.f5854a.removeCallbacks(fVar2.f5855b);
        fVar2.a(fVar2.f5857d);
        tVar.s(java.lang.System.currentTimeMillis());
        d75.b.g(new tk3.p(tVar, 1.0f));
        tVar.f419955m = tk3.h.f419924f;
    }

    public static void t(tk3.t tVar, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar, boolean z17, int i17, java.lang.Object obj) {
        tk3.d dVar;
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        if ((i17 & 4) != 0) {
            z17 = true;
        }
        if (!tVar.p() || (dVar = tVar.f419949d) == null) {
            return;
        }
        if (multiTaskInfo != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView = dVar.f419913a;
            objArr[0] = multiTaskNewFloatBallView != null ? java.lang.Boolean.valueOf(multiTaskNewFloatBallView.f150555z) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "onFloatBallInfoChanged, show FloatBallView %b", objArr);
            com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView2 = dVar.f419913a;
            if (multiTaskNewFloatBallView2 != null && !multiTaskNewFloatBallView2.f150555z) {
                multiTaskNewFloatBallView2.u(z17, false, aVar);
            }
        } else {
            com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView3 = dVar.f419913a;
            if (multiTaskNewFloatBallView3 != null && multiTaskNewFloatBallView3.getVisibility() == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "onFloatBallInfoChanged, hide FloatBallView");
                com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView4 = dVar.f419913a;
                if (multiTaskNewFloatBallView4 != null) {
                    multiTaskNewFloatBallView4.p(false, false, aVar);
                }
            }
        }
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView5 = dVar.f419913a;
        if (multiTaskNewFloatBallView5 != null) {
            multiTaskNewFloatBallView5.f(multiTaskInfo, aVar);
        }
    }

    @Override // kk3.c
    public void f(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            n(multiTaskInfo, aVar);
        } else {
            d75.b.g(new tk3.o(this, multiTaskInfo, aVar));
        }
    }

    @Override // jk3.f
    public void g(boolean z17, boolean z18) {
        d75.b.g(new tk3.r(this, z17));
    }

    public final void l() {
        tk3.d dVar;
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        tk3.d dVar2 = new tk3.d(context);
        this.f419949d = dVar2;
        android.view.WindowManager windowManager = dVar2.f419915c;
        if (windowManager != null) {
            android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
            if (fp.h.c(26)) {
                layoutParams.type = 2038;
            } else {
                layoutParams.type = 2002;
            }
            layoutParams.format = 1;
            layoutParams.packageName = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageName();
            layoutParams.flags = android.R.style.DialogWindowTitle.Material;
            layoutParams.gravity = 8388659;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.x = com.tencent.mm.plugin.multitask.q0.f150495l + qp1.c0.f365708q;
            layoutParams.y = com.tencent.mm.plugin.multitask.q0.f150496m - qp1.c0.f365705n;
            try {
                windowManager.addView(dVar2.f419913a, layoutParams);
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewFloatBallContainer", "attachFloatBallViewToWindow success");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiTaskNewFloatBallContainer", e17, "attachFloatBallViewToWindow fail", new java.lang.Object[0]);
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskNewFloatBallContainer", "attachFloatBallViewToWindow, window manager is null");
        }
        boolean z17 = this.f419950e;
        if (z17) {
            tk3.d dVar3 = this.f419949d;
            if (dVar3 != null && (multiTaskNewFloatBallView = dVar3.f419913a) != null) {
                multiTaskNewFloatBallView.setNeedTranslateAnimation(z17);
            }
            this.f419950e = false;
        }
        if (!p() || (dVar = this.f419949d) == null) {
            return;
        }
        tk3.j jVar = new tk3.j(this);
        com.tencent.mm.plugin.multitask.ui.floatball.MultiTaskNewFloatBallView multiTaskNewFloatBallView2 = dVar.f419913a;
        if (multiTaskNewFloatBallView2 != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) multiTaskNewFloatBallView2.f150541i).add(jVar);
        }
    }

    public final void m(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewUIManager", "ball detachFloatBallContainer");
        d75.b.g(new tk3.m(this, i17));
    }

    public final void n(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, qn5.a aVar) {
        try {
            this.f419950e = false;
            if (multiTaskInfo == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewUIManager", "empty ball info list");
                m(0);
                if (aVar != null) {
                    aVar.a(null);
                    return;
                }
                return;
            }
            if (p()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewUIManager", "float ball already created");
                t(this, multiTaskInfo, aVar, false, 4, null);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewUIManager", "float ball did not create");
                l();
                t(this, multiTaskInfo, aVar, false, 4, null);
                q();
            }
            r(o());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskNewUIManager", "doOnFloatBallInfoChanged exp:%s", e17);
            if (aVar != null) {
                aVar.a(null);
            }
        }
    }

    public final long o() {
        return ((java.lang.Number) ((jz5.n) this.f419953h).getValue()).longValue();
    }

    public final boolean p() {
        return this.f419949d != null;
    }

    public final void q() {
        java.util.Map map = nk3.e.f338037a;
        nk3.e.f338040d = this.f419954i;
        nk3.e.f338038b = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        nk3.e.f338039c = java.lang.System.currentTimeMillis();
        java.util.Map map2 = nk3.e.f338037a;
        ((java.util.LinkedHashMap) map2).clear();
        map2.put("suspended_ball_sid", nk3.e.f338038b);
        map2.put("suspended_ball_startms", java.lang.Long.valueOf(nk3.e.f338039c));
        map2.put("suspended_ball_source", java.lang.Integer.valueOf(nk3.e.f338040d));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("generate_suspended_ball", map2, 33488);
    }

    public final void r(long j17) {
        this.f419951f.a(j17);
        if (7000 < j17) {
            j17 = 7000;
        }
        this.f419952g.a(j17);
        s(java.lang.System.currentTimeMillis());
        d75.b.g(new tk3.p(this, 1.0f));
        this.f419955m = tk3.h.f419924f;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskNewUIManager", "start timer");
    }

    public final void s(long j17) {
        if (j17 > java.lang.System.currentTimeMillis()) {
            j17 = java.lang.System.currentTimeMillis();
        }
        com.tencent.mm.sdk.platformtools.o4.M("multi_task_ui_storage").B("multi_task_float_ball_create_time", j17);
    }
}
