package si0;

/* loaded from: classes13.dex */
public final class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f408207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f408208e;

    public x(si0.l0 l0Var, long j17) {
        this.f408207d = l0Var;
        this.f408208e = j17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        si0.l0 l0Var = this.f408207d;
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = l0Var.f408108k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationUpdate(this.f408208e, si0.w.f408205d);
        l0Var.f408111n = animation.getCurrentPlayTime();
        java.lang.Object animatedValue = l0Var.f408112o.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        double floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (l0Var.f408110m == floatValue) {
            return;
        }
        l0Var.f408110m = floatValue;
        kotlinx.coroutines.r2 r2Var = l0Var.f408120w;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        l0Var.f408120w = kotlinx.coroutines.l.d(l0Var.f408117t, l0Var.f408118u, null, new si0.d0(l0Var, floatValue, null), 2, null);
    }
}
