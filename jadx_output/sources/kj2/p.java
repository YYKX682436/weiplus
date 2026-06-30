package kj2;

/* loaded from: classes10.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.s f308432d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kj2.s sVar) {
        super(1);
        this.f308432d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        kj2.s sVar = this.f308432d;
        if (sVar.getPluginAbility().a0().K() == null || sVar.getCurWidgetMode() != pm2.a.f356862r) {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = sVar.getWaveView();
            if (waveView != null) {
                waveView.setColor(intValue);
            }
        } else {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView2 = sVar.getWaveView();
            if (waveView2 != null) {
                waveView2.setColor(sVar.U);
            }
        }
        return jz5.f0.f302826a;
    }
}
