package qs3;

/* loaded from: classes15.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarTipsView f366357d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.radar.ui.RadarTipsView radarTipsView) {
        super(0);
        this.f366357d = radarTipsView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.radar.ui.RadarTipsView radarTipsView = this.f366357d;
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(radarTipsView.getContext(), com.tencent.mm.R.anim.f477865dn);
        loadAnimation.setAnimationListener(new qs3.j0(radarTipsView));
        return loadAnimation;
    }
}
