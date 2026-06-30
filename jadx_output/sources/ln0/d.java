package ln0;

/* loaded from: classes10.dex */
public final class d extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln0.p f319645d;

    public d(ln0.p pVar) {
        this.f319645d = pVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        ln0.p pVar = this.f319645d;
        ((ku5.t0) u0Var).h(new ln0.c(pVar), pVar.f319678g);
        ln0.p.a(this.f319645d);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMXp2pWrapper", "xp2p Wrapper onNetworkChange");
    }
}
