package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ed extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC f134264d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ed(com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC) {
        super(0);
        this.f134264d = finderFeedMegaVideoBtnAnimUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = this.f134264d;
        android.view.View view = finderFeedMegaVideoBtnAnimUIC.f133557e;
        if (view != null) {
            android.view.View view2 = view.getVisibility() == 0 ? view : null;
            if (view2 != null) {
                android.animation.ValueAnimator valueAnimator = finderFeedMegaVideoBtnAnimUIC.f133560h;
                if (valueAnimator.isRunning()) {
                    valueAnimator.cancel();
                }
                ((android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.iqr)).setAlpha(0.0f);
                android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.f483043v2);
                int color = view2.getContext().getResources().getColor(com.tencent.mm.R.color.f479247tz);
                int color2 = view2.getContext().getResources().getColor(com.tencent.mm.R.color.f479258ua);
                valueAnimator.removeAllUpdateListeners();
                valueAnimator.removeAllListeners();
                valueAnimator.addUpdateListener(new com.tencent.mm.plugin.finder.viewmodel.component.dd(view2, finderFeedMegaVideoBtnAnimUIC, findViewById, color2, color));
                valueAnimator.start();
            }
        }
        finderFeedMegaVideoBtnAnimUIC.f133557e = null;
        return jz5.f0.f302826a;
    }
}
