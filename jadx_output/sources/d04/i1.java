package d04;

/* loaded from: classes13.dex */
public final class i1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f225438d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225439e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f225440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanNewProductListLayout f225441g;

    public i1(int i17, int i18, boolean z17, com.tencent.mm.plugin.scanner.ui.widget.ScanNewProductListLayout scanNewProductListLayout) {
        this.f225438d = i17;
        this.f225439e = i18;
        this.f225440f = z17;
        this.f225441g = scanNewProductListLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        int i17 = intValue - this.f225438d;
        boolean z17 = this.f225440f;
        int i18 = this.f225439e;
        if (z17) {
            i18 -= i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanNewProductListLayout", "smoothScrollTo  onAnimationUpdate  value:" + intValue + ", currentPaddingBottom:" + i18);
        int i19 = com.tencent.mm.plugin.scanner.ui.widget.ScanNewProductListLayout.C;
        this.f225441g.g(intValue, i18);
    }
}
