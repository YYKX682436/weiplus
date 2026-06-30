package mx2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner) {
        super(0);
        this.f332481d = finderImageBanner;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPlay : onPlayComplete, scroll from:");
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = this.f332481d;
        sb6.append(finderImageBanner.getFocusPosition());
        sb6.append(" to next page");
        com.tencent.mars.xlog.Log.i("Finder.ImageBanner", sb6.toString());
        ym5.o1 indicator = finderImageBanner.getIndicator();
        com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView finderPageIndicatorView = indicator instanceof com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView ? (com.tencent.mm.plugin.finder.view.indictor.FinderPageIndicatorView) indicator : null;
        if (finderPageIndicatorView != null) {
            android.animation.ValueAnimator valueAnimator = finderPageIndicatorView.f132367n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            finderPageIndicatorView.f132364h = 1.0f;
            finderPageIndicatorView.invalidate();
        }
        if (finderImageBanner.f132324v && finderImageBanner.isAttachedToWindow()) {
            com.tencent.mm.plugin.finder.view.image.FinderImageBanner.c(finderImageBanner);
        }
        return jz5.f0.f302826a;
    }
}
