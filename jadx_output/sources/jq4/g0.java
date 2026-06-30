package jq4;

/* loaded from: classes5.dex */
public final class g0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f301148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f301149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f301150f;

    public g0(android.view.View view, jq4.z0 z0Var, boolean z17) {
        this.f301148d = view;
        this.f301149e = z0Var;
        this.f301150f = z17;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "dismissAnimationEnd");
        super.onAnimationEnd(animation);
        android.view.View view = this.f301148d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$dismissCard$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager$dismissCard$1$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        jq4.z0 z0Var = this.f301149e;
        if (z0Var.f301235d == null) {
            com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "windowManager is null At Animation: ".concat(jq4.g0.class.getName()));
        }
        android.view.ViewManager viewManager = z0Var.f301235d;
        android.view.View view2 = this.f301148d;
        if (viewManager != null) {
            viewManager.removeView(view2);
        }
        rq4.s sVar = rq4.s.f399098a;
        rq4.r rVar = rq4.s.f399100c;
        if (rVar.f399096d == 1) {
            rVar.f399094b = 1;
        }
        if (this.f301150f) {
            z0Var.u(view2);
        }
        z0Var.f301235d = null;
        z0Var.f301241j = null;
        z0Var.f301233b = false;
        z0Var.f301250s = false;
    }
}
