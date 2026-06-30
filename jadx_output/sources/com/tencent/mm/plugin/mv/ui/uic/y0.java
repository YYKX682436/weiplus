package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class y0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public boolean f151541d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f151542e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f151543f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f151544g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f151545h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151544g = jz5.h.b(com.tencent.mm.plugin.mv.ui.uic.u0.f151471d);
        this.f151545h = jz5.h.b(com.tencent.mm.plugin.mv.ui.uic.v0.f151483d);
    }

    public final void O6() {
        if (this.f151543f) {
            return;
        }
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ((ll3.e1) P6).x();
        }
        this.f151543f = true;
    }

    public final ka0.g0 P6() {
        return (ka0.g0) ((jz5.n) this.f151545h).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        if (this.f151542e) {
            return true;
        }
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ll3.e1 e1Var = (ll3.e1) P6;
            e1Var.f319158v = false;
            com.tencent.mm.plugin.ball.service.d dVar = (com.tencent.mm.plugin.ball.service.d) P6;
            if (dVar.u()) {
                dVar.W(false);
            } else {
                e1Var.e0(b21.m.b());
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicMvFloatBallAnimationUIC", "onBackPressed hideAllFloatBall: %s, needExitAnimation: %s", java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        pv.g0 g0Var = (pv.g0) ((jz5.n) this.f151544g).getValue();
        java.lang.Boolean bool = null;
        if (g0Var != null) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            com.tencent.mm.ui.ga controller = ((com.tencent.mm.ui.MMActivity) activity).getController();
            bool = java.lang.Boolean.valueOf(((ep1.k) g0Var).e(null, controller != null ? controller.w() : null, null, null, new com.tencent.mm.plugin.mv.ui.uic.w0(this)));
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ll3.e1 e1Var = (ll3.e1) P6;
            e1Var.f319158v = true;
            e1Var.f319160x = true;
        }
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            this.f151541d = true;
            pv.g0 g0Var = (pv.g0) ((jz5.n) this.f151544g).getValue();
            if (g0Var != null) {
                android.content.Intent intent = getActivity().getIntent();
                androidx.appcompat.app.AppCompatActivity activity = getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                com.tencent.mm.ui.ga controller = ((com.tencent.mm.ui.MMActivity) activity).getController();
                ((ep1.k) g0Var).c(intent, controller != null ? controller.w() : null, null, new com.tencent.mm.plugin.mv.ui.uic.x0(this));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ((ll3.e1) P6).z();
        }
        this.f151543f = false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (!this.f151541d) {
            O6();
        }
        ep1.m.a(getActivity(), false);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        gp1.v Bi;
        super.onStart();
        P6();
        if (ep1.m.g(getActivity().getIntent()) || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.k0();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        ka0.g0 P6 = P6();
        if (P6 != null) {
            ((ll3.e1) P6).t0();
        }
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.r0();
        }
    }
}
