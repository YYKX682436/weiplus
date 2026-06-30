package mi1;

/* loaded from: classes7.dex */
public final class u0 extends mi1.g0 implements mi1.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f326695d;

    /* renamed from: e, reason: collision with root package name */
    public int f326696e;

    /* renamed from: f, reason: collision with root package name */
    public android.animation.Animator f326697f;

    public u0(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        this.f326695d = runtime;
        this.f326696e = Integer.MIN_VALUE;
    }

    public static final void n(mi1.u0 u0Var, al1.q qVar, boolean z17) {
        if (qVar == null) {
            u0Var.getClass();
            return;
        }
        u0Var.q();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = u0Var.f326695d;
        mi1.q1 q1Var = appBrandRuntime.f74821z.f326707f;
        jz5.g gVar = mi1.q1.f326662h;
        q1Var.c(true, true);
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton d17 = appBrandRuntime.f74821z.d();
        android.view.View a17 = appBrandRuntime.f74821z.a(com.tencent.mm.R.id.eyp);
        if (a17 != null) {
            d17.removeView(a17);
        }
        qVar.setId(com.tencent.mm.R.id.eyp);
        qVar.setColor(d17.getStyleColor());
        d17.f91033d.setVisibility(8);
        d17.f91034e = qVar;
        d17.addView(qVar);
        qVar.setAlpha(0.0f);
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.addUpdateListener(new al1.o(qVar));
        ofFloat.start();
        if (z17) {
            android.animation.Animator l17 = u0Var.l(d17.getCustomOptionView());
            l17.start();
            u0Var.f326697f = l17;
        }
    }

    @Override // mi1.w0
    public void b(java.lang.CharSequence charSequence) {
    }

    @Override // mi1.w0
    public void c(android.graphics.drawable.Drawable drawable) {
        p(drawable);
    }

    @Override // mi1.w0
    public void dismiss() {
        p(null);
    }

    @Override // mi1.w0
    public void e(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        o(params);
    }

    @Override // mi1.w0
    public void f(int i17, boolean z17) {
        this.f326696e = i17;
    }

    @Override // mi1.w0
    public void i(boolean z17) {
        com.tencent.mars.xlog.Log.i("CapsuleBarBlinkWrapper", "reportCapsuleBlinkMutationFinish isCustomStatus:%b", java.lang.Boolean.valueOf(z17));
        this.f326695d.C1(false, this.f326696e, z17);
    }

    public void o(java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        java.lang.Object obj = params.get("key_type");
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarBlinkHelper.CustomStatus");
        mi1.a aVar = (mi1.a) obj;
        java.lang.Object obj2 = params.get("key_allow_animation");
        java.lang.Boolean bool = obj2 instanceof java.lang.Boolean ? (java.lang.Boolean) obj2 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        mi1.a aVar2 = mi1.a.TRADE;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f326695d;
        if (aVar == aVar2) {
            new al1.w(appBrandRuntime.f74821z.d().getContext(), params, new mi1.r0(this, booleanValue));
        } else if (aVar == mi1.a.KOUBEI) {
            new al1.u(appBrandRuntime.f74821z.d().getContext(), params, new mi1.s0(this, booleanValue));
        }
        int ordinal = aVar.ordinal();
        com.tencent.mars.xlog.Log.i("CapsuleBarBlinkWrapper", "reportCapsuleBlinkMutationStart isCustomStatus:%b", java.lang.Boolean.TRUE);
        appBrandRuntime.C1(true, ordinal, true);
    }

    public void p(android.graphics.drawable.Drawable drawable) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f326695d;
        com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton d17 = appBrandRuntime.f74821z.d();
        q();
        boolean z17 = drawable != null;
        boolean z18 = (z17 || d17.f91034e == null) ? false : true;
        appBrandRuntime.f74821z.f326707f.c(false, drawable != null);
        d17.b();
        com.tencent.mars.xlog.Log.i("CapsuleBarBlinkWrapper", "applyLogo isStart " + z17);
        if (z17) {
            int i17 = this.f326696e;
            com.tencent.mars.xlog.Log.i("CapsuleBarBlinkWrapper", "reportCapsuleBlinkMutationStart isCustomStatus:%b", java.lang.Boolean.valueOf(z18));
            appBrandRuntime.C1(true, i17, z18);
        } else {
            i(z18);
        }
        if (drawable != null) {
            d17.getButtonImage().setImageDrawable(drawable);
            android.animation.Animator l17 = l(d17.getButtonImage());
            ((android.animation.ValueAnimator) l17).addUpdateListener(new mi1.t0(d17, drawable));
            l17.start();
            this.f326697f = l17;
        }
    }

    public final void q() {
        android.animation.Animator animator = this.f326697f;
        if (animator != null) {
            animator.cancel();
        }
        android.widget.ImageView buttonImage = this.f326695d.f74821z.d().getButtonImage();
        if (buttonImage != null) {
            buttonImage.clearAnimation();
        }
    }
}
