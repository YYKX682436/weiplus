package kj2;

/* loaded from: classes10.dex */
public final class i0 implements pj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj2.j0 f308405a;

    public i0(kj2.j0 j0Var) {
        this.f308405a = j0Var;
    }

    @Override // pj2.c
    public void a() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f308405a.f308409p1;
        if (ripperAnimateView != null) {
            int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
            ripperAnimateView.e(false);
        }
    }

    @Override // pj2.c
    public void b() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f308405a.f308409p1;
        if (ripperAnimateView != null) {
            ripperAnimateView.d();
        }
    }

    @Override // pj2.c
    public boolean c() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f308405a.f308409p1;
        return ripperAnimateView != null && ripperAnimateView.c();
    }
}
