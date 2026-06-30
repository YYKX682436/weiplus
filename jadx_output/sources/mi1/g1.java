package mi1;

/* loaded from: classes7.dex */
public final class g1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f326560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f326561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi1.r1 f326562f;

    public g1(mi1.q1 q1Var, android.widget.LinearLayout linearLayout, mi1.r1 r1Var) {
        this.f326560d = q1Var;
        this.f326561e = linearLayout;
        this.f326562f = r1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        int i17;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        mi1.q1 q1Var = this.f326560d;
        q1Var.f326663d.f74821z.l();
        this.f326561e.setVisibility(8);
        q1Var.f326663d.f74821z.d().f91037h = false;
        mi1.q1.b(q1Var);
        jz5.g gVar = mi1.q1.f326662h;
        com.tencent.mars.xlog.Log.i("CapsuleTipsAnimator", "animateShow-> onAnimationEnd ->reportCapsuleTipsMutation");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = q1Var.f326663d;
        mi1.r1 r1Var = this.f326562f;
        if (r1Var != null) {
            i17 = r1Var.f326676e;
        } else {
            mi1.z0 z0Var = mi1.z0.f326739e;
            i17 = 0;
        }
        appBrandRuntime.E1(false, i17);
    }
}
