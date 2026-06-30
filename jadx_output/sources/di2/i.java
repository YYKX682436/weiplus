package di2;

/* loaded from: classes10.dex */
public final class i implements pj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ di2.j f232648a;

    public i(di2.j jVar) {
        this.f232648a = jVar;
    }

    @Override // pj2.c
    public void a() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f232648a.W;
        if (ripperAnimateView != null) {
            int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
            ripperAnimateView.e(false);
        }
    }

    @Override // pj2.c
    public void b() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f232648a.W;
        if (ripperAnimateView != null) {
            ripperAnimateView.d();
        }
    }

    @Override // pj2.c
    public boolean c() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f232648a.W;
        return ripperAnimateView != null && ripperAnimateView.c();
    }
}
