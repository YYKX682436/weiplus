package qs3;

/* loaded from: classes8.dex */
public final class b0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarStateView f366335a;

    public b0(com.tencent.mm.plugin.radar.ui.RadarStateView radarStateView) {
        this.f366335a = radarStateView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.radar.ui.RadarStateView.f155011m;
        com.tencent.mm.plugin.radar.ui.RadarStateView radarStateView = this.f366335a;
        radarStateView.getClass();
        radarStateView.setVisibility(8);
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
