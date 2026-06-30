package lh5;

/* loaded from: classes2.dex */
public final class d implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f318726a;

    public d(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f318726a = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        this.f318726a.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
    }
}
