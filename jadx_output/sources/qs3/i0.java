package qs3;

/* loaded from: classes15.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarTipsView f366353d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.radar.ui.RadarTipsView radarTipsView) {
        super(0);
        this.f366353d = radarTipsView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return android.view.animation.AnimationUtils.loadAnimation(this.f366353d.getContext(), com.tencent.mm.R.anim.f477864dm);
    }
}
