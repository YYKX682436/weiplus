package la0;

/* loaded from: classes11.dex */
public class y extends com.tencent.mm.sdk.event.n {
    public y() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ActivateEvent activateEvent = (com.tencent.mm.autogen.events.ActivateEvent) iEvent;
        if (!gm0.j1.a() || activateEvent.f53964g.f6412a) {
            return false;
        }
        ml3.b bVar = new ml3.b();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MUSIO_LAST_SCAN_MUSIC_FILE_TIME_LONG;
        long longValue = ((java.lang.Long) c17.m(u3Var, 0L)).longValue();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - longValue < gl3.b.f272820c.longValue()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PieceCacheCleanController", "don't scanMusic because the time is in one day");
            return false;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
        s75.d.c(new ml3.a(bVar), "ScanMusicThread", 1);
        return false;
    }
}
