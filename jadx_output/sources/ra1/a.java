package ra1;

/* loaded from: classes4.dex */
public class a implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar f393482d;

    public a(com.tencent.mm.plugin.appbrand.game.preload.ui.BootstrapProgressBar bootstrapProgressBar) {
        this.f393482d = bootstrapProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        this.f393482d.invalidate();
    }
}
