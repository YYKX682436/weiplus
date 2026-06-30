package kj2;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.x f308436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(kj2.x xVar) {
        super(1);
        this.f308436d = xVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = this.f308436d.getWaveView();
        if (waveView != null) {
            waveView.setColor(intValue);
        }
        return jz5.f0.f302826a;
    }
}
