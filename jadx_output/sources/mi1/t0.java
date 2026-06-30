package mi1;

/* loaded from: classes7.dex */
public final class t0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton f326690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f326691e;

    public t0(com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandOptionButton appBrandOptionButton, android.graphics.drawable.Drawable drawable) {
        this.f326690d = appBrandOptionButton;
        this.f326691e = drawable;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        this.f326690d.getButtonImage().setImageDrawable(this.f326691e);
    }
}
