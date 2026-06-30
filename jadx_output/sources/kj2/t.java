package kj2;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.u f308435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(kj2.u uVar) {
        super(1);
        this.f308435d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = this.f308435d.getWaveView();
        if (waveView != null) {
            waveView.setColor(intValue);
        }
        return jz5.f0.f302826a;
    }
}
