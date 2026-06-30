package zg3;

/* loaded from: classes.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        int i17 = ((com.tencent.mm.autogen.events.DoingInitContactEvent) iEvent).f54093g.f6636a;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TAG", "do init start");
            c01.e2.f37118b = true;
        } else if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TAG", "do init end");
            c01.e2.f37118b = false;
        }
        return false;
    }
}
