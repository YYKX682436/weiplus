package qs3;

/* loaded from: classes8.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarStateView f366344d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.radar.ui.RadarStateView radarStateView) {
        super(0);
        this.f366344d = radarStateView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f366344d.getContext(), com.tencent.mm.R.anim.f477863dl);
        loadAnimation.setAnimationListener(new qs3.d0());
        return loadAnimation;
    }
}
