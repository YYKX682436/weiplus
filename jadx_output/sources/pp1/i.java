package pp1;

/* loaded from: classes14.dex */
public final class i implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp1.z f357417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f357418e;

    public i(pp1.z zVar, yz5.a aVar) {
        this.f357417d = zVar;
        this.f357418e = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        pp1.z.B = true;
        pp1.z zVar = this.f357417d;
        pp1.z.c(zVar);
        zVar.k();
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView = zVar.f357448f;
        if (contentFloatBallView != null) {
            com.tencent.mm.plugin.ball.view.ContentFloatBallView.S(contentFloatBallView, 0, false, 2, null);
        }
        com.tencent.mm.plugin.ball.view.ContentFloatBallView contentFloatBallView2 = zVar.f357448f;
        if (contentFloatBallView2 != null) {
            contentFloatBallView2.B(true, false);
        }
        yz5.a aVar = this.f357418e;
        if (aVar != null) {
            aVar.invoke();
        }
        zVar.f357455p = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
