package ww1;

/* loaded from: classes14.dex */
public class w2 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.AnimationSet f450324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.x2 f450325b;

    public w2(ww1.x2 x2Var, android.view.animation.AnimationSet animationSet) {
        this.f450325b = x2Var;
        this.f450324a = animationSet;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        android.view.animation.AnimationSet animationSet = this.f450324a;
        animationSet.setStartOffset(1700L);
        this.f450325b.f450346e.f450122a0.startAnimation(animationSet);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        this.f450325b.f450346e.f450122a0.setVisibility(0);
    }
}
