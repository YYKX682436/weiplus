package li2;

/* loaded from: classes10.dex */
public final class m implements pj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ li2.o f318769a;

    public m(li2.o oVar) {
        this.f318769a = oVar;
    }

    @Override // pj2.c
    public void a() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f318769a.W;
        if (ripperAnimateView != null) {
            int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
            ripperAnimateView.e(false);
        }
    }

    @Override // pj2.c
    public void b() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f318769a.W;
        if (ripperAnimateView != null) {
            ripperAnimateView.d();
        }
    }

    @Override // pj2.c
    public boolean c() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f318769a.W;
        return ripperAnimateView != null && ripperAnimateView.c();
    }
}
