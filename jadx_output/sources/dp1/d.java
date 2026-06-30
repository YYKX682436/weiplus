package dp1;

/* loaded from: classes14.dex */
public class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dp1.k f242124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dp1.l f242125e;

    public d(dp1.l lVar, dp1.k kVar) {
        this.f242125e = lVar;
        this.f242124d = kVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        dp1.k kVar;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo;
        dp1.l lVar = this.f242125e;
        mp1.c cVar = lVar.f242167i;
        if (cVar != null) {
            cVar.getClass();
        }
        mp1.e eVar = lVar.f242166h;
        if (eVar == null || (kVar = this.f242124d) == null || (ballInfo = kVar.f242136d) == null) {
            return;
        }
        eVar.b(ballInfo, kVar.f242137e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        mp1.c cVar = this.f242125e.f242167i;
        if (cVar != null) {
            ((rp1.p1) cVar).a();
        }
    }
}
