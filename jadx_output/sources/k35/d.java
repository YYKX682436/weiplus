package k35;

/* loaded from: classes11.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        bm5.p1 p1Var = k35.c.f303898e;
        int i17 = ((com.tencent.mm.autogen.events.DoingInitContactEvent) iEvent).f54093g.f6636a;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "do init start");
            k35.c.f303902i = true;
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListHelper", "do init end");
            k35.c.f303902i = false;
        }
        return false;
    }
}
