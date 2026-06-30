package m31;

/* loaded from: classes9.dex */
public final class l1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f323164d;

    public l1(m31.p1 p1Var) {
        this.f323164d = p1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        m31.p1 p1Var = this.f323164d;
        java.lang.Integer num = p1Var.G;
        if (num != null) {
            android.view.View findViewById = p1Var.f323193t.findViewById(num.intValue());
            if (findViewById != null) {
                ((android.widget.LinearLayout) p1Var.f323193t.findViewById(com.tencent.mm.R.id.cg7)).removeView(findViewById);
            }
        }
        zk1.a.a(p1Var.f323183g);
    }
}
