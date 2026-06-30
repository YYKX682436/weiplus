package qh2;

/* loaded from: classes10.dex */
public final class g implements pj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qh2.i f363442a;

    public g(qh2.i iVar) {
        this.f363442a = iVar;
    }

    @Override // pj2.c
    public void a() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = this.f363442a.getWaveView();
        if (waveView != null) {
            int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
            waveView.e(false);
        }
    }

    @Override // pj2.c
    public void b() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = this.f363442a.getWaveView();
        if (waveView != null) {
            waveView.d();
        }
    }

    @Override // pj2.c
    public boolean c() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView waveView = this.f363442a.getWaveView();
        return waveView != null && waveView.c();
    }
}
