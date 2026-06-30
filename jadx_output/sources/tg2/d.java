package tg2;

/* loaded from: classes10.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg2.g f419162d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f419163e;

    public d(tg2.g gVar, android.widget.ImageView imageView) {
        this.f419162d = gVar;
        this.f419163e = imageView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f419162d.f419174a.removeView(this.f419163e);
    }
}
