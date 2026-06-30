package w03;

/* loaded from: classes10.dex */
public final class u extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f441903d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f441904e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f441905f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f441906g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f441907h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f441908i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f441909m;

    /* renamed from: n, reason: collision with root package name */
    public long f441910n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f441911o;

    /* renamed from: p, reason: collision with root package name */
    public android.os.Bundle f441912p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f441913q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f441914r;

    /* renamed from: s, reason: collision with root package name */
    public s03.e f441915s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f441916t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f441903d = jz5.h.b(w03.q.f441899d);
        this.f441911o = true;
    }

    public static void S6(w03.u uVar, boolean z17, boolean z18, boolean z19, java.lang.Long l17, int i17, java.lang.Object obj) {
        boolean z27 = (i17 & 1) != 0 ? false : z17;
        boolean z28 = (i17 & 2) != 0 ? false : z18;
        boolean z29 = (i17 & 4) != 0 ? false : z19;
        java.lang.Long l18 = (i17 & 8) != 0 ? null : l17;
        if (uVar.f441905f || uVar.f441913q) {
            uVar.O6().a7(false);
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "tryToAddFloatBall doingFloatBallExitPageAnimation and ignore");
            return;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.B7).getValue()).r()).intValue();
        if (z27) {
            boolean z37 = intValue == 1 || intValue == 2;
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "tryToAddFloatBall, enableAutoFloatBall=" + z37 + ", hasTriggerAdd=" + uVar.f441913q);
            if (!(z37 && !uVar.f441913q)) {
                if (!(!uVar.f441913q && uVar.f441907h && uVar.f441908i && !kd2.p1.N.a().u())) {
                    uVar.O6().a7(false);
                    return;
                }
            }
        }
        boolean z38 = uVar.f441914r || !z27 || intValue == 2;
        kd2.o0 o0Var = kd2.p1.N;
        if (!o0Var.a().B0(z29, false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "addFloatBall: unable to add float ball");
            uVar.O6().a7(false);
        } else if (uVar.R6(z29, true, z38, l18, z27, z28)) {
            uVar.f441909m = true;
            if (z28) {
                o0Var.a().C0(3);
            }
            kotlinx.coroutines.l.d(((c61.l7) i95.n0.c(c61.l7.class)).V, null, null, new w03.o(z29, z38, false, uVar, z28, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "addFloatBall saveData failed");
            uVar.O6().a7(false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "handleExitAnimation backClose: " + z27);
    }

    public final com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity O6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity");
        return (com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity) activity;
    }

    public final void P6() {
        this.f441904e = true;
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f441903d).getValue();
        if (g0Var != null) {
            ((ep1.k) g0Var).c(getActivity().getIntent(), getActivity().getWindow().getDecorView(), null, new w03.r(this));
        }
    }

    public final void Q6() {
        if (this.f441906g) {
            return;
        }
        kd2.o0 o0Var = kd2.p1.N;
        o0Var.a().f93132d.f93059t = false;
        o0Var.a().x();
        o0Var.a().t0();
        this.f441906g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean R6(boolean r17, boolean r18, boolean r19, java.lang.Long r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w03.u.R6(boolean, boolean, boolean, java.lang.Long, boolean, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w03.u.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        kd2.p1.N.a().P0();
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.r0();
        }
        this.f441915s = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        super.onFinished();
        kd2.p1.N.a().p();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onNewIntent(android.content.Intent intent) {
        java.lang.String stringExtra = intent != null ? intent.getStringExtra("FLOAT_BALL_KEY") : null;
        this.f441907h = !(stringExtra == null || stringExtra.length() == 0);
        this.f441908i = kd2.p1.N.a().O0();
        if (intent != null) {
            this.f441910n = intent.getLongExtra("KEY_ENTER_PLAYING_FEED_ID", 0L);
        }
        this.f441911o = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "onNewIntent %s", java.lang.Boolean.valueOf(this.f441904e));
        if (this.f441907h && (getActivity() instanceof com.tencent.mm.ui.MMActivity)) {
            P6();
        }
        this.f441912p = getContext().getIntent().getExtras();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (!this.f441909m) {
            R6(true, false, false, null, false, false);
        }
        if (this.f441906g) {
            kd2.p1.N.a().z();
        }
        kd2.p1 a17 = kd2.p1.N.a();
        gp1.v vVar = a17.f93136h;
        if (vVar != null) {
            vVar.o0(a17.f93132d);
        }
        this.f441906g = false;
        O6().W6();
        this.f441916t = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        gp1.v Bi;
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        if (this.f441908i && this.f441907h && this.f441911o) {
            if (ep1.m.h(getIntent())) {
                ep1.m.a(getActivity(), false);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFloatBallAnimationUIC", "onResume %s", java.lang.Boolean.valueOf(this.f441904e));
            if (!this.f441904e) {
                Q6();
            }
        } else {
            kd2.p1.T0(kd2.p1.N.a(), true, true, false, 4, null);
        }
        this.f441911o = false;
        if (ep1.m.h(getIntent()) && (swipeBackLayout = O6().getSwipeBackLayout()) != null) {
            swipeBackLayout.setNeedRequestActivityTranslucent(false);
            swipeBackLayout.d(true);
        }
        if (!this.f441907h && (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) != null) {
            Bi.k0();
        }
        if (this.f441916t) {
            O6().Y6();
            this.f441916t = false;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
    }
}
