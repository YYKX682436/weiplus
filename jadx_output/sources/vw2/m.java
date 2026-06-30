package vw2;

/* loaded from: classes2.dex */
public final class m implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f440862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f440863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f440864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f440865g;

    public m(int i17, in5.s0 s0Var, int i18, in5.s0 s0Var2) {
        this.f440862d = i17;
        this.f440863e = s0Var;
        this.f440864f = i18;
        this.f440865g = s0Var2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        vw2.n.f440868g.remove(java.lang.Integer.valueOf(this.f440864f));
        com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "startButtonEduAnimation: animation onCancel. holder=" + this.f440865g);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        vw2.n.f440868g.remove(java.lang.Integer.valueOf(this.f440862d));
        com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "startButtonEduAnimation: animation onEnd. holder=" + this.f440863e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
