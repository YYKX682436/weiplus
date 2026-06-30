package si0;

/* loaded from: classes13.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ si0.v f408079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f408080e;

    public h(si0.v vVar, long j17) {
        this.f408079d = vVar;
        this.f408080e = j17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        si0.v vVar = this.f408079d;
        com.tencent.pigeon.flutter_pag.PAGViewListenerApi pAGViewListenerApi = vVar.f408188k;
        kotlin.jvm.internal.o.d(pAGViewListenerApi);
        pAGViewListenerApi.onAnimationUpdate(this.f408080e, si0.g.f408075d);
        vVar.f408191n = animation.getCurrentPlayTime();
        java.lang.Object animatedValue = vVar.f408192o.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        double floatValue = ((java.lang.Float) animatedValue).floatValue();
        if (vVar.f408190m == floatValue) {
            return;
        }
        vVar.f408190m = floatValue;
        kotlinx.coroutines.r2 r2Var = vVar.f408200w;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        vVar.f408200w = kotlinx.coroutines.l.d(vVar.f408197t, vVar.f408198u, null, new si0.n(vVar, floatValue, null), 2, null);
    }
}
