package qs3;

/* loaded from: classes15.dex */
public final class j0 implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarTipsView f366355a;

    public j0(com.tencent.mm.plugin.radar.ui.RadarTipsView radarTipsView) {
        this.f366355a = radarTipsView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        com.tencent.mm.plugin.radar.ui.RadarTipsView radarTipsView = this.f366355a;
        if (radarTipsView.f155030r) {
            return;
        }
        radarTipsView.f155019d.sendEmptyMessage(0);
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
