package yt2;

/* loaded from: classes3.dex */
public final class p extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView f465317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f465318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f465319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f465320g;

    public p(com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView, float f17, float f18, float f19, float f27) {
        this.f465317d = finderLiveShoppingSubsidyOverlayView;
        this.f465318e = f18;
        this.f465319f = f19;
        this.f465320g = f27;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.finder.shopping.view.subsidy.FinderLiveShoppingSubsidyOverlayView finderLiveShoppingSubsidyOverlayView = this.f465317d;
        finderLiveShoppingSubsidyOverlayView.f126348f.setPivotX(0.0f);
        finderLiveShoppingSubsidyOverlayView.f126348f.setPivotY(this.f465318e);
        finderLiveShoppingSubsidyOverlayView.f126348f.setTranslationX(this.f465319f);
        finderLiveShoppingSubsidyOverlayView.f126348f.setTranslationY(this.f465320g);
    }
}
