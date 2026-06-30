package qs3;

/* loaded from: classes8.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarStateView f366339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.radar.ui.RadarStateView radarStateView) {
        super(0);
        this.f366339d = radarStateView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.radar.ui.RadarStateView radarStateView = this.f366339d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(radarStateView.getContext(), com.tencent.mm.R.anim.f477862dk);
        loadAnimation.setAnimationListener(new qs3.b0(radarStateView));
        return loadAnimation;
    }
}
