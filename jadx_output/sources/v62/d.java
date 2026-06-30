package v62;

/* loaded from: classes12.dex */
public final class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent) iEvent;
        am.r2 r2Var = checkResUpdateCacheFileEvent.f54053g;
        if (r2Var.f7759a != 46 || r2Var.f7760b != 0) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtQbarDataManager", "hy: got ext qrcode config. trigger copy");
        com.tencent.mm.vfs.w6.c(checkResUpdateCacheFileEvent.f54053g.f7761c, v62.e.b());
        v62.e.d();
        return false;
    }
}
