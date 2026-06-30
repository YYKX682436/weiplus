package qs3;

/* loaded from: classes8.dex */
public final class x implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarStateChooseView f366405a;

    public x(com.tencent.mm.plugin.radar.ui.RadarStateChooseView radarStateChooseView) {
        this.f366405a = radarStateChooseView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.radar.ui.RadarStateChooseView.f155006h;
        com.tencent.mm.plugin.radar.ui.RadarStateChooseView radarStateChooseView = this.f366405a;
        radarStateChooseView.getClass();
        radarStateChooseView.setVisibility(8);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }
}
