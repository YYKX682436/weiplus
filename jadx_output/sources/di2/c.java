package di2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ di2.d f232644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(di2.d dVar) {
        super(1);
        this.f232644d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = this.f232644d.getWaveView();
        if (waveView != null) {
            waveView.setColor(intValue);
        }
        return jz5.f0.f302826a;
    }
}
