package vw2;

/* loaded from: classes2.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f440844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f440845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vw2.b f440846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f440847g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f440848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vw2.b f440849i;

    public h(yz5.a aVar, in5.s0 s0Var, vw2.b bVar, yz5.a aVar2, in5.s0 s0Var2, vw2.b bVar2) {
        this.f440844d = aVar;
        this.f440845e = s0Var;
        this.f440846f = bVar;
        this.f440847g = aVar2;
        this.f440848h = s0Var2;
        this.f440849i = bVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f440847g.invoke();
        com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "getSingleButtonEduAnimator: single animation onCancel. holder=" + this.f440848h + ", data=" + this.f440849i);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f440844d.invoke();
        com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "getSingleButtonEduAnimator: single animation onEnd. holder=" + this.f440845e + ", data=" + this.f440846f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
