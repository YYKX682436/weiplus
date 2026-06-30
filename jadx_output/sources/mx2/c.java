package mx2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner) {
        super(2);
        this.f332482d = finderImageBanner;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        ym5.o1 indicator = this.f332482d.getIndicator();
        com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView finderPageIndicatorView = indicator instanceof com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView ? (com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView) indicator : null;
        if (finderPageIndicatorView != null) {
            float f17 = ((float) longValue) / ((float) longValue2);
            android.animation.ValueAnimator valueAnimator = finderPageIndicatorView.f132367n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            finderPageIndicatorView.f132364h = f17;
            finderPageIndicatorView.invalidate();
        }
        return jz5.f0.f302826a;
    }
}
