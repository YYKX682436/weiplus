package pu3;

/* loaded from: classes12.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        ou3.q.f348970c.f348939a.callback(checkResUpdateCacheFileEvent);
        ou3.p.f348969b.f348939a.callback(checkResUpdateCacheFileEvent);
        return false;
    }
}
