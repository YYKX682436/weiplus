package kj2;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.j0 f308400d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(kj2.j0 j0Var) {
        super(1);
        this.f308400d = j0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        kj2.j0 j0Var = this.f308400d;
        if (j0Var.getPluginAbility().a0().K() == null || j0Var.getCurWidgetMode() != pm2.a.f356862r) {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = j0Var.f308409p1;
            if (ripperAnimateView != null) {
                ripperAnimateView.setColor(intValue);
            }
        } else {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView2 = j0Var.f308409p1;
            if (ripperAnimateView2 != null) {
                ripperAnimateView2.setColor(j0Var.f308411y1);
            }
        }
        return jz5.f0.f302826a;
    }
}
