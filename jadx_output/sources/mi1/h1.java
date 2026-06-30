package mi1;

/* loaded from: classes7.dex */
public final class h1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f326564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f326565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi1.r1 f326566f;

    public h1(android.widget.LinearLayout linearLayout, mi1.q1 q1Var, mi1.r1 r1Var) {
        this.f326564d = linearLayout;
        this.f326565e = q1Var;
        this.f326566f = r1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        mi1.t1 t1Var = mi1.t1.f326692a;
        mi1.q1 q1Var = this.f326565e;
        android.widget.TextView a17 = t1Var.a(q1Var.f326663d);
        mi1.r1 r1Var = this.f326566f;
        if (a17 != null) {
            a17.setText(r1Var.f326672a);
            t1Var.c(a17, r1Var.f326678g, false);
        }
        mi1.q1.b(q1Var);
        if (r1Var.f326677f) {
            this.f326564d.setBackgroundResource(com.tencent.mm.R.drawable.f480772yj);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationStart(animation);
        this.f326564d.setVisibility(0);
        mi1.q1 q1Var = this.f326565e;
        q1Var.f326663d.f74821z.m();
        jz5.g gVar = mi1.q1.f326662h;
        com.tencent.mars.xlog.Log.i("CapsuleTipsAnimator", "animateShow-> onAnimationStart ->reportCapsuleTipsMutation");
        q1Var.f326663d.E1(true, this.f326566f.f326676e);
    }
}
