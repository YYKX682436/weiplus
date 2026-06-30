package r20;

/* loaded from: classes9.dex */
public final class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.product.view.EcsBarrageBoxView f368766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f368767e;

    public a(com.tencent.mm.feature.ecs.product.view.EcsBarrageBoxView ecsBarrageBoxView, android.view.View view) {
        this.f368766d = ecsBarrageBoxView;
        this.f368767e = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.tencent.mm.feature.ecs.product.view.EcsBarrageBoxView ecsBarrageBoxView = this.f368766d;
        ecsBarrageBoxView.f65950o = (ecsBarrageBoxView.f65950o + 1) % ((java.util.ArrayList) ecsBarrageBoxView.f65947i).size();
        ecsBarrageBoxView.removeView(this.f368767e);
        ecsBarrageBoxView.f65945g.postDelayed(ecsBarrageBoxView.f65946h, ecsBarrageBoxView.f65944f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
