package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public class z extends com.tencent.mm.ui.component.UIComponent implements com.tencent.mm.plugin.ting.uic.i {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f174804d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f174805e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f174806f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f174807g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f174808h;

    /* renamed from: i, reason: collision with root package name */
    public al4.b f174809i;

    /* renamed from: m, reason: collision with root package name */
    public al4.b f174810m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f174811n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f174812o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f174813p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f174814q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f174815r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f174816s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f174804d = jz5.h.b(com.tencent.mm.plugin.ting.uic.t.f174795d);
        this.f174805e = jz5.h.b(com.tencent.mm.plugin.ting.uic.y.f174803d);
        this.f174806f = jz5.h.b(new com.tencent.mm.plugin.ting.uic.x(activity));
        this.f174807g = jz5.h.b(com.tencent.mm.plugin.ting.uic.o.f174781d);
        this.f174808h = jz5.h.b(com.tencent.mm.plugin.ting.uic.p.f174786d);
        jz5.h.b(new com.tencent.mm.plugin.ting.uic.u(activity));
    }

    public static final void Q6(kotlin.coroutines.Continuation continuation, boolean z17) {
        try {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TingFloatBallAnimationUIC", e17, "exitWithAnimation exception", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.ting.uic.i
    public void G(al4.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f174809i = listener;
    }

    @Override // com.tencent.mm.plugin.ting.uic.i
    public void O5(al4.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f174810m = null;
    }

    public final boolean O6(al4.b bVar) {
        boolean z17;
        ep1.m.a(getActivity(), false);
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f174804d).getValue();
        if (g0Var != null) {
            z17 = ((ep1.k) g0Var).e(null, getActivity().getWindow().getDecorView(), null, new com.tencent.mm.plugin.ting.uic.q(), new com.tencent.mm.plugin.ting.uic.r(bVar, this));
        } else {
            z17 = false;
        }
        if (z17) {
            al4.b bVar2 = this.f174810m;
            if (bVar2 != null) {
                bVar2.onAnimationStart();
            }
            R6(false);
        }
        return z17;
    }

    public final void P6() {
        if (this.f174814q) {
            return;
        }
        il4.l lVar = il4.l.f292142a;
        il4.l.f292145d = null;
        ku5.u0 u0Var = ku5.t0.f312615d;
        il4.j jVar = il4.j.f292139d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(jVar, 3000L, false);
        if (getActivity().isFinishing() && ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).ij()) {
            ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).zj();
        }
    }

    public final void R6(boolean z17) {
        sl4.a a17 = jm4.t2.a(bw5.eq0.TingMusic);
        if (a17 == null) {
            return;
        }
        if (!(a17 instanceof cm4.a)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TingFloatBallAnimationUIC", "markNeedEnterTranslation floatBallHelper invalid");
            return;
        }
        cm4.a aVar = (cm4.a) a17;
        aVar.f409264s = z17;
        aVar.f93132d.f93058s = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean S6() {
        /*
            r8 = this;
            jz5.g r0 = r8.f174807g
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La2
            java.lang.Class<s40.w0> r0 = s40.w0.class
            i95.m r3 = i95.n0.c(r0)
            s40.w0 r3 = (s40.w0) r3
            com.tencent.mm.feature.finder.live.v4 r3 = (com.tencent.mm.feature.finder.live.v4) r3
            r3.getClass()
            com.tencent.mm.plugin.finder.live.view.k0 r3 = dk2.ef.f233380e
            r4 = 0
            if (r3 == 0) goto L29
            android.content.Context r3 = r3.getContext()
            goto L2a
        L29:
            r3 = r4
        L2a:
            boolean r5 = r3 instanceof android.app.Activity
            if (r5 == 0) goto L31
            r4 = r3
            android.app.Activity r4 = (android.app.Activity) r4
        L31:
            if (r4 == 0) goto La2
            int r3 = r4.getTaskId()
            boolean r4 = r4.isFinishing()
            if (r4 != 0) goto L59
            java.lang.Class<qk.t8> r5 = qk.t8.class
            i95.m r5 = i95.n0.c(r5)
            qk.t8 r5 = (qk.t8) r5
            ef0.h3 r5 = (ef0.h3) r5
            java.lang.Integer r5 = r5.f252226f
            if (r5 != 0) goto L4c
            goto L54
        L4c:
            int r5 = r5.intValue()
            if (r5 != r3) goto L54
            r5 = r2
            goto L55
        L54:
            r5 = r1
        L55:
            if (r5 == 0) goto L59
            r5 = r2
            goto L5a
        L59:
            r5 = r1
        L5a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "needAddFloatBallWhenExit finderLiveId: "
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = ", finderLiveActFinish: "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = ", sameTask: "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "MicroMsg.TingFloatBallAnimationUIC"
            com.tencent.mars.xlog.Log.i(r4, r3)
            if (r5 == 0) goto La2
            i95.m r0 = i95.n0.c(r0)
            s40.w0 r0 = (s40.w0) r0
            com.tencent.mm.feature.finder.live.v4 r0 = (com.tencent.mm.feature.finder.live.v4) r0
            boolean r0 = r0.rk()
            if (r0 == 0) goto La2
            java.lang.String r0 = "needAddFloatBallWhenExit false for visitor living and stop"
            com.tencent.mars.xlog.Log.i(r4, r0)
            java.lang.Class<pv.z> r0 = pv.z.class
            i95.m r0 = i95.n0.c(r0)
            pv.z r0 = (pv.z) r0
            ov.b r0 = (ov.b) r0
            r0.Ni()
            return r1
        La2:
            jm4.v2 r0 = jm4.w2.f300435d
            jm4.u2 r0 = r0.a()
            if (r0 == 0) goto Lc3
            bw5.eq0 r3 = bw5.eq0.AudioRadio
            jm4.w2 r0 = (jm4.w2) r0
            jm4.n2 r0 = r0.d(r3)
            if (r0 == 0) goto Lc3
            jm4.p2 r0 = (jm4.p2) r0
            jm4.g3 r0 = r0.f()
            if (r0 == 0) goto Lc3
            jm4.h3 r0 = (jm4.h3) r0
            int r0 = r0.i()
            goto Lc4
        Lc3:
            r0 = r1
        Lc4:
            boolean r0 = il4.m.a(r0)
            if (r0 == 0) goto Lcb
            return r1
        Lcb:
            java.lang.Class<qk.i9> r0 = qk.i9.class
            i95.m r0 = i95.n0.c(r0)
            qk.i9 r0 = (qk.i9) r0
            ef0.l4 r0 = (ef0.l4) r0
            qk.g9 r0 = r0.bj()
            if (r0 == 0) goto Le2
            rk4.z8 r0 = (rk4.z8) r0
            boolean r0 = r0.fj()
            goto Le3
        Le2:
            r0 = r1
        Le3:
            if (r0 == 0) goto Le6
            return r2
        Le6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ting.uic.z.S6():boolean");
    }

    public final void T6() {
        if (this.f174813p) {
            return;
        }
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        boolean b17 = kotlin.jvm.internal.o.b(((rk4.k8) aj6).f396796e, getIntent().getStringExtra("session_id"));
        b66.g b18 = b66.i.f18167d.b(bw5.eq0.TingMusic);
        if (b18 != null) {
            ((b66.i) b18).e();
        }
        if (b17) {
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(false);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(false);
        }
        this.f174813p = true;
    }

    public final void U6() {
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.W(1.0f);
        }
    }

    public final void V6() {
        java.lang.Object value = ((jz5.n) this.f174805e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((ef0.l4) ((qk.i9) value)).Vi(((java.lang.Number) ((jz5.n) this.f174806f).getValue()).intValue(), false);
        boolean b17 = kotlin.jvm.internal.o.b(((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).f396796e, getIntent().getStringExtra("session_id"));
        boolean S6 = S6();
        com.tencent.mars.xlog.Log.i("MicroMsg.TingFloatBallAnimationUIC", "tryShowTingFloatBall exitNotAddFloatBall: " + this.f174815r + ", canAddFloatBall: " + S6 + ", isSessionValid: " + b17);
        if (this.f174815r || !b17 || ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk()) {
            P6();
            return;
        }
        if (S6) {
            R6(true);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(true);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Bi(true);
        } else {
            R6(true);
            ((rk4.y4) ((qk.s8) i95.n0.c(qk.s8.class))).Ai(true);
            P6();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(boolean r10, boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ting.uic.z.d(boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.ting.uic.i
    public void g0(al4.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f174809i = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (((java.lang.Boolean) ((jz5.n) this.f174808h).getValue()).booleanValue()) {
            al4.b bVar = this.f174809i;
            if (bVar != null) {
                bVar.a();
            }
        } else {
            this.f174811n = true;
            pv.g0 g0Var = (pv.g0) ((jz5.n) this.f174804d).getValue();
            if (g0Var != null) {
                ((ep1.k) g0Var).c(getActivity().getIntent(), getActivity().getWindow().getDecorView(), new com.tencent.mm.plugin.ting.uic.v(), new com.tencent.mm.plugin.ting.uic.w(this));
            }
        }
        java.lang.Object value = ((jz5.n) this.f174805e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        ((ef0.l4) ((qk.i9) value)).Vi(((java.lang.Number) ((jz5.n) this.f174806f).getValue()).intValue(), true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        V6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        b66.g b17;
        super.onPause();
        if (this.f174813p && (b17 = b66.i.f18167d.b(bw5.eq0.TingMusic)) != null) {
            ((b66.i) b17).d();
        }
        this.f174813p = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (!this.f174811n) {
            T6();
        }
        if (ep1.m.h(getIntent())) {
            ep1.m.a(getActivity(), false);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        this.f174816s = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        if (this.f174816s) {
            V6();
        }
    }

    @Override // com.tencent.mm.plugin.ting.uic.i
    public void r0(al4.b listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f174810m = listener;
    }
}
