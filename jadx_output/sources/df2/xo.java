package df2;

/* loaded from: classes3.dex */
public final class xo implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zo f231791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f231792e;

    public xo(df2.zo zoVar, android.widget.ImageView imageView) {
        this.f231791d = zoVar;
        this.f231792e = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.widget.ImageView imageView = this.f231792e;
        imageView.setVisibility(8);
        zl2.r4.f473950a.Q2(imageView);
        df2.zo zoVar = this.f231791d;
        kotlinx.coroutines.r2 r2Var = zoVar.f231982p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        zoVar.f231982p = com.tencent.mm.plugin.finder.live.util.y.o(zoVar, null, null, new df2.vo(zoVar, null), 3, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        df2.zo zoVar = this.f231791d;
        android.widget.FrameLayout Z6 = zoVar.Z6();
        if (Z6 != null) {
            Z6.setVisibility(0);
        }
        this.f231792e.setVisibility(0);
        kotlinx.coroutines.r2 r2Var = zoVar.f231982p;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
    }
}
