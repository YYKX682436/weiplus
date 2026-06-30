package nd1;

/* loaded from: classes7.dex */
public final class x extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f336414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nd1.c0 f336415e;

    public x(com.tencent.mm.plugin.appbrand.o6 o6Var, nd1.c0 c0Var) {
        this.f336414d = o6Var;
        this.f336415e = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f336414d;
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = o6Var.u0().L1;
        if (halfScreenConfig != null && (weAppHalfScreenStatusChangeListener = halfScreenConfig.f77366p) != null) {
            weAppHalfScreenStatusChangeListener.b(false);
        }
        nd1.c0.D(this.f336415e, o6Var, true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenStatusChangeListener weAppHalfScreenStatusChangeListener;
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = this.f336414d.u0().L1;
        if (halfScreenConfig == null || (weAppHalfScreenStatusChangeListener = halfScreenConfig.f77366p) == null) {
            return;
        }
        weAppHalfScreenStatusChangeListener.b(true);
    }
}
