package zm1;

/* loaded from: classes11.dex */
public class h extends com.tencent.mm.ui.component.UIComponent implements zm1.n {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f474136d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f474137e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f474138f;

    /* renamed from: g, reason: collision with root package name */
    public um1.b f474139g;

    /* renamed from: h, reason: collision with root package name */
    public um1.b f474140h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f474141i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f474142m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f474143n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f474144o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f474136d = jz5.h.b(zm1.d.f474132d);
        jz5.h.b(new zm1.g(activity));
        this.f474137e = jz5.h.b(zm1.a.f474130d);
        this.f474138f = jz5.h.b(zm1.b.f474131d);
        jz5.h.b(new zm1.e(activity));
    }

    public static final void O6(kotlin.coroutines.Continuation continuation, boolean z17) {
        try {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizAudioFloatBallAnimationUIC", e17, "exitWithAnimation exception", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if ((r4 != null && r4.intValue() == r2) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean P6() {
        /*
            r7 = this;
            jz5.g r0 = r7.f474137e
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L9e
            java.lang.Class<s40.w0> r0 = s40.w0.class
            i95.m r2 = i95.n0.c(r0)
            s40.w0 r2 = (s40.w0) r2
            com.tencent.mm.feature.finder.live.v4 r2 = (com.tencent.mm.feature.finder.live.v4) r2
            r2.getClass()
            com.tencent.mm.plugin.finder.live.view.k0 r2 = dk2.ef.f233380e
            r3 = 0
            if (r2 == 0) goto L28
            android.content.Context r2 = r2.getContext()
            goto L29
        L28:
            r2 = r3
        L29:
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 == 0) goto L30
            r3 = r2
            android.app.Activity r3 = (android.app.Activity) r3
        L30:
            if (r3 == 0) goto L9e
            int r2 = r3.getTaskId()
            boolean r3 = r3.isFinishing()
            if (r3 != 0) goto L58
            java.lang.Class<rv.i2> r4 = rv.i2.class
            i95.m r4 = i95.n0.c(r4)
            rv.i2 r4 = (rv.i2) r4
            bv.f r4 = (bv.f) r4
            java.lang.Integer r4 = r4.f24646e
            r5 = 1
            if (r4 != 0) goto L4c
            goto L54
        L4c:
            int r4 = r4.intValue()
            if (r4 != r2) goto L54
            r4 = r5
            goto L55
        L54:
            r4 = r1
        L55:
            if (r4 == 0) goto L58
            goto L59
        L58:
            r5 = r1
        L59:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "needAddFloatBallWhenExit finderLiveId: "
            r4.<init>(r6)
            r4.append(r2)
            java.lang.String r2 = ", finderLiveActFinish: "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = ", sameTask: "
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "MicroMsg.BizAudioFloatBallAnimationUIC"
            com.tencent.mars.xlog.Log.i(r3, r2)
            if (r5 == 0) goto L9e
            i95.m r0 = i95.n0.c(r0)
            s40.w0 r0 = (s40.w0) r0
            com.tencent.mm.feature.finder.live.v4 r0 = (com.tencent.mm.feature.finder.live.v4) r0
            boolean r0 = r0.rk()
            if (r0 == 0) goto L9e
            java.lang.String r0 = "needAddFloatBallWhenExit false for visitor living and stop"
            com.tencent.mars.xlog.Log.i(r3, r0)
            java.lang.Class<pv.z> r0 = pv.z.class
            i95.m r0 = i95.n0.c(r0)
            pv.z r0 = (pv.z) r0
            ov.b r0 = (ov.b) r0
            r0.Ni()
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: zm1.h.P6():boolean");
    }

    public final void Q6() {
        if (this.f474142m) {
            return;
        }
        rv.j2 Bi = ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).Bi();
        if (kotlin.jvm.internal.o.b(((mm1.b0) Bi).f328639e, getIntent().getStringExtra("session_id"))) {
            ((b66.i) tm1.h.f420470a.a()).e();
        }
        this.f474142m = true;
    }

    @Override // zm1.n
    public void R(um1.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f474139g = listener;
    }

    public final void R6() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.W(1.0f);
        }
    }

    public final void S6() {
        boolean b17 = kotlin.jvm.internal.o.b(((mm1.b0) ((mm1.f0) ((rv.k2) i95.n0.c(rv.k2.class))).Bi()).f328639e, getIntent().getStringExtra("session_id"));
        P6();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAudioFloatBallAnimationUIC", "tryShowBizAudioFloatBall exitNotAddFloatBall: " + this.f474143n + ", canAddFloatBall: false, isSessionValid: " + b17);
        if (this.f474143n || !b17 || ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk()) {
            return;
        }
        ((b66.i) tm1.h.f420470a.a()).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    @Override // zm1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(boolean r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zm1.h.d(boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // zm1.n
    public void k5(um1.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f474140h = listener;
    }

    @Override // zm1.n
    public void m0(um1.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f474139g = null;
    }

    @Override // zm1.n
    public void m2(um1.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f474140h = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (((java.lang.Boolean) ((jz5.n) this.f474138f).getValue()).booleanValue()) {
            um1.b bVar = this.f474139g;
            if (bVar != null) {
                bVar.a();
                return;
            }
            return;
        }
        this.f474141i = true;
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f474136d).getValue();
        if (g0Var != null) {
            ((ep1.k) g0Var).c(getActivity().getIntent(), getActivity().getWindow().getDecorView(), null, new zm1.f(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        S6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f474142m = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (!this.f474141i) {
            Q6();
        }
        if (ep1.m.h(getIntent())) {
            ep1.m.a(getActivity(), false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        this.f474144o = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (this.f474144o) {
            S6();
        }
    }
}
