package w72;

/* loaded from: classes12.dex */
public class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.FavNotifyEvent favNotifyEvent = (com.tencent.mm.autogen.events.FavNotifyEvent) iEvent;
        if (((a82.h2) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).Aj()).f2013f) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavNotifyListener", "sending item, do not do sync");
        } else {
            byte[] bArr = favNotifyEvent.f54239g.f8184a;
            ((s72.j0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).sj()).f7(bArr == null ? 5 : kk.u.a(bArr, 0), 4, new com.tencent.mm.feature.emoji.b0$$c());
        }
        return false;
    }
}
