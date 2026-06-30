package oj2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f345757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj2.c f345758e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(boolean z17, oj2.c cVar) {
        super(0);
        this.f345757d = z17;
        this.f345758e = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f345757d;
        oj2.c cVar = this.f345758e;
        if (z17) {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = cVar.getWaveView();
            if (waveView != null) {
                waveView.d();
            }
        } else {
            com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView2 = cVar.getWaveView();
            if (waveView2 != null) {
                int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
                waveView2.e(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
