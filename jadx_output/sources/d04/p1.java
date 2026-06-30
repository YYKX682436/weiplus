package d04;

/* loaded from: classes13.dex */
public final class p1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f225484d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f225485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f225486f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout f225487g;

    public p1(int i17, int i18, boolean z17, com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout scanProductListLayout) {
        this.f225484d = i17;
        this.f225485e = i18;
        this.f225486f = z17;
        this.f225487g = scanProductListLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        java.lang.Object animatedValue = animation.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        int i17 = intValue - this.f225484d;
        boolean z17 = this.f225486f;
        int i18 = this.f225485e;
        if (z17) {
            i18 -= i17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductListLayout", "smoothScrollTo  onAnimationUpdate  value:" + intValue + ", currentPaddingBottom:" + i18);
        int i19 = com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout.C;
        this.f225487g.g(intValue, i18);
    }
}
