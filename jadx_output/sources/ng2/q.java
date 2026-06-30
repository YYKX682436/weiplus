package ng2;

/* loaded from: classes10.dex */
public final class q extends jg2.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ng2.s f336984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.live.core.view.LiveVideoView f336985e;

    public q(ng2.s sVar, com.tencent.mm.live.core.view.LiveVideoView liveVideoView) {
        this.f336984d = sVar;
        this.f336985e = liveVideoView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        mn0.b0 b0Var = this.f336984d.d().f291409h;
        if (b0Var != null) {
            mn0.b0.B(b0Var, this.f336985e, null, 2, null);
        }
    }
}
