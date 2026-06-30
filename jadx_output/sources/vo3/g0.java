package vo3;

/* loaded from: classes9.dex */
public class g0 extends com.tencent.mm.sdk.event.n {
    public g0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.OfflineUpdateCardListEvent offlineUpdateCardListEvent = (com.tencent.mm.autogen.events.OfflineUpdateCardListEvent) iEvent;
        com.tencent.mars.xlog.Log.i("UpdateCardListEventIListener", "update card list: %s", java.lang.Integer.valueOf(offlineUpdateCardListEvent.f54558g.f6477a));
        am.dm dmVar = offlineUpdateCardListEvent.f54558g;
        if (dmVar.f6477a == 2 && yo3.m.i()) {
            com.tencent.mars.xlog.Log.i("UpdateCardListEventIListener", "unbind card, offline kinda enable, check ifneed userbindquery in kinda");
            ((h45.q) i95.n0.c(h45.q.class)).checkIfNeedRequestUserBindqueryWhenUnBindCard(dmVar.f6478b);
            return true;
        }
        if (yo3.m.k()) {
            gm0.j1.d().g(new wo3.p(13, null, 8, 0, ""));
        }
        return false;
    }
}
