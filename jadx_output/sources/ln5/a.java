package ln5;

/* loaded from: classes15.dex */
public final class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.refreshLayout.WxRefreshLayout f319916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f319917e;

    public a(com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout, boolean z17) {
        this.f319916d = wxRefreshLayout;
        this.f319917e = z17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.view.refreshLayout.WxRefreshLayout wxRefreshLayout = this.f319916d;
        if (wxRefreshLayout.A.f420872e == null || wxRefreshLayout.getHeaderPlugin() == null) {
            return;
        }
        tn5.j jVar = wxRefreshLayout.f213753z;
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        jVar.a(((java.lang.Integer) animatedValue).intValue(), true, this.f319917e);
    }
}
