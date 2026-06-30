package kj2;

/* loaded from: classes10.dex */
public final class a0 implements pj2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kj2.c0 f308384a;

    public a0(kj2.c0 c0Var) {
        this.f308384a = c0Var;
    }

    @Override // pj2.c
    public void a() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f308384a.K;
        if (ripperAnimateView != null) {
            int i17 = com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView.f111717o;
            ripperAnimateView.e(false);
        }
    }

    @Override // pj2.c
    public void b() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f308384a.K;
        if (ripperAnimateView != null) {
            ripperAnimateView.d();
        }
    }

    @Override // pj2.c
    public boolean c() {
        com.tencent.mm.plugin.finder.live.mic.voiceroom.wave.RipperAnimateView ripperAnimateView = this.f308384a.K;
        return ripperAnimateView != null && ripperAnimateView.c();
    }
}
