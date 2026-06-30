package hk1;

/* loaded from: classes7.dex */
public final class c extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk1.e f281871d;

    public c(hk1.e eVar) {
        this.f281871d = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f281871d.f281876f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTag(java.lang.Boolean.FALSE);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f281871d.f281876f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTag(java.lang.Boolean.TRUE);
    }
}
