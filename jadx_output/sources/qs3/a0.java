package qs3;

/* loaded from: classes8.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarStateChooseView f366330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.radar.ui.RadarStateChooseView radarStateChooseView) {
        super(0);
        this.f366330d = radarStateChooseView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f366330d.getContext(), com.tencent.mm.R.anim.f477861dj);
        loadAnimation.setAnimationListener(new qs3.z());
        return loadAnimation;
    }
}
