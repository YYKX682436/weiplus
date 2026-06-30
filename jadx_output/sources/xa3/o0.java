package xa3;

/* loaded from: classes15.dex */
public class o0 extends com.tencent.mm.sdk.event.n {
    public o0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (((com.tencent.mm.autogen.events.ResumeOrPauseTrackRoomEvent) iEvent).f54709g.f8474a) {
            if (!va3.j0.Ri().c() || !va3.j0.Ri().f434366x) {
                return false;
            }
            va3.j0.Ri().g();
            return false;
        }
        if (!va3.j0.Ri().c()) {
            return false;
        }
        va3.v0 Ri = va3.j0.Ri();
        Ri.f434366x = true;
        i11.e eVar = Ri.f434351f;
        if (eVar != null) {
            ((i11.h) eVar).m(Ri.K);
        }
        va3.f0 f0Var = Ri.f434352g;
        if (f0Var == null) {
            return false;
        }
        f0Var.c(Ri.L);
        return false;
    }
}
