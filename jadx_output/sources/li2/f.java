package li2;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li2.g f318764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(li2.g gVar) {
        super(1);
        this.f318764d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = this.f318764d.getWaveView();
        if (waveView != null) {
            waveView.setColor(intValue);
        }
        return jz5.f0.f302826a;
    }
}
