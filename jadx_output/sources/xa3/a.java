package xa3;

/* loaded from: classes12.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        va3.g0 Di = va3.j0.Di();
        Di.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticMapMsgLogic", "clean task");
        Di.f434289a.clear();
        Di.f434293e.clear();
        Di.f434294f.clear();
        Di.f434291c.clear();
        Di.f434292d.clear();
        Di.f434295g.clear();
        Di.f434290b.clear();
        va3.j0.Ni().c(Di);
        va3.j0.Ni().c(Di);
        return false;
    }
}
