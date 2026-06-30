package qs3;

/* loaded from: classes8.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarStateChooseView f366407d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.radar.ui.RadarStateChooseView radarStateChooseView) {
        super(0);
        this.f366407d = radarStateChooseView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.radar.ui.RadarStateChooseView radarStateChooseView = this.f366407d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(radarStateChooseView.getContext(), com.tencent.mm.R.anim.f477860di);
        loadAnimation.setAnimationListener(new qs3.x(radarStateChooseView));
        return loadAnimation;
    }
}
