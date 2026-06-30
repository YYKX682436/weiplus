package g82;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        boolean c17;
        com.tencent.mm.autogen.events.FavDeleteEvent favDeleteEvent = (com.tencent.mm.autogen.events.FavDeleteEvent) iEvent;
        if (favDeleteEvent != null) {
            am.r9 r9Var = favDeleteEvent.f54235g;
            java.lang.String str = r9Var.f7802a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "deleteFavOffline url is null!");
            } else {
                i82.a z07 = ((e82.e) i95.n0.c(e82.e.class)).Ai().z0(str);
                if (z07 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.offline.FavOfflineHelp", "deleteFavOffline favOffline is null!");
                } else {
                    c17 = h82.e.c(str, z07.field_path, z07.field_imgDirPath);
                    com.tencent.mars.xlog.Log.i("FavDeleteEventIListener", "FavDeleteEvent url:%s result:%s", r9Var.f7802a, java.lang.Boolean.valueOf(c17));
                }
            }
            c17 = false;
            com.tencent.mars.xlog.Log.i("FavDeleteEventIListener", "FavDeleteEvent url:%s result:%s", r9Var.f7802a, java.lang.Boolean.valueOf(c17));
        }
        return false;
    }
}
