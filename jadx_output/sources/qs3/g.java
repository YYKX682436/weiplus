package qs3;

/* loaded from: classes14.dex */
public final class g implements android.view.animation.Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarMemberView f366347a;

    public g(com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView) {
        this.f366347a = radarMemberView;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        int i17 = com.tencent.mm.plugin.radar.ui.RadarMemberView.B;
        com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView = this.f366347a;
        radarMemberView.f154985t = false;
        radarMemberView.f154989x.sendEmptyMessage(1);
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
