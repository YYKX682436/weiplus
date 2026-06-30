package uq1;

/* loaded from: classes8.dex */
public class c extends com.tencent.mm.sdk.event.n {
    public c() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent localCheckResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.LocalCheckResUpdateCacheFileEvent) iEvent;
        if (localCheckResUpdateCacheFileEvent == null) {
            return false;
        }
        am.dj djVar = localCheckResUpdateCacheFileEvent.f54480g;
        if (djVar.f6471a != 73 || djVar.f6472b != 1) {
            return false;
        }
        rq1.m0.bj(djVar.f6473c, true);
        return false;
    }
}
