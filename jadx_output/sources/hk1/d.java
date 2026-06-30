package hk1;

/* loaded from: classes7.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk1.e f281872d;

    public d(hk1.e eVar) {
        this.f281872d = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        hk1.e eVar = this.f281872d;
        android.view.ViewGroup viewGroup = eVar.f281876f;
        if (viewGroup != null) {
            viewGroup.setTag(java.lang.Boolean.FALSE);
        }
        android.view.ViewGroup viewGroup2 = eVar.f281876f;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.ViewGroup viewGroup = this.f281872d.f281876f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTag(java.lang.Boolean.TRUE);
    }
}
