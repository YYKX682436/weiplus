package si0;

/* loaded from: classes.dex */
public final class c0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f408043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f408044e;

    public c0(si0.l0 l0Var, long j17) {
        this.f408043d = l0Var;
        this.f408044e = j17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = this.f408043d.f408108k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationCancel(this.f408044e, si0.y.f408209d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        si0.l0 l0Var = this.f408043d;
        if (l0Var.f408109l) {
            return;
        }
        l0Var.f408111n = 0L;
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = l0Var.f408108k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationEnd(this.f408044e, si0.z.f408216d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = this.f408043d.f408108k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationRepeat(this.f408044e, si0.a0.f408035d);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = this.f408043d.f408108k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationStart(this.f408044e, si0.b0.f408040d);
    }
}
