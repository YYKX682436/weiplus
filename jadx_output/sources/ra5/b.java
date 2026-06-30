package ra5;

/* loaded from: classes3.dex */
public final class b implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f393555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ra5.c f393556e;

    public b(android.graphics.drawable.Drawable drawable, ra5.c cVar) {
        this.f393555d = drawable;
        this.f393556e = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        onAnimationEnd(animation);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        this.f393555d.setAlpha(255);
        this.f393556e.f393557d.setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
